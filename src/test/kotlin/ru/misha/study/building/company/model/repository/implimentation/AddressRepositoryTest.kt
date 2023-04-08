package ru.misha.study.building.company.model.repository.implimentation

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Order
import org.junit.jupiter.api.Test
import ru.misha.study.building.company.model.impl.Address
import ru.misha.study.building.company.repository.implimentation.AddressRepository

class AddressRepositoryTest {
    private val addressRepository: AddressRepository = AddressRepository(mutableSetOf())

    private val address = Address(
            region = "VoronezhskayOblast",
            locality = "Voronezh",
            street = "Morozova",
            home = "99",
            floor = "88",
            numberRoom = "11"
    )

    @Test
    @Order(0)
    fun `Happy pass - save a new address`() {
        addressRepository.save(
                address
        )
        Assertions.assertThat(addressRepository.findAll()).size().isEqualTo(1)
    }

    @Test
    @Order(2)
    fun findOne() {
        addressRepository.save(
                address
        )
        Assertions.assertThat(addressRepository.findOne(address.id)).isEqualTo(address)
    }

    @Test
    @Order(3)
    fun findAll() {
        addressRepository.save(
                address
        )
        Assertions.assertThat(addressRepository.findAll()).size().isEqualTo(1)
    }

    @Test
    @Order(5)
    fun delete() {
        addressRepository.save(
                address
        )
        org.junit.jupiter.api.Assertions.assertTrue(addressRepository.delete(address))
        Assertions.assertThat(addressRepository.findAll()).size().isEqualTo(0)
    }
}
