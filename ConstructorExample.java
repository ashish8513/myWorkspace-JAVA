class Rectangle {
    int length;
    int breadth;

    // Default constructor
    Rectangle() {
        System.out.println("Constructor with zero parameters");
        length = breadth = 0;
    }

    // Constructor with one parameter
    Rectangle(int side) {
        System.out.println("Constructor with one parameter");
        length = breadth = side;
    }

    // Constructor with two parameters
    Rectangle(int l, int b) {
        System.out.println("Constructor with two parameters");
        length = l;
        breadth = b;
    }

    // Method to calculate area
    int area() {
        return length * breadth;
    }
}

// Main class to test the Rectangle constructors
public class ConstructorExample {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(); // Calls the default constructor
        Rectangle r2 = new Rectangle(5); // Calls the constructor with one parameter
        Rectangle r3 = new Rectangle(5, 10); // Calls the constructor with two parameters

        System.out.println("Area of rectangle r1: " + r1.area());
        System.out.println("Area of rectangle r2: " + r2.area());
        System.out.println("Area of rectangle r3: " + r3.area());
    }
}
