@file:Suppress("UNREACHABLE_CODE")

fun main() {
    val a = 25
    val b = 5
    val sign = '+'
    val result: Int = calculate(a, b, sign)
    println(result)
    println(getName())
}

fun calculate(a: Int, b: Int, sign: Char): Int {
    return when (sign) {
        '+' -> a + b
        '-' -> {
            a - b
        }

        '*' -> {
            a * b
        }

        else -> {
            a / b
        }
    }
}

    fun getName(): String {
        val names = arrayOf("чынара", "ырыс", "нурлан", "гулсанаа", "жылдыз", "замир")
        val myName = "чынгыз"
        var isWordFound: Boolean
        var emptyString = ""
        for (i in myName.indices) {
            for (word in names) {
                isWordFound = false
                for (k in word.indices) {
                    if (myName[i] == word[k]) {
                        emptyString += word[k]
                        isWordFound = true
                        break
                    }
                }
                if (isWordFound) {
                    break
                }
            }
        }
        return emptyString
    }

