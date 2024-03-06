class mobile{
    void ring(){
        System.out.println("Ringing.....");
    }
    void vibrate(){
        System.out.println("Vibrating...");
    }
    void call(){
        System.out.println("Calling....");
    }
}
public class class1 {
    public static void main(String[] args) {
       mobile c=new mobile();
       c.ring();
       c.vibrate();
       c.call();

        //System.out.println(c.area());
        //System.out.println(c.perimeter());
    }
}
