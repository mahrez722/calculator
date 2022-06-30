open class `am the parent` {
    var num=20
    var name="Billy"

}
class child:`am the parent`(){
    fun display(){
        println("The number from my Parent class is "+num)
    }

}
class child2:`am the parent`(){
    fun display(){
        println("The name from my Parent class is "+name)
    }
}

fun main(args: Array<String>) {
    val myobj=child()
    val myobj2=child2()
    println(myobj.display())
    println(myobj2.display())
}