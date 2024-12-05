// Parent class
class Animal {
    // Method to be overridden
    void sound() {
        System.out.println("Animals make different sounds.");
    }
}

// Subclass
class Dog extends Animal {
    // Overriding the sound method
    @Override
    void sound() {
        System.out.println("Dog barks.");
    }
}

// Subclass
class Cat extends Animal {
    // Overriding the sound method
    @Override
    void sound() {
        System.out.println("Cat meows.");
    }
}

// Main class
public class MethodOverridingExample {
    public static void main(String[] args) {
        // Parent class reference to parent object
        Animal animal = new Animal();
        animal.sound();

        // Parent class reference to subclass object
        Animal dog = new Dog();
        dog.sound();

        // Parent class reference to another subclass object
        Animal cat = new Cat();
        cat.sound();
    }
}
