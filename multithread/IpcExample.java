package multithread;

class Whiteboard {
    String text;
    int numberOfStudents;
    int count = 0;

    public void attendance(){
        numberOfStudents++;
    }

    synchronized public void write(String t){
        System.out.println("Teacher is writing: "+t);
        while(count!=0){
            try { wait(); } catch (Exception e) { }
        }

        text = t;
        count = numberOfStudents;
        notifyAll();
    }

    synchronized public String read(){
        while(count==0){
            try { wait(); } catch (Exception e) { }
        }

        String t = text;
        count--;
        if(count==0){
            notify();
        }
        return t;
    }
}

class Teacher extends Thread {
    Whiteboard wb;
    String notes[] = {"Java is a language", "It is OOPS", "It is platform independent", "It supports Thread","end"};
    
    public Teacher(Whiteboard wb){
        this.wb = wb;
    }

    public void run(){
        for(int i=0;i<notes.length;i++){
            wb.write(notes[i]);
        }
    }
}

class Student extends Thread {
    String name;
    Whiteboard wb;

    public Student(String name, Whiteboard wb){
        this.name = name;
        this.wb = wb;
    }

    public void run(){
        String text;
        wb.attendance();

        do {
            text = wb.read();
            System.out.println(name+" Reading "+text);
            System.out.flush();
        } while(!text.equals("end"));
    }
}

public class IpcExample {
    public static void main(String[] args) {
        Whiteboard wb = new Whiteboard();
        Teacher t = new Teacher(wb);
        Student s1 = new Student("1. A ", wb);
        Student s2 = new Student("1. B ", wb);
        Student s3 = new Student("1. C ", wb);
        Student s4 = new Student("1. D ", wb);

        t.start();
        s1.start();
        s2.start();
        s3.start();
        s4.start();
    }
}
