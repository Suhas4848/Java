import java.util.Scanner;

interface Stack {
    void push();

    void pop();

    void display1();

}

interface Queue {
    void enqueue();

    void dequeue();

    void display2();
}

class StackQueueOperation implements Stack, Queue {
    int top;
    int maxsize = 0;
    int[] arr;
    int front;
    int rear;
    int ele;
    Scanner sc = new Scanner(System.in);

    StackQueueOperation(int ms) {
        this.maxsize = ms;
        this.arr = new int[maxsize];
        this.top = -1;
        this.front = 0;
        this.rear = 0;
    }

    public void push() {
        if (top == maxsize - 1) {
            System.out.println("Stack is full");
        } else {
            System.out.print("Enter the Element to push :");
            ele = sc.nextInt();
            arr[++top] = ele;
            System.out.println("Item Push Successfully");
        }
    }

    public void pop() {
        if (top < 0) {

            System.out.println("Stack is empty");

        } else {
            System.out.println("Popped element is: " + arr[top--]);
            System.out.println("Item POP Successfully");

        }
    }

    public void display1() {
        if (top < 0) {

            System.out.println("Stack is empty");

        } else {

            System.out.print("Stack elements are :" + " ");
            for (int i = 0; i <= top; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public void enqueue() {
        if (rear == maxsize) {
            System.out.println("Queue is full");
        } else {
            System.out.print("Enter the Element to Enqueue :");
            ele = sc.nextInt();
            arr[rear++] = ele;
            System.out.println("Item Enqueue Successfully");
        }
    }

    public void dequeue() {
        if (rear == front) {
            System.out.println("Queue is Empty");

        } else {
            System.out.println("Dequeued element is: " + arr[front++]);
            System.out.println("Item Dequeue Successfully");
        }
    }

    public void display2() {
        if (rear == front) {
            System.out.println("Queue is Empty");

        } else {
            System.out.println("Queue elements are :" + " ");
            for (int i = front; i < rear; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

class StackQueueTest {
    public static void main(String[] args) {

        StackQueueOperation sq = new StackQueueOperation(5);
        Scanner sc = new Scanner(System.in);

        int choice;
        while (true) {
            System.out.println("1. Stack");
            System.out.println("2. Queue");
            System.out.println("3. Exit");
            System.out.print("Enter the choise : ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:

                    System.out.println("1. Push");
                    System.out.println("2. Pop");
                    System.out.println("3. Display");
                    System.out.println("4. Exit");
                    System.out.print("Enter the Operation Which you want to perform  :");

                    int ch = sc.nextInt();

                    switch (ch) {
                        case 1:
                            sq.push();
                            break;

                        case 2:
                            sq.pop();
                            break;

                        case 3:
                            sq.display1();
                            break;
                        case 4:
                            System.out.println("Exiting...");
                            return;

                        default:
                            System.out.println(" You Enter the valid choise ");

                    }

                    break;

                case 2:
                    System.out.println("1. Enqueue");
                    System.out.println("2. Dequeue");
                    System.out.println("3. Display");
                    System.out.println("4. Exit");
                    System.out.print("Enter the Operation Which you want to perform  :");

                    int ch1 = sc.nextInt();

                    switch (ch1) {
                        case 1:
                            sq.enqueue();
                            break;

                        case 2:
                            sq.dequeue();
                            break;

                        case 3:
                            sq.display2();
                            break;
                        case 4:
                            System.out.println("Exiting...");
                            return;

                        default:
                            System.out.println(" You Enter the valid choise ");

                    }
                    break;

                case 3:
                    System.out.println(" Exited ");
                    break;

            }

        }
    }

}