package multithread;

/*
 * Multiprogramming: Multi-user(also known as time-sharing) and Multi-Tasking (Multi-thread)
 * Multi-user is many user running their own programs on a single computer. 
 * Mutli-tasking is a single user is running multiple programs on a single computer.
 * Multi-tasking is with different applications, meanwhile multi-threading is internally to a program.
 * There are two ways:
 *  1. Thread class. (If class is not inheriting any super class)
 *  2. Runnable interface. (If class is already inheriting another super class, then another class can't be extended, so use interface)
 *      - We have to create object of thread class in this one. And the object of our class need to be passed as an argument i.e runnable object.
 */

class MyThread extends Thread {
    public void run(){
        int i = 1;
        while(true){
            System.out.println("Class Thread is running: "+i);
            i++;
            try { Thread.sleep(1000); } catch (Exception e){ System.out.println(e); }
        }
    }
}

class MyRunnable implements Runnable {
    public void run(){
        int i = 1;
        while(true){
            System.out.println("Runnable Thread is running: "+i);
            i++;
            try { Thread.sleep(1000); } catch (Exception e){ System.out.println(e); }
        }
    }
}

public class MultiThreading {
    public static void main(String[] args) {
    
        // Using thread class
        // MyThread myThread = new MyThread();
        // myThread.start();
        // int i = 1;
        // while(true){
        //     System.out.println("Main is running: "+i);
        //     i++;
        //     try { Thread.sleep(1000); } catch (Exception e){ System.out.println(e); }
        // }
        

    // Using Runnable interface
        MyRunnable myRunnable = new MyRunnable();
        Thread t = new Thread(myRunnable);
        t.start();
        int i = 1;
        while(true){
            System.out.println("Main is running: "+i);
            i++;
            try { Thread.sleep(1000); } catch (Exception e){ System.out.println(e); }
        }
    }
}



/*
 * Synchronisation: It is the coordination between two services.
 *  1. Resource sharing             : Each thread has it's own stack memory. But common heap memory, so multiple thread can access the same object in heap.
 *  2. Critical Section             : Critical section is the piece of code, where two threads are accessing the same resource.
 *  3. Mutual Exclusion             : Happening of one event prevent other event.
 *  4. Locking / Mutex              : 
 *  5. Semaphore                    :
 *  6. Monitor                      :
 *  7. Race condition               :
 *  8. Inter - thread communication : 
 */


 /*
  * Mutex Lock:
  *     - Thread set a flag = true, once it start using the resource. And unset it once it finished using.
  *     - In case of mutex there is no system, thread itself is trying to be in sync with one variable. The mutex is withing the thread.
  *     - Problem: T1 and T2 two threads are there. T1 checks if resource is available and it is, and after checking it moves the waiting queue.
  *                and thread T2 comes and aquire the lock. Now T1 comes back and acquire the lock too.
  
  * Semaphores:
  *     - Semaphores have wait() and signal() method as well as a block queue.
  *     - There are 4 threads in parallel which are running. T1 aquire a resource and put a lock on it, then t2 comes, so OS will ask t2 to wait and put it in
  *     - block queue, and same with t3, from the CPU queue. Once t1 release it, t2 and t3 will aquire the lock.

  * Monitor:
  *     - Object itself have mutex as well as read, write method and the queue.
  */