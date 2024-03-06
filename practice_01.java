import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class practice_01 {
      int age(int n){
     if(n%2==0)
     {
         System.out.println("Hey!This is even number");
     }
     else {
         System.out.println("This is odd number");
     }
     return n;
     }
     public static void main(String[] args){
         System.out.println("Please follow proper instructions:");
         Scanner age1=new Scanner(System.in);
         System.out.println("Enter your age buddy!");
         int a=age1.nextInt();
         practice_01 age3=new practice_01();
         int b=age3.age(a);
     }
}



