
import java.util.Scanner;

public class Reverse_string {
    public static String reverseString(String str) {
        StringBuffer reversedString = new StringBuffer();
        String[] words = str.split(" ");
        for (String word : words) {
            StringBuffer reversedWord = new StringBuffer(word);
            reversedWord.reverse();
            reversedString.append(reversedWord).append(" ");
        }
        return reversedString.toString().trim();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string:");
        String name=sc.nextLine();
        String reversedName = reverseString(name);
        System.out.println("Reversed name is: " + reversedName);
        }
    }



