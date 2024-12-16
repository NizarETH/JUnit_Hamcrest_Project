package com.app.myappjunit

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.*
import org.hamcrest.Matchers.greaterThan
import org.hamcrest.Matchers.lessThanOrEqualTo
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        //class Carre
        val carre = Carre(2)
        assertEquals(4, carre.calcul_surface())
        //Addition
        assertEquals(3, 2 + 1)
        println("The test is successful.")
    }
    @Test
    fun testNumberComparison() {


        //class Carre
        val carre = Carre(2)
        assertThat(carre.calcul_surface(), equalTo(4))
        //Math
        val number = 10
        assertThat(number, greaterThan(5))
        assertThat(number, lessThanOrEqualTo(10))
    }
}