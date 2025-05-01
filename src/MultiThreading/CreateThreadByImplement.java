package MultiThreading;

import java.util.*;
class Calc1 implements Runnable{
    public void run(){
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

}

class Message1 implements Runnable{
    public void run(){
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
public class CreateThreadByImplement {
    public static void main(String[] args) {
        Calc1 c1 = new Calc1();
        Message1 m2 = new Message1();
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(m2);
        t1.start();
        t2.start();
    }
}
