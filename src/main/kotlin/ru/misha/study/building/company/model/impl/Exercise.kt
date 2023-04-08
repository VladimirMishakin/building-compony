package ru.misha.study.building.company.model.impl

import ru.misha.study.building.company.model.Entity
import java.time.LocalDateTime
import kotlin.random.Random

/**
 * This class contains information about exercise
 * When we use this class we can have information about exercise and how do it this exercise
 * For example:
    * Exercise (Installer, 121, 12.12.12, ready)
 *
 */
data class Exercise(
        override val id: Int = Random.nextInt(),
        val worker: Worker,
        val order: Order,
        val time: LocalDateTime,
        val note: String,
) : Entity(id)