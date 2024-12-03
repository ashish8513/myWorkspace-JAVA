class Rectangle {
    int length;
    int breadth;

    Rectangle() {
        length = 5;
        breadth = 10;
    }

    int area() {
        int recArea = length * breadth;
        return recArea;
    }

}

public class Constructor {

    public static void main(String[] args) {
        Rectangle firstReact = new Rectangle();
        System.out.println("Area of first rectangle is: " + firstReact.area());
    }
}