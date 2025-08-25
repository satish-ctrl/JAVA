package Array;


public class SubArrayOfArray {
     public static void subArrayOfArray (int array[]){
          int count=0;
          for(int i=0; i<array.length; i++){
               int start=i;
               
               for(int j=i; j<array.length; j++){
                    int end=j;
                    
                    for(int k=start; k<=end; k++){
                         
                         System.out.print(array[k]+" ");
                    }
                    System.out.println();
                    count++;
               }
               System.out.println("----------------------------");
          }
          System.out.println("total sub array="+count);
     }
     public static void main(String args[]){
          int array[]={2, 4, 5, 7, 9};
          subArrayOfArray(array);
     }
}
