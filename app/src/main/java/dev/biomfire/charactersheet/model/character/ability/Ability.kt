package dev.biomfire.charactersheet.model.character.ability

class Ability constructor(private val name: String, private var value: Int) {
    constructor(ability: Ability) : this(ability.name, ability.value){}


    fun getRawValue(): Int = value

    fun setRawValue(newValue: Int) {
        value = newValue
    }

    fun getModifier(): Int = kotlin.math.floor((value - 10) / 2.0).toInt()


    fun getName() = name
}