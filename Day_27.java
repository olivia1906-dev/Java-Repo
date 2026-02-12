// Encapsulation + Runtime Polymorphism Example

class Employee {
    //  Encapsulated data (private variables)
    private String name;
    private double salary;

    // Public getters and setters (controlled access)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {   // validation
            this.salary = salary;
        }
    }

    // Method to be overridden (polymorphism)
    public double calculateBonus() {
        return salary * 0.10; // Default 10% bonus
    }
}

// Subclass 1
class Manager extends Employee {
    @Override
    public double calculateBonus() {
        return getSalary() * 0.20; // 20% bonus
    }
}

// Subclass 2
class Developer extends Employee {
    @Override
    public double calculateBonus() {
        return getSalary() * 0.15; // 15% bonus
    }
}

public class Day_27 {
    public static void main(String[] args) {

        // Runtime Polymorphism
        Employee emp1 = new Manager();
        emp1.setName("Alice");
        emp1.setSalary(50000);

        Employee emp2 = new Developer();
        emp2.setName("Bob");
        emp2.setSalary(40000);

        System.out.println(emp1.getName() + " Bonus: " + emp1.calculateBonus());
        System.out.println(emp2.getName() + " Bonus: " + emp2.calculateBonus());
    }
}
