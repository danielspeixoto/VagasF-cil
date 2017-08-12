package com.baworks.baworks.model.pojo

import android.graphics.Bitmap
import kotlin.collections.ArrayList

/**
 * Created by daniel on 8/10/17.
 */
//data class User(
//        var email: String? = null,
//        var password: String? = null,
//        var name: String? = null,
//        var id: Int? = null,
//        var cpf: Int? = null,
//        var isMan: Boolean? = null,
//        var race: Race? = null,
//        var zone: Zone = Zone.Urbana,
//        var location: String? = null,
//        var scolarity: String? = null,
//        var formation: String? = null,
//        var occupation: Job? = null,
//        var skills: ArrayList<Skill> = arrayListOf(),
//        var bithDate: String? = null
//)

data class User (var name: String? = null,
                 var email: String? = null,
                 var pass: String? = null,
                 var gender: String? = null,
                 var state: String? = null,
                 var birth: String? = null,
                 var phone: String? = null,
                 var city: String? = null,
                 var hood: String? = null,
                 var cpf: String? = null,
                 var about: String? = null,
                 var job: String? = null,
                 var image: Bitmap? = null,
                 var skills: ArrayList<String> = arrayListOf())