import java.util.Random;
import java.util.Scanner;
class myThread3 implements Runnable {
    public void run() {
        int i = 1;
        while (i < 1000) {
            System.out.println("Thread3 is running");
            i++;
        }
    }
}
    class myThread4 implements Runnable {
        public void run() {
            int i = 1;
            while (i < 1000) {
                System.out.println("Good Morning");
                i++;
            }
        }
    }
public class interface1 {
    public static void main(String[] args) {
myThread3 t=new myThread3();
Thread gun=new Thread(t);
myThread4 t1=new myThread4();
Thread gun2=new Thread(t1);
        gun.start();
gun2.start();
    }
}
