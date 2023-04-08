package ru.misha.study.building.company.repository.implimentation

import ru.misha.study.building.company.model.impl.Order
import ru.misha.study.building.company.repository.DefaultBuildingRepository

class OrderRepository (override val store: MutableSet<Order>) : DefaultBuildingRepository<Order>()