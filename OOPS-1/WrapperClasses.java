public class WrapperClasses {

    static int add(Integer a, Integer b) {
        return a+b;
    }

    public static void main(String[] args) {
//        Integer x = new Integer(10);  // boxing
//        int a = x.intValue();  // unboxing

//        int x = 10;
//        String a = x;

//        int a = 10;
//        Integer x = new Integer(a);

//        Integer y = new Integer(20); // auto boxing
//        int b = y;  // auto unboxing
//        System.out.println(x);

        System.out.println(add(20,30));
    }
}
