import java.util.Scanner;

interface Person {
    void input();

    void output();

}

class Student_Interface implements Person {
    String name;
    int age;
    int roll_no;
    Scanner sc = new Scanner(System.in);

    public void input() {
        System.out.println("Enter the name ");
        name = sc.next();

        System.out.println("Enter the age ");
        age = sc.nextInt();

        System.out.println("Enter the roll no  ");
        roll_no = sc.nextInt();
    }

    public void output() {
        System.out.println("****INFORMATION****");
        System.out.println("NAME" + "    " + "AGE" + "   " + "ROLL_NO");
        System.out.println(name + "   " + age + "    " + roll_no);

    }

    public static void main(String args[]) {
        Person p = new Student_Interface();
        p.input();
        p.output();
    }

}