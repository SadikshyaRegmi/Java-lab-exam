package Fourth;



class Bike {
    String model;
    int year;

    // Default Constructor
    Bike() {
        model = "Yamaha";
        year = 2022;
    }

    void display() {
        System.out.println("Bike Model: " + model + ", Year: " + year);
    }
}

public class DefaultConstructor {
    public static void main(String[] args) {
        Bike bike1 = new Bike();
        bike1.display();
    }
}


