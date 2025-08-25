package BitManipulaltion;

public class IsPowerOfTwoOrNot {
     public static boolean isPowerOfTwoOrNot(int n){
               return (n & (n-1))==0;
     }
     public static void main(String args[]){
          System.out.println(isPowerOfTwoOrNot(16));
          System.out.println(isPowerOfTwoOrNot(19));
          System.out.println(isPowerOfTwoOrNot(32));
          System.out.println(isPowerOfTwoOrNot(225));
          System.out.println(isPowerOfTwoOrNot(256));
     }
}
