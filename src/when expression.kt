fun main(args: Array<String>) {
    var bus="The Man"

    when(bus){
        "The Man" ->println("My bus is The Man")
        "Scania" ->println("My bus is Scania")
        "Mercedes"->println("My bus is Mercedes")
        "Mitsubishi"->println("My bus is a Mitsubishi")
        else -> println("Invalid input")
    }
}