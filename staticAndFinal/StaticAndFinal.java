package staticAndFinal;

/*
 * Static: It can be used to generate a account number directly inside the class, on creation of new object instead of passing via main method.
 * Static variables:
 *      Static members can be called via Class name directly or via object too.
 * Static methods:
 *      Static methods can use only static members or other static methods of the class.
 * Static inner class:
 *      If there are multiple static methods, then those methods can be grouped in a static inner class.
 *      Then the object can be created without creating the object of outer class.
 *      this and super can't be used in static class and static methods.
 *      Only inner classes can be static.
 * Static Blocks:
 *      Static blocks are used to initialize the static members. (Not frequently used.)
 * 
 * 
 * Important:
 *      Static members are the metadata of the class. Like price of a car, it exists without an actual car as well.
 *      Static members belong to the class.
 *      Static members can be used without creating the object.
 *      Static members are shared by all the objects. There will be only one copy of static members.
 *      They are created in method area, not in heap. At the time of loading the class into the memory.
 */


 class Test {
    static int x;
    int y = 20;

    static {
        x = 10;
    }
    
    void show(){
        System.out.println(x+" "+y);
    }
    

    static void showStatic(){
        System.out.println(x);
    }
}



 /*
  * Final: It is used as a constant variables, to restrict method overriding, and to retrict inheritance.
  * Final Variables: 
  *     These variables are constant. Final variables can't be modified.
  *     These are written in capital letter.
  *     Final variables can be initialised at the time of decleration, inside static block or inside the constructer.
  * 
  * Final Methods:
  *     Final methods can't be overriden.
  * Final Class:
  *     Final class can't be extened. The features of a final class can't be borrowed.
  */


class FinalDemo {
    final int X = 10;
    final int Y;
    {
        Y = 20;
    }
    static final int Z;
    static {
        Z = 30;
    }
    final String STR;
    FinalDemo(){
        STR = "Final";
    }
}


/*
 * Singleton Class
 * Those classes for which only 1 object (or fixed number of object) can be created.
 * How to do that:
 *      Make the constructor as private. (No object can be created outside of the class)
 *      Declare a static variable of type class with value as NULL.
 *      Define a static method to get the object instance, and create the object inside this static method and return.
 */

class CoffeeMachine {
    private float coffeeQty;
    private float milkQty;
    private float teaQty;
    private float waterQty;
    static private CoffeeMachine cm = null;

    private CoffeeMachine(){
        coffeeQty = 1;
        milkQty = 1;
        teaQty = 1;
        waterQty = 1;
    }

    static CoffeeMachine getInstance(){
        if (cm == null){
            cm = new CoffeeMachine();
        }
        return cm;
    }
}

public class StaticAndFinal {
    public static void main(String[] args) {
        System.out.println(Test.x);
        Test.showStatic();


        CoffeeMachine cm1 = CoffeeMachine.getInstance();
        CoffeeMachine cm2 = CoffeeMachine.getInstance();
        CoffeeMachine cm3 = CoffeeMachine.getInstance();
        System.out.println(cm1+"\n"+cm2+"\n"+cm3+"\n");
    }
}
