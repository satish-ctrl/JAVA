package Basic;

import java.util.Scanner;

public class SumTwoNumber{
     public static void main(String[] args) {
          System.out.println("Enter two numer:");
          Scanner sc=new Scanner(System.in);
          int a=sc.nextInt();
          int b=sc.nextInt();
          int sum=a+b;
          System.out.println(sum);
     }
}