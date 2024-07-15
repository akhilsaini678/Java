package other;

/*
 * Nested inner class   : It is used to simplify the code. Object of inner class can be created from the object of outer class.
 * Local inner class    : Class defined inside a method is local inner class, it can't be accessed outside of the method.
 * Anonyous inner class : It is a class created for abstract classes or interfaces, to override the method.
 * static inner class   : Static inner class's object can be directly created outside of outer class. Static class can access only static member of outer class.
 */





class LocalOuter {
    void display(){
        class LocalInner {
            void show(){
                System.out.println("Local inner class");
            }
        }
        LocalInner m = new LocalInner();
        m.show();
    }
}


abstract class My {
    abstract void show();
}

class OuterAnonymous {
    void display(){
        My m = new My() {
            void show(){
                System.out.println("Anonymous class");
            }
        };
        m.show();
    }
}

class OuterStatic {
    int x = 10;
    static int y = 20;
    static class My {
        void show(){
            System.out.println(y);
        }
    }
}

class Outer {
    
    int x = 10;
    class Inner {
        int y = 20;
        void innerDisplay(){
            System.out.println("Inner Class: x = "+x+" y = "+y);
        }
    }

    /*
     * Outer class can create the inner class object and call the method
     * 
     */
    Inner i = new Inner();
    void outerDisplay(){
        System.out.println("Outer Class ");
        i.innerDisplay();
    }
}

public class innerClasses {
    public static void main(String args[]){
        Outer o = new Outer();
        o.outerDisplay();

        Outer.Inner oi = new Outer().new Inner();
        oi.innerDisplay();

        LocalOuter li = new LocalOuter();
        li.display();

        OuterStatic.My os = new OuterStatic.My();
        os.show();
    }
}