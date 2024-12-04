public class ClassScopeExample {
    static String staticVar = "I am a class (static) variable";

    public static void display() {
        System.out.println(staticVar); // Accessible directly in static methods
    }

    public static void main(String[] args) {
        System.out.println(ClassScopeExample.staticVar); // Access with class name
        ClassScopeExample.display();
    }
}
