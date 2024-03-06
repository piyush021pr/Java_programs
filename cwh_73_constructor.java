class myThr extends Thread{
    public myThr(String name){
        super(name);
    }
    public void run(){
        System.out.println("Hello Everyone!!");
    }

}
public class cwh_73_constructor {
    public static void main(String[] args) {
        myThr t1=new myThr("Piyush");
        t1.start();
        myThr t2=new myThr("Raj");
        t2.start();
        System.out.println("The id is "+t1.getId());
        System.out.println("The name is "+t1.getName());
        System.out.println("The id is "+t2.getId());
        System.out.println("The name is "+t2.getName());

    }
}
