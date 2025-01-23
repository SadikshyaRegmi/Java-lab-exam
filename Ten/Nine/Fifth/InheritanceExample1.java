package Fifth;

// Example 1: Basic Inheritance
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car is starting");
    }
}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike is starting");
    }
}

public class InheritanceExample1 {
    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle();
        myVehicle.start();

        Vehicle myCar = new Car();
        myCar.start();

        Vehicle myBike = new Bike();
        myBike.start();
    }
}
