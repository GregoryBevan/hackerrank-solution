package com.hackerrank.birthdaycakecandles

import com.hackerrank.bithdaycakecandles.birthdayCakeCandles
import org.junit.jupiter.api.Test
import kotlin.test.expect

class BirthdayCakeCandles {

    @Test
    fun `should return 1 if first birthday`() {
        expect(1) { birthdayCakeCandles(listOf(1))}
    }

    @Test
    fun `should return number of candles if same height`() {
        expect(4) { birthdayCakeCandles(listOf(1, 1, 1, 1))}
    }

    @Test
    fun `should return number of candles of greatest height`() {
        expect(2) { birthdayCakeCandles(listOf(1, 2, 2, 1))}
    }

    @Test
    fun `should return 100000 if 100000 of same height`() {
        expect(100000) { birthdayCakeCandles((1 .. 100000).map { 1000 })}
    }

    @Test
    fun `should return 99999 if one shortest candle only`() {

        expect(99999) { birthdayCakeCandles((1 .. 100000).map { if(it == 1) 999 else 1000  })}
    }
}