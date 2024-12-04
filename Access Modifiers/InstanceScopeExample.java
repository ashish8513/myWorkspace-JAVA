public class InstanceScopeExample {
    String instanceVar = "I am an instance variable";

    public void display() {
        System.out.println(instanceVar); // Accessible within instance methods
    }

    public static void main(String[] args) {
        InstanceScopeExample obj = new InstanceScopeExample();
        System.out.println(obj.instanceVar); // Access using object
        obj.display();
    }
}
