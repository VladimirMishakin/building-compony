package ru.misha.study.building.algorithm

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class FindNumberTest {
    @Test
    fun `Happy pass - find all numbers`(){
        Assertions.assertThat(findNumber(listOf(1, 2, 3, 4), 4)).isEqualTo(true)
        Assertions.assertThat(findNumber(listOf(0, 0, 0, 0), 0)).isEqualTo(true)
        Assertions.assertThat(findNumber(listOf(0, 2, 3, 1, 1), 5)).isEqualTo(false)
        Assertions.assertThat(findNumber(listOf(), 1)).isEqualTo(false)
    }
    private fun findNumber(list: List<Int>, forFinding: Int): Boolean {
        for (i: Int in list){
        if (forFinding == i){
        return true
        }
        }
            return false
}
}