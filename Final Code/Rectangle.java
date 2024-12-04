class Rectangle {
    int lenght;
    int breadth;

    // constructor
    Rectangle() {
        lenght = 5;
        breadth = 10;
    }
int area(){
    return lenght * breadth;
}

class constructorDemo {
    public static void main(String[] args) {
        Rectangle firstReact=new Rectangle();
        System.out.println("area of the rectangle is " + firstReact.area());
    }
}
}