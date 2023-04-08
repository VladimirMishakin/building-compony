package ru.misha.study.building.company.model.repository.implimentation

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Order
import org.junit.jupiter.api.Test
import ru.misha.study.building.company.model.impl.Room
import ru.misha.study.building.company.model.impl.RoomType
import ru.misha.study.building.company.repository.implimentation.RoomRepository

class RoomRepositoryTest {

    private val roomRepository: RoomRepository = RoomRepository(mutableSetOf())

    private val room = Room(
            square = 36,
            width = 3,
            height = 6,
            length = 6,
            roomType = RoomType.COMMERCIAL
    )

    @Test
    @Order(0)
    fun `Happy pass - save a new room`() {
        roomRepository.save(
                room
        )
        Assertions.assertThat(roomRepository.findAll()).size().isEqualTo(1)
    }

    @Test
    @Order(2)
    fun findOne() {
        roomRepository.save(
                room
        )
        Assertions.assertThat(roomRepository.findOne(room.id)).isEqualTo(room)
    }

    @Test
    @Order(3)
    fun findAll() {
        roomRepository.save(
                room
        )
        Assertions.assertThat(roomRepository.findAll()).size().isEqualTo(1)
    }

    @Test
    @Order(5)
    fun delete() {
        roomRepository.save(
                room
        )
        org.junit.jupiter.api.Assertions.assertTrue(roomRepository.delete(room))
        Assertions.assertThat(roomRepository.findAll()).size().isEqualTo(0)
    }
}
