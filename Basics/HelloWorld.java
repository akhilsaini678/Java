package Basics;
import java.lang.*;
import java.util.Scanner;

// If class is public, then the file name and class name need to be same, otherwise it will work fine.
class HelloWorld { // Everything in Java is inside the class, even main function.
    
    // public: If anything need to be called outside of the class, then it should be public.
    //         JVM need to know the method, so that is why main method is public, so that it can access it.
    // static: We can't use the class, without creating an object, but if we want to use it without creating the object, then it need to be static. 
    //         JVM needs to find this main method from the class name only. That is why static.
    // String args[]: Mandatory fields to be passed.
    public static void main(String args[]){

        // System: It is a class (In capital)
        // out: It is an object of system class.
        // println: It is a method that is why having paranthesis.
        System.out.println("Hello World!");

        // Scanner is a class, we created an object of it, which has different methods like nextInt(), nextDouble() etc.
        // System.in is an object attached to the keyboard, it is a reference provided by java.
        // Scanner has: nextInt(), nextFloat(), nextDouble(), next(), nextLine(), nextByte(), nextShort(), nextLong(), nextBoolean(), hasNextInt(), hasNextFloat()
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("Sum of "+num1+" and "+num2+" is "+(num1+num2));

        // * To know all the methods of class: javap java.util.Scanner
    }
}
