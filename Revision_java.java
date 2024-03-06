import java.util.Scanner;

public class Revision_java {
    static int sum(int x,int...arr){
        int result=x;
        for(int a:arr) {
            result += a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("The sum of numbers is "+sum(4,5,6));
        System.out.println("The sum of numbers is "+sum(4));
        System.out.println("The sum of numbers is "+sum(6,4));
    }
    }

