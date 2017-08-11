package com.baworks.baworks.contract

import com.baworks.baworks.model.pojo.User


/**
 * Created by danielspeixoto on 2/14/17
 */

interface SignUp {

    interface View : ActivityBase.View {
        fun setMessageViewText(message: String)
    }

    interface Presenter : ActivityBase.Presenter {
        fun signUp(user: User)
    }
}
