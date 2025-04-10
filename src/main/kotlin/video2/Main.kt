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
    iterationOrLoopExample()
}

fun iterationOrLoopExample() {
    println()
    println("Start IterationOrLoopExample")
    // ? While like Java
    var amount = 2
    while (amount-- > 0) { // ? 1 0
        println("Amount left: $amount")
    }
    println()
    // ? For / Repeat
    amount = 2
    repeat(amount) { a -> // ? 0 1
        println("Repeat Current: $a")
    } // ? trailing function (Functional Programming รับ function มาไป execute ต่อ)
    println("---------------")

    print("index i until  for (i in 0 until 10) :")
    for (i in 0 until 10) {
        // ? Range Expression (until) Ex. for (int i = 0; i <10; i++)
        print(" $i")
    }

    println()
    println("---------------")
    print("index i ..  for (i in 0..10) :")
    for (i in 0..10) {
        // ? (..) Ex. for (int i = 0; i <= 10; i++) .. is include ตัวสุดท้าย
        print(" $i")
    }

    println()
    println("---------------")
    print("index i downTo for (i in 10 downTo 0) :")
    for (i in 10 downTo 0) {
        // ? (downTo) Ex. for (int i = 10; i >= 0; i--)
        print(" $i")
    }

    // ? more use step
    println()
    println("---------------")
    print("index i downTo step 2 for (i in 10 downTo 0 step 2) :")
    for (i in 10 downTo 0 step 2) {
        // ? (downTo) Ex. for (int i = 10; i >= 0; i -= 2)
        print(" $i")
    }

    println()
    println("---------------")
    print("index i .. step 2 for (i in 0..10 step 2) :")
    for (i in 0..10 step 2) {
        // ? (..) Ex. for (int i = 0; i >= 10; i += 2)
        print(" $i")
    }

    println()
    println("---------------")
    print("index i until step 2  for (i in 0 until 10 step 2) :")
    for (i in 0 until 10 step 2) {
        // ? (until) Ex. for (int i = 0; i > 10; i += 2)
        print(" $i")
    }
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
    // ? Iterable Count (iterator)
    var vowelCount = 0
    val text = "ashdajsajd"
    for (char in text) {
        when (char) {
            'a', 'e', 'i', 'o', 'u' -> ++vowelCount
        }
        // ? char.isLetter (Helper Extension)
        // ? char.isDigit
    }
    println("VowelCount: ${vowelCount}")
}


fun checkScore(scores: Int): Boolean {
    val result: Boolean = if (scores >= 50) {
//        println("Scored passed!")
        true
    } else if (scores < 50 && scores >= 0) {
//        println("Failed!")
        false
    } else {
//        println("Value is Negative")
        false
    }
    return result
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