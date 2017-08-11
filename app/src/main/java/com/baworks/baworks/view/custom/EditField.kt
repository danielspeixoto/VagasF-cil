package com.baworks.baworks.view.custom

import android.content.Context
import android.support.v4.content.ContextCompat
import android.view.ViewGroup
import android.view.ViewManager
import android.widget.EditText
import com.baworks.baworks.util.PARAM_LAYOUT
import org.jetbrains.anko.custom.ankoView
import org.jetbrains.anko.dip
import org.jetbrains.anko.padding

/**
 * Created by danielspeixoto on 4/24/17.
 */
class EditField(ctx: Context) : EditText(ctx) {

    init {
        background = ContextCompat.getDrawable(context, android.R.drawable.editbox_background)
        padding = dip(PARAM_LAYOUT * 2)
        layoutParams = ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT)
    }
}

inline fun ViewManager.editField(theme: Int = 0) = editField(theme) {}
inline fun ViewManager.editField(theme: Int = 0, init: EditField.() -> Unit) =
        ankoView(::EditField, theme, init)