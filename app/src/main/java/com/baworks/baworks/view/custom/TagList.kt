package com.baworks.baworks.view.custom

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Color
import android.graphics.PorterDuff
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.ViewManager
import android.widget.ImageView
import android.widget.LinearLayout
import com.baworks.baworks.R
import com.baworks.baworks.model.UserModel
import com.baworks.baworks.util.PARAM_LAYOUT
import com.baworks.baworks.view.fragments.ProfileFragment
import com.baworks.baworks.view.recycler.LinksAdapter
import org.jetbrains.anko.*
import org.jetbrains.anko.custom.ankoView
import org.jetbrains.anko.recyclerview.v7.recyclerView

/**
 * Created by daniel on 8/12/17.
 */
class TagList(ctx: Context) : LinearLayout(ctx) {

    lateinit var edit : EditField

    var str = ""
    var list : RecyclerView
    var adpt = LinksAdapter(ctx)
    var kind : Int = 0

    init {
        orientation = LinearLayout.VERTICAL

        relativeLayout {
            edit = editField {
                id = 72
                padding = PARAM_LAYOUT * 6
            }.lparams(width = 800) {
                alignParentLeft()
                topMargin = 20
                rightMargin = 20
            }
            var img = imageButton() {
                scaleType = ImageView.ScaleType.FIT_CENTER
                backgroundColor = Color.TRANSPARENT
                setOnClickListener({
                    adpt.addItem(edit.text.toString())
                    ProfileFragment.skills.add(edit.text.toString())
                    edit.setText("")
                })
            }.lparams(width = 150) {
                rightOf(edit)
                //alignParentRight()
            }
            img.setImageResource(R.mipmap.ic_add)
        }
        list = recyclerView {
            adapter = adpt
            layoutManager = LinearLayoutManager(ctx)
        }
    }
}

inline fun ViewManager.tagList(theme: Int = 0) = tagList(theme) {}
inline fun ViewManager.tagList(theme: Int = 0, init: TagList.() -> Unit) =
        ankoView(::TagList, theme, init)