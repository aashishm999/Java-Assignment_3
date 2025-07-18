class Employees {
    Employees() {
        System.out.println("Default Constructor");
    }

    Employees(String name) {
        System.out.println("Name : " + name);
    }

    Employees(int id) {
        System.out.println("ID : " + id);
    }

    public class constructoroverload {
        public static void main(String[] args) {
            new Employees();
            new Employees("ashish");
            new Employees(8457);
        }
    }
}
