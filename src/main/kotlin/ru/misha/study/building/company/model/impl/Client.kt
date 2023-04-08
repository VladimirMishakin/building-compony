package ru.misha.study.building.company.model.impl

import ru.misha.study.building.company.model.Entity
import kotlin.random.Random

/**
 * This class contains information about client.
 * For example:
    * Client (Vladimir, Mishakin, Sergeevich, MIG, 89611865868, 23, 120000, PRIVATE_PERSON)
 *
 */
data class Client(
        override val id: Int = Random.nextInt(),
        val name: String,
        val surname: String,
        val lastName: String,
        val companyName: String,
        val telephoneNumber: String,
        val orderNumber: Long,
        val numberOfOrder: Long,
        val priceOrder: Long,
        val clientTypes: ClientType,
) : Entity(id)

enum class ClientType {
    PRIVATE_PERSON,
    LAWYER_PERSON
}