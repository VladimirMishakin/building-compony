package ru.misha.study.building.company.repository.implimentation

import ru.misha.study.building.company.model.impl.Address
import ru.misha.study.building.company.model.impl.Order
import ru.misha.study.building.company.repository.DefaultBuildingRepository

class AddressRepository(override val store: MutableSet<Address>) : DefaultBuildingRepository<Address>()