package Function;

import java.util.*;

public class Sum {

     public static int sum(int a,int b){
          int sum=a+b;
          return sum;
     }

     public static void main(String args[]){
          System.out.print("Enter two number:");
          Scanner sc=new Scanner(System.in);
          int a=sc.nextInt();
          int b=sc.nextInt();
          int sum=sum(a,b);
          System.out.print(sum);
     }
     
}
