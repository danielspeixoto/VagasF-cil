package com.baworks.baworks.view.activity

import android.graphics.Color
import android.os.Bundle
import android.widget.ImageView
import com.baworks.baworks.R
import org.jetbrains.anko.*

/**
 * Created by daniel on 8/12/17.
 */
class TutorialActivity : BaseActivity() {

    lateinit var image : ImageView
    var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var pics = arrayOf( R.drawable.b, R.drawable.c, R.drawable.d)
        linearLayout {
            lparams(width = matchParent, height = matchParent)
            image = imageView {
                setOnClickListener({
                    if(counter < pics.size) {
                        setImageResource(pics[counter++])
                    } else {
                        startActivity<HomeActivity>()
                        finish()
                    }
                })
            }.lparams(width = matchParent, height = matchParent) {
                backgroundColor = Color.rgb(0,1,127)
            }
        }
        image.setImageResource(R.drawable.start)

    }
}