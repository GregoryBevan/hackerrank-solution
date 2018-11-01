package com.hackerrank.diagonaledifference

class DiagonalDifference {
    fun diagonalDifference(arr: Array<Array<Int>>) =
        Math.abs(arr.mapIndexed {index, line -> line[index]}.sum() - arr.mapIndexed { index, line -> line.reversedArray()[index]}.sum())

}
