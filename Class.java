package E;

class Bus {
    String model;

    Bus(String model) {
        this.model = model;
    }

    void display() {
        System.out.println("Bus model: " + model);
    }
}

public class Class {
    public static void main(String[] args) {
        Bus Bus = new Bus("Toyota");
        Bus.display();
    }
}
