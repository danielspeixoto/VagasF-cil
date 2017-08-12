package com.baworks.baworks.view.recycler.holder

import android.support.v7.widget.RecyclerView
import android.view.View
import com.baworks.baworks.view.recycler.BaseAdapter

/**
 * Created by daniel on 8/12/17.
 */
abstract class BaseHolder<O>(itemView: View) :
        RecyclerView.ViewHolder(itemView) {

    var item: O? = null
    lateinit var adapter : BaseAdapter<O>

    abstract fun onPostCreated()

}