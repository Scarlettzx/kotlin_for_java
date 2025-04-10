package video4

// ? Video 4 - รับ User Input ด้วย readln()
fun main() {
    // ? Read User Input(Console)
    print("Please Input: ")
    //    readlnOrNull()  // ? null safety (return String?)
    //    readln()  // ? make sure can not be null (return String)
    val input = readln()
    println("Your input: $input")
    // ? change Datatype
    println("${input.toDouble()}") // ? Concern Input must correct type
    // ? ที่เราจะ convert int ไป double ได้ String ไป double ไม่ได้ (!! Exception in thread "main" java.lang.NumberFormatException: For input string: "dsa")


    // ? handler throw Error not compact format
    try {
        print("Please Input2: ")
        //    readlnOrNull()  // ? null safety (return String?)
        //    readln()  // ? make sure can not be null (return String)
        val input2 = readln()
        println("Your input2: $input2")
        // ? change Datatype
        println("${input2.toDouble()}") // ? Concern Input must correct type
    } catch (e: Exception) {
        when (e) {
            (e as NumberFormatException) -> println("not Correct Format type")
            else -> println("don't know Format type")
        }
    }

    // ? Example using repeat combine readln()
    val inputList = mutableListOf<String>()
    repeat(10) {
        val userInput = readln()
        inputList.add(userInput)
    }
    println(inputList.joinToString(","))
}