class Person {
    final void hello() {
        System.out.println("Hello from person");
    }
}

class Student extends Person {
//    void hello() {
//        System.out.println("Hello from student");
//    }
}


public class FinalKeyword {

    public static void main(String[] args) {
        final int x = 10;

        Student s = new Student();
        s.hello();
    }
}
