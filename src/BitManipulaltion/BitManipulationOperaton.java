package BitManipulaltion;

public class BitManipulationOperaton {
     // Get Operation
     public static int getOperation(int n, int i){
          int bitMask=1<<i;
          if((n & bitMask)==0){
               return 0;
          }else{
               return 1;
          }
     }
     // Set operation
     public static int setOperation(int n, int i){
          int bitMask=1<<i;
          return n|bitMask;
     }
     // Clear Operation
     public static int clearOperation(int n, int i){
          int bitMask=~(1<<i);
          return n & bitMask;
     }
     
     public static void main(String args[]){
          System.out.println("Get Operation :"+getOperation(10, 1));
          System.out.println("Get Operation :"+setOperation(10, 2));
          System.out.println("Clear Operation :"+clearOperation(10, 2));
     }
}
