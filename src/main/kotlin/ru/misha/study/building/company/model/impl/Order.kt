package ru.misha.study.building.company.model.impl

import ru.misha.study.building.company.model.Entity
import kotlin.random.Random

data class Order (
        override val id: Int = Random.nextInt(),
        val client: Client,
        val workers: List<Worker>,
        val contract: Document
) : Entity(id)