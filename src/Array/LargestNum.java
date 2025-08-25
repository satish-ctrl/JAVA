package Array;

import java.util.*;
public class LargestNum {
     public static int largestNum(int num[]){
          int largest=Integer.MIN_VALUE;
          int smallest=Integer.MAX_VALUE;
          for(int i=0;i<num.length;i++){
               if(largest<num[i]){
                    largest=num[i];
               }
               if(smallest>num[i]){
                    smallest=num[i];
               }     
          }
          System.out.println("smallest value is :"+smallest);
          return largest;
     }
     public static void main(String args[]){
          int num[]={3, 5, 1, 7, 3};
          System.out.println("largest number is :"+largestNum(num));

     }
     
}
