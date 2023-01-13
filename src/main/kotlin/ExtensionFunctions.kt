class ExtensionFunctions(var name:String) {


}

fun ExtensionFunctions.printName(): Unit{
    println(this.name)
}

fun ExtensionFunctions.inlineOfPrintName() : String = this.name

fun main() {
    var extensionFunctions = ExtensionFunctions("pranathi")
    extensionFunctions.printName()
    println(extensionFunctions.inlineOfPrintName())
}

