package F;

class Bird {
    void fly() {
        System.out.println("Birds can fly");
    }
}

class Sparrow extends Bird {
    void fly() {
        System.out.println("Sparrow flies short distances");
    }
}

public class Nest {
    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();
        sparrow.fly(); // Output: Sparrow flies short distances
    }
}
