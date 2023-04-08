package ru.misha.study.building.algorithm

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class FindIntersectionTest {

    @Test
    fun `Happy pass - find Intersection`() {
        Assertions.assertThat(findIntersection(listOf(1, 2, 3, 4), 4)).isEqualTo(1)
        Assertions.assertThat(findIntersection(listOf(0, 0, 0, 0), 0)).isEqualTo(4)
        Assertions.assertThat(findIntersection(listOf(0, 2, 3, 1, 1), 1)).isEqualTo(2)
        Assertions.assertThat(findIntersection(listOf(), 1)).isEqualTo(0)
    }

    private fun findIntersection(list: List<Int>, forFinding: Int): Int {
        val result = mutableListOf<Int>()
        for (a: Int in list)
            if (a == forFinding) {
                result.add(a)
            }
        return result.size
    }
}