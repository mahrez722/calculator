fun calculate(){
    var num1=81
    var num2=50
    println("The sum of $num1 && $num2 is "+(num1+num2))
    println("The product of $num1 && $num2 is "+(num1*num2))
    println("The difference of $num1 && $num2 is "+(num1-num2))
    println("The quotient of $num1 && $num2 is "+(num1/num2))
}
fun main(args: Array<String>) {
    calculate()
    name()
    cars("Mercedes", "Blue",2020)
    cars("V8","Black",2021)
}
fun name(){
    var name1="Billy"
    var name2="Mahrez"
    println("My name is  "+(name1+name2))
}


fun cars(name: String, color: String,  year:Int){
    println("My car name is "+name)
    println("The color of my car is "+color)
    println("The year manufactured is "+year)
}