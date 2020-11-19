package dev.biomfire.charactersheet.character.ability

import org.junit.Assert
import org.junit.Test

class AbilityUnitTest {
    @Test
    fun name_isCorrect() {
        val strength =Strength(1)
        Assert.assertEquals("Strength", strength.getName())
    }
    @Test
    fun modifier_isCorrect_1() {
        val strength = Strength(1)
        Assert.assertEquals(-5, strength.getModifier())
    }
    @Test
    fun modifier_isCorrect_5() {
        val strength = Strength(5)
        Assert.assertEquals(-3, strength.getModifier())
    }
    @Test
    fun modifier_isCorrect_22() {
        val strength = Strength(18)
        Assert.assertEquals(4, strength.getModifier())
    }
    @Test
    fun modifier_isCorrect_30() {
        val strength = Strength(30)
        Assert.assertEquals(10, strength.getModifier())
    }
}