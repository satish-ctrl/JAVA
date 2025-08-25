package Strings;

import java.util.*;
public class IsPalindrome {
     public static boolean isPalindrome(String str){
          int n=str.length()-1;
          for(int i=0; i<=n/2; i++){
               if (str.charAt(i)!=str.charAt(n-i)) {
                    return false;
               }
          }
          return true;
     }

     public static void main(String args[]){
          System.out.println("Enter a string:");
          Scanner sc=new Scanner(System.in);
          String str=sc.next();
          System.out.println(isPalindrome(str));

     }
}