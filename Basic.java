import java.util.Scanner;

public class Basic {
   static int fact(int n){
       if(n==0 || n==1){
           return 1;
       }
       else{
           return n*fact(n-1);
       }
   }
   static int itfact(int z){
       if(z==0 || z==1){
           return 1;
       }
       else{
           int prod=1;
           for(int i=1;i<=z;i++){
               prod*=i;
           }
           return prod;
       }
   }
    public static void main(String[] args) {
        System.out.println("The factorial is "+fact(4));
        System.out.println("The factorial is "+itfact(5));

    }
}