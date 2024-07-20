package errorHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * Resources are allocated in heap, so program should release them after use.
 * Finally block can be used to release the resouces.
 * Those classes which implements Autoclosable, can be used inside try without finally and catch.
 */

public class TryWithResources {
    // static FileInputStream fi;
    // static Scanner sc;
    static void divide() throws Exception {
        // fi = new FileInputStream("errorHandling\\num.txt");
        try(FileInputStream fi = new FileInputStream("errorHandling\\num.txt");Scanner sc = new Scanner(fi);) {
            // sc = new Scanner(fi); 
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println(a/c);
        }
        // finally {
        //     fi.close();
        //     sc.close();
        // }
    }
    public static void main(String[] args) throws Exception {
        try {
            divide();   
        } catch (Exception e) {
            System.out.println(e);
        }
        // int x = sc.nextInt();
        // System.out.println(x);
    }
}
