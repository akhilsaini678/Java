package multithread;


/*
 * Priortiy: 
 *  - It is an integer value from 1 to 10 (default is 5)
 *  - JVM scheduler take cares of priorities, which schdule the threads with the help of OS. 
 *  - According to the priority, threads get less or more time to run.
 */

class MyRunnable implements Runnable {
    public void run() {

    }
}

class MyThread extends Thread {
    
    public MyThread(String name){
        super(name);
    } 

    public void run(){
        int i = 1;
        while(true){
            System.out.println("Main is running: "+i);
            i++;
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
}

public class MTMethods {
    public static void main(String[] args) {
        Thread t = new Thread();
        Thread t1 = new Thread("Thread 1");
        Thread t2 = new Thread(new MyRunnable(),"Thread 2");

        MyThread myThread = new MyThread("Thread 3");
        myThread.start();
        myThread.setPriority(Thread.MIN_PRIORITY+6);
        System.out.println("Thread Id: "+myThread.getId());
        System.out.println("Thread Name: "+myThread.getName());
        System.out.println("Thread Priority: "+myThread.getPriority());
        System.out.println("Thread State: "+myThread.getState());
        System.out.println("Thread Alive: "+myThread.isAlive());
        myThread.interrupt();
    }
}
