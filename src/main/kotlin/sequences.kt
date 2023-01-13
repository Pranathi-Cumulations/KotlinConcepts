class sequences {
}

fun main(){
    var firstSequence = generateSequence(1) { it+2}
    println(firstSequence.take(5).toList())

    var seq = sequence<Int> {yieldAll(generateSequence(4) { it*2 })  }
    println(seq.take(3).toList())
}