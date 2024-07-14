package interfaceRule;

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
