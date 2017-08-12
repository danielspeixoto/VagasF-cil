package com.baworks.baworks.util

import com.baworks.baworks.model.pojo.User
import java.util.regex.Pattern


/**
 * Created by daniel on 8/10/17.
 */
object Validate {

    val OK = "ok"
    private val EMAIL_REGEX = "(?:[a-z0-9!#$%&'*+/=?" +
            "^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-" +
            "\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\" +
            "x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*" +
            "[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4]" +
            "[0-9]|[a]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[a]?[0-9][0-9]?|[a-z0-9-]" +
            "*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-" +
            "\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])"

    private val NAME_REGEX = "^[\\p{L}\\s'.-]+$"

    fun user(user: User): String {
        var result = OK
        user.email = user.email!!.toLowerCase().trim { it <= ' ' }
        result = email(user.email!!)
        if (result != OK) {
            return result
        }
        if (user.name != null && !Pattern.matches(NAME_REGEX, user.name)) {
            result = "O nome não está escrito propriamente"
            return result
        }
        return result
    }

    fun email(email: String): String {
        var email = email
        var result = OK
        email = email.toLowerCase().trim { it <= ' ' }
        if (!Pattern.matches(EMAIL_REGEX, email)) {
            result = "Formato do email está incorreto"
        }
        return result
    }

    fun integer(str: String): String {
        var result = OK
        if (Pattern.matches("[0-9]*", result) && str.length > 0) {
            result = "Não é um número valído"
        }
        return result
    }
}