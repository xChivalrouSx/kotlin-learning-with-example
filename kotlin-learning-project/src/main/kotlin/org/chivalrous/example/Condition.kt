package org.chivalrous.example

class Condition {
    companion object {
        fun runExample() {
            val randomNumber = (1..50).random();

            var result = if (randomNumber < 20) "min" else "max"
            println(result)
            result = if (10 > randomNumber) "min" else if (randomNumber == 10) "same" else "max"
            println(result)

            result = when{
                (randomNumber > 20) -> "max"
                (randomNumber ==10) -> "same"
                else -> "min"
            }
            println(result)

            var gender = if ((1..2).random() % 2 == 0) "M" else "F"
            when(gender) {
                "F" -> println("FEMALE")
                "M" -> println("MALE")
                else -> println("not supported")
            }

            gender = when(gender) {
                "F" -> "FEMALE"
                "M" -> "MALE"
                else -> "not supported"
            }
            println(gender)

            val age = (1..100).random()
            when (age) {
                in 13..19 -> println("Teenager")
                !in 0..12 -> println("Young")
                else -> println("Older")
            }
        }
    }
}