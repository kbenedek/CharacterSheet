package dev.biomfire.charactersheet.model.character.ability

import org.junit.Assert
import org.junit.Test

class AbilityUnitTest {

    @Test
    fun modifier_isCorrect_1() {
        val strength = Ability("",1)
        Assert.assertEquals(-5, strength.getModifier())
    }

    @Test
    fun modifier_isCorrect_5() {
        val strength = Ability("",5)
        Assert.assertEquals(-3, strength.getModifier())
    }

    @Test
    fun modifier_isCorrect_22() {
        val strength = Ability("",18)
        Assert.assertEquals(4, strength.getModifier())
    }

    @Test
    fun modifier_isCorrect_30() {
        val strength = Ability("",30)
        Assert.assertEquals(10, strength.getModifier())
    }
}