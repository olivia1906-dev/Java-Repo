// Parent class
class Parent {
    String name = "Unknown"; // Instance variable of Parent class

    // Parent class constructor
    Parent() {
        System.out.println("Parent constructor called");
    }

    // Method in parent class
    void show() {
        System.out.println("This is a person");
    }
}

// Child class inheriting Parent
class Child extends Parent {
    String name; // Child class has its own variable with same name

    // Constructor of Child class
    Child(String name) {
        super();          // Calls the constructor of Parent class
        this.name = name; // Refers to Child's variable
    }

    // Method to display both names
    void displayNames() {
        System.out.println("Child name (this): " + this.name);   // Child variable
        System.out.println("Parent name (super): " + super.name); // Parent variable
    }

    // Method overriding
    @Override
    void show() {
        super.show(); // Calls Parent's show()
        System.out.println("This is a student"); // Child-specific behavior
    }
}

// Main class
public class Day_20 {  
    public static void main(String[] args) {

        Child c = new Child("Ishika");

        c.displayNames(); // Demonstrates this & super
        c.show();         // Demonstrates method overriding
    }
}
