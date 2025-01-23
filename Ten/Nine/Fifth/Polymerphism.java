package Fifth;

class Shape {
    void draw() {
        System.out.println("Drawing a shape.");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle.");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a rectangle.");
    }
}

public class Polymerphism {
    public static void main(String[] args) {
        Shape shape;

        shape = new Circle(); // Dynamic binding
        shape.draw();

        shape = new Rectangle(); // Dynamic binding
        shape.draw();
    }
}

