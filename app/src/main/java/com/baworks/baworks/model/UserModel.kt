package com.baworks.baworks.model

import com.baworks.baworks.model.pojo.User
import io.reactivex.Single

/**
 * Created by daniel on 8/10/17.
 */

object UserModel {

    var users = ArrayList<User>()

    var currentUser : User? = null

    init {
        users.add(
                User("d@gmail.com", "1", "Daniel")
        )
    }

    fun logIn(username: String, password: String): Single<User> {
        return Single.create<User> { subscriber ->
            var isHere = false
            users.forEach({
                if (it.email === username && it.pass === password) {
                    isHere = true
                    subscriber.onSuccess(it)
                }
            })
            if (!isHere) {
                subscriber.onError(Throwable("404"))
            }
        }
    }

    fun create(user: User): Single<User> {
        return Single.create<User> { subscriber ->
            users.add(user)
            subscriber.onSuccess(user)
        }
    }

}
