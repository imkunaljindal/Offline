class Calculator {
    int add(int a, int b) {
        System.out.println("First add called");
        return a+b;
    }

    double add(double a, double b) {
        System.out.println("Second add called");
        return a+b;
    }

    int add(int x) {
        return x+5;
    }

    // not allowed
//    double add(int a) {
//        return a+5;
//    }
}

class Polymorphism {
    public static void main(String[] args) {

        Calculator c = new Calculator();
        System.out.println(c.add(5,5));
        System.out.println(c.add(10));
    }
}
