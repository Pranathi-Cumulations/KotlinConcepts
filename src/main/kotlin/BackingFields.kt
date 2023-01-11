class BackingFields {
    var name:String = ""
    set(value): Unit {
        if (value!=null) {
            field = value
        }
    }
}

fun main() {
    var backingFields = BackingFields()
    backingFields.name="pra"
    println(backingFields.name)
}