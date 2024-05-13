package org.chivalrous.example

import kotlin.math.max

class Variable {
    companion object {
        fun runExample() {
            val name: String = "test-name";
            val age: Int = 15;
            println("Name: $name, Age: $age")
            println("Age x 2 = ${age * 2}")
            println()

            // val -> read only (Java: final), var -> can change
            var testLong: Long = 5L
            val testDouble: Double = 2.15
            val testFloat: Float = 2.15F
            val testBoolean: Boolean = true
            val testChar: Char = 'C'
            val testString: String = "test-string"
            val testAny: Any = "any-object-here"
            println("""
                testLong: ${++testLong}, testDouble: $testDouble
                testFloat: $testFloat, testBoolean: $testBoolean
                testChar: $testChar, testString: $testString
                testAny: $testAny
            """.trimIndent())

            var nullTest : String? = "not-null-value"
            println(nullTest?.uppercase())
            nullTest = if ((1..100).random() % 2 == 0) null else "not-null"
            println(nullTest?.isBlank())

            val string1 = "test"
            val string2 = String("test".toCharArray())
            println("== %s".format(string1 == string2))
            println("=== %s".format(string1 === string2))
            println("equals %s".format(string1.equals(string2)))

            println(Math.PI)
            println(max(5, 10))
        }
    }
}