import java.io.*;
import java.util.*;

class createFile
{
	public static void main(String args[])
{

	File f = new File("D:\\23UAI317\\info.txt");
	try{
		if(f.createNewFile())
		{
			System.out.println("File is created...Successfully");

		}
		else
		{
			System.out.println("File is already exists");
	
		}

	FileWriter fw = new FileWriter("info.txt");
	fw.write("name of student is xyz");
	fw.close();
	System.out.println("file is updated");

	Scanner Reader = new Scanner(f);
	while(Reader.hasNextLine())
		{
			String data = Reader.nextLine();
			System.out.println(data);	

		}
		Reader.close();

		if(f.delete()){
		System.out.println("File is deleted.....");	
		}
	}

	catch(Exception e){

			System.out.println(e);

		}

}

}



