class Person {
    String name = "Unknown";

    Person() {
        System.out.println("Person constructor called");
    }

    void show() {
        System.out.println("This is a person");
    }
}

class Student extends Person {
    String name; // Student's own variable

    // Constructor using this and super
    Student(String name) {
        super();          // Calls parent class constructor
        this.name = name; // Refers to current class variable
    }

    void displayNames() {
        System.out.println("Student name (this): " + this.name);
        System.out.println("Person name (super): " + super.name);
    }

    // Method Overriding
    @Override
    void show() {
        super.show(); // Call parent method
        System.out.println("This is a student");
    }
}

public class Day_18{
    public static void main(String[] args) {
        Student s = new Student("Ishika");

        s.displayNames();  // Demonstrates this & super variables
        s.show();          // Demonstrates method overriding
    }
}
