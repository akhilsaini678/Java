package abstraction;


/*
 * Abstract Class
 * Abstract meaning: existing only as an idea, not as a physical thing
 * These classes are used to impose things. Abstract classes are meant
 * Properties:
 *  Object of an abstract class can't be created.
 *  A concrete class which is extending a abstract class, must override all the abstract method to be concrete.
 *  If a class has at least one abstract method then the class becomes abstract.
 *  An abstract class can have abstract method as well as non-abstract method.
 *  Abstract class can have a reference (Use: Dynamic Method Dispatch).
 *  If a method's body isn't defined then it should be declared as abstract.
 *  Abstract class can't be make final. Since a class which is final can't be extended. And abstract classes are meant to be extended.
 *  Abstract method can't be make final. Since a method which is final can't be overriden. And abstract methods are meant to be overriden.
 *  Abstract method can't be make static. Since a method which is static can be called just by class name without the object.
 */

abstract class Hospital {
    public Hospital(){
        System.out.println("Hospital Constructor");
    }

    abstract public void emergency();
    abstract public void appointment();
    abstract public void admit();
    abstract public void billing();
}

class Aims extends Hospital {
    public void emergency() { System.out.println(); };
    public void appointment() { System.out.println(); };
    public void admit() { System.out.println(); };
    public void billing() { System.out.println(); };
}

public class Abstract {
    public static void main(String args[]){
        Aims aims = new Aims();

    }
}
