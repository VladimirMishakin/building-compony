package ru.misha.study.building.company.model.impl

import ru.misha.study.building.company.model.Entity
import ru.misha.study.building.company.model.StageOfWork
import kotlin.random.Random

/**
 * This class contains information about object.
 * When we use this class we can have information about object, adress, stage of work, notes and rediness.
 * For example:
 *
 *
 */
data class Object(
        override val id: Int = Random.nextInt(),
        val rooms: List<Room>,
        val address: Address,
        val stagesOfWork: List<StageOfWork>,
        val plan: Document,
        val designProject: Document,
        val estimate: Document,
        val notes: String,
        val readiness: String,
) : Entity(id)