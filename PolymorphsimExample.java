class Animal {
    void sound() {
        System.out.println("the animal makes the sound:");

    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("the dog barks");
    }
}
class Cat extends Animal 
{
    void sound() {
        System.out.println("the cat meows");
    }
}
public class PolymorphsimExample{
    public static void main(String[] args) {
        Animal myAnimal;
        myAnimal = new Dog();
        myAnimal.sound();

        myAnimal = new Cat();
        myAnimal.sound();  // This will call Cat's sound() method as Cat is an instance of Animal.
    }
} 