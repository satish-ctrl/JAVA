package MultiThreading;
import java.util.*;

class Calc extends Thread{
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
        System.out.println("***********************************************************************");
    }
}

class Massage extends Thread{
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

public class CreateMultiThread {
    public static void main(String[] args) {
        Calc t1 = new Calc();
        Massage t2 = new Massage();
        t1.start();
        t2.start();

    }
}
