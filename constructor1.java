import java.util.Scanner;
class circleArea{
   int r;
    public double area(int n){
        r=n;
        return Math.PI*r*r;
    }
    public double perimeter(){
    return 2*Math.PI*r;
}
public class constructor1 {
    public static void main(String[] args) {
        circleArea c=new circleArea();
        System.out.println(c.area(5));
        System.out.println(c.perimeter());
    }

    }
}
