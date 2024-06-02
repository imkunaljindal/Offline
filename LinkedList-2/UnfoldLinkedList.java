import java.io.*;
import java.util.*;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
}
class LinkedList{
    Node head;
    void add(int data ){
        Node new_node = new Node(data);
        if(head == null){
            head = new_node;
            return;
        }
        Node current = head;
        while(current.next !=null){
            current = current.next;
        }
        current.next = new_node;
    }
}

class Solution {
    static void unfold(Node head)
    {
        Node evenHead = null;
        Node oddHead = null;
        Node currEven = null;
        Node currOdd = null;
        int i = 0;
        while(head!=null) {
            if(i%2==0) {
                //even
                if(currEven==null) {
                    evenHead = head;
                    currEven = head;
                }
                else {
                    currEven.next = head;
                    currEven = currEven.next;
                }
            }
            else{
                //odd
                if(currOdd==null) {
                    oddHead = head;
                    currOdd = head;
                }
                else {
                    currOdd.next = head;
                    currOdd = currOdd.next;
                }
            }
            head = head.next;
            i++;
        }

        Node revOddHead = reverse(oddHead);
        currEven.next = revOddHead;

        printList(evenHead);
    }

    public static void printList(Node head) {
        Node curr = head;
        while(curr!=null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    public static Node reverse(Node head) {
        Node curr = head;
        Node prev = null;
        Node forward = null;

        while(curr!=null) {
            forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }

        return prev;
    }
}
public class UnfoldLinkedList {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList l1= new LinkedList();
        for(int i=0;i<n;i++){
            l1.add(sc.nextInt());
        }
        Solution Ob = new Solution();
        Ob.unfold(l1.head);
    }
}