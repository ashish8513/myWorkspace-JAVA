
public class PrivateExample {
    private String secret = "I am Private";

    private void displaySecret() {
        System.out.println("Private Method: " + secret);
    }

    public void accessSecret() {
        System.out.println("Accessing private member...");
        displaySecret(); // Accessible within the class
    }

    public static void main(String[] args) {
        PrivateExample obj = new PrivateExample();
        // System.out.println(obj.secret); // Not accessible
        // obj.displaySecret();           // Not accessible
        obj.accessSecret();              // Access through public method
    }
}
