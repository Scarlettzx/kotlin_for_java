package video3

// ? Basic Null Safety
fun main() {
    fun splitText(text: String): List<String> {
        return text.split(" ")
    }

    var text: String = "Example Text"
    // ? text = null ทำไม่ได้เพราะเราไม่ได้บอกว่ามันสามารถเป็น null ได้ Ex. String?

    var text2: String? = "Example Text2" // Nullable
//    text2 = null
    // ? Option 1 Basic null Check
    if (text2 != null) {
        println(splitText(text2).toString())
    }
    // ? Option 2 Safe calls
    // ? Example of object usage -> node?.next?.next
    text2?.let { println(splitText(it).toString()) }

    // ? Option 3 UnSafe calls (Concern NullPointerException)
//    println(splitText(text2!!).toString())

    // ? Option 4 Elvis Operator (Default value)
    val text3 = text2 ?: "Default Text"
    println(splitText(text3).toString())
}


