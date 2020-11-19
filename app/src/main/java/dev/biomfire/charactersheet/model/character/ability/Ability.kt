package dev.biomfire.charactersheet.model.character.ability

abstract class Ability protected constructor(private var value: Int, private val name: String) {

    fun getRawValue(): Int = value

    fun setRawValue(newValue: Int) {
        value = newValue
    }

    fun getModifier(): Int = kotlin.math.floor((value - 10) / 2.0).toInt()


    fun getName() = name
}