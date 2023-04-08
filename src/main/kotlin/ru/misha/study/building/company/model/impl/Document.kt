package ru.misha.study.building.company.model.impl

import ru.misha.study.building.company.model.Entity
import java.io.File
import kotlin.random.Random

data class Document(
        override val id: Int = Random.nextInt(),
        val name: String,
        val file: File,
) : Entity(id)
