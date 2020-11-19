package dev.biomfire.charactersheet.model.character.ability

import org.junit.Assert
import org.junit.Test

class WisdomUnitTest {
    @Test
    fun name_isCorrect() {
        val wisdom = Wisdom(1)
        Assert.assertEquals("Wisdom", wisdom.getName())
    }
}