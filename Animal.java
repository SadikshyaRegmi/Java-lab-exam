package E;

class Dog {
    void bark() {
        System.out.println("Woof!");
    }
}

public class Animal {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();
    }
}