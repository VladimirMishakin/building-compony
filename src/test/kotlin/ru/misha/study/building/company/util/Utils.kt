package ru.misha.study.building.company.util

import ru.misha.study.building.company.model.impl.*
import java.io.File


fun createOrder() = Order(
        client = Client(
                name = "Vovello",
                surname = "Hreniv",
                lastName = "Invaniv",
                telephoneNumber = "89611865868",
                companyName = "OOO",
                orderNumber = 204923049,
                numberOfOrder = 1,
                priceOrder = 29993030,
                clientTypes = ClientType.PRIVATE_PERSON
        ),
        workers = listOf(generateWorker()),
        contract = Document(name = "Trololo", file = File(""))
)

fun generateWorker() = Worker(
        name = "Vovello",
        surname = "Hreniv",
        lastName = "Invaniv",
        age = 27,
        telephoneNumber = "89611865868",
        position = Position.DESIGNER,
        ordersInWork = emptyList()
)