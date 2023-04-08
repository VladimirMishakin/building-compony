package ru.misha.study.building.company.model.impl

import ru.misha.study.building.company.model.Entity
import kotlin.random.Random

/**
 * This class contains all fields for describing a real room.
 * When we use this class we can have access to geometric shape and different properties.
 * For example:
     *  Room(10.0, 15.0, 5.0, 7.0, COMMERCIAL)
 *
 */
data class Room(
        override val id: Int = Random.nextInt(),
        val square: Int,
        val width: Int,
        val height: Int,
        val length: Int,
        val roomType: RoomType,
) : Entity(id)

/**
 *
 */
enum class RoomType {
    COMMERCIAL,
    LIFE,
    STOCK,
    INDUSTRIAL
}