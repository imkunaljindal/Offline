class Car {
    String brand;
    int price;

    public Car(String b, int p) {
        brand = b;
        price = p;
    }

    // copy constructor
    public Car(Car c) {
        brand = c.brand;
        price = c.price;
    }

}

public class CopyConstructor {

    public static void main(String[] args) {

        Car c1 = new Car("Maruti",500000);
        Car c2 = new Car(c1);

        System.out.println(c2.brand);
        System.out.println(c2.price);
    }
}
