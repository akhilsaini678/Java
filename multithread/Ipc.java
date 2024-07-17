package multithread;

class MyData {
    private int value;
    boolean flag = true;
    synchronized public void set(int value){
        while(flag!=true)
            try { wait(); } catch (Exception e){};
        this.value = value;
        flag = false;
        notify();
    }

    synchronized public int get(){
        int x = 0;
        while(flag!=false)
            try { wait(); } catch (Exception e){};
        
        x = value;
        flag = true;
        notify();
        return x;
    }
}

class Producer extends Thread {
    MyData data;
    public Producer(MyData d){
        data = d;
    }
    public void run(){
        int count = 1;
        while(true){
            data.set(count);
            System.out.println("Producer value is:"+count);
            count++;
        }
    }
}

class Consumer extends Thread {
    MyData data;
    public Consumer(MyData d){
        data = d;
    }
    public void run(){
        while(true){
            int value = data.get();
            System.out.println("Consumer value is "+value);
        }
    }
}


public class Ipc {
    public static void main(String[] args) {
        MyData data = new MyData();

        Producer p = new Producer(data);
        Consumer c = new Consumer(data);
        p.start();
        c.start();
    }
}
