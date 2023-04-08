package ru.misha.study.building.company.repository

import ru.misha.study.building.company.model.Entity

abstract class DefaultBuildingRepository<O: Entity> : BuildingRepository<O> {

    override fun save(element: O): O {
        store.add(element)
        return element
    }

    override fun findOne (id: Int): O {
        return store.first {it.id == id}
    }

    override fun findAll(): Set<O> {
        return store
    }

    override fun delete(element: O): Boolean {
        return store.remove(element)
    }
}