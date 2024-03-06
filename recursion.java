

import java.util.Scanner;
public class recursion {
    static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
    static int iteratiive(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            int prod=1;
            for(int i=1;i<=n;i++){
                prod*=i;
            }
            return prod;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number for factorial:");
        int x= sc.nextInt();
        System.out.println("The factorial of number is "+fact(x));
        System.out.println("The factorial of number is "+iteratiive(x));
    }
}
