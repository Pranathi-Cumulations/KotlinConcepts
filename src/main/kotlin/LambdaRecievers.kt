class LambdaRecieversDemo {

}

fun LambdaRecieversDemo.printSomething(f:LambdaRecieversDemo.()->Unit){
    f()
}

fun main(){
    var lambdaRecieversDemo = LambdaRecieversDemo()
    lambdaRecieversDemo.printSomething { println(this) }
}
