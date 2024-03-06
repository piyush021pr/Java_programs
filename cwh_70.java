class myThread1 extends Thread{
    public void run(){
        int i=0;
        while(i<500) {
            System.out.println("Hii Good Morning!!");
            i++;
        }
    }
}
class myThread2 extends Thread{
    public void run(){
        int i=0;
        while(i<500) {
            System.out.println("Hii Friend!!");
            i++;
        }
    }
}
public class cwh_70 {
    public static void main(String[] args) {
        myThread1 t1=new myThread1();
        myThread2 t2=new myThread2();
        t1.start();
        t2.start();

    }
}
