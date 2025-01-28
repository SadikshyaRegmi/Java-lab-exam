package F;

abstract class Horse {
    abstract void sound();
}


class Cat extends Horse {
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Puppy {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.sound(); // Output: Cat meows
    }
}
