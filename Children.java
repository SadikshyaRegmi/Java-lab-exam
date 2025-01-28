package F;

class Parent {
    void display() {
        System.out.println("Parent class");
    }
}

class Child extends Parent {
    void display() {
        super.display(); // Calls Parent's display
        System.out.println("Child class");
    }
}

public class Children {
    public static void main(String[] args) {
        Child child = new Child();
        child.display(); // Output: Parent class \n Child class
    }
}