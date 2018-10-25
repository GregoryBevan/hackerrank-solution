package com.hackerrank.gradingstudents

import org.junit.jupiter.api.Test
import kotlin.test.expect

class GradingStudentsTest {

    @Test
    fun `should not round when less than 38`(){
        expect(listOf(37)) {gradingStudents(listOf(37))}
    }

    @Test
    fun `should not round when less than 38 and 2 or less to the next multiple of 5`(){
        expect(listOf(33)) {gradingStudents(listOf(33))}
    }

    @Test
    fun `should not round when less than 3 to the next multiple of 5`(){
        expect(listOf(67)) {gradingStudents(listOf(67))}
    }

    @Test
    fun `should not round when multiple of 5`(){
        expect(listOf(65)) {gradingStudents(listOf(65))}
    }

    @Test
    fun `should round when when 2 or less to the next multiple of 5`(){
        expect(listOf(70)) {gradingStudents(listOf(68))}
    }

    @Test
    fun `should round to 40 when 38`(){
        expect(listOf(40)) {gradingStudents(listOf(38))}
    }

}