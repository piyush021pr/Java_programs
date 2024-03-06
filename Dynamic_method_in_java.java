

class phone{
    public void greet(){
        System.out.println("Good Morning!");
    }
    public void on(){
        System.out.println("Turning on the phone...");
    }
}
class smartphone extends phone{
    public void welcome(){
        System.out.println("Welcome!");
    }
    public void on(){
        System.out.println("Turning on the smartphone.....");
    }
}
public class Dynamic_method_in_java {
    public static void main(String[] args) {
        //phone c=new phone();
        //smartphone s=new smartphone();
        //c.greet();
       // c.on();
        //s.on();
        phone obj=new smartphone();
        obj.on();
        obj.greet();
        //obj.welcome();
    }
}
