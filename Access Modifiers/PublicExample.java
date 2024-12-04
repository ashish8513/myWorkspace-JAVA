public class PublicExample {
    public String message = "I am public";

    public void displayMessage() {
        System.out.println("public method" + message);
    }

    public static void main(String[] args) {
        PublicExample obj = new PublicExample();
        System.out.println(obj.message);
        obj.displayMessage();
    }
}