
class class3{
    public void myMethod(){
        System.out.println("This is myMethod value");
    }
    public void myDefinition(){
        System.out.println("This is myDefinition value");
    }
}
public class class2 {
    public static void main(String[] args) {
    class3 c=new class3();
    c.myDefinition();
        c.myMethod();

    }
}
