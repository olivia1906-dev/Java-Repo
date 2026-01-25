public class Day_2{
    public static void main(String[] args){
        // fixed literals
        int num1 = 10;
        int num2 = 11;
        // printing the fixed literals
        System.out.println("Number 1 is " + num1 + ", and Number 2 is " + num2);
        System.out.println();

        // performing Relational operators
        System.out.println("Is 'num1 equal to num2'? " + (num1 == num2));
        System.out.println("Is 'num1 not equal to num2'? " + (num1 != num2)); 
        System.out.println("Is 'num1 greater than num2'? " + (num1 > num2));
        System.out.println("Is 'num1 less than num2'? " + (num1 < num2)); 
        System.out.println("Is 'num1 greater than or equal to num2'? " + (num1 >= num2)); 
        System.out.println("Is 'num1 lesser than or equal to num2'? " + (num1 <= num2)); 
        System.out.println();

        // performing Bitwise operators
        System.out.println("Bitwise and operator between num1 and num2 :  " + (num1 & num2)); 
        System.out.println("Bitwise or operator between num1 and num2: " + (num1 | num2)); 
        System.out.println("Bitwise exor operator between num1 and num2: " + (num1 ^ num2)); 
        System.out.println("Bitwise not operator on num1 and num2 :  " + (~num1) + " & " + (~num2)); 
        System.out.println("Bitwise left shift operator on num1 and num2 by 2: " + (num1 << 2) + " & " + (num2 << 2)); .
        System.out.println("Bitwise right shift operator on num1 and num2: "+ (num1 >> 2) + " & " + (num2 >> 2)); 
        System.out.println("Bitwise unsigned right shift operator on num1 and num2: "+ (num1 >>> 2) + " & " + (num2 >>> 2)); 
        System.out.println("Bitwise unsigned right shift operator on a negative number(-10  & -11): "+ (-10 >>> 2) + " & " + (-11 >>> 2));


    }
}
