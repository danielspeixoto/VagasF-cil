package com.baworks.baworks.view.activity

import android.graphics.Typeface
import android.os.Bundle
import android.support.v4.view.GravityCompat
import android.view.Gravity
import android.widget.TextView
import com.baworks.baworks.R
import com.baworks.baworks.R.string.name
import com.baworks.baworks.R.string.phone
import com.baworks.baworks.model.UserModel
import com.baworks.baworks.model.pojo.User
import com.baworks.baworks.model.pojo.Vaga
import com.baworks.baworks.util.PARAM_LAYOUT
import com.baworks.baworks.view.custom.floatingButton
import org.jetbrains.anko.*
import org.jetbrains.anko.design.coordinatorLayout

/**
 * Created by daniel on 8/12/17.
 */
class InfoJobActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var vaga = getIntent().getSerializableExtra("vaga") as Vaga
        coordinatorLayout() {
            verticalLayout() {

                textView() {
                    text = vaga.titulo
                    textAlignment = TextView.TEXT_ALIGNMENT_CENTER
                    textSize = (PARAM_LAYOUT * 4).toFloat()
                    padding = 50
                    setTypeface(null, Typeface.BOLD);
                    topPadding = 100
                }
                textView() {
                    text = vaga.descricao
                    textAlignment = TextView.TEXT_ALIGNMENT_CENTER
                    textSize = (PARAM_LAYOUT * 2).toFloat()
                }
            }.lparams(matchParent, matchParent)
            floatingButton {
                imageResource = R.mipmap.ic_apply
                setOnClickListener({

                })
            }.lparams {
                margin = resources.getDimensionPixelSize(R.dimen.fab_margin)
                gravity = Gravity.BOTTOM or GravityCompat.END
            }

        }

    }
}