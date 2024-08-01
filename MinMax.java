import java.util.Scanner;
class MinMax{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];


        System.out.println("Enter the array elements ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }

        System.out.println(" ");
        System.out.println("Array elements are ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        int max = arr[0];
        int min=arr[0];
      

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Max no is " + max);
        System.out.println("Min no is " + min);

    }
}
