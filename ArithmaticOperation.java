import  java.util.Scanner;

class ArithmaticOperation
{
   public static void main(String args[])
{
System.out.println("Integer value Arithmatic Operation: \n ");

int a,b,sum,sub,multi,div,remainder ;
Scanner sc = new Scanner(System.in);

System.out.println("enter the 1st no :");
a=sc.nextInt();

System.out.println("enter the 2nd no :");
b=sc.nextInt();

sum = a+b;
System.out.println("Addintion is :"+ sum + "\n");		

sub= a-b;
System.out.println("substraction is : "+ sub + "\n");	

multi =a*b;
System.out.println("multiplication is :"+ multi + "\n");	

div = a/b;
System.out.println("division is :"+ div + "\n");

remainder = a%b;
System.out.println("remainder is :"+ remainder + "\n");

	
}
}