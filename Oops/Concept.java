package Oops;


/*
 * Abstraction
 * Encapsulation 
 * Inheritence (Specialisation)
 * Polymorphism (Generalisation)
 */


class Circle {
    private int radius;

    public Circle(){
        radius = 1;
    }

    public Circle(int r){
        radius = r;
    }

    void setRadius(int r){
        radius = r;
    }

    int getRadius(){
        return radius;
    }

    double area(){
        return Math.PI * radius * radius;
    }

    double perimeter(){
        return 2 * Math.PI * radius;
    }

    double circumference(){
        return perimeter();
    }
}

public class Concept {
    
    public static void main(String args[]){
        /*
         * Class: Properties + Behaviour.
         * Object: A blueprint of the class.
         * 
         * Objects are created in heap, but there reference is in stack
         * Seprate class file is created for each class.
         */

         Circle c1 = new Circle();
         c1.setRadius(7);

         System.out.println("Circle Radius: "+c1.getRadius());
         System.out.println("Circle Area: "+c1.area());
         System.out.println("Circle Circumference: "+c1.circumference());
         
         /*
          * Data Hiding: Keeping the variables as private, but providing public methods over that data.
          * Getter and Setter methods are used to access and modify the properties of class.
          * There are 3 types of properties:
          * Read and Writable, Read only, and Write only.
          * Read only: Like account no.
          * Write only: Balance of a charity account.
          */

          /*
           * Constructor:
           * Need of constructor: At the time of creation of an object, at that time iteself it should have some valid properties.
           */

        Circle c2 = new Circle(10);
        System.out.println("Circle Radius: "+c2.getRadius());
        System.out.println("Circle Area: "+c2.area());
        System.out.println("Circle Circumference: "+c2.circumference());

    }
}
