package Basics;


class DataTypes {

    public static void main(String args[]){
        // Primitive Data Types
        byte val1 = 1; // 2^8
        short val2 = 2; // 2^16
        int val3 = 3; // 2^32
        long val4 = 4; // 2^64

        float val5 = 10.20f; // 4 bytes
        double val6 = 20.40; // 8 bytes

        boolean val7 = true; // Space depends on the environment. 
        char val8 = 'A'; // 2 bytes (Supports other languages as well except English, is has Unicode)

        System.out.println(val1);
        System.out.println(val2);
        System.out.println(val3);
        System.out.println(val4);
        System.out.println(val5);
        System.out.println(val6);
        System.out.println(val7);
        System.out.println(val8);

        // For every primitive data type, there is a class. Which contains the information about the data type.
        // Can get the info about the datatypes using: javap java.lang.Integer
        System.out.println("Minimum Value: "+ Integer.MIN_VALUE + "and Maximum Value: " + Integer.MAX_VALUE);

        // byte b = 128; // It will throw an error, since 128 can't be stored in byte.


        // Variables
        /*
         * Case Sensitive
         * Contains alphabet, numbers, _ or $ : total$Amount or total_amount
         * Starts with alphabet, _ or $
         * Should not be a keyword
         * Should not be a class name, although it will work.
         * No limit on length of name
         * Follow camel case
         * 
         */

         /*
          * Literals
          * Literals also have data type.
          *
          */
          byte b1 = 10;
          byte b2 = 0b1010;
          byte b3 = 012;
          byte b4 = 0XA;

          System.out.println(b1+"\n"+b2+"\n"+b3+"\n"+b4);

          long l = 999_999_999_999L; // Underscore is allowed for literal to seprate bigger number
          float f = 24.65f;
          double d = 48.34d;


          System.out.println(l+"\n"+f+"\n"+d);


          /*
           * Negative numbers are stored in two's compliment.
           * Where first bit determines the nature of number, and rest is the number itself.
           * In case of positive number first bit is 0.
           * In case of negative number first bit is 1, and rest bits are in two's complement of number.
          */ 

          int num = -6;
          // It will print binary representation stored for -6.
          System.out.println(Integer.toBinaryString(num));

          /*
           * Float: . is not stored in memory, instead the number is converted into 12.54 to 1254(mantis) X 10^-2(exponent)
           * Foat supports upto 6-7 digits after decimal, whereas double will support 14-15 digits after decimals.
           * 
           */
    }
}