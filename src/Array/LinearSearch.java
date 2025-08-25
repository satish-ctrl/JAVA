package Array;


public class LinearSearch {

     public static int linearSearch(int num [] , int key){
          for(int i=0 ; i<num.length ; i++){
               if(num[i]==key){
                    return 1;
               }
          }
          return -1;

     }
     public static void main(String args[]){
          int num[]={4,6,2,9,8,1,7};
          int key=6;
          int index = linearSearch(num , key );
          if(index==-1){
               System.out.println("Not Fount");
          }
          else{
               System.out.println("Index value is :"+index);
          }

     }
     
}
