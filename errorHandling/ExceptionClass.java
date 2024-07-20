package errorHandling;
import java.io.*;

/*
 *                        Object
 *                          |
 *                      Throwable
 *                          |
 *                    |           |
 *                Exception     Error
 *                    |
 *                ClassNotFound [Class Related]
 *                IoException [File Related]
 *                InterruptedException [Thread Related]
 *                NumberFormatException [Number Related]
 *                RuntimeException
 *                      |
 *                  Arthimetic Exception [Division by zero]
 *                  IndexOutOfBoundException
 *                  NullPointerException
 */               

 /*
  * Exceptions are of two types: Checked and Unchecked exception.
  * Checked exceptions are those which are mandotory to handle using try and catch. Java compiler forces to handle such exception. 
  * Unchecked exceptions are those which programmer can handle or not. But program will crash if it isn't handled. [Runtime Exception]
  */

/* 
 * class Exception {
 *  getMessage();
 *  toString();
 *  printStackTrace();
 * }
 */


 /*
  * Throw and Throws
  * Throw:  When a function is having an error, but how do it return it to the calling functions, since it has return type int.
  *         In this case, we use throw, that either it return the data, or throw an error. 
  *         Throw is used to send it to the calling functions, throws is used at the function defination.
  */


class LowBalanceException extends Exception {
    public String toString(){
        return "Balance should not be less than 5000";
    }
}

public class ExceptionClass {
    static void fun1() throws LowBalanceException {
        // Unchecked Exception: Runtime Exception
        try {
            System.out.println(10/1);
            throw new LowBalanceException();
        } finally {
            System.out.println("Finally");
        }

        // Checked Exception
        // FileInputStream f = new FileInputStream("File.txt");
    }
    
    static void fun2() throws LowBalanceException {
        fun1();
    }
    
    static void fun3() throws LowBalanceException {
        fun2();
    }

    public static void main(String[] args) {
        try {
            fun3();
        } catch (Exception e){
            System.out.println("Exception: "+ e);
        }
    }
}
