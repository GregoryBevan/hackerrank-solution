package com.hackerrank.plusminus

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import kotlin.test.expect

class PlusMinusTest {

    private lateinit var outStream: ByteArrayOutputStream
    private lateinit var plusMinus: PlusMinus

    @BeforeEach
    fun setup() {
        outStream = ByteArrayOutputStream()
        System.setOut(PrintStream(outStream))
        plusMinus = PlusMinus()
    }


    @Test
    fun `should print 0 0 1 for array with one element equal to zero`() {
        plusMinus.plusMinus(arrayOf(0))
        expect("0.000000\n0.000000\n1.000000\n") { outStream.toString() }
    }

    @Test
    fun `should print 1 0 0 for array with one positive element`() {
        plusMinus.plusMinus(arrayOf(1))
        expect ("1.000000\n0.000000\n0.000000\n") { outStream.toString() }
    }

    @Test
    fun `should print 0 1 0 for array with one negative element`() {
        plusMinus.plusMinus(arrayOf(-1))
        expect ("0.000000\n1.000000\n0.000000\n") { outStream.toString() }
    }

    @Test
    fun `should print sample output for sample input`() {
        plusMinus.plusMinus(arrayOf(-4, 3, -9, 0, 4, 1 ))
        expect ("0.500000\n0.333333\n0.166667\n") { outStream.toString() }
    }

}