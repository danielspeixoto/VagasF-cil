package com.baworks.baworks.contract

import com.baworks.baworks.model.pojo.User

/**
 * Created by danielspeixoto on 5/3/17.
 */
interface CreateUser {

    interface View : ActivityBase.View {
        fun setMessageViewText(message: String)
    }

    interface Presenter : ActivityBase.Presenter {
        fun create(user: User)
    }

}