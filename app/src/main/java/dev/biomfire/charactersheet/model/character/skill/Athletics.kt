package dev.biomfire.charactersheet.model.character.skill

import dev.biomfire.charactersheet.model.character.Proficiency
import dev.biomfire.charactersheet.model.character.ability.Strength

class Athletics(proficiencyModifier: Proficiency, isProficient: Boolean, ability: Strength) : Skill(
    proficiencyModifier,
    isProficient, ability
)