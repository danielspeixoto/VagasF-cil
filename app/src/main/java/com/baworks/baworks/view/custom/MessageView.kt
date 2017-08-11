package com.baworks.baworks.view.custom

import android.view.View
import android.widget.TextView

/**
 * Created by daniel on 8/10/17.
 */
interface MessageView {

    var messageView: TextView?

    fun setMessageViewContent(message: String) {
        messageView!!.text = message
        messageView!!.visibility = View.VISIBLE
    }
}