package ru.misha.study.building.company.model.repository.implimentation

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.MethodOrderer
import org.junit.jupiter.api.Order
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestMethodOrder
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.junit.jupiter.MockitoExtension
import ru.misha.study.building.company.model.impl.Position
import ru.misha.study.building.company.model.impl.Worker
import ru.misha.study.building.company.repository.implimentation.WorkerRepository

@ExtendWith(MockitoExtension::class)
@TestMethodOrder(MethodOrderer.OrderAnnotation::class)
class WorkerRepositoryTest {
    private val workerRepository: WorkerRepository = WorkerRepository(mutableSetOf())

    private val worker = Worker(
            name = "Vovchela",
            surname = "Lemonchelo",
            lastName = "The best man in the world",
            telephoneNumber = "big dig",
            age = 33,
            position = Position.MANAGER,
            ordersInWork = emptyList()
    )

    @Test
    @Order(0)
    fun `Happy pass - save a new worker`() {
        workerRepository.save(
                worker
        )
        assertThat(workerRepository.findAll()).size().isEqualTo(1)
    }

    @Test
    @Order(2)
    fun findOne() {
        workerRepository.save(
                worker
        )
        assertThat(workerRepository.findOne(worker.id)).isEqualTo(worker)
    }

    @Test
    @Order(3)
    fun findAll() {
        workerRepository.save(
                worker
        )
        assertThat(workerRepository.findAll()).size().isEqualTo(1)
    }

    @Test
    @Order(5)
    fun delete() {
        workerRepository.save(
                worker
        )
        assertTrue(workerRepository.delete(worker))
        assertThat(workerRepository.findAll()).size().isEqualTo(0)
    }
}