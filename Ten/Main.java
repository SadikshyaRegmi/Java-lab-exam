package Ten;

class Person {
    String name;

    // Method
    void greet() {
        System.out.println("Hello, " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an object
        Person person1 = new Person();
        person1.name = "Alice";
        person1.greet();
    }
}

