class base1{
    int x;
    public void setx(int a){
        this.x=a;
        System.out.println("I am setting a");
    }
    public int getx(){
        return x;
    }
}
class derived1 extends base1{
    int y;
    public void sety(int b){
        this.y=b;
    }
    public int gety(){
        return y;
    }
}
public class recursion1 {
    public static void main(String[] args) {
//        base1 c=new base1();
        derived1 c=new derived1();
    c.setx(6);
        System.out.println(c.getx());
    }
}
