import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class CCh_practice {
    static int fact(int n) {
        if (n == 1 || n == 0) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }
static int fact1(int n){
        int proud=1;
    if (n == 1 || n == 0) {
        return 1;
    } else {
        for(int i=1;i<=n;i++){
            proud*=i;
        }
        return proud;
    }
}

    public static void main(String[] args) {
        System.out.println(fact(5));
        System.out.println(fact1(5));
    }
}
