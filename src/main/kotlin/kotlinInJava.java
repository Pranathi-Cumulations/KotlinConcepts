public class kotlinInJava {

    public static void demoFunction(){
        System.out.println("java function is handled here in kotlin");
    }
    public static void main(String[] args) {
        ExtensionFunctions extensionFunctions = new ExtensionFunctions("pranathi");
        ExtensionFunctionsKt.printName(extensionFunctions);
    }
}
