package dev.biomfire.charactersheet.model.character.skill

import dev.biomfire.charactersheet.model.character.Proficiency
import dev.biomfire.charactersheet.model.character.ability.Intelligence

class Investigation(
    proficiencyModifier: Proficiency,
    isProficient: Boolean,
    ability: Intelligence
) :
    Skill(
        proficiencyModifier,
        isProficient, ability
    )