import java.util.Random;
import java.util.Scanner;
public class trying {
    public static void main(String[] args) {
        int[] arr1 = new int[]{10, 10, 20, 30, 40, 40, 50};
        System.out.println("Original element in given array is");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        System.out.println("Array in reverse order");
        for(int i=arr1.length-1;i>=0;i--){
            System.out.print(arr1[i]+" ");
        }
    }
}





