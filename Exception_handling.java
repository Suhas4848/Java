import java.util.Scanner;

class Exception_handling
{
	public static void main(String[] args)
	{
 		Scanner sc = new Scanner(System.in);
  		int divident[] =new int[5];
  		int divisor;
  		int remainder[] = new int[5];

System.out.println(".........Programme is started.........");

		System.out.println("Enter the elements ");
		for(int i=0;i<5;i++)
			{
				divident[i]=sc.nextInt();

			}	

	System.out.print("Enter the Divisor : ");
		divisor = sc.nextInt();

	
    try{

	for(int i=0;i<5;i++)
		{
		 remainder[i] = divident[i]%divisor;
		}


	System.out.println("the remainders :");
	for(int i =0;i<5;i++)
		{
		System.out.println(remainder[i]);

		}
System.out.println("Exception is  NOT occured");
	}

catch(Exception e)
{

System.out.println("Can not Divided by 0 ...Enter the Divisor Greater than 0");

}
System.out.println("........Programme ends........");
}
}
