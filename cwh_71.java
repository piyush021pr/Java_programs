class myThreadRunnable implements Runnable{
    public void run(){
        int i=0;
        while(i<500){
            System.out.println("Hii!! First");
            i++;
        }
    }
}
class myThreadRunnable1 implements Runnable{
    public void run(){
        int i=0;
        while(i<500){
            System.out.println("Hii! Second");
            i++;
        }
    }
}
public class cwh_71 {
    public static void main(String[] args) {
    myThreadRunnable bullet1=new myThreadRunnable();
    Thread gun1=new Thread(bullet1);
    myThreadRunnable1 bullet2=new myThreadRunnable1();
    Thread gun2=new Thread(bullet2);
    gun1.start();
    gun2.start();
    }
}
