package Array;

public class BinarayInsertion {
     
     public static int binaryInsertion(int num[], int key){
          int start=0, end= num.length-1;
          
          int index=-1;
          if(key < num[start]){
               index=start;
             return 0;
          }
          if(key > num[num.length]){
               return end+1;
               
               
          }
          while(start<=end){
               int mid=(start + end)/2;
               // System.out.println(mid);
               if(num[mid]==key){
                    return mid;
               }
               if(num[mid]>key){
                    if(num[mid-1]<key){
                       index=mid; 
                       break; 
                    }
                    else{
                         end=mid-1;
                    }
               }
               else{
                    if(num[mid+1]>key){
                         index=mid+1; 
                         break; 
                      }
                      else{
                         start=mid+1;
                      }    
               }
          }
          return index;
     }
     public static void main(String args []){

          int num[]={2, 3, 5, 9, 15, 22, 27, 35};
          int key=40;
          int index=binaryInsertion(num, key);
               System.out.println("index: "+index);
     }
     
}
