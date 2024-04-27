public class Concept {
    public static void main(String[] args) {

//        String s = "hello";
//        StringBuilder s1 = new StringBuilder();
//        System.out.println("Before hello s1 ki value = " + s1);
//        s1.append("hello");
//        s1.append("abc");
//        s1.append("xyz");
//        System.out.println(s1);

//        StringBuilder s2 = new StringBuilder("ABC");
////        System.out.println("s2 ki value = " + s2);
//        s2.append(" 123");
//        System.out.println(s2);

//        System.out.println(s2.length());  // length
//        s2.delete(2,5);
//        System.out.println(s2);

//        System.out.println(s2.charAt(2));
//        System.out.println(s2.charAt(6));
//
//        s2.replace(2,5,"Hello");
//        System.out.println(s2);

//        StringBuilder s = new StringBuilder("asnfkjsanfoif");
//        s.replace(2,5,"Kunal Jindal");
//        System.out.println(s);
//        System.out.println(s.length());

        StringBuilder s = new StringBuilder();
        s.append("ABCDE");
//        s.delete(2,3);
//        System.out.println(s);
        s.deleteCharAt(3);
        System.out.println(s);
    }
}
