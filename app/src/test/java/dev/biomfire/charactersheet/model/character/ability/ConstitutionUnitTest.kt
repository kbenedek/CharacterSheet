package dev.biomfire.charactersheet.model.character.ability

import org.junit.Assert
import org.junit.Test

class ConstitutionUnitTest {
    @Test
    fun name_isCorrect() {
        val constitution = Constitution(1)
        Assert.assertEquals("Constitution", constitution.getName())
    }
}