import java.io.*;
import java.util.*;

class FileHandling {
    public static void main(String args[]) {

        File f = new File("D:\\23UAI317\\xyz.txt");
        try {
            if (f.createNewFile()) {
                System.out.println("File is created...Successfully");

            } else {
                System.out.println("File is already exists");

            }
            FileReader fr = new FileReader(f);
            BufferedReader bf = new BufferedReader(fr);
            String line;

            while ((line = bf.readLine()) != null) {

                System.out.println();
                System.out.println(line);

            }
            bf.close();
            fr.close();
        }

        catch (Exception e) {

            System.out.print("An error occured while reading the file :" + e.getMessage());

        }

    }
}
