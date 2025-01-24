package Fourth;



class Student {
    String name;
    int age;

    // Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Student Name: " + name + ", Age: " + age);
    }
}

public class This {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 21);
        student1.display();
    }
}


