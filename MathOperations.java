import java.util.*;

class MathOperations {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("");
            System.out.println(" 1.Arithmatic Operations");
            System.out.println(" 2.Statistical Operations");
            System.out.println(" 3.trignomatric operations ");
            System.out.println("4.Exit..");
            System.out.println("");

            System.out.print("Enter the choise ...... : ");

            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("");

                    System.out.println("Enter the Two numbers ");
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    System.out.println(" Addition of two numbers is : " + (a + b));
                    System.out.println(" Substarcytion of two numbers is : " + (a - b));
                    System.out.println(" Multiplication of two numbers is : " + (a * b));
                    System.out.println(" Quotient of two numbers is : " + (a / b));
                    break;

                case 2:
                    System.out.println("");

                    System.out.println("Enter the numbers separeted by space : ");
                    int[] arr = new int[4];
                    int sum = 0;
                    for (int i = 0; i < 4; i++) {
                        arr[i] = sc.nextInt();
                    }
                    for (int i = 0; i < 4; i++) {
                        sum = sum + arr[i];
                    }
                    double avg = sum / 4;
                    System.out.println("Average is :" + avg);
                    break;

                case 3:
                    System.out.println("");
                    System.out.println("Enter the angle in Degree :");
                    double degree = sc.nextInt();
                    double radians = Math.toRadians(degree);

                    System.out.println("Sine value : " + Math.sin(radians));
                    System.out.println("Cosine value : " + Math.cos(radians));
                    System.out.println("Tangent value : " + Math.tan(radians));
                    break;

                case 4:
                    System.exit(0);

                default:
                    System.out.println("");
                    System.out.println("You enter the Wrong choise ...\n please enter the choise between 1 to 4 .. ");
                    break;
            }

        }

    }
}