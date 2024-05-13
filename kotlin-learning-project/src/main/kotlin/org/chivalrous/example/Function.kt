package org.chivalrous.example

class Function {
    companion object{
        fun runExample() {
            sayHi("Me")
            sayHi("You")
            sayHi()

            say()
            say { println("inner-fun") }
            saySomething {x -> println(x.length) }

            val instance = Function()
            val (v1, v2) = instance.twoValues()
            val (v3, v4, v5) = instance.threeValues()
        }

        private fun sayHi(to: String = "default") {
            println("Hi to $to")
        }

        private fun say(paramFunction: () -> Unit = { println("default") }){
            println("Saying...")
            paramFunction()
        }

        private fun saySomething(paramFunction: (value: String) -> Unit){
            println("Saying something...")
            paramFunction("test")
        }

        private fun double(n: Int) : Int = n * 2
        private fun double2(n: Int) = n * 2
        private fun double3(n: Int) : Int {
            return  n * 2
        }
    }

    private fun twoValues() : Pair<String, Int> {
        return "Test" to 25
    }

    private fun threeValues() : Triple<String, Int, Boolean> {
        return Triple("Test-2", 2, false)
    }
}