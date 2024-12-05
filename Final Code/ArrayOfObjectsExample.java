class Student {
    String name;
    int age;

    // Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display student details
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ArrayOfObjectsExample {
    public static void main(String[] args) {
        // Create an array of Student objects
        Student[] students = new Student[3];

        // Initialize objects in the array
        students[0] = new Student("Ashish", 20);
        students[1] = new Student("Madhu", 22);
        students[2] = new Student("Prajapati", 19);

        // Display details of each student
        for (Student student : students) {
            student.display();
        }
    }
}
