package com.baworks.baworks.view.activity

import android.graphics.Color
import android.os.Bundle
import android.support.v4.view.GravityCompat
import android.view.Gravity
import android.view.View
import android.view.inputmethod.EditorInfo
import android.widget.EditText
import android.widget.TextView
import com.baworks.baworks.R
import com.baworks.baworks.contract.SignUp
import com.baworks.baworks.model.pojo.User
import com.baworks.baworks.presenter.SignUpPresenter
import com.baworks.baworks.util.PARAM_LAYOUT
import com.baworks.baworks.view.custom.MessageView
import com.baworks.baworks.view.custom.editField
import com.baworks.baworks.view.custom.floatingButton
import org.jetbrains.anko.*
import org.jetbrains.anko.design.coordinatorLayout

/**
 * Created by daniel on 8/11/17.
 */
class GatherDataActivity : BaseActivity(), SignUp.View, MessageView {

    override var messageView: TextView? = null
    lateinit var cpfEdit: EditText
    lateinit var genderEdit: EditText
    lateinit var raceEdit: EditText
    lateinit var zoneEdit: EditText
    lateinit var locationEdit: EditText
    lateinit var scolarityEdit: EditText
    lateinit var formationEdit: EditText
    lateinit var occupationEdit: EditText
    lateinit var birthEdit: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun setMessageViewText(message: String) {
        setMessageViewContent(message)
    }
}