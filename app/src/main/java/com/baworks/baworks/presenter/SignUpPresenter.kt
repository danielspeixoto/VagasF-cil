package com.baworks.baworks.presenter

import com.baworks.baworks.contract.SignUp
import com.baworks.baworks.model.UserModel
import com.baworks.baworks.model.pojo.User
import com.baworks.baworks.util.Validate
import com.baworks.baworks.view.activity.HomeActivity
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * Created by daniel on 8/10/17.
 */
class SignUpPresenter(private val view: SignUp.View) : SignUp.Presenter {

    override fun signUp(user: User) {
        view.showLoadingDialog()
        val result = Validate.user(user)
        if (result == Validate.OK) {
            UserModel.create(user)
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe({ user1 ->
                        view.closeLoadingDialog()
                        view.goToActivityClearPrevious(HomeActivity::class.java)
                    }, { _ ->
                        view.closeLoadingDialog()
                        view.showErrorDialog()
                    })
        } else {
            view.setMessageViewText(result)
        }
    }
}
