public class MethodOverloadingExample {

    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two double values
    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        MethodOverloadingExample obj = new MethodOverloadingExample();

        // Call method with two integers
        System.out.println("Sum of 5 and 10: " + obj.add(5, 10));

        // Call overloaded method with three integers
        System.out.println("Sum of 5, 10, and 15: " + obj.add(5, 10, 15));

        // Call overloaded method with two double values
        System.out.println("Sum of 5.5 and 10.5: " + obj.add(5.5, 10.5));
    }
}
