import java.util.Scanner;

class Matrix {
    int A[][] = new int[2][2];
    int B[][] = new int[2][2];

    Scanner sc = new Scanner(System.in);

    void getarrayele() {
        System.out.println("Enter the 1st matrix elements :");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the 2nd matrix elements :");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                B[i][j] = sc.nextInt();
            }
        }
    }

    void display() {
        System.out.println("1st matrix elements are  :");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n 2nd matrix elements are  :");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }

    }

    void Add() {
        System.out.println("Addition is :");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(A[i][j] + B[i][j] + " ");
            }
            System.out.println();
        }
    }

    void Sub() {
        System.out.println("Subtraction is :");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(A[i][j] - B[i][j] + " ");
            }
            System.out.println();
        }
    }

    void Multi() {
        System.out.println("Multiplication is :");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(A[i][j] * B[i][j] + " ");
            }
            System.out.println();
        }

    }

}

class Matrix1 {
    public static void main(String args[]) {

        Matrix M = new Matrix();
        M.getarrayele();
        M.display();
        M.Add();
        M.Sub();
        M.Multi();
    }
}