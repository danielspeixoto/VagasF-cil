package com.baworks.baworks.view.fragments

import android.graphics.Color
import android.os.Bundle
import android.support.v4.app.Fragment
import android.text.InputType
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.baworks.baworks.R
import com.baworks.baworks.view.custom.editField
import org.jetbrains.anko.*
import org.jetbrains.anko.support.v4.UI


/**
 * Created by daniel on 8/11/17.
 */
class ProfileFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        return UI {
            verticalLayout {
                lparams(width = matchParent, height = matchParent)
                linearLayout {
                    verticalLayout {
                        imageView {
                            backgroundColor = Color.GRAY
                        }.lparams(400, 400) {
                            leftPadding = 20
                            bottomPadding = leftPadding
                            margin = 40
                        }
                        editField {
                            hint = "Dia que nasceu"
                            inputType = InputType.TYPE_TEXT_VARIATION_WEB_EMAIL_ADDRESS
                        }
                        editField {
                            hint = "DDD + Celular"
                            inputType = InputType.TYPE_TEXT_VARIATION_WEB_EMAIL_ADDRESS
                        }
                        editField {
                            hint = "Cidade"
                            inputType = InputType.TYPE_TEXT_VARIATION_WEB_EMAIL_ADDRESS
                        }
                        editField {
                            hint = "Bairro"
                            inputType = InputType.TYPE_TEXT_VARIATION_WEB_EMAIL_ADDRESS
                        }
                    }.lparams(width = 500) {
                        rightMargin = 50
                    }
                    verticalLayout {
                        editField {
                            hint = "Nome"
                            inputType = InputType.TYPE_TEXT_VARIATION_WEB_EMAIL_ADDRESS
                        }
                        editField {
                            hint = "CPF"
                            inputType = InputType.TYPE_TEXT_VARIATION_WEB_EMAIL_ADDRESS
                        }
                        editField {
                            hint = "Sexo"
                            inputType = InputType.TYPE_TEXT_VARIATION_WEB_EMAIL_ADDRESS
                        }
                        editField {
                            hint = "Email"
                            inputType = InputType.TYPE_TEXT_VARIATION_WEB_EMAIL_ADDRESS
                        }
                        editField {
                            hint = "Estado"
                            inputType = InputType.TYPE_TEXT_VARIATION_WEB_EMAIL_ADDRESS
                        }
                    }.lparams(width = 500)
                }.lparams(width = matchParent, height = wrapContent)
                imageButton() {
                    imageResource = R.drawable.loginfacebook
                    scaleType = ImageView.ScaleType.FIT_CENTER
                    backgroundColor = Color.TRANSPARENT
                }.lparams(width = matchParent) {
                   margin = 40
                }
            }
        }.view
    }
}
