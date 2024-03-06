import java.util.Scanner;
import java.util.*;
public class swap_number {
    public static void main(String[] args) {
     LinkedList<Integer> l1=new LinkedList<>();
     LinkedList<Integer> l2=new LinkedList<>();
     l2.add(22);
     l2.add(25);
     l2.add(30);
     l1.add(5);
     l1.add(6);
     l1.add(7);
     l1.add(8);
     l1.add(9);
     l1.add(0,1);
     l1.addLast(100);
     l1.addLast(200);
     l1.addAll(0,l2);

        System.out.println(l1.contains(30));
        System.out.println(l1.indexOf(22));
     for(int i=0;i< l1.size();i++){
         System.out.print(l1.get(i));
         System.out.print(",");
     }
    }

    }






