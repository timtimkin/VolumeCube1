fun main(args: Array<String>) {
//Программа считает объём куба
    println("First side:")
    val side1 = readln()
    println("Second side:")
    val side2 = readln()
    println("Thirst side:")
    val side3 = readln()

    val volume = side1.toInt() * side2.toInt() * side3.toInt()

    println("Result:")
    println(volume)

}