class Base {
    int num1;

    void baseShow() {
        System.out.println("num1: " + num1);
    }
}

class Derived extends Base {
    int num2;

    void product() {
        System.out.println("product: " + (num1 * num2));
    }

    void derivedShow() {
        System.out.println("num2: " + num2);
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Derived d = new Derived();
        d.num1 = 10; // Set value for num1
        d.baseShow(); // Call method from Base class
        d.num2 = 20; // Set value for num2
        d.derivedShow(); // Call method from Derived class
        d.product(); // Call product method
    }
}
