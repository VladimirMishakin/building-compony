package ru.misha.study.building.company.model.impl

import ru.misha.study.building.company.model.Entity
import kotlin.random.Random
import kotlin.random.Random.Default.nextInt

/**
 * This class contains all fields for describing a real room.
 * When we use this class we can have access to geometric shape and different properties.
 * For example:
 *  Worker(
 */
data class Worker(
        override val id: Int = Random.nextInt(),
        val name: String,
        val surname: String,
        val lastName: String,
        val telephoneNumber: String,
        val age: Int,
        val position: Position,
        val ordersInWork: List<Order>
) : Entity(id)

/**
 *
 */
enum class Position {
    ENGINEER, MANAGER, ARCHITECT, DESIGNER, FOREMAN, INSTALLER, PLUMBER, ELECTRICIAN, PAINTER, PLASTER
}

