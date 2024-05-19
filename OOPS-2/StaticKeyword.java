class Student {
    int marks;
    static int count = 0;
//    public Student(int marks) {
//        this.marks = marks;
//    }

    public void increment() {
        count++;
    }

    public void random() {
        System.out.println("Random" + marks + count);
    }

    public static void hello() {
        System.out.println("Hello world");
    }
}

public class StaticKeyword {

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();

//        s1.increment();
//        s1.increment();
//        s2.increment();
//
//        System.out.println(s1.count);
//        System.out.println(s2.count);
//        s1.hello();
        Student.hello();
    }

}
