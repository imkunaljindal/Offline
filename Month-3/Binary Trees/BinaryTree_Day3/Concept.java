import java.util.*;

public class Concept {

    public static void main(String[] args) {
        Set<Integer> s1 = new TreeSet<>(); // Self Balancing BST
        Set<Integer> s2 = new HashSet<>(); // Hashing
        Set<Integer> s3 = new LinkedHashSet<>(); // Linked List


        s1.add(3); s2.add(3); s3.add(3);
        s1.add(4); s2.add(4); s3.add(4);
        s1.add(1); s2.add(1); s3.add(1);
        s1.add(0); s2.add(0); s3.add(0);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

//        ArrayList<Integer> arr = new ArrayList<>();
//        System.out.println(arr);
    }
}
