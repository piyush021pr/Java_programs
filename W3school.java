import java.sql.SQLOutput;
import java.util.Scanner;
public class W3school {
    public static void main(String[] args) {
        float[] marks = {100.0f, 200.3f, 300.9f, 400.6f, 500.3f};
        System.out.println("Printing the array element");
        float num=200.3f;
        for (float element:marks) {
            if(num==element){
                System.out.println("Element is present in marks");
            }
        }
        //System.out.println("The sum of elements is "+sum);
    }
}
