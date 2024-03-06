import org.w3c.dom.Node;

public class Single_linkedlist {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public int count() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public void reverse(Node current) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        } else {
            if (current.next == null) {
                System.out.println(current.data + " ");
                return;
            }
            reverse(current.next);
            System.out.println(current.data + " ");
        }
    }

    public void delete() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        } else {
            if (head != tail) {
                head = head.next;
            } else {
                head = tail = null;
            }
        }
    }

    public void display() {
        Node current = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Node of singly linked list");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Single_linkedlist s = new Single_linkedlist();
        s.addNode(10);
        s.addNode(20);
        s.addNode(30);
        s.addNode(40);
        s.display();
        System.out.println("Node present in list " + s.count());
        System.out.println("Reversed list ");
        s.reverse(s.head);
        System.out.println();
        while (s.head != null) {
            s.delete();
            //Printing updated list
            System.out.println("Updated List: ");
            s.display();
        }
    }
}




