package dev.biomfire.charactersheet.model.character

import dev.biomfire.charactersheet.model.character.ability.Ability
import dev.biomfire.charactersheet.model.character.ability.Strength

class Character(level: Int){
    val abilities = listOf<Ability>(Strength(1))
    //val abilities = (animalHandling, History)
    //IntMod+(prof ? 2 : 0)
    val proficiency :Proficiency = Proficiency(level)
}