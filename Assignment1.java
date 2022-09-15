public class Assignment1 {
    public static void main(String []args){

        // Question1
        // Write a Java program to print addition and subtraction of two integer numbers
        int num1 = 10;
        int num2 = 5;
        int sum = num1 + num2;
        int difference = num1-num2;
        System.out.println("Addition of num1 and num2: " + sum);
        System.out.println("Subtraction of num1 and num2: " + difference);
        
        // Question2
        // Write a Java program to print multiplication of two floating point numbers
        float num1 = 5.2f;
        float num2 = 2.2f;
        System.out.println("Multiplication of num1 and num2: " + (num1*num2) );

        // Question3
        // Write a Java program to compute quotient and remainder and print it
        int num1 = 10;
        int num2 = 3;
        int quotient = num1/num2;
        int remainder = num1%num2;
        System.out.println("When we divide num1 and num2 quotient is: " + quotient);
        System.out.println("When we divide num1 and num2 remainder is: " + remainder);

        // Question4
        // Write a Java program to swap the values of integer number with using temporary variable and without using temporary variable
        // Swapping values using temporary variable
        int num1 = 15;
        int num2 = 10;
        System.out.println("Before swapping num1: " + num1 + " num2: " + num2);
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After swapping using temporary variable num1: " + num1 + " num2: " + num2);

        // Resetting num1 and num2
        num1 = 15;
        num2 = 10;

        //Swapping without using temporary variable
        System.out.println("Before swapping num1: " + num1 + " num2: " + num2);
        num1 = num1 + num2;
        num2 = num1-num2;
        num1 = num1 - num2;
        System.out.println("After swapping without using temporary variable num1: " + num1 + " num2: " + num2);
    }
}
