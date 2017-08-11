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

/**
 * Created by daniel on 8/11/17.
 */
//class GatherDataActivity : BaseActivity(), SignUp.View, MessageView {
//
//    override var messageView: TextView? = null
//    lateinit var cpfEdit: EditText
//    lateinit var genderEdit: EditText
//    lateinit var raceEdit: EditText
//    lateinit var zoneEdit: EditText
//    lateinit var locationEdit: EditText
//    lateinit var scolarityEdit: EditText
//    lateinit var formationEdit: EditText
//    lateinit var occupationEdit: EditText
//    lateinit var birthEdit: EditText
//    lateinit private var presenter: SignUp.Presenter
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        presenter = SignUpPresenter(this)
//        coordinatorLayout {
//            padding = dip(PARAM_LAYOUT)
//            scrollView {
//                verticalLayout {
//                    nameEdit = editField {
//                        hint = getString(R.string.name)
//                        inputType = EditorInfo.TYPE_TEXT_VARIATION_PERSON_NAME
//                    }
//                    usernameEdit = editField {
//                        hint = getString(R.string.username)
//                        inputType = EditorInfo.TYPE_TEXT_VARIATION_WEB_EMAIL_ADDRESS
//                    }
//                    passEdit = editField {
//                        hint = getString(R.string.password)
//                        inputType = EditorInfo.TYPE_CLASS_TEXT or EditorInfo.TYPE_TEXT_VARIATION_WEB_PASSWORD
//                    }
//                    confirmPassEdit = editField {
//                        hint = getString(R.string.confirm_your_password)
//                        inputType = EditorInfo.TYPE_CLASS_TEXT or EditorInfo.TYPE_TEXT_VARIATION_WEB_PASSWORD
//                    }
//                    messageView = textView {
//                        padding = PARAM_LAYOUT * 4
//                        textColor = Color.RED
//                        textSize = (PARAM_LAYOUT * 2).toFloat()
//                        visibility = View.GONE
//                        gravity = Gravity.CENTER_HORIZONTAL
//                    }.lparams(width = matchParent)
//                }.lparams(width = matchParent) {
//                    gravity = Gravity.CENTER
//                }
//            }.lparams(width = matchParent, height = matchParent)
//            floatingButton {
//                imageResource = R.drawable.ic_save
//                onClick {
//                    if (nameEdit.isEmpty()) {
//                        nameEdit.requestFocus()
//                        setMessageViewContent(getString(R.string.name_must_fill))
//                    } else if (usernameEdit.isEmpty()) {
//                        usernameEdit.requestFocus()
//                        setMessageViewContent(getString(R.string.username_must_fill))
//                    } else if (passEdit.isEmpty()) {
//                        passEdit.requestFocus()
//                        setMessageViewContent(getString(R.string.password_must_fill))
//                    } else if (passEdit.content != confirmPassEdit.content) {
//                        confirmPassEdit.requestFocus()
//                        setMessageViewContent(getString(R.string.password_must_match))
//                    } else {
//                        val user = User(usernameEdit.content.trim(), passEdit.content, nameEdit.content.trim())
//                        presenter.signUp(user)
//                    }
//                }
//            }.lparams {
//                margin = resources.getDimensionPixelSize(R.dimen.fab_margin)
//                gravity = Gravity.BOTTOM or GravityCompat.END
//            }
//        }
//    }
//
//    override fun setMessageViewText(message: String) {
//        setMessageViewContent(message)
//    }
//}