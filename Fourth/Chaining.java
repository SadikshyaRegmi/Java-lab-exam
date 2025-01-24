package Fourth;


class Animal {
    String name;

    // Constructor
    Animal(String name) {
        this.name = name;
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);  // Calls the parent class constructor
    }

    void display() {
        System.out.println("Dog's Name: " + name);
    }
}

public class Chaining {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Buddy");
        dog1.display();
    }
}

