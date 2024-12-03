public class exception {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("division by zero is not allowed ");
        } finally {
            System.out.println("This will always run");
        }
    }
}
