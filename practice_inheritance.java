class circle{
    public int radius;
    public double radius(){
        return Math.PI*this.radius*this.radius;
    }
}
class cylinder1 extends circle{
    public int height;
public double volume(){
    return Math.PI*this.radius*this.radius*this.height;
}
}
public class practice_inheritance {
    public static void main(String[] args) {


        circle obj = new circle();
        obj.radius = 9;
        double d=obj.radius();
        System.out.println(d);
cylinder1 obj2=new cylinder1();
double e=obj2.volume();
        System.out.println(e);
    }
}
