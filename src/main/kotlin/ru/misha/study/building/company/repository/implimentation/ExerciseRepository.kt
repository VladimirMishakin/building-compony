package ru.misha.study.building.company.repository.implimentation

import ru.misha.study.building.company.model.impl.Exercise
import ru.misha.study.building.company.repository.BuildingRepository
import ru.misha.study.building.company.repository.DefaultBuildingRepository

class ExerciseRepository(override val store: MutableSet<Exercise>): DefaultBuildingRepository<Exercise>()

