public class BlockScopeExample {
    public static void main(String[] args) {
        if (true) {
            int blockVar = 10; // Declared inside if-block
            System.out.println("Block Variable: " + blockVar);
        }
        // System.out.println(blockVar); // Error: Cannot access outside the block
    }
}
