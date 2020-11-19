package dev.biomfire.charactersheet.model.character

import org.junit.Test

import org.junit.Assert.*
import org.slf4j.LoggerFactory
import kotlin.random.Random

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ProficiencyUnitTest {
    private val logger = LoggerFactory.getLogger(javaClass)

    @Test
    fun modifier_isCorrectLvl_1to4() {
        val randomLevel = Random(0).nextInt(1, 5)
        logger.debug("Random level: $randomLevel")
        val proficiency = Proficiency(randomLevel)
        assertEquals(2, proficiency.getModifier())
    }

    @Test
    fun modifier_isCorrectLvl_5to9() {
        val randomLevel = Random(0).nextInt(5, 10)
        logger.debug("Random level: $randomLevel")
        val proficiency = Proficiency(randomLevel)
        assertEquals(3, proficiency.getModifier())
    }

    @Test
    fun modifier_isCorrectLvl_10to13() {
        val randomLevel = Random(0).nextInt(10, 14)
        logger.debug("Random level: $randomLevel")
        val proficiency = Proficiency(randomLevel)
        assertEquals(4, proficiency.getModifier())
    }

    @Test
    fun modifier_isCorrectLvl_14to16() {
        val randomLevel = Random(0).nextInt(14, 17)
        logger.debug("Random level: $randomLevel")
        val proficiency = Proficiency(randomLevel)
        assertEquals(5, proficiency.getModifier())
    }

    @Test
    fun modifier_isCorrectLvl_17to20() {
        val randomLevel = Random(0).nextInt(17, 20)
        logger.debug("Random level: $randomLevel")
        val proficiency = Proficiency(randomLevel)
        assertEquals(6, proficiency.getModifier())
    }
    @Test
    fun setmodifier_isCorrect() {
        val proficiency = Proficiency(1)
        assertEquals(2, proficiency.getModifier())
        proficiency.setProficiencyToLevel(20)
        assertEquals(6, proficiency.getModifier())
    }
}