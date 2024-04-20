public class SubstringConcept {

    public static void main(String[] args) {
        String s = "acciojob";

        // index a, b
        // ex - 1,4 ->
        int a = 1;
        int b = 4;
//        String ans = "";
//        for(int i=a;i<b;i++){
//            ans = ans + s.charAt(i);
//        }

        String ans = s.substring(1,4);
        String ans1 = s.substring(4);

        System.out.println(ans1);


    }
}
