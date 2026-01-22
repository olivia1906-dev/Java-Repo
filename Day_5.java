public class Day_5{
    public static void main(String[] args){
        System.out.println("Inheritance");
        System.out.println("Inheritance in Java is an Object-Oriented Programming (OOP) concept where one class (child/subclass) acquires the properties (fields) and behaviors (methods) of another class (parent/superclass). But parent class cannot access the properties of child class.");
        System.out.println("   ");
        System.out.println("Today we are going to study 'Legal Inheritance'.");
        System.out.println("   ");
        System.out.println("Legal inheritance is of main 4 types.");
        System.out.println("1. Single - level: it include 1 parent class and 1 child class.");
        System.out.println("2. Multi - level: it include 1 grand parent class and 1 parent class and 1 child class. Child class can access grand parent class through parent class.");
        System.out.println("3. Hierarchy : it include 1 parent class and many child class.");

        // Execution code:
        GrandFather g = new GrandFather();
        g.AA();
        Father f = new Father();
        f.AA();
        f.AB();
        Child1 c1 = new Child1();
        c1.AA();
        c1.AB();
        c1.AC();
        Child2 c2 = new Child2();
        c2.AA();
        c2.AB();
        c2.AD();
        Child3 c3 = new Child3();
        c3.AA();
        c3.AB();
        c3.AC();
        c3.AE();
    }
}

class GrandFather{
    void AA(){
        System.out.println("Method from Grand Parent class.");
    }
}

class Father extends GrandFather{
    void AB(){
        System.out.println("Method from Parent class.");
    }
}

class Child1 extends Father{
    void AC(){
        System.out.println("Method from Child 1 class.");
    }
}

class Child2 extends Father{
    void AD(){
        System.out.println("Method from Child 2 class.");
    }
}

class Child3 extends Child1{
    void AE(){
        System.out.println("Method from Child 3 class.");
    }
}