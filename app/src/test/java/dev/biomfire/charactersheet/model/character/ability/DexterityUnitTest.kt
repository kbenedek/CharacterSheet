package dev.biomfire.charactersheet.model.character.ability

import org.junit.Assert
import org.junit.Test

class DexterityUnitTest {
    @Test
    fun name_isCorrect() {
        val dexterity =Dexterity(1)
        Assert.assertEquals("Dexterity", dexterity.getName())
    }
}