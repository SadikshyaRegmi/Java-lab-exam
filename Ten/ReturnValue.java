package Ten;

class Rectangle {
    int length, width;

    // Method that returns area of rectangle
    int area() {
        return length * width;
    }
}

public class ReturnValue {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.length = 5;
        rect.width = 10;
        System.out.println("Area of rectangle: " + rect.area());
    }
}

