package dev.biomfire.charactersheet.model.character.ability

import org.junit.Assert
import org.junit.Test

class StrengthUnitTest {
    @Test
    fun name_isCorrect() {
        val strength = Strength(1)
        Assert.assertEquals("Strength", strength.getName())
    }
}