fun main(args: Array<String>) {
    var nullVar: Int? = null;
    var nullString : String? = null;
    var len:Int = if(nullString!=null) nullString.length else -1
    var elvislength:Int = nullString?.length ?:-1
    println(len)
    println(nullString?.length);
    println(elvislength)

    //arrays with null reference in Kotlin

    var nullArray = listOf<Int?>(1,2,null,3)
    var nonNullArray = listOfNotNull(1,"hi",null,5)
    //even when anything results in adding a null to it it ignores it
    println("sixe of non-null array ${nonNullArray.size}")
    var rawString = """ hello there , this is a raw String
        |accepts new line and spaces and tabs     normally without 
        |special characters and the length of nullArray is ${nullArray.size}
    """.trimMargin()
    println(rawString)
    for(i in nonNullArray){
        println(i)
    }

    var Name : String = "Pranathi"
    var lenOfName : Int = Name.length
     //when in kotlin
    when(lenOfName){
        -1 -> println("string is null")
        0 -> println("string is empty")
        1 -> println("there is only one character in string")
        else -> println("string with more than one character")
    }

    kotlinInJava.demoFunction();

    var kot: kotlinInJava = kotlinInJava();
    println(kot)
}