package MultiThreading;
import java.util.*;

class MyThread2 extends Thread{
    public void run(){
        String tname=Thread.currentThread().getName();
        if(tname.equals("CALC")){
            calc();
        }
        else{
            important();
        }
    }
    public void calc(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Start calculation");
        System.out.println("Enter first number : ");
        int num1=sc.nextInt();
        System.out.println("Enter 2nd number : ");
        int num2=sc.nextInt();

        int res = num1 + num2;
        System.out.println("Sum is : "+res);
        System.out.println("End Calculation");
        System.out.println("------------------------------------------------------");
    }
    public void important(){
        System.out.println("Displaying importand massage task");
        try {
            for(int i=0; i<3; i++){
                System.out.println("Focus on you skill");
                Thread.sleep(3000);
            }
        }
        catch (Exception e){
            System.out.println("Some Problem");
        }
        System.out.println("Displaying importand message end");
    }
}
public class MultipleThreadWithinSingleRunMeth {
    public static void main(String[] args) {
        MyThread2 thread1=new MyThread2();
        MyThread2 thread2=new MyThread2();
        thread1.setName("CALC");
        thread2.setName("PRINT");
        thread1.start();
        thread2.start();
    }
}
