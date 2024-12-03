public class returnProgram {
    public static void main(String[] args) {
        int result = add(5, 10);
        System.out.println("result: " + result);
    }

    static int add(int a, int b) {
        return a + b;
    }
}