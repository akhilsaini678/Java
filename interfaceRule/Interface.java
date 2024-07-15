package interfaceRule;

/*
  * Interfaces
  * Interfaces are abstract class with all abstract methods only.
  * Interfaces methods are abstract as well as public by default.
  * Child class object can be stored in an interface reference.
  */

  /*
   * Abstract and Interfaces
   * Abstracts provides inheritance as well as polymorphism, whereas interfaces provides only polymorphism.
   * Abstracts classes are extended but interfaces are implemented.
   * A class can extend only from one class, but a class can implements multiple interfaces.
   * 
   */


class Phone {
    public void call(){ System.out.println("Phone making a call"); }
    public void sms(){ System.out.println("Phone sending a sms"); }
}

interface Camera {
    void click();
    void record();
}

interface Music {
    void play();
    void pause();
    void stop();
}


class SmartPhone extends Phone implements Camera, Music {
    
    public void videoCall() { System.out.println("Smartphone video calling"); }
    public void click() { System.out.println("Smartphone clicking photo"); }
    public void record() { System.out.println("Smartphone recording video"); }
    public void play() { System.out.println("Smartphone playing music"); }
    public void pause() { System.out.println("Smartphone pausing music"); }
    public void stop() { System.out.println("Smartphone stopping music"); }

}

public class Interface {
    public static void main(String args[]){
        // All are valid. Just some methods will be accessible only.
        SmartPhone sp = new SmartPhone();
        Phone p = new SmartPhone();
        Camera c = new SmartPhone();
        Music m = new SmartPhone();
    }
    
}
