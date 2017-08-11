package com.baworks.baworks.view.custom

import android.content.Context
import android.support.v4.content.ContextCompat
import android.view.ViewGroup
import android.view.ViewManager
import android.widget.EditText
import android.widget.LinearLayout
import com.baworks.baworks.util.App.Companion.context
import com.baworks.baworks.util.PARAM_LAYOUT
import org.jetbrains.anko.custom.ankoView
import org.jetbrains.anko.dip
import org.jetbrains.anko.matchParent
import org.jetbrains.anko.padding
import org.jetbrains.anko.textView

/**
 * Created by daniel on 8/11/17.
 */
class WriteField(ctx: Context) : LinearLayout(ctx) {

    lateinit var field : EditField

    init {
        textView()
        field = editField()
        background = ContextCompat.getDrawable(context, android.R.drawable.editbox_background)
        padding = dip(PARAM_LAYOUT * 2)
        layoutParams = ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT)
    }
}

inline fun ViewManager.writeField(theme: Int = 0) = writeField(theme) {}
inline fun ViewManager.writeField(theme: Int = 0, init: WriteField.() -> Unit) =
        ankoView(::WriteField, theme, init)