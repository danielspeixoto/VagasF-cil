package com.baworks.baworks.model.pojo

import com.baworks.baworks.util.Race
import com.baworks.baworks.util.Zone
import java.util.*

/**
 * Created by daniel on 8/10/17.
 */
data class User(
        var email: String? = null,
        var password: String? = null,
        var name: String? = null,
        var id: Int? = null,
        var cpf: Int? = null,
        var isMan: Boolean? = null,
        var race: Race? = null,
        var zone: Zone = Zone.Urbana,
        var location: String? = null,
        var scolarity: String? = null,
        var formation: String? = null,
        var occupation: Job? = null,
        var skills: ArrayList<Skill> = arrayListOf(),
        var bithDate: String? = null
)