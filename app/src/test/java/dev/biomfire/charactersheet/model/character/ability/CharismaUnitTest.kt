package dev.biomfire.charactersheet.model.character.ability

import org.junit.Assert
import org.junit.Test

class CharismaUnitTest {
    @Test
    fun name_isCorrect() {
        val charisma = Charisma(1)
        Assert.assertEquals("Charisma", charisma.getName())
    }
}