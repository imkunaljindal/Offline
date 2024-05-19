class Car {
    int wheels;
    String engine;

    public Car() {
        System.out.println("Car constructor is called");
    }
    public Car(int wheels, String engine) {
        this.wheels = wheels;
        this.engine = engine;
    }

    public void start() {
        System.out.println("Car has started");
    }
    public void run() {
        System.out.println("Car is running");
    }
}

class SportCar extends Car {
    int horsePower;

    public SportCar() {
        super();
        System.out.println("Sports car constructor is called");
    }

    public void increaseHp() {
        super.start();
        super.run();
        horsePower += 50;
        System.out.println("Horse power increased by 50");
    }
}

class NormalCar extends Car {
    int airBags;

    public NormalCar() {
        super(4,"ABC");
        System.out.println("Normal car constructor called");
    }

    public void openAirBags() {
        super.start();
        super.run();
        System.out.println("Air bags opened");
    }
}

public class CompleteRevisionExample
{
    public static void main(String[] args) {
// 		SportCar sportCar = new SportCar();
// 		sportCar.increaseHp();
        NormalCar car = new NormalCar();
        car.openAirBags();
    }
}
