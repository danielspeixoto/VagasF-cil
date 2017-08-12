package com.baworks.baworks.view.recycler

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import com.baworks.baworks.model.pojo.Vaga
import com.baworks.baworks.util.PARAM_LAYOUT
import com.baworks.baworks.util.PreencheVagas
import com.baworks.baworks.view.activity.BaseActivity
import com.baworks.baworks.view.activity.InfoJobActivity
import com.baworks.baworks.view.fragments.VagaFragment
import com.baworks.baworks.view.recycler.holder.BaseHolder
import org.jetbrains.anko.*
import org.jetbrains.anko.cardview.v7.cardView

/**
 * Created by daniel on 8/12/17.
 */
class VagasAdapter(activity: Context) :
        BaseAdapter<Vaga>(activity) {

    companion object {
        var color = 0
    }

    override fun onCreateViewHolder(parent: ViewGroup?,
                                    viewType: Int): RecyclerView.ViewHolder {
        return ItemUI().createHolder(AnkoContext.create(parent!!.context,
                parent))

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder,
                                  position: Int) {
        holder as VagaHolder
        holder.item = data[position]
        holder.adapter = this
        holder.onPostCreated()


    }

    fun filter(list : ArrayList<String>) {
        var vagas = PreencheVagas().vagas
        for(i in 0 .. vagas.size - 1) {
            for(j in 0 .. vagas[i].caracteristicas.size - 1) {
                if(list.contains(vagas[i].caracteristicas[j])) {
                    addItem(vagas[i])
                    break
                }
            }
        }
    }

    class ItemUI : AnkoComponent<ViewGroup> {

        lateinit var nameText: TextView
        lateinit var descriptionText : TextView

        override fun createView(ui: AnkoContext<ViewGroup>): View {
            return with(ui) {
                verticalLayout {
                    color++
                    if(color % 2 == 0) {
                        backgroundColor = Color.rgb(150,180,255)
                    }
                    lparams(width = matchParent) {
                        padding = (PARAM_LAYOUT * 2)
                        leftPadding = (PARAM_LAYOUT * 4)
                        rightPadding = leftPadding
                    }
                    nameText = textView {
                        textColor = Color.BLUE
                        textSize = (PARAM_LAYOUT * 2).toFloat()
                    }
                    nameText.setTypeface(null, Typeface.BOLD);
                    descriptionText = textView {
                        textColor = Color.BLUE
                        textSize = PARAM_LAYOUT.toFloat() * 2
                    }

                }
            }
        }

        fun createHolder(ui: AnkoContext<ViewGroup>): VagaHolder {
            val holder = VagaHolder(createView(ui))
            holder.nameText = nameText
            holder.descriptionText = descriptionText
            return holder
        }

    }

    class VagaHolder(itemView: View) : BaseHolder<Vaga>(itemView) {

        lateinit var nameText: TextView
        lateinit var descriptionText: TextView

        override fun onPostCreated() {
            nameText.text = item!!.titulo
            descriptionText.text = item!!.descricao
            itemView.setOnClickListener({
                val intent = Intent(adapter.activity,
                        InfoJobActivity::class.java)
                intent.putExtra("vaga",
                        item)
                adapter.activity.startActivity(intent)
            })
        }
    }

}