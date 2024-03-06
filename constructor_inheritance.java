class Base2{
    Base2(){
        System.out.println("I am a constructor in base class");
    }
    Base2(int x){
        System.out.println("I am base2 constructor with value "+x);
    }
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
class Derived2 extends Base2{
    Derived2(){
        System.out.println("I am a constructor in derived class");
    }
    Derived2(int x,int y){
        super(x);
        System.out.println("I am derived constructor with value "+y);
    }
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
class Child3 extends Derived2{
    Child3(){
        System.out.println("I am child2 constructor");
    }
    Child3(int x,int y,int z){
        super(x,y);
        System.out.println("I am child2 constructor with value "+z);
    }
    int z;

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
}
public class constructor_inheritance {
    public static void main(String[] args) {
   //base2 b=new base2();
        //derived2 d=new derived2();
        Child3 c=new Child3(10,20,30);

    }
}
