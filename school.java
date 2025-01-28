package D;

class Student {
    String name;
    int age;

    Student(String name) {
        this.name = name;
        this.age = 18; // default age
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Student: " + name + ", Age: " + age);
    }
}

public class school {
    public static void main(String[] args) {
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob", 22);
        student1.display();
        student2.display();
    }
}
