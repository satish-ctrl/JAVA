package BitManipulaltion;

public class ClearLastIthBit {
     public static int clearLastIthBit(int n, int i){
          int bitMask=(~0)<<i;
          // or,
          // int bitMask=(-1)<<i;
          return n & bitMask;
     }
     public static void main(String args[]){
          System.out.println(clearLastIthBit(15, 2));
     }
}
