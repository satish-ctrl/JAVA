package Sorting;

public class SelectionSort {
          public static void selectionSort(int array[]){
               for(int term=0; term<array.length-1; term++){
                    int minPos=term;
                    for(int j=term+1; j<array.length; j++){
                         if (array[minPos]>array[j]) {
                             
                              minPos=j;
                         }
                    }
                    int temp=array[minPos];
                    array[minPos]=array[term];
                    array[term]=temp;
                    
               }
               
          }
          public static void display(int array[]){
               for(int i=0; i<array.length; i++){
                    System.out.print(array[i]+" ");
               }
          }
     
          public static void main(String[] args) {
               int array[]={5, 4, 3, 2, 1};
               selectionSort(array);
               display(array);
          }
}
     
