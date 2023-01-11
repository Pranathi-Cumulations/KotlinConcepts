fun demo(x : Any){
    if (x is Int){
        println(x)
    }
    else if(x is String){
        println(x.length)
    }
}
fun main( args : Array<String>){
    var x = "123"
    demo(x)

    var y:Int = 123
    println(y as? String)

}