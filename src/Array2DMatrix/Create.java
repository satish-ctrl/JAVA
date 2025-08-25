package Array2DMatrix;

import java.util.*;
public class Create {

     public static boolean findElenemt(int matrix[][], int key){
          for(int i=0; i<matrix.length; i++){
               for(int j=0; j<matrix[0].length; j++){
                   if( matrix[i][j]==key){
                    System.out.println("key present at index: "+"("+i+","+j+")");
                    return true;
                   }
               }
          } 
          return false; 
     }
     public static void main(String[] args) {
          int matrix[][]=new int[3][3];
          System.out.println("Enter the matrix element");
          Scanner sc=new Scanner(System.in);
          int m=matrix.length, n=matrix[0].length;
          // take input
          for(int i=0; i<m; i++){
               for(int j=0; j<n; j++){
                    matrix[i][j]=sc.nextInt();
               }
          }
          // print output
          for(int i=0; i<m; i++){
               for(int j=0; j<n; j++){
                   System.out.print(matrix[i][j]+" ");
               }
               System.out.println();
          }
          System.err.println(findElenemt(matrix, 5));

     }
}
