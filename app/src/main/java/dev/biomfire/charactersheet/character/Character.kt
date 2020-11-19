package dev.biomfire.charactersheet.character

import dev.biomfire.charactersheet.character.ability.Ability
import dev.biomfire.charactersheet.character.ability.Strength

class Character(level: Int){
    val abilities = listOf<Ability>(Strength(1))
    //val abilities = (animalHandling, History)
    //IntMod+(prof ? 2 : 0)
    val proficiency :Proficiency = Proficiency(level)
}