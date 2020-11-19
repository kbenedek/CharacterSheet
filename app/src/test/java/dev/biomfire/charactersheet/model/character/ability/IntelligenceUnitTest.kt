package dev.biomfire.charactersheet.model.character.ability

import org.junit.Assert
import org.junit.Test

class IntelligenceUnitTest {
    @Test
    fun name_isCorrect() {
        val intelligence = Intelligence(1)
        Assert.assertEquals("Intelligence", intelligence.getName())
    }
}