package ru.misha.study.building.company.repository.implimentation

import ru.misha.study.building.company.model.impl.Room
import ru.misha.study.building.company.repository.BuildingRepository
import ru.misha.study.building.company.repository.DefaultBuildingRepository

class RoomRepository(override val store: MutableSet<Room>): DefaultBuildingRepository<Room>()
