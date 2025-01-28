package F;

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Domestic {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound(); // Output: Dog barks
    }
}