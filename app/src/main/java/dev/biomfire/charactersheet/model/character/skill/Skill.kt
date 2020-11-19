package dev.biomfire.charactersheet.model.character.skill

import dev.biomfire.charactersheet.model.character.Proficiency
import dev.biomfire.charactersheet.model.character.ability.Ability

abstract class Skill(
    private val proficiencyModifier: Proficiency,
    private val isProficient: Boolean,
    val ability: Ability
) {
    fun getModifier(): Int {
        return if (isProficient)
            ability.getModifier() + proficiencyModifier.getModifier()
        else
            ability.getModifier()
    }
}