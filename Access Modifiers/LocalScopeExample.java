public class LocalScopeExample {
    public void display() {
        String localVar = "I am a local variable"; // Declared inside method
        System.out.println(localVar); // Accessible only within this method
    }

    public static void main(String[] args) {
        LocalScopeExample obj = new LocalScopeExample();
        obj.display();
        // System.out.println(localVar); // Error: Cannot access outside the method
    }
}
