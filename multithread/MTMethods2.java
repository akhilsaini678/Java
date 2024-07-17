package multithread;

class MyThread extends Thread {
    public void run(){
        int count = 0;
        while(true){
            System.out.println("Thread is running: "+count);
            count++;
        }
    }
}

public class MTMethods2 {
    public static void main(String[] args) throws Exception {
        MyThread myThread = new MyThread();
        myThread.setDaemon(true); // Ends the thread when the current thread finish executing.
        myThread.start();
        Thread mainThread = Thread.currentThread();
        int count = 0;
        while(count<=1000){
            System.out.println("Main is running: "+count);
            count++;
        }
        Thread.yield(); // Intrupt the current thread, giving more time to the other thread.
        mainThread.join(1000); // Waits for the child thread to finish.
    }
}