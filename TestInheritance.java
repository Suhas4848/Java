import java.util.Scanner;

class Person
{
	String name;
	int age;
	String city;
	Scanner sc = new Scanner(System.in);


void input()
{
 System.out.print("Enter the name :");
 name = sc.next();


 System.out.print("Enter the age :");
 age = sc.nextInt();

 System.out.print("Enter the city :");
 city = sc.next();
}

}

class Student extends Person
{
int roll_no;
double cgpa;

void get()
{
 System.out.print("Enter the roll no :");
 roll_no = sc.nextInt();

 System.out.print("Enter the cgpa :");
 cgpa=sc.nextDouble();

}

void display()
{

 System.out.println("****Details****");

 System.out.println("Name of Student :" + name);

 System.out.println("Student age :"+ age);

 System.out.println("Name of city :"+ city);

 System.out.println("Student Roll no :"+ roll_no);

 System.out.println("Student CGPA:"+ cgpa);



}

}
class TestInheritance
{
public static void main(String[] args)
{
  Student s1 = new Student();
s1.input();
s1.get();
s1.display();

}
}