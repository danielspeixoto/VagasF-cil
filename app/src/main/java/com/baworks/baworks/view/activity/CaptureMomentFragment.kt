package com.baworks.baworks.view.activity

import android.text.Html
import android.graphics.Typeface
import android.widget.TextView
import android.os.Bundle
import android.view.ViewGroup
import android.view.LayoutInflater
import android.app.Activity
import android.support.v4.app.Fragment
import android.view.View
import android.widget.ImageView
import com.baworks.baworks.R


/**
 * Created by daniel on 8/11/17.
 */
class CaptureMomentFragment : Fragment(), View.OnClickListener {

    protected lateinit var mActivity: Activity
    private var mCamera: ImageView? = null
    private var intro: TextView? = null

    override fun onAttach(act: Activity) {
        super.onAttach(act)
        mActivity = act
    }

    override fun onCreate(saveInstanceState: Bundle?) {
        super.onCreate(saveInstanceState)
    }

    override fun onActivityCreated(saveInstanceState: Bundle?) {
        super.onActivityCreated(saveInstanceState)
    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                     savedInstanceState: Bundle?): View {
        val view = inflater.inflate(R.layout.info_dialog, container, false)

        return view
    }

    override fun onClick(v: View) {
        //do whatever you want here
    }
}
