package ru.misha.study.building.company.model.repository.implimentation

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import ru.misha.study.building.company.repository.implimentation.OrderRepository
import ru.misha.study.building.company.util.createOrder

class OrderRepositoryTest {
    private val orderRepository: OrderRepository = OrderRepository(mutableSetOf())

    private val order = createOrder()

    @Test
    fun `Happy pass - save a new order`() {
        orderRepository.save(order)
        Assertions.assertThat(orderRepository.findAll()).size().isEqualTo(1)
    }

    @Test
    fun findOne() {
        orderRepository.save(order)
        Assertions.assertThat(orderRepository.findOne(order.id)).isEqualTo(order)
    }

    @Test
    fun findAll() {
        orderRepository.save(order)
        Assertions.assertThat(orderRepository.findAll()).size().isEqualTo(1)
    }

    @Test
    fun delete() {
        orderRepository.save(order)
        org.junit.jupiter.api.Assertions.assertTrue(orderRepository.delete(order))
        Assertions.assertThat(orderRepository.findAll()).size().isEqualTo(0)
    }
}
