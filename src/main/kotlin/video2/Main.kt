package video2

const val LIMIT: Long =
    50L // ? ประกาศตัวแปร static ต่างๆ // ? don't usable in local variable (outside function) (Recommend name variable is UPPERCASE)

// ?
fun main() {
    // ? Primitive Type
    // ? Reference Type (OBJ)

    // ? Data type =>  All of them is Class
    // ? var => Mutable / Reassign
    // ? val => Immutable / Can't Reassign
    var numMutable: Int = 5
    println("numMutable: ${numMutable}")
    numMutable = 2
    println("numMutable: ${numMutable}")
    val numImmutable: Int = 10
    println("numImMutable: ${numImmutable}")
    //    numImmutable = 2 // ? Error
    //    println("numImMutable: ${numImmutable}")

    println("Const Value: $LIMIT")

    operatorExample()
    // ? conditionExample (Ex. if else)
    conditionExample()
}

fun conditionExample() {
    println()
    println("Start conditionExample")
    // ? If-else Concept
    val scores = 73

    // ? Switch (When)
    when (checkScore(scores)) {
        // ? Matching score or condition
        true -> println("Passed!")
        else -> println("Failed!")
    }
}

fun checkScore(scores: Int): Boolean {
    if (scores >= 50) {
//        println("Scored passed!")
        return true
    } else if (scores < 50 && scores >= 0) {
//        println("Failed!")
        return false
    } else {
//        println("Value is Negative")
        return false
    }
}

fun operatorExample() {
    // ? You can do almost the same as Java
    println("Start Operator Session")
    val sum = 5 + 5
    val sumOperator = 5.plus(5) // ? infix function (plus)
    println("sum: $sum")
    println("sumOperator: $sumOperator")
    // ? Example Of Bit Level
    // ? 4 - 100
    // ? 3 - 011
    println("Example bit:And ${4.and(3)}")
    println("Example bit:Or ${4.or(3)}")
    println("Example bit:Shift ${4.shr(2)}")
}