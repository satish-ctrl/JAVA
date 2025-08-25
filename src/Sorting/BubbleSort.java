package Sorting;

public class BubbleSort {
     public static void bubbleSort(int array[]){
          int swap=0;
          for(int term=0; term<array.length; term++){
               for(int j=0; j<array.length-1-term; j++){
                    if (array[j]>array[j+1]) {
                         int temp=array[j];
                         array[j]=array[j+1];
                         array[j+1]=temp;
                         swap++;
                    }
               }
               if (swap==0) {
                    return;
               }
          }
          
     }
     public static void display(int array[]){
          for(int i=0; i<array.length; i++){
               System.out.print(array[i]+" ");
          }
     }

     public static void main(String[] args) {
          int array[]={5, 4, 3, 2, 1};
          bubbleSort(array);
          display(array);
     }
}
