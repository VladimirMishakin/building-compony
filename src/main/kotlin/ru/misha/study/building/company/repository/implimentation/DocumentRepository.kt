package ru.misha.study.building.company.repository.implimentation

import ru.misha.study.building.company.model.impl.Document
import ru.misha.study.building.company.repository.DefaultBuildingRepository

class DocumentRepository(override val store: MutableSet<Document>) : DefaultBuildingRepository<Document>()
