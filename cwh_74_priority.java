class myThr1 extends Thread{
    public myThr1(String name){
        super(name);
    }
    public void run(){
        int i=1;
        while(i<500){
            System.out.println("The name is "+this.getName());
            i++;
        }
    }
}
public class cwh_74_priority {
    public static void main(String[] args) {
        myThr1 t1=new myThr1("Piyush(Important)");
        myThr1 t2=new myThr1("Raj");
        myThr1 t3=new myThr1("Ayush");
        myThr1 t14=new myThr1("Raja");
        myThr1 t5=new myThr1("kanak");
        t1.setPriority(Thread.MAX_PRIORITY);
        t5.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t14.start();
        t5.start();

    }
}
