class Mobile
{
	String brand;
	int price;
	static String name;

void show()
{
	System.out.println("Brand  :" + brand);
	System.out.println("Price of phone : " + price);
	System.out.println("Name of phone :" + name);
}
}

class Static_var 
{
	public static void main(String args[])
	{
		Mobile m1 = new Mobile();	
		Mobile m2 = new Mobile();	
	
	m1.brand="Samsung";
	m1.price=20000;
	m1.name="SmartPhone";

	
	m2.brand="Apple";
	m2.price=150000;
	m2.name="Phone";

	System.out.println();
	System.out.println("   1 st mobile ");
	m1.show();

	System.out.println();
	System.out.println("   2nd  mobile ");
	m2.show();

	}


}