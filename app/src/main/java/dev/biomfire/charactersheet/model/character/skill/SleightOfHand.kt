package dev.biomfire.charactersheet.model.character.skill

import dev.biomfire.charactersheet.model.character.Proficiency
import dev.biomfire.charactersheet.model.character.ability.Dexterity

class SleightOfHand(proficiencyModifier: Proficiency, isProficient: Boolean, ability: Dexterity) :
    Skill(
        proficiencyModifier,
        isProficient, ability
    )