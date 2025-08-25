package Array2DMatrix;

public class DiagonalSum {

     public static void diagonalSum(int matrix[][]){
          int sum=0;
          for( int i=0; i<matrix.length; i++){
               sum+=matrix[i][i];
               if(i!=matrix.length-1-i){
                    sum+=matrix[i][matrix.length-1-i];
               }
          }
          System.out.println("Sum ="+sum);

     }
     public static void main(String args[]){
          int matrix[][]={{1, 2, 3,10},
                         {4, 5, 6, 11},
                         {7, 8, 9, 12},
                         {13,14,15,16}};
          diagonalSum(matrix);
          
     }
}
