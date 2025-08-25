package Array;


public class ReverseArray {
     public static void reverseArray(int array[]){
          int first=0, last=array.length-1;
          while(first<last){
               int temp=array[first];
               array[first]=array[last];
               array[last]=temp;
               first++;
               last--;
          }
     }
     public static void main(String args[]){
          int array[]={4, 6, 7, 2, 9, 2, 8};
          for(int i=0;i<array.length;i++){
               System.out.print(array[i]+" "); 
          }
          System.out.println();
          reverseArray(array);
          System.out.println("Reverse array");
          for(int i=0;i<array.length;i++){
               System.out.print(array[i]+" "); 
          }
     }
}
