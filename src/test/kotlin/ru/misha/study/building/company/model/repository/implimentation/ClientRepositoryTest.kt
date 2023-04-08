package ru.misha.study.building.company.model.repository.implimentation

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Order
import org.junit.jupiter.api.Test
import ru.misha.study.building.company.model.impl.Client
import ru.misha.study.building.company.model.impl.ClientType
import ru.misha.study.building.company.repository.implimentation.ClientRepository

class ClientRepositoryTest {
    private val clientRepository: ClientRepository = ClientRepository(mutableSetOf())

    private val client = Client(
            name = "Vovello",
            surname = "Misha",
            lastName = "Mishakovich",
            companyName = "GoldDragon",
            telephoneNumber = "896118658568",
            orderNumber = 1,
            numberOfOrder = 3,
            priceOrder = 2500,
            clientTypes = ClientType.PRIVATE_PERSON,
    )

    @Test
    @Order(0)
    fun `Happy pass - save a new client`() {
        clientRepository.save(
                client
        )
        Assertions.assertThat(clientRepository.findAll()).size().isEqualTo(1)
    }

    @Test
    @Order(2)
    fun findOne() {
        clientRepository.save(
                client
        )
        Assertions.assertThat(clientRepository.findOne(client.id)).isEqualTo(client)
    }

    @Test
    @Order(3)
    fun findAll() {
        clientRepository.save(
                client
        )
        Assertions.assertThat(clientRepository.findAll()).size().isEqualTo(1)
    }

    @Test
    @Order(5)
    fun delete() {
        clientRepository.save(
                client
        )
        org.junit.jupiter.api.Assertions.assertTrue(clientRepository.delete(client))
        Assertions.assertThat(clientRepository.findAll()).size().isEqualTo(0)
    }
}
