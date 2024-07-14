package Inheritance;

/*
 * Generalisation: When we already have child classes and we want to generalise all the classes into one. It can be achieved using Interfaces.
 * For ex: Bike + Ship + Car -> Vehicle
 * Specialisation: When we have a class, and we want any other class to inherit it as a super class. It can be achieved using Inheritance.
 * For ex: Samsung: Samsung S22, Samsung S23.
 * 
 * Every method and properties are inherited once we extend a superclass.
 * 
 * Constructor inheritance:
 */

class Circle {

    double radius;

    double area(){
        return Math.PI * radius * radius;
    }

    double circumference(){
        return 2* Math.PI * radius;
    }
}

class Cyclinder extends Circle {
    double height;
    public Cyclinder(int r,int h){
        radius = r;
        height = h;
    }
    double volume(){
        return area() * height;
    }
}

public class Concept {
    public static void main(String args[]){
        Cyclinder c1 = new Cyclinder(5,10);
        System.out.println("Volume of cyclinder is: "+c1.volume());
        System.out.println("Area of cyclinder is: "+c1.area());
    }
}
