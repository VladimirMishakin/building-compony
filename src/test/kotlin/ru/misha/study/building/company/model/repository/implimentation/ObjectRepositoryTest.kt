package ru.misha.study.building.company.model.repository.implimentation

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Order
import org.junit.jupiter.api.Test
import ru.misha.study.building.company.model.StageOfWork
import ru.misha.study.building.company.model.impl.*
import ru.misha.study.building.company.repository.implimentation.ObjectRepository
import java.io.File

class ObjectRepositoryTest {
    private val objectRepository: ObjectRepository = ObjectRepository(mutableSetOf())

    private val Object = Object(
        rooms = listOf(Room(square = 3, width = 6, height = 6, length = 6, roomType =  RoomType.COMMERCIAL)),
        address = Address(
                region = "Voronezhskay",
                locality = "Voronezh",
                street = "Morozova",
                home = "99",
                floor = "3",
                numberRoom = "33"),
        stagesOfWork = listOf(StageOfWork.ARCHITECTING),
        plan = Document(name = "NameDocument1", file = File("1")),
        designProject = Document(name = "NameDocument2", file = File("2")),
        estimate = Document(name = "NameDocument3", file = File("3")),
        notes = "zametka",
        readiness = "ready",
        )

    @Test
    @Order(0)
    fun `Happy pass - save a new object`() {
        objectRepository.save(
                Object
        )
        Assertions.assertThat(objectRepository.findAll()).size().isEqualTo(1)
    }

    @Test
    @Order(2)
    fun findOne() {
        objectRepository.save(
                Object
        )
        Assertions.assertThat(objectRepository.findOne(Object.id)).isEqualTo(Object)
    }

    @Test
    @Order(3)
    fun findAll() {
        objectRepository.save(
                Object
        )
        Assertions.assertThat(objectRepository.findAll()).size().isEqualTo(1)
    }

    @Test
    @Order(5)
    fun delete() {
        objectRepository.save(
                Object
        )
        org.junit.jupiter.api.Assertions.assertTrue(objectRepository.delete(Object))
        Assertions.assertThat(objectRepository.findAll()).size().isEqualTo(0)
    }
}
