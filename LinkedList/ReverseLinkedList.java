class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        next = null;
    }
}
class LinkedList {
    Node head;
    // O(n)
    public void addToLast(int val) {
        Node newNode = new Node(val);
        // linked list is empty
        if(head==null) {
            head = newNode;
            return;
        }
        Node curr = head;
        while(curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }

//    // O(n)
    public void print() {
        Node curr = head;
        while(curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

//    // O(1)
    public void deleteFirst() {
        if(head==null) {
            return;
        }
        head = head.next;
    }

    // O(n)
    public void deleteLast() {
        if(head==null) {
            return;
        }
        if(head.next == null) {
            head = null;
            return;
        }
        Node curr = head;
        while(curr.next.next != null) {
            curr = curr.next;
        }
        curr.next = null;
    }

    // O(n)
    public int length() {
        int count = 0;
        Node curr = head;
        while(curr!=null) {
            count++;
            curr = curr.next;
        }
        return count;
    }

    // O(1)
    public void addToFront(int val) {
        Node newNode = new Node(val);
        if(head==null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
}


public class ReverseLinkedList {

    public static Node reverse(Node head) {
        if(head==null || head.next==null) {
            return head;
        }

        Node revHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return revHead;
    }

    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.addToLast(1);
        l.addToLast(2);
        l.addToLast(3);
        l.addToLast(4);
        l.print();

        l.head = reverse(l.head);
        l.print();
    }
}
