package overriding;

class TV {
    void switchOn() { System.out.println("TV is switched on."); }
    void changeChannel(){ System.out.println("TV channel is changed."); }
}

class SmartTV extends TV {
    void switchOn() { System.out.println("Smart TV is switched on."); }
    void changeChannel(){ System.out.println("Smart TV channel is changed."); }
    void browse(){ System.out.println("Smart TV is browsing."); }
}


public class Overriding {
    public static void main(String args[]){
        TV tv = new TV();
        tv.switchOn();
        tv.changeChannel();

        /*
         * Method Overriding 
         * This is method overriding: When parent and child have same method with same parameters, then the child method is called.
         * Final and static methods can't be override.
         * Private -> Protected -> Public: In this sequence only parent and child class should have it. Losely one is allowed in child class not stricter one.
         * Parent = Private then Child can have all 3.
         * Parent = Protected then Child can have protected and public
         * Parent = Public then Child can have only Public. 
         */
        SmartTV smartTV = new SmartTV();
        smartTV.switchOn();
        smartTV.changeChannel();
        smartTV.browse();


        /*
         * Dynamic Method Dispatch
         * This is dynamic method dispatch: When parent reference hold the child object, and the same method is called, then child method is called.
         * The object is created at runtime in heap. So, at the time of runtime it is being decided which method to call on the basis of object.
         * That is why it is called dynamic method dispatch (Dispatch means calling)
         * It is used for acheiving runtime polymorphism using method overriding.
         */
        TV tv1 = new SmartTV();
        tv1.switchOn();
        tv1.changeChannel(); 

        // tv1.browse(); [Not valid because we are having a reference of tv, which doesn't have all the functionality of smart TV]
        //               Super class reference doesn't have knowledge about the sub class method if it's not present in parent class itself.
        // For example consider: TV, TV's remote and SmartTv, SmartTv's remote
        // Now, if you have SmartTv but remote of TV, then you can change channel, switch on (because it is extending the parent class), but you can't browse with old remote.
        // Similarly, if you have a TV, and a smartTV's remote, it won't work, since the remote itself is new.
        // SmartTV smartTV = new TV(); [Not valid, smartTV reference can't have all the methods and properties available in TV object]


        /*
         * Runtime Polymorphism
         * Poly means many and morphism means shape. The name remains same, but actions are different.
         * It is acheived using overloading and overriding. Since in both names are same, but different methods are called based on the logic.
         * It is of two types: 
         * Compile-time polymorphism (Method overloading): Since, the compiler decides at the compile time, on the basis of arguments passed to it, which methods to call.
         * Run-time polymorphism (Method overriding): Since the object is created on heap at runtime, so at runtime, it is decided which method to call. Achieved only in inheritance.
         */

    }
}
