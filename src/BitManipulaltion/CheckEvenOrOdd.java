package BitManipulaltion;

public class CheckEvenOrOdd {
     public static void evenOrOdd(int n){
          int bitMask=1;
          if((n & bitMask) == 0){
               System.out.println("Even");
          }else{
               System.out.println("Odd");
          }
     }
     public static void main(String args[]){
          evenOrOdd(8);
          evenOrOdd(9);
          evenOrOdd(76);
          evenOrOdd(47);
     }
}
