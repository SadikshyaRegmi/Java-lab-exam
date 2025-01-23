package Fourth;

class Car {
    String model;
    int year;

    // Constructor
    Car(String m, int y) {
        model = m;
        year = y;
    }

    void display() {
        System.out.println("Car Model: " + model + ", Year: " + year);
    }
}

public class Basic {
    public static void main(String[] args) {
        Car car1 = new Car("Tesla", 2021);
        car1.display();
    }
}

