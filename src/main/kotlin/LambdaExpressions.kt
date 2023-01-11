fun main(){
    var nums = intArrayOf(1,4,6,5)
    var numsFilered = nums.filter { n -> n % 2 ==0 }
    for (i in numsFilered){
        println(i)
    }

    //using it keyword

    var numsFilered1 = nums.filter { it%2!=0}
    for (i in numsFilered1){
        println(i)
    }

    val sum = { x: Int, y: Int -> x + y }
    println(sum(1,2))

}