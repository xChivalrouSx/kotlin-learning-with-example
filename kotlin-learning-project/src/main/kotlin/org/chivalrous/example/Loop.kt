package org.chivalrous.example

class Loop {
    companion object {
        fun runExample() {
            for (x in 1..5){
                println("x: $x")
            }

            val testList = listOf("test-1", "test-2")
            for(x in listOf("test-1", "test-2")) {
                println(x.replaceFirstChar { p -> p.uppercase() })
            }

            for(i in testList.indices) {
                println("$i - ${testList[i]}")
            }

            for(i in testList.indices.reversed()) {
                println("$i - ${testList[i]}")
            }

            for(i in 1..10) println(i)
            for(i in 1..10 step 2) println(i)
            for(i in 20 downTo 15) println(i)
            for(i in 20 downTo 15 step 3) println(i)
            for (c in "testString") println(c)
            testList.forEach { println(it) }

            var index = 0
            while (index < 5) {
                println(index)
                index++
            }

            do {
                println("do-while")
            } while (false)
        }
    }
}