package ru.misha.study.building.company.repository.implimentation

import ru.misha.study.building.company.model.impl.Worker
import ru.misha.study.building.company.repository.BuildingRepository
import ru.misha.study.building.company.repository.DefaultBuildingRepository

class WorkerRepository(override val store: MutableSet<Worker>): DefaultBuildingRepository<Worker>()
