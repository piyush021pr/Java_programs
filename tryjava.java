import java.util.Scanner;
class MyThread8 extends Thread {
    public void run() {
        int i = 1;
        while (i<50 ) {
            System.out.println("Thread1 is running............");
            i=i+1;
        }

    }
}
class MyThread9 extends Thread {
    public void run() {
        int i = 1;
        while (i<50 ) {
            System.out.println("Thread2 is processing......");
            i=i+1;
        }

    }
}
public class tryjava {
    public static void main(String[] args) {
        MyThread8 t1=new MyThread8();
        MyThread9 t2=new MyThread9();
        t1.start();
        t2.start();


        }

        }




