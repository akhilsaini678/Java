package Oops;


public class Methods {

    /*
     * Static: Methods called from static should be static only. Static methods can't call non-static method.
     * Call without making the method static: Create a object of the class, and call the method by using that object.
     */

    /*
     * Parameters are passed by values only in java.
     * Primitives types are copied into the methods. No change will reflect in actual value on changing the value in a method.
     * Non-primitive types reference is copied. That is data allocation on heap remains same, but a new reference is created to that data.
     * In case of non-primitive type, changes in value inside method will reflect the change in the actual value.
     */
    static int findMax(int a,int b){
        if(a>b) return a;
        return b;
    }
    
    static int findMax(int a, int b,int c){
        if(a>b&&a>c){
            return a;
        } else if(b>c){
            return b;
        }
        return c;
    }

    /*
     * Variable arguments:
     * Only 1 argument can be passed as a variable argument, that too last one.
     */
    static int variableArg(int...x){
        for(int a:x){

        }
        return 10;
    }

    public static void main(String args[]){
        int a = 10, b = 20, c = 30;
        int max = findMax(a,b);
        // Methods methods = new Methods();
        // methods.findMax(a, b);
        System.out.println(max);


        /*
         * Method Overloading
         * Either the number of parameters passed is different or the data type for any of the parameter is different.
         * Then java treats the methods differently.
         * 
         */

        int maximum = findMax(a,b,c);
        System.out.println(maximum);
    }   
}