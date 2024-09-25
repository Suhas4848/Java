import java.util.*;
import java.io.*;

class MyThread extends Thread{

    public void run(){

        for(int i= 0;i<5;i++){

            System.out.println("Thread A : " + i );

         
         try{
            Thread.sleep(1000);
         }
         catch(InterruptedException e){
             System.out.println(e);
         }
    }
    }
}
class AnotherThread extends Thread{

    public void run(){

        for(int i= 0;i<5;i++){

            System.out.println("Thread B : " + i );

         
         try{
            Thread.sleep(1000);
         }
         catch(InterruptedException e){
             System.out.println(e.getMessage());
         }
    }
    }
}
public class ThreadExample{
    public static void main(String args[]){
        MyThread ThreadA = new MyThread();
       AnotherThread ThreadB = new AnotherThread();
        ThreadA.start();
        ThreadB.start();


    }
}