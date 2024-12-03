class Car {
    String brand;
    String color;
    String year;

    // Constructor
    Car(String brand, String color, String year) {
        this.brand = brand;
        this.color = color;
        this.year = year;
    }

    // Method to display car details
    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Red", "2020");
        car1.displayDetails();

        Car car2 = new Car("Honda", "Blue", "2018");
        car2.displayDetails();

        Car car3 = new Car("Ford", "Black", "2019");
        car3.displayDetails();
    }
}
