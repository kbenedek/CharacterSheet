package dev.biomfire.charactersheet.model.character.skill

import dev.biomfire.charactersheet.model.character.Proficiency
import dev.biomfire.charactersheet.model.character.ability.Wisdom

class Insight(proficiencyModifier: Proficiency, isProficient: Boolean, ability: Wisdom) :
    Skill(
        proficiencyModifier,
        isProficient, ability
    )