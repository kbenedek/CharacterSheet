package dev.biomfire.charactersheet.model.character.skill

import dev.biomfire.charactersheet.model.character.Proficiency
import dev.biomfire.charactersheet.model.character.ability.Ability

class Skill private constructor(
    val proficiency: Proficiency,
    var isProficient: Boolean,
    val ability: Ability,
    val name: String
) {

    fun getModifier(): Int {
        return if (isProficient)
            ability.getModifier() + proficiency.getModifier()
        else
            ability.getModifier()
    }

    data class Builder(
        var proficiency: Proficiency? = null,
        var isProficient: Boolean = false,
        var ability: Ability? = null,
        var name: String? = null
    ) {
        fun proficiency(proficiency: Proficiency) =
            apply { this.proficiency = proficiency }

        fun isProficient(isProficient: Boolean) = apply { this.isProficient = isProficient }
        fun ability(ability: Ability) = apply { this.ability = ability }
        fun name(name: String) = apply { this.name = name }
        fun build() :Skill {
            return Skill(proficiency ?: Proficiency(1), isProficient,
            ability?: Ability("Strength", 1), name?: "Athletics")
        }
    }
}