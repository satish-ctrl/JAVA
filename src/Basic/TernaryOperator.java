package Basic;

import java.util.Scanner;
public class TernaryOperator {
     public static void main(String [] args){
          System.out.println("Enter two number:");
          Scanner sc = new Scanner (System.in);
          int a=sc.nextInt();
          int b=sc.nextInt();
          int result=(a>b)?a:b;
          System.out.println("Largest number is:"+result);


     }
     
}
