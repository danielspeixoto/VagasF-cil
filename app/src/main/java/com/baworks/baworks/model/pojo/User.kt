package com.baworks.baworks.model.pojo

/**
 * Created by daniel on 8/10/17.
 */
data class User(var email: String? = null,
                var password: String? = null,
                var name: String? = null,
                val group: String? = null,
                var token: String? = null,
                var permissions: HashMap<String, Boolean> = HashMap())