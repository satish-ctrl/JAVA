package Array;

public class BinarySearch {

     public static int binarySearch(int num[], int key){
          int start=0, end= num.length;
          while(start<=end){
               int mid=(start + end)/2;
               System.out.println(mid);
               if(num[mid]==key){
                    return mid;
               }
               if(num[mid]>key){
                    end=mid-1;
               }
               else{
                    start=mid+1;
               }
          }
          return -1;
     }
     public static void main(String args []){

          int num[]={2, 4, 5, 7, 8};
          int key=8;
          int index=binarySearch(num, key);
          if(index==-1){
               System.out.println("Key not found");
          }
          else{
               System.err.println("key present at "+(index+1)+" Position");
          }
     }
     
}
