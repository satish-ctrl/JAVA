package Array2DMatrix;

public class SpiralMatrix {
     public static void spiralMatrix(int matrix[][]){
          int srow=0;
          int erow=matrix.length-1;
          int scol=0;
          int ecol=matrix[0].length-1;
          // print top
          while (srow<=erow && scol<=ecol) {

               for(int j=scol; j<=ecol; j++){
                    System.out.print(matrix[srow][j]+" ");
               }
               // print right
               for(int i=srow+1; i<=erow; i++){
                    System.out.print(matrix[i][ecol]+" ");
               }
               // print buttom
               for(int j=ecol-1; j>=scol; j--){
                    if(srow==erow){
                         break;
                    }
                    System.out.print(matrix[erow][j]+" ");
               }
               // print left
               for(int i=erow-1; i>=srow+1; i--){
                    if(scol==ecol){
                         break;
                    }
                    System.out.print(matrix[i][scol]+" ");
               }
               srow++;
               erow--;
               scol++;
               ecol--;
          }
     }
     public static void main (String args[]){
          int matrix[][] = {{1, 2, 3, 4, 25},
                           {5, 6, 7, 8, 26},
                           {9, 10, 11, 12, 27}};
                         //   {13, 14, 15, 16, 28},
                         //   {17, 18, 19, 20, 29},
                         //   {21, 22, 23, 24, 30}};
          // for(int i=0; i<matrix.length; i++){
          //      for(int j=0; j<matrix[0].length; j++){
          //           System.out.print(matrix[i][j]+" ");
          //      }
          //      System.out.println();
          // }
          spiralMatrix(matrix);
     }                      
                        
}
