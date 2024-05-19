class Human {
    String name;
    int grade;
    public void sayHello() {
        System.out.println("Hello! My name is "+ name);
    }

    public void study() {
        System.out.println("I study in class "+grade);
    }

}

class Teacher extends Human {
    int salary;
    public void teach() {
        System.out.println("I teach Programming");
    }
}

class Kid extends Human {
    int grade;
    int age;
//    public void study() {
//        System.out.println("I study in class "+grade);
//    }

    public void printRef() {
        this.study();
    }
}

public class InheritancePractice {

    public static void main(String[] args) {
//        Teacher t = new Teacher();
//        t.teach();
        Kid kid = new Kid();
        kid.study();
    }
}
