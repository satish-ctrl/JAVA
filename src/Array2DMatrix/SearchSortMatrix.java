package Array2DMatrix;

public class SearchSortMatrix {
     //  first method
     public static boolean searchTargetF(int matrix[][], int target){
          int row=0, col=matrix[0].length-1;
          while(row<matrix.length && col>=0){
               if(matrix[row][col]==target){
                    System.out.println("Target found at ("+row+","+col+")");
                    return true;
               }
               else if(matrix[row][col]<target){
                    row++;
               }
               else{
                    col--;
               }
          }
          System.out.println("target not found");
          return false;
     }
     // second method
     public static boolean searchTargetS(int matrix[][], int target){
          int row=matrix.length-1, col=0;
          while(row>=0 && col<=matrix[0].length-1){
               if(matrix[row][col]==target){
                    System.out.println("Target found at ("+row+","+col+")");
                    return true;
               }
               else if(matrix[row][col]>target){
                    row--;
               }
               else{
                    col++;
               }
          }
          System.out.println("Target not found");
          return false;
     }
     public static void main(String args[]){
          int matrix[][]={{10, 15, 20, 25},
                          {30, 35, 40, 45},
                          {50, 55, 60, 65},
                          {70, 75, 80, 85}};
          System.out.println(searchTargetF(matrix,21) ); 
          System.out.println(searchTargetS(matrix, 20) );      
     }
}
