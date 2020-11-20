package dev.biomfire.charactersheet.model.character

import dev.biomfire.charactersheet.model.character.ability.Ability
import dev.biomfire.charactersheet.model.character.skill.Skill
import java.util.logging.Logger

class Character private constructor(
    val abilities: HashMap<String, Ability>,
    val skills: HashMap<String, Skill>,
    val proficiency: Proficiency,
    val level: Int
) {
    data class Builder(
    var abilities: HashMap<String, Ability> = HashMap(),
        var skills: HashMap<String, Skill> = HashMap(),
        var proficiency: Proficiency? = null,
        var level: Int = 1
    ) {
        fun abilities(abilities: HashMap<String, Ability>) = apply { this.abilities = abilities }
        fun level(level: Int) = apply { this.level = level }
        fun skills(skills: HashMap<String, Skill>) = apply { this.skills = skills }
        fun build(): Character {
            val finalLevel = level
            val finalProficiency = Proficiency(level)
            val finalAbilities = HashMap(abilities)
            for ((key, ability) in this.abilities) {
                finalAbilities.put(key, Ability(ability))
            }

            val finalSkills = HashMap<String, Skill>()
            for ((_, skill) in this.skills) {
                val baseAbilityName = skill.ability.getName()
                if (finalAbilities.containsKey(baseAbilityName)) {
                    val baseAbility = finalAbilities.get(baseAbilityName)!!
                    finalSkills[skill.name] = Skill.Builder()
                        .ability(baseAbility)
                        .name(skill.name)
                        .proficiency(finalProficiency)
                        .isProficient(skill.isProficient)
                        .build()
                } else throw IllegalArgumentException("Ability named $baseAbilityName was not found in provided ability list")
            }
            return Character(finalAbilities, finalSkills, finalProficiency, finalLevel)
        }
    }

}