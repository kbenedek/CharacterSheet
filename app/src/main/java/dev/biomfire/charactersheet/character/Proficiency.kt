package dev.biomfire.charactersheet.character

class Proficiency(level: Int) {
    private var modifier: Int
    init {
        modifier = getProficiencyToLevel(level)
    }

    private fun getProficiencyToLevel(currentLevel: Int): Int {
        return when (currentLevel) {
            in 1..4 -> 2
            in 5..9 -> 3
            in 10..13 -> 4
            in 14..16 -> 5
            in 17..20 -> 6
            else -> throw IllegalArgumentException("$currentLevel is not between 1 and 20")
        }
    }

    fun setProficiencyToLevel(currentLevel: Int) {
        modifier = getProficiencyToLevel(currentLevel)
    }

    fun getModifier() = modifier
}