package ru.misha.study.building.company.model.repository.implimentation

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import ru.misha.study.building.company.model.impl.*
import ru.misha.study.building.company.repository.implimentation.ExerciseRepository
import ru.misha.study.building.company.util.createOrder
import ru.misha.study.building.company.util.generateWorker
import java.io.File
import java.time.LocalDateTime

class ExerciseRepositoryTest {
    private val exerciseRepository: ExerciseRepository = ExerciseRepository(mutableSetOf())

    private val exercise = Exercise(
            worker = generateWorker(),
            order = createOrder(),
            time = LocalDateTime.now(),
            note = "zametka",
    )

    @Test
    @org.junit.jupiter.api.Order(0)
    fun `Happy pass - save a new exercise`() {
        exerciseRepository.save(
                exercise
        )
        Assertions.assertThat(exerciseRepository.findAll()).size().isEqualTo(1)
    }

    @Test
    @org.junit.jupiter.api.Order(2)
    fun findOne() {
        exerciseRepository.save(
                exercise
        )
        Assertions.assertThat(exerciseRepository.findOne(exercise.id)).isEqualTo(exercise)
    }

    @Test
    @org.junit.jupiter.api.Order(3)
    fun findAll() {
        exerciseRepository.save(
                exercise
        )
        Assertions.assertThat(exerciseRepository.findAll()).size().isEqualTo(1)
    }

    @Test
    @org.junit.jupiter.api.Order(5)
    fun delete() {
        exerciseRepository.save(
                exercise
        )
        org.junit.jupiter.api.Assertions.assertTrue(exerciseRepository.delete(exercise))
        Assertions.assertThat(exerciseRepository.findAll()).size().isEqualTo(0)
    }
}
