package com.baworks.baworks.view.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.baworks.baworks.model.UserModel
import com.baworks.baworks.model.pojo.Vaga
import com.baworks.baworks.util.PreencheVagas
import com.baworks.baworks.view.recycler.VagasAdapter
import org.jetbrains.anko.recyclerview.v7.recyclerView
import org.jetbrains.anko.support.v4.UI

/**
 * Created by daniel on 8/12/17.
 */
class VagaFragment : Fragment() {

    lateinit var list : RecyclerView
    companion object {

        lateinit var adp : VagasAdapter
    }

    var vagas : ArrayList<Vaga> = arrayListOf()

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        adp = VagasAdapter(activity = activity)
        vagas = PreencheVagas().vagas

        var user = UserModel.currentUser
        adp.clearData()
        if(user != null) {
            //Log.d("dsdsds", user!!.skills.toString())
            for(i in 0 .. vagas.size - 1) {
                for(j in 0 .. vagas[i].caracteristicas.size - 1) {
                    if(user.skills.contains(vagas[i].caracteristicas[j])) {
                        adp.addItem(vagas[i])
                        break
                    }
                }
            }
        }

        return UI {
            list = recyclerView {
                adapter = adp
                layoutManager = LinearLayoutManager(activity)
            }

        }.view
    }
}