package dev.biomfire.charactersheet.character.skill

import dev.biomfire.charactersheet.character.ability.Ability
import dev.biomfire.charactersheet.character.Proficiency

abstract class Skill(private val proficiencyModifier: Proficiency) {
    abstract val isProficient: Boolean
    abstract val ability: Ability
    fun getModifier(): Int {
        return if (isProficient)
            ability.getModifier() + proficiencyModifier.getModifier()
        else
            ability.getModifier()
    }
}