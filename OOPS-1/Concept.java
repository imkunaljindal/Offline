class Calculator {
//    public Calculator() {
//
//    }

    public int add(int x, int y) {
        return x+y;
    }
    public int multiply(int x, int y) {
        return x*y;
    }
}

public class Concept {

    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(10,20));
        System.out.println(c.multiply(2,3));
    }
}
