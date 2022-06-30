class fruits {
    var type=""
    var color=""
    var price=0

}

fun main(args: Array<String>) {
    val matunda=fruits()
    val matunda1=fruits()
    val matunda2=fruits()
    matunda.type="Mango"
    matunda.color="Yellow"
    matunda.price=40
    println(matunda.type)
    println(matunda.color)
    println(matunda.price)

    matunda1.type="Orange"
    matunda1.color="pink"
    matunda1.price=30
    println(matunda1.type)
    println(matunda1.color)
    println(matunda1.price)

    matunda2.type="Avocado"
    matunda2.color="Green"
    matunda2.price=20
    println(matunda2.type)
    println(matunda2.color)
    println(matunda2.price)
}