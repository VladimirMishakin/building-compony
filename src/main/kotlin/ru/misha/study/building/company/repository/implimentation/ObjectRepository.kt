package ru.misha.study.building.company.repository.implimentation

import ru.misha.study.building.company.model.impl.Object
import ru.misha.study.building.company.repository.BuildingRepository
import ru.misha.study.building.company.repository.DefaultBuildingRepository

class ObjectRepository(override val store: MutableSet<Object>) : DefaultBuildingRepository<Object>()

