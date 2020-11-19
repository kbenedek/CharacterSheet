package dev.biomfire.charactersheet.model.character.skill

import dev.biomfire.charactersheet.model.character.Proficiency
import dev.biomfire.charactersheet.model.character.ability.Charisma

class Intimidation(proficiencyModifier: Proficiency, isProficient: Boolean, ability: Charisma) :
    Skill(
        proficiencyModifier,
        isProficient, ability
    )