import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Concept {

    public static void main(String[] args) {

//        Queue<Integer> q = new ArrayDeque<>();
//        q.add(11);
//        q.add(15);
//        q.add(20);
//        q.offer(45);
//        System.out.println(q.size());
//
//        System.out.println(q.peek());
//        q.remove();
//        q.poll();
//        System.out.println(q.peek());
//        q.add(99);
//        q.remove();
//        System.out.println(q.peek());
//        System.out.println(q);

        Deque<Integer> dq = new ArrayDeque<>();
        dq.addFirst(10);
        dq.addFirst(20);
        dq.addLast(35);
        dq.addLast(40);

        System.out.println(dq.getFirst());
        System.out.println(dq.getLast());

        dq.removeLast();
        System.out.println(dq.getLast());
        System.out.println(dq.getFirst());
        dq.removeFirst();
        System.out.println(dq.getFirst());
    }
}
