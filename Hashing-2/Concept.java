import java.util.*;

public class Concept {
    public static void main(String[] args) {
//        HashMap<String, ArrayList<String>> map = new HashMap<>();
//        String s = "cat";
//        char[] c = s.toCharArray();
//        Arrays.sort(c);
//        String sortedS = String.valueOf(c);
//        System.out.println(sortedS);
//        if(map.containsKey("act")) {
//            ArrayList l = map.get("act");
//            l.add("cat");
//            map.put("act",l);
//        }
//        else {
//            ArrayList l = new ArrayList();
//            l.add("cat");
//            map.put("act",l);
//        }

        String s = "askljdhsaijkldlnoa";
        HashMap<Character,Integer> freqMap = new HashMap<>();
        for(char c: s.toCharArray()) {
            freqMap.put(c,freqMap.getOrDefault(c,0)+1);
        }

        int freqArr[] = new int[26];  // o(1)
        for(char c: s.toCharArray()) {
            freqArr[c-'a']++;
        }
    }
}
