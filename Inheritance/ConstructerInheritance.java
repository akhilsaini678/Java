package Inheritance;

class Parent {
    int num = 20;
    public Parent(){
        System.out.println("Non-param parent Constructor");
    
    }
    public Parent(int x){
        System.out.println("Param Constructro of parent");
    }
}

class Child extends Parent {
    int num = 10;
    public Child(){
        System.out.println("Non-param child Constructor");
    }
    public Child(int x, int y){
        super(x);
        System.out.println("Param Constructro of child");

        /*
        * This and Super
        * this is an reference to the current object of a class.
        * super is a reference to the properties and methods of parent class.
        */
        System.out.println("This: "+ this.num);
        System.out.println("Super: "+ super.num);
    }
}


public class ConstructerInheritance {
    public static void main(String[] args) {
        Child ch = new Child(10,20);   
    }
}
