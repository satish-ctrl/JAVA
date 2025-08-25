package Basic;

import java.util.*;
public class Switch {
     public static void main(String[] args) {
          System.out.print("Enter first number:");
          Scanner sc=new Scanner(System.in);
          int a=sc.nextInt();
          System.out.print("Enter operator:");
          char ch=sc.next().charAt(0);
          System.out.print("Enter second number:");
          int b=sc.nextInt();
          switch(ch){
               case '+':
                    System.out.println(a+b);
                    break;
               case '-':
                    System.out.println(a-b);
                    break;
               case '*':
                    System.out.println(a*b);
                    break;
               case '/':
                    System.out.println(a/b);
                    break;
               default:
                    System.out.println("Wrong operator");
          }
     }
     
}
