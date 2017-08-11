package com.baworks.baworks.presenter

import com.baworks.baworks.R
import com.baworks.baworks.contract.Login
import com.baworks.baworks.model.UserModel
import com.baworks.baworks.model.pojo.User
import com.baworks.baworks.util.App
import com.baworks.baworks.util.Validate
import com.baworks.baworks.view.activity.HomeActivity
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * Created by daniel on 8/10/17.
 */
class LoginPresenter(private val view: Login.View) : Login.Presenter {

    override fun logIn(username: String,
                       password: String) {

        view.showLoadingDialog()
        val user = User(username,
                password)
        val result = Validate.user(user)
        if (result == Validate.OK) {
            UserModel.logIn(username,
                    password)
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe({ _ ->
                        view.closeLoadingDialog()
                        view.goToActivityClearPrevious(HomeActivity::class.java)
                    },
                            { throwable ->
                                view.closeLoadingDialog()
                                when (throwable.message) {
                                    "404" -> view.setMessageViewText(App.getStringResource(R.string.incorrect_username_password))
                                    else -> view.showErrorDialog()
                                }
                            })
        } else {
            view.setMessageViewText(result)
        }
    }
}