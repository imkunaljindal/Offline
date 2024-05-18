
class Animal {
    int legs;
    int eyes;

    public Animal(int legs, int eyes) {
        this.legs = legs;
        this.eyes = eyes;
    }

    public void swapLegs(Animal a) {
        int temp = this.legs;
        this.legs = a.legs;
        a.legs = temp;
    }
}

public class SwapGame {
    public static void main(String[] args) {
        Animal human = new Animal(2,2);
        Animal zebra = new Animal(4,2);

        human.swapLegs(zebra);
        System.out.println(human.legs);
    }
}
