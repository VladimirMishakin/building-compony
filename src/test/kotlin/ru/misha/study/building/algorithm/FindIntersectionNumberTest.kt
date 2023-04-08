package ru.misha.study.building.algorithm

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class FindIntersectionNumberTest {

    @Test
    fun `Happy pass - find all intersection numbers`() {
        Assertions.assertThat(whatIntersectionNumbers(listOf(1, 2, 3, 4), listOf(2, 3)).toList()).isEqualTo(listOf(2, 3))
        Assertions.assertThat(whatIntersectionNumbers(listOf(), listOf()).toList()).isEqualTo(emptyList<Int>())
        Assertions.assertThat(whatIntersectionNumbers(listOf(0, 0, 0, 0), listOf(0)).toList()).isEqualTo(listOf(0))
        Assertions.assertThat(whatIntersectionNumbers(listOf(0, 2, 3, 1, 1), listOf(1)).toList()).isEqualTo(listOf(1))
    }

    private fun whatIntersectionNumbers(array: List<Int>, forFinding: List<Int>): Set<Int> {
        val result = mutableSetOf<Int>()
        for (a: Int in array) {
            for (b: Int in forFinding) {
                if (a == b) {
                    result.add(a)
                }
            }
        }
        return result
    }
}
