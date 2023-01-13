fun main(){
    var simpleMap = mapOf<Int,String>( 1 to "pranathi" , 2 to "pragya")

    var hashMap = hashMapOf<Int,String>(1 to "pranathi" , 2 to "pragya")
    hashMap.put(3,"prana")

    for((k,v) in hashMap){
        println("here is $k key and $v value")
    }
}