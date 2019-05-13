public class Hello {
    public static void main(String[] args) {
        // declaration = initialization
        // a is a variable, value can be changed
        int a = 10; 
        System.out.println("Hello World");
        System.out.println(a);
        // error due to incompatible type
        // a = "DTCC"; // static type checking, during compilation
        System.out.println(a);
    }
}