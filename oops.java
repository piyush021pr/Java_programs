import java.sql.SQLOutput;
import java.util.Scanner;

public class oops {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int a=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(a+ "X" +i+ "=" +a*i);
            /*System.out.println("   J    a   v     v  a ");
            System.out.println("   J   a a   v   v  a a");
            System.out.println("J  J  aaaaa   V V  aaaaa");
            System.out.println(" JJ  a     a   V  a     a");*/
        }
    }
}
