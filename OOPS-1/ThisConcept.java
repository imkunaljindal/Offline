class Player {
    String name;
    int age;

    public Player(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void print() {
        System.out.println(this);
    }
}

public class ThisConcept {

    public static void main(String[] args) {
        Player p1 = new Player("Virat",10);
//        Player p2 = new Player();

        System.out.println(p1.age);
        System.out.println(p1.name);

//        p1.print();  // p1 address
//        p2.print(); // p2 address

    }
}
