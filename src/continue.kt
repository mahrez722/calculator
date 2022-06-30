fun main(args : Array<String>){

    for (n in 1..5){
        println("before continue, Loop: $n")
        if(n==2||n==4)
            continue

        println("after continue, Loop: $n")

    }
}