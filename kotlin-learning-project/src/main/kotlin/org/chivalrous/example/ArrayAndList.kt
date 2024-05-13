package org.chivalrous.example

class ArrayAndList {
    companion object {
        fun runExample() {
            val stringArray = arrayOf<String>("test-1", "test-2")
            println(stringArray.contentToString())

            val mixArray = arrayOf("test-1", "test-2", 2)
            println(mixArray.contentToString())

            val (one, _, three) = mixArray
            println("one: $one, three: $three")
            println("two: ${mixArray[1]}")

            mixArray[1] = "new-value"
            println("new value ${mixArray[1]}")

            val result = if ("test" in mixArray) "found" else "not found"
            println("test $result in micArray")

            val arraysOfNulls = arrayOfNulls<Int>(5)
            println(arraysOfNulls.contentToString())

            val boolArray = booleanArrayOf(true, false, true)
            println(boolArray.contentToString())

            val testArray : Array<String> = arrayOf("1", "2")
            println(testArray.contentToString())

            val testList = mutableListOf("test", "test-1")
            testList.add("3")
            println(testList.toString())
        }
    }
}