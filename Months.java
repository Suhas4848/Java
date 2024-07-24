class Months
{
public static void main(String args[])
{
	int n=0;
	for(int i =0 ; i < args.length; i++)
	{
	n = Integer.parseInt(args[i]);
	}


switch(n)
{
case 1:
	System.out.println("JAN");
	break;
case 2:
	System.out.println("FEB");
	break;
case 3:
	System.out.println("MAR");
	break;
case 4:
	System.out.println("APR");
	break;
case 5:
	System.out.println("MAY");
	break;
case 6:
	System.out.println("JUN");
	break;
case 7:
	System.out.println("JUL");
	break;
case 8:
	System.out.println("AUG");
	break;
case 9:
	System.out.println("SEP");
	break;
case 10:
	System.out.println("OCT");
	break;
case 11:
	System.out.println("NOV");
	break;
case 12:
	System.out.println("DEC");
	break;
default:
	System.out.println("INVALID");
	break;


}
}
}