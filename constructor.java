
class Information {
    String name;
    double salary;

    Information() { // default constructor
        System.out.println("Default constructor");
    }

    Information(String a, double b) { // parameterized constructor
        this.name = a;
        this.salary = b;

        System.out.println("NAME" + "   " + "SALARY");
        System.out.println(name + " " + salary);
    }

    void display() {
        System.out.println();
        System.out.println("****Information****");
        System.out.println();
        System.out.println("NAME" + "   " + "SALARY");
        System.out.println(name + " " + salary);
    }
}

class constructor {
    public static void main(String args[]) {

        Information i = new Information("suhas ", 100000);
        // i.display();

        Information x = new Information();
    }
}