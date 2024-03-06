import java.util.Scanner;
public class ATM_program {
   class Node {
       int data;
       Node next;

       public Node(int data) {
           this.data = data;
           this.next = null;
       }
   }
   public Node head=null;
   public Node tail=null;
   public void addNode(int data){
       Node newNode=new Node(data);
       if(head==null){
           head=newNode;
           tail=newNode;
       }
       else{
           tail.next=newNode;
           tail=newNode;
       }
   }
   public void display() {
       Node current = head;
       if (head == null) {
           System.out.println("List is empty:");
       } else {
           System.out.println("Nodes of singly Linked List :");
           while (current != null) {
               System.out.println(current.data + " ");
               current = current.next;
           }
           System.out.println();
       }
   }
    public static void main(String[] args) {
ATM_program a=new ATM_program();
a.addNode(10);
a.addNode(20);
a.addNode(30);
a.display();
    }
}




