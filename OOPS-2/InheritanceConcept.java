class Animal {
    int legs;
    int eyes;

    public Animal() {
        System.out.println("Animal constrcutor is called");
    }
    public Animal(int x) {
        System.out.println(x);
    }
    public void walk() {
        System.out.println("I am walking");
    }
}

class Zebra extends Animal {

    public Zebra() {
        super(10);
        System.out.println("Zebra constructor is called");
    }

    public void run() {
        super.walk();
    }
    int stripes;
}

// This is allowed
class ZebraHybrid extends Zebra {

}

class Lion extends Animal{
    int strength;
}


public class InheritanceConcept {
    public static void main(String[] args) {
//        Zebra z = new Zebra();
//        z.legs = 4;
//        z.eyes = 2;
//        z.walk();
//        z.stripes = 100;
//
//        Lion l = new Lion();
//        l.legs = 4;
//        l.eyes = 3;
//        l.strength = 200;
//        l.walk();

        Zebra zebra;
//        System.out.println(zebra);
    }
}
