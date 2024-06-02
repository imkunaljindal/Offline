//class Node {
//    int data;
//    Node next;
//
//    public Node(int data) {
//        this.data = data;
//        next = null;
//    }
//}
//
//class LinkedList {
//    Node head;
//
//    // O(n)
//    public void addToLast(int val) {
//        Node newNode = new Node(val);
//        // linked list is empty
//        if (head == null) {
//            head = newNode;
//            return;
//        }
//        Node curr = head;
//        while (curr.next != null) {
//            curr = curr.next;
//        }
//        curr.next = newNode;
//    }
//
//    //    // O(n)
//    public void print() {
//        Node curr = head;
//        while (curr != null) {
//            System.out.print(curr.data + " -> ");
//            curr = curr.next;
//        }
//        System.out.println("null");
//    }
//}
//
//
//public class IterativeReverseLinkedList {
//    public static Node reverse(Node head) {
//        Node prev = null;
//        Node forward = null;
//        Node curr = head;
//
//        while(curr != null) {
//            forward = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = forward;
//        }
//
//        return prev;
//    }
//
//    public static void main(String[] args) {
//    }
//}
