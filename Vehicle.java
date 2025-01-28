package E;

class Car {
    String model;

    Car(String model) {
        this.model = model;
    }

    void display() {
        System.out.println("Car model: " + model);
    }
}

public class Vehicle {
    public static void main(String[] args) {
        Car car = new Car("Toyota");
        car.display();
    }
}
