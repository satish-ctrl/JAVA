package Array;


public class PairOfArray {
     public static void pairOfArray(int array[]){
          for(int i=0;i<array.length;i++){
               for(int j=i+1;j<array.length;j++){
                    System.out.print("("+array[i]+","+array[j]+")  ");
               }
               System.out.println();
          }
     }
     public static void main(String args[]){
          int array[]={4,3,7,1,8};
          pairOfArray(array);
     }
}
