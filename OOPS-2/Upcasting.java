class Vehicle {
    int wheels;
}

class Truck extends Vehicle{
    String company;
}

public class Upcasting {

    public static void main(String[] args) {
        Vehicle vehicle = (Vehicle) new Truck();
        Truck truck = (Truck)new Vehicle();
    }
}
