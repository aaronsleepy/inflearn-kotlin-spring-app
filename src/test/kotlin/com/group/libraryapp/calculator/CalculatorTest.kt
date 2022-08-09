package com.group.libraryapp.calculator

import java.lang.Exception
import kotlin.IllegalArgumentException

fun main() {
    val calculatorTest = CalculatorTest()
    calculatorTest.addTest()
    calculatorTest.minusTest()
    calculatorTest.multiplyTest()
    calculatorTest.divideTest()
    calculatorTest.divideByZeroTest()
}

class CalculatorTest {

    fun addTest() {
        // given
        val calculator = Calculator(5)

        // when
        calculator.add(3)

        // then
        if (calculator.number != 8) {
            throw IllegalArgumentException("addTest failed")
        }
    }

    fun minusTest() {
        // given
        val calculator = Calculator(5)

        // when
        calculator.minus(3)

        // then
        if (calculator.number != 2) {
            throw IllegalArgumentException("addTest failed")
        }
    }

    fun multiplyTest() {
        // given
        val calculator = Calculator(5)

        // when
        calculator.multiply(3)

        // then
        if (calculator.number != 15) {
            throw IllegalArgumentException("addTest failed")
        }
    }

    fun divideTest() {
        // given
        val calculator = Calculator(5)

        // when
        calculator.divide(2)

        // then
        if (calculator.number != 2) {
            throw IllegalArgumentException("addTest failed")
        }
    }

    fun divideByZeroTest() {
        // given
        val calculator = Calculator(5)

        // when
        try {
            calculator.divide(0)
        } catch (e: java.lang.IllegalArgumentException) {
            // then
            if (e.message != "Can't divide by zero") {
                throw IllegalArgumentException("divideByZeroTest failed")
            }
            // success
            return
        } catch (e: Exception) {
            throw IllegalArgumentException("divideByZeroTest failed")
        }

        throw IllegalArgumentException("divideByZeroTest failed")
    }
}