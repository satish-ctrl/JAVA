package Array2DMatrix;

import java.util.*;
public class SmallAndLarger {
     public static int[] smallAndLarge(int a[][]){
          int m=a.length, n=a.length;
          int large=Integer.MIN_VALUE;
          int small=Integer.MAX_VALUE;
          for(int i=0; i<a.length; i++){
               for(int j=0; j<a.length; j++){
                   large=Math.max(large, a[i][j]);
                   small=Math.min(small, a[i][j]);
                   
               }
          }
          return new int[] {large, small};
     }
     public static void main(String[] args) {
          int a[][]=new int[3][3];
          Scanner sc=new Scanner(System.in);
          System.out.println("enter the 3*3 matrix");
          for(int i=0; i<a.length; i++){
               for(int j=0; j<a.length; j++){
                   a[i][j]=sc.nextInt();
               }
          }
          for(int i=0; i<a.length; i++){
               for(int j=0; j<a.length; j++){
                   System.out.print(a[i][j]+"  ");
               }
               System.out.println();
          }
          int result[]=smallAndLarge(a);
          System.out.println("largest= "+result[0]);
          System.out.println("smaller= "+result[1]);
          
     }
}
