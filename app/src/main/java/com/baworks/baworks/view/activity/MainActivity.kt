package com.baworks.baworks.view.activity

import android.graphics.Color
import android.os.Bundle
import android.util.TypedValue
import android.view.View
import com.baworks.baworks.R
import com.baworks.baworks.contract.Main
import com.baworks.baworks.util.App
import com.baworks.baworks.util.PARAM_LAYOUT
import com.baworks.baworks.view.custom.iconView
import org.jetbrains.anko.*

/**
 * Created by daniel on 8/10/17.
 */
class MainActivity : BaseActivity(), Main.View {

    private val HAS_NO_ACCOUNT: Int = 1
    private val HAS_ACCOUNT: Int = 2

    // lateinit private var mPresenter: Main.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
//        mPresenter = MainPresenter(this)
//        mPresenter.checkIfUserIsSaved()
        super.onCreate(savedInstanceState)
        relativeLayout {
            lparams(width = matchParent, height = matchParent)
            padding = dip(PARAM_LAYOUT)
            val typedValue = TypedValue()
            theme.resolveAttribute(R.attr.colorAccent, typedValue, true)
            button(App.getStringResource(R.string.has_no_account)) {
                textColor = Color.WHITE
                id = HAS_NO_ACCOUNT
                setOnClickListener(object : View.OnClickListener {

                    override fun onClick(p0: View?) {
                        startActivity<HomeActivity>()
                    }
                })
                backgroundColor = typedValue.data
            }.lparams(width = matchParent) {
                bottomMargin = dip(8)
                alignParentBottom()
                alignParentStart()
            }
            button(App.getStringResource(R.string.has_account)) {
                textColor = Color.WHITE
                id = HAS_ACCOUNT
                setOnClickListener(object : View.OnClickListener {

                    override fun onClick(p0: View?) {
                        startActivity<LoginActivity>()
                    }
                })
                backgroundColor = typedValue.data
            }.lparams(width = matchParent) {
                above(HAS_NO_ACCOUNT)
                bottomMargin = dip(8)
                alignParentStart()
            }
            iconView().lparams {
                alignParentTop()
                centerHorizontally()
            }
        }
    }
}
