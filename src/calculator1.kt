import java.util.Scanner
fun main(){

    val scanner=Scanner(System.`in`)
    print("Enter your first number :")
    val first=scanner.nextInt()

    print("Enter your second number :")
    val second=scanner.nextInt()

    print("Enter your operator (+,-,*,/:")
    val operator=scanner.next()[0]

    val sum=first+second
    val subtract=first-second
    val product=first*second
    val quotient=first/second

    if(operator=='+'){
        println(sum)
    }else if(operator=='-') {
        println(subtract)
    }else if(operator=='*'){
        println(product)
    }else if(operator=='/'){
        println(quotient)
    }else{
        println("OPERATOR IS INVALID")
    }




}