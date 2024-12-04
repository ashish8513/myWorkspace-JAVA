// File: DefaultExample.java
package example;

class DefaultExample {
    String message = "I am Default"; // No modifier = default

    void displayMessage() {
        System.out.println("Default Method: " + message);
    }

    public static void main(String[] args) {
        DefaultExample obj = new DefaultExample();
        System.out.println(obj.message); // Accessible
        obj.displayMessage();           // Accessible
    }
}
