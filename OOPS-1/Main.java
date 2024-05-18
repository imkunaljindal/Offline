class Person {
//    public Person(){
//        System.out.println("Object ban rha hai");
//    }

    String name;
    int age;
    String gender;

    // paramterized constructor
    public Person() {

    }
    public Person(String n, int x) {
        name = n;
        age = x;
    }
    public Person(String n, int x, String g) {
        name = n;
        age = x;
        gender = g;
    }

    // getter
    public String getName() {
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getGender() {
        return gender;
    }

    //setter
    public void setName(String n) {
        name = n;
    }
    public void setAge(int x) {
        if(x>0){
            age = x;
        }
    }
    public void setGender(String g){
        gender = g;
    }

    public void sayHello() {
        System.out.println("Hi, My name is "+name);
    }
}

class Student{

}

public class Main {

    public static void main(String[] args) {
//        Person p1 = new Person();
        // . operator to access the member attributes
//        p1.name = "Kunal";
//        p1.age = 10;
//        p1.gender = "Male";
//        System.out.println(p1.name);
//        System.out.println(p1.age);
//        System.out.println(p1.gender);
//        p1.sayHello();
//
//        Person p2 = new Person();
//        p2.name = "Virat";
//
//        p2.sayHello();
//        System.out.println(p1);

//        Student s1 = new Student();

//        Person p1 = new Person("Kunal",10);
//        System.out.println(p1.name);
//        System.out.println(p1.age);
//        System.out.println(p1.gender);
//        Person p2 = new Person();

//        Person p2 = new Person("Virat",35,"male");
//        System.out.println(p2.name);
//        System.out.println(p2.age);
//        System.out.println(p2.gender);

        Person p3 = new Person();
        p3.setName("Kunal");
//        p3.setAge(10);
        p3.setAge(-5);
        p3.setGender("male");

        System.out.println(p3.getName());
        System.out.println(p3.getAge());
        System.out.println(p3.getGender());
    }
}
