public class MethodParameterExample {
    public void greet(String name) {
        System.out.println("Hello, " + name); // 'name' is a local variable
    }

    public static void main(String[] args) {
        MethodParameterExample obj = new MethodParameterExample();
        obj.greet("Ashi");
    }
}
