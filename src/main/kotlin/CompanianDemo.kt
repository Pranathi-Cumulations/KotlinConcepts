class CompanianDemo {
    companion object{
        fun staticMethod(){
            println("In the companion object")
        }
    }
}

interface AnonymousDemo{
    fun printSomething(): Unit;
}

fun main() {
    CompanianDemo.staticMethod()
    var anonymousDemo = object : AnonymousDemo{
        override fun printSomething(): Unit {
            println("Inside the anonymousDemo")
        }
    }

    anonymousDemo.printSomething()
}