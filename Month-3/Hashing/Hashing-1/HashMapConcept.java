import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashMapConcept {

    public static void main(String[] args) {
        HashMap<String,Integer> scoreCard = new HashMap<>();  // playername - score

        scoreCard.put("Rohit",50);
        scoreCard.put("Kolhi",40);
        scoreCard.put("Sky",65);
//        scoreCard.put("Bumrah",30);

//        System.out.println(scoreCard.size());
        scoreCard.put("Rohit",45);  // overwrite
        System.out.println(scoreCard.get("Rohit"));  // get(key)-> return value
//        System.out.println(scoreCard.get("Bumrah"));
//
//        if(scoreCard.containsKey("Bumrah")) {
//            System.out.println("Key is present");
//        }
//        else {
//            System.out.println("Key is not present");
//        }

        // iterate over a hashmap
        for(String x: scoreCard.keySet()) {  // set of keys
            System.out.println(x + "->" + scoreCard.get(x));
        }

        // will return the value of key if it exists otherwise return default value
        int score = scoreCard.getOrDefault("Bumrah",0);
        System.out.println("Bumrah's score = "+score);
    }
}
