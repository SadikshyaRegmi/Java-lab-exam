package Fifth;

class Employee {
    void role() {
        System.out.println("Employee role is not defined");
    }
}

class Manager extends Employee {
    @Override
    void role() {
        System.out.println("Manager oversees the team");
    }
}

class Developer extends Employee {
    @Override
    void role() {
        System.out.println("Developer writes code");
    }
}

public class PolymerphismExample1 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.role();

        Employee mgr = new Manager();
        mgr.role();

        Employee dev = new Developer();
        dev.role();
    }
}

