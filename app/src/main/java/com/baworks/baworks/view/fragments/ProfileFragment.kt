package com.baworks.baworks.view.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.view.GravityCompat
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.baworks.baworks.R
import com.baworks.baworks.model.UserModel
import com.baworks.baworks.model.pojo.User
import com.baworks.baworks.view.activity.HomeActivity
import com.baworks.baworks.view.custom.EditField
import com.baworks.baworks.view.custom.editField
import com.baworks.baworks.view.custom.floatingButton
import com.baworks.baworks.view.custom.tagList
import org.jetbrains.anko.*
import org.jetbrains.anko.design.coordinatorLayout
import org.jetbrains.anko.support.v4.UI
import android.graphics.Bitmap
import android.view.inputmethod.EditorInfo
import com.baworks.baworks.util.PARAM_LAYOUT
import com.baworks.baworks.view.fragments.VagaFragment.Companion.adp


/**
 * Created by daniel on 8/11/17.
 */
class ProfileFragment : Fragment() {

    lateinit var name : EditField
    lateinit var email : EditField
    lateinit var pass : EditField
    lateinit var gender : EditField
    lateinit var state : EditField
    lateinit var birth : EditField
    lateinit var phone : EditField
    lateinit var city: EditField
    lateinit var hood : EditField
    lateinit var cpf : EditField
    lateinit var about : EditField
    lateinit var job : EditField

    lateinit var img : ImageView

    var RESULT_LOAD_IMAGE = 3

    companion object {
        var skills : ArrayList<String> = arrayListOf()
    }
    lateinit var bmp : Bitmap

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {

        var user = UserModel.currentUser
        return UI {
            if(user == null) {
                coordinatorLayout {
                    scrollView {
                        verticalLayout {
                            lparams(width = matchParent, height = matchParent)
                            relativeLayout {
                                img = imageView {
                                    scaleType = ImageView.ScaleType.FIT_CENTER
                                    setOnClickListener({
                                        dispatchTakePictureIntent()
                                    })
                                }.lparams(width = 500, height = 500) {
                                    centerHorizontally()
                                    bottomMargin = 30
                                }
                            }.lparams(width = matchParent, height = 500)
                            img.setImageResource(R.drawable.insira_sua_foto_aqui_icon)
                            name = editField {
                                hint = "Nome"
                            }
                            email = editField {
                                hint = "Email"
                            }
                            pass = editField {
                                hint = "Senha"
                                inputType = EditorInfo.TYPE_CLASS_TEXT or EditorInfo.TYPE_TEXT_VARIATION_WEB_PASSWORD
                            }
                            about = editField {
                                hint = "Fale sobre você"
                                gravity = Gravity.START
                            }.lparams(height = 600, width = matchParent)
                            city = editField {
                                hint = "Cidade"
                            }
                            linearLayout {
                                verticalLayout {
                                    birth = editField {
                                        hint = "Dia que nasceu"
                                    }
                                    phone = editField {
                                        hint = "DDD + Celular"
                                    }

                                    hood = editField {
                                        hint = "Bairro"
                                    }
                                }.lparams(width = 495) {
                                    rightMargin = 30
                                }
                                verticalLayout {
                                    cpf = editField {
                                        hint = "CPF"
                                    }
                                    gender = editField {
                                        hint = "Sexo"
                                    }

                                    state = editField {
                                        hint = "Estado"
                                    }

                                }.lparams(width = 495) {
                                }
                            }.lparams(width = matchParent, height = wrapContent)
                            editField {
                                hint = "Escolaridade"
                            }.lparams(width = matchParent)
                            job = editField {
                                hint = "Cargo a exercer"
                            }.lparams(width = matchParent)
                            editField {
                                hint = "Descreva suas experiências anteriores"
                                gravity = Gravity.START
                            }.lparams(width = matchParent, height = 600)
                            tagList {
                                edit.hint = "Quais são suas habilidades?"
                            }.lparams(width = matchParent) {
                                bottomMargin = 200
                            }
                        }.lparams {
                            rightMargin = 30
                            leftMargin = 30
                        }
                    }.lparams(width = matchParent)
                    floatingButton {
                        imageResource = R.drawable.ic_save
                        setOnClickListener({
                            UserModel.currentUser = (User(
                                    name.text.toString(),
                                    email.text.toString(),
                                    pass.text.toString(),
                                    gender.text.toString(),
                                    state.text.toString(),
                                    birth.text.toString(),
                                    phone.text.toString(),
                                    city.text.toString(),
                                    hood.text.toString(),
                                    cpf.text.toString(),
                                    about.text.toString(),
                                    job.text.toString(),
                                    bmp
                            ))

                            UserModel.currentUser!!.skills = skills
                            if(VagaFragment.adp != null) {
                                adp.filter(skills)
                            }
                            val transaction = fragmentManager.beginTransaction()
                            transaction.detach(this@ProfileFragment)
                            transaction.attach(this@ProfileFragment)
                            transaction.commit()

                            HomeActivity.mViewPager!!.setCurrentItem(2)

                        })
                    }.lparams {
                        margin = resources.getDimensionPixelSize(R.dimen.fab_margin)
                        gravity = Gravity.BOTTOM or GravityCompat.END
                    }
                }
            } else {

                verticalLayout {
                    relativeLayout() {
                        var image = imageView {
                            id = 2342
                        }.lparams(width = 500, height = 500) {
                            centerHorizontally()
                            topMargin = 100
                            bottomMargin = 50
                        }
                        image.setImageBitmap(user.image)
                        var name = textView(user.name) {
                            id = 2343
                            textSize = (PARAM_LAYOUT * 3).toFloat()
                            bottomPadding = PARAM_LAYOUT
                        }.lparams {
                            centerHorizontally()
                            below(image)
                        }
                        var job = textView(user.job) {
                            id = 2347
                            textSize = (PARAM_LAYOUT * 2).toFloat()
                            bottomPadding = 50
                        }.lparams {
                            centerHorizontally()
                            below(name)
                        }
                        var about = textView(user.about) {
                            id = 23121
                            textSize = (PARAM_LAYOUT * 2 ).toFloat()
                            padding = PARAM_LAYOUT * 2
                        }.lparams {
                            centerHorizontally()
                            below(job)
                        }

                    }

                }
            }
        }.view
    }

    private fun dispatchTakePictureIntent() {
        val takePictureIntent = android.content.Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE)
        if (takePictureIntent.resolveActivity(activity.packageManager) != null) {
            startActivityForResult(takePictureIntent, RESULT_LOAD_IMAGE)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: android.content.Intent?) {
        if (requestCode == RESULT_LOAD_IMAGE && resultCode == android.app.Activity.RESULT_OK) {
            val extras = data!!.getExtras()
            var imageBitmap = extras.get("data") as android.graphics.Bitmap
            bmp = imageBitmap
            img.setImageBitmap(imageBitmap)
        }
    }
}
