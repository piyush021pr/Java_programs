import java.sql.SQLOutput;
import java.util.Scanner;
 class rect{
     int length;
     int breadth;
     public int area(){
         return length*breadth;
     }
     public int perimeter(){
         return 2*(length+breadth);
     }
 }
public class practice_mehods {
    public static void main(String[] args) {
     rect sq=new rect();
      sq.length=3;
      sq.breadth=4;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());

    }
}
