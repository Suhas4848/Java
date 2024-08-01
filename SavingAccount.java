class Account
{
	double SavingBalance;
	static double InterestRate;


	Account(double balance)
		{
		this.SavingBalance=balance;

		}

void MonthlyInterest()
	{
		double MonthlyInterest = (SavingBalance*InterestRate/12)/100;
		SavingBalance+= MonthlyInterest;
	}

void PrintMonthlyInterest()
	{
 		System.out.println("After Applying InterestRate  :" + SavingBalance);
	}	

static void  ModifyInterestRate(double newRate)
	{
		InterestRate = newRate;
	}
}

class SavingAccount
{
	public static void main(String args[])
		{
			Account s1 = new Account(2000.0);
			Account s2 = new Account(3000.0);

	System.out.println("");	
	System.out.println("   Interest rate is 4%   ");	
	Account.ModifyInterestRate(4.0);
	s1.MonthlyInterest();
	s1.PrintMonthlyInterest();
	s2.MonthlyInterest();
	s2.PrintMonthlyInterest();

	System.out.println("");	
	System.out.println("   Interest rate is 5%   ");	
	Account.ModifyInterestRate(5.0);
	s1.MonthlyInterest();
	s1.PrintMonthlyInterest();
	s2.MonthlyInterest();
	s2.PrintMonthlyInterest();	
		
		}
} 
