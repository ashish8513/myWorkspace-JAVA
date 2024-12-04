// Abstract Class
abstract class Animal {
    // Abstract method (no implementation)
    abstract void sound();

    // Concrete method (implemented)
    void eat() {
        System.out.println("I can eat food.");
    }
}

// Subclass 1
class Dog extends Animal {
    // Implementing the abstract method
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Subclass 2
class Cat extends Animal {
    // Implementing the abstract method
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

// Main Class
public class AbstractClassExample {
    public static void main(String[] args) {
        Animal myDog = new Dog(); // Polymorphism
        myDog.sound();           // Dog barks
        myDog.eat();             // I can eat food

        Animal myCat = new Cat();
        myCat.sound();           // Cat meows
        myCat.eat();             // I can eat food
    }
}
