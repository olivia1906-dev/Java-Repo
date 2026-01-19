public class Day_2{
    public static void main(String[] args){
        // fixed literals
        int num1 = 10;
        int num2 = 11;
        // printing the fixed literals
        System.out.println("Number 1 is " + num1 + ", and Number 2 is " + num2);
        System.out.println();

        // performing Relational operators
        System.out.println("Is 'num1 equal to num2'? " + (num1 == num2)); //equal to tells if two numbers are equal.
        System.out.println("Is 'num1 not equal to num2'? " + (num1 != num2)); //not equal tells if two numbers are not equal.
        System.out.println("Is 'num1 greater than num2'? " + (num1 > num2)); //greater than tells if number 1 is greater than number 2 or not.
        System.out.println("Is 'num1 less than num2'? " + (num1 < num2)); //lesser than tells if number 1 is lesser than number 2 or not.
        System.out.println("Is 'num1 greater than or equal to num2'? " + (num1 >= num2)); //greater than or equal  to tells if number 1 is greater than or equal to number 2.
        System.out.println("Is 'num1 lesser than or equal to num2'? " + (num1 <= num2)); //lesser than oe equal to tells if number 1 is lesser than equal to number 2.
        System.out.println();

        // performing Bitwise operators
        System.out.println("Bitwise and operator between num1 and num2 :  " + (num1 & num2)); //bitwise and performs logical AND between 2 numbeer's binary form.
        System.out.println("Bitwise or operator between num1 and num2: " + (num1 | num2)); //bitwise or performs logical OR between 2 numbeer's binary form.
        System.out.println("Bitwise exor operator between num1 and num2: " + (num1 ^ num2)); // bitwise exclusive or performs logical EX-OR between 2 numbeer's binary form.
        System.out.println("Bitwise not operator on num1 and num2 :  " + (~num1) + " & " + (~num2)); //bitwise not performs logical NOT on each bit of a number.
        System.out.println("Bitwise left shift operator on num1 and num2 by 2: " + (num1 << 2) + " & " + (num2 << 2)); //bitwise left shift shifts binary bits of the number by the given number in left direction.
        System.out.println("Bitwise right shift operator on num1 and num2: "+ (num1 >> 2) + " & " + (num2 >> 2)); // bitwise right shift shifts binary bits of the number by the given number in right direction.
        System.out.println("Bitwise unsigned right shift operator on num1 and num2: "+ (num1 >>> 2) + " & " + (num2 >>> 2)); // bitwise unsigned right shift is similar to bitwise right shift is just different if the number is negative.
        System.out.println("Bitwise unsigned right shift operator on a negative number(-10  & -11): "+ (-10 >>> 2) + " & " + (-11 >>> 2));


    }
}