public class Day_3 {
    public static void main(String[] args) {
        System.out.println("BASIC MATHEMATICAL FORMULAS");
        System.out.println();

        // Simple Interest
        System.out.println("Finding Simple Interest:");
        System.out.println("Formula : (P * R * T) / 100");
        int principal = 10000;
        int rate = 5;
        int time = 3;
        int simpleInterest = (principal * rate * time) / 100;
        System.out.println("Principal = " + principal + ", Rate = " + rate + ", Time = " + time);
        System.out.println("Simple Interest = " + simpleInterest);
        System.out.println();

        // Circumference of Circle
        System.out.println("Finding Circumference of a Circle:");
        System.out.println("Formula : 2 * 3.14 * radius");
        int radius = 20;
        double circumference = 2 * 3.14 * radius;
        System.out.println("Radius = " + radius);
        System.out.println("Circumference = " + circumference);
        System.out.println();

        // Area of Circle
        System.out.println("Finding Area of a Circle:");
        System.out.println("Formula : 3.14 * radius * radius");
        double circleArea = 3.14 * radius * radius;
        System.out.println("Area = " + circleArea);
        System.out.println();

        // Perimeter of Rectangle
        System.out.println("Finding Perimeter of a Rectangle:");
        System.out.println("Formula : 2 * (length + breadth)");
        int length = 20;
        int breadth = 10;
        int rectanglePerimeter = 2 * (length + breadth);
        System.out.println("Length = " + length + ", Breadth = " + breadth);
        System.out.println("Perimeter = " + rectanglePerimeter);
        System.out.println();

        // Area of Rectangle
        System.out.println("Finding Area of a Rectangle:");
        System.out.println("Formula : length * breadth");
        int rectangleArea = length * breadth;
        System.out.println("Area = " + rectangleArea);
        System.out.println();

        // Perimeter of Triangle
        System.out.println("Finding Perimeter of a Triangle:");
        System.out.println("Formula : side1 + side2 + side3");
        int side1 = 20;
        int side2 = 10;
        int side3 = 30;
        int trianglePerimeter = side1 + side2 + side3;
        System.out.println("Sides = " + side1 + ", " + side2 + ", " + side3);
        System.out.println("Perimeter = " + trianglePerimeter);
        System.out.println();

        // Area of Right Angled Triangle
        System.out.println("Finding Area of a Right Angled Triangle:");
        System.out.println("Formula : 0.5 * base * height");
        int base = 20;
        int height = 10;
        double triangleArea = 0.5 * base * height;
        System.out.println("Base = " + base + ", Height = " + height);
        System.out.println("Area = " + triangleArea);
        System.out.println();

        // Curved Surface Area of Cuboid
        System.out.println("Finding Curved Surface Area of a Cuboid:");
        System.out.println("Formula : 2 * height * (length + breadth)");
        height = 30;
        int curvedSurfaceArea = 2 * height * (length + breadth);
        System.out.println("Length = " + length + ", Breadth = " + breadth + ", Height = " + height);
        System.out.println("Curved Surface Area = " + curvedSurfaceArea);
        System.out.println();

        // Total Surface Area of Cuboid
        System.out.println("Finding Total Surface Area of a Cuboid:");
        System.out.println("Formula : 2 * (length * breadth + length * height + breadth * height)");
        int totalSurfaceArea = 2 * (length * breadth + length * height + breadth * height);
        System.out.println("Total Surface Area = " + totalSurfaceArea);
        System.out.println();

        // Volume of Cuboid
        System.out.println("Finding Volume of a Cuboid:");
        System.out.println("Formula : length * breadth * height");
        int volume = length * breadth * height;
        System.out.println("Volume = " + volume);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("THANK YOU");
    }
}
