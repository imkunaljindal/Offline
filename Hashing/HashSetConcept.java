import java.util.HashSet;

public class HashSetConcept {

    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10);
        set.add(50);
        set.add(20);
//        set.remove(20);
//        System.out.println(set.size());
//        set.remove(20);
//        System.out.println(set.size());

        // iterate over a hashset
        for(int ele: set) {
            System.out.print(ele + " ");
        }

    }
}
