package D;

class Dog {
    String name;

    Dog() {
        name = "Buddy";
    }

    void display() {
        System.out.println("Dog's name: " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.display();
    }
}
