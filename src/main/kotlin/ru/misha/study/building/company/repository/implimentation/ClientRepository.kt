package ru.misha.study.building.company.repository.implimentation

import ru.misha.study.building.company.model.impl.Client
import ru.misha.study.building.company.repository.BuildingRepository
import ru.misha.study.building.company.repository.DefaultBuildingRepository

class ClientRepository(override val store: MutableSet<Client>) : DefaultBuildingRepository<Client>()
