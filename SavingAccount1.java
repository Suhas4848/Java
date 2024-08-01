import java.util.Scanner;

class Account
{
	double SavingBalance;
	static double InterestRate;
	Scanner sc = new Scanner(System.in);


void getData()
{
	
 	System.out.println("Enter the balance ");
	SavingBalance = sc.nextDouble();	
}

void MonthlyInterest()
	{
		double MonthlyInterest = (SavingBalance*InterestRate/12)/100;
		SavingBalance+= MonthlyInterest;
	}

void PrintMonthlyInterest()
	{
 		System.out.println("After Applying InterestRate " + SavingBalance);
	}	

 void  ModifyInterestRate()
	{
	System.out.println();
	System.out.println("Enter the Interest Rate:");
	
	double newRate= sc.nextDouble();
	InterestRate = newRate;
	System.out.println("The Interest Rate is :" + InterestRate +"%" );
	
	}
}

class SavingAccount1
{
	public static void main(String args[])
		{
			Account s1 = new Account();
			Account s2 = new Account();


	
	
			s1.getData();
			s2.getData();  
			s1.ModifyInterestRate();
			
			s1.MonthlyInterest();
			s1.PrintMonthlyInterest();

			s2.MonthlyInterest();
			s2.PrintMonthlyInterest();
		
			System.out.println("");	
    			s2.ModifyInterestRate();
		

			s1.MonthlyInterest();
			s1.PrintMonthlyInterest();
	
			s2.MonthlyInterest();
			s2.PrintMonthlyInterest();	
		
		}
} 