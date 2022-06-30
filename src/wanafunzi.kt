class wanafunzi(val name:String,val gender:String,var phoneno:Int,var age:Int,val course:String) {

}
fun main(){
    val obj=wanafunzi("Billy","Male",705562039,21,"Full-stack Software Development")
    println("My name is "+obj.name+ "Gender is "+obj.gender+"My phoneno is "+obj.phoneno+"My Age is "+obj.age+"course taken is "+obj.course)


}