package ru.misha.study.building.company.repository


interface BuildingRepository<O> {
        abstract val store: MutableSet<O>

        fun save(element: O): O
        fun findOne(id: Int): O
        fun findAll(): Set<O>
        fun delete(element: O): Boolean
}

