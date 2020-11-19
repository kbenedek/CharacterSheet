package dev.biomfire.charactersheet.model.character

import dev.biomfire.charactersheet.model.character.ability.Ability
import dev.biomfire.charactersheet.model.character.skill.Skill
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class CharacterUnitTest {
    @Test
    fun empty_character_isCorrect() {
        val character = Character.Builder().build()
        assertEquals(1, character.level)
        assertEquals(0, character.abilities.size)
        assertEquals(0, character.skills.size)
        assertEquals(2, character.proficiency.getModifier())
    }

    @Test
    fun lvl_2_character_isCorrect() {
        val character = Character.Builder().level(2).build()
        assertEquals(2, character.level)
        assertEquals(0, character.abilities.size)
        assertEquals(0, character.skills.size)
        assertEquals(2, character.proficiency.getModifier())
    }

    @Test
    fun lvl_5_character_isCorrect() {
        val character = Character.Builder().level(5).build()
        assertEquals(5, character.level)
        assertEquals(0, character.abilities.size)
        assertEquals(0, character.skills.size)
        assertEquals(3, character.proficiency.getModifier())
    }

    @Test
    fun one_ability_character_isCorrect() {
        val ability = Ability("Strength", 2)
        val character =
            Character.Builder().abilities(hashMapOf(Pair(ability.getName(), ability)))
                .build()
        assertEquals(1, character.abilities.size)
        assertTrue(character.abilities.containsKey("Strength"))
        assertEquals(2, character.abilities.get("Strength")?.getRawValue())
        assertEquals(-4, character.abilities.get("Strength")?.getModifier())
        ability.setRawValue(20)
        assertEquals(2, character.abilities.get("Strength")?.getRawValue())
        assertEquals(-4, character.abilities.get("Strength")?.getModifier())
    }

    @Test
    fun one_skill_character_isCorrect() {
        val ability = Ability("Strength", 1)
        val skill =
            Skill.Builder()
                .ability(ability).isProficient(true)
                .name("Athletics")
                .proficiency(Proficiency(5)).build()
        val character =
            Character.Builder()
                .abilities(hashMapOf(Pair(ability.getName(), ability)))
                .skills(hashMapOf(Pair(skill.name, skill)))
                .build()
        assertEquals(1, character.skills.size)
        assertTrue(character.skills.containsKey("Athletics"))
        assertEquals(true, character.skills.get("Athletics")?.isProficient)
        skill.isProficient = false
        assertEquals(true, character.skills.get("Athletics")?.isProficient)
    }
}