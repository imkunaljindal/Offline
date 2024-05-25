class Car {
    int wheels = 4;
    public void start() {
        System.out.println("Car has started");
    }
}

class SportsCar extends Car {
    int horsePower;
    int wheels = 6;
    public void start() {
        System.out.println("Sports car has started");
    }
}


public class RuntimePolymorphism {
    public static void main(String[] args) {
//        SportsCar sportsCar = new SportsCar();
////        Car c = new Car();
//        sportsCar.start();
////        c.start();

//        Car c = new SportsCar();
//        c.start();

        SportsCar sportsCar = new SportsCar();
        System.out.println(sportsCar.wheels);
    }
}
