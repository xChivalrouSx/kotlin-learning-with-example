package src.main.kotlin.org.chivalrous

import org.chivalrous.example.ArrayAndList
import org.chivalrous.example.Condition
import org.chivalrous.example.Function
import org.chivalrous.example.Loop
import org.chivalrous.example.Variable

const val PI_VAL = 3.14 // (Java: static final)

fun main() {
    println("Hello World!..")
    println()
    print("Print test ")
    print("is done with same line...")
    println()

    Variable.runExample()
    Condition.runExample()
    ArrayAndList.runExample()
    Loop.runExample()
    Function.runExample()
}
