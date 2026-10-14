// Q56: Node copy constructor - copies data, not the link
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    Node(Node other) {
        this.data = other.data;     // copy the data
        this.next = null;           // do NOT copy the reference link
    }
}

public class Q56 {
    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        n1.next = n2;

        Node copy = new Node(n1);
        System.out.println("Original data = " + n1.data + ", next = " + (n1.next != null ? n1.next.data : "null"));
        System.out.println("Copy data     = " + copy.data + ", next = " + (copy.next != null ? copy.next.data : "null"));
    }
}
