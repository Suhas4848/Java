import java.util.Scanner;

class EmpInfo
{
	String name[]= new String[5];
	int EmpId[]= new int[5];
	float salary[]=new float[5];
	Scanner sc = new Scanner(System.in);

void getData()
	{
	System.out.println("Enter the name of employee :");
		for(int i=0;i<5;i++)
		{
			name[i]=sc.next();	
		}
		
	System.out.println("Enter the ID of employee :");
		for(int i=0;i<5;i++)
		{
			EmpId[i]=sc.nextInt();	
		}

	System.out.println("Enter the salary of employee :");
		for(int i=0;i<5;i++)
		{
			salary[i]=sc.nextFloat();	
		}
	}

void display()
	{
		System.out.println("\n Information of Employee \n ");
		System.out.println("ID" + "\t"+ "NAME"+ " \t" + "Salary");

		for(int i=0;i<5;i++)
		{
		System.out.println(EmpId[i]+"\t"+name[i]+ "\t" + salary[i]);	
		System.out.println("");
		}
	}
}

class Employee
{
 public static void main(String args[])
{
  EmpInfo em = new EmpInfo();
  em.getData();
  em.display();	

}

}