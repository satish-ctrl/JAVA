package Array;


import java.util.*;

// ======================   BRUTE METHOD      =========================

// public class MaxSumOfSubArray {
//      public static void maxSumOfsubArray (int array[]){
//           int min=Integer.MAX_VALUE;
//           int max=Integer.MIN_VALUE;
//           for(int i=0; i<array.length; i++){
//                int start=i;
               
//                for(int j=i; j<array.length; j++){
//                     int end=j;
//                     int currSum=0;
//                     for(int k=start; k<=end; k++){
                         
//                          currSum += array[k];
//                     }
//                     System.out.println(currSum);
//                     if(max < currSum){
//                          max=currSum;
//                     }
//                     if(min > currSum){
//                          min = currSum;
//                     }

//                } 
//                System.out.println("---------------------------------");    
//           }
//           System.out.println("Minimum sum="+min);
//           System.out.println("Maximum sum="+max);
//      }
//      public static void main(String args[]){
//           int array[]={2, 4, 5, 7, 9};
//           maxSumOfsubArray(array);
//      }
// }

// ==================   PREFIX METHOD   ==================

// public class MaxSumOfSubArray{
//      public static void maxSumOfsubArray(int array[]){
//           int maxSum = Integer.MIN_VALUE;
//           int prefix[] = new int [array.length];
//           prefix[0] = array[0];
//           for(int i = 1; i <array.length; i++){
//                prefix[i] = prefix[i-1] + array[i];
//           }
//           for ( int i = 0; i < array.length; i++){
//                int start = i;
//                int curSum = 0;
//                for(int j = i; j < array.length; j++){
//                     int end = j;
//                     curSum = start == 0? prefix[end] :prefix[end]- prefix[start-1];
//                     if(maxSum < curSum){
//                          maxSum = curSum;
//                     }
                    
//                }
//           }
//           System.out.println("Max sum="+maxSum);
//      }
//      public static void main(String args[]){
//           int array[] = {1, -2, 6, -1, 3};
//           maxSumOfsubArray(array);
//      }
// }

// ================= KADANES ALGORITHM   ================

public class MaxSumOfSubArray{

     public static void maxSumOfsubArray(int array[]){
          int currSum = 0;
          int maxSum = Integer.MIN_VALUE;
          for(int i = 0; i<array.length; i++){
               currSum =currSum  + array[i];
               if(currSum < 0){
                    currSum = 0;
               }
               maxSum =Math.max(maxSum , currSum);
          }
          System.out.println("Max sum = "+maxSum);
     }
     public static void main(String[] args) {
          int array[]={-2, -3, 4, -1, -2, 1, 5, -3};
          maxSumOfsubArray(array);
     }
}
