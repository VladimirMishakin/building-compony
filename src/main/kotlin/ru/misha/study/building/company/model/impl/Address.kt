package ru.misha.study.building.company.model.impl

import ru.misha.study.building.company.model.Entity
import kotlin.random.Random.Default.nextInt

/**
 * This class contains information about address object
 * When we use this class we can have location and place object.
 * For example:
    * Address(Voronez region, Voronezh, Puskina, 12, 23, 11)
 *
 */

data class Address(
        override val id: Int = nextInt(),
        val region: String,
        val locality: String,
        val street: String,
        val home: String,
        val floor: String,
        val numberRoom: String,
) : Entity(id)