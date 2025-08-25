package Function;

public class binToDec {
     public static void binaryToDecimal(int b){
          int bNum=b;
         int  pow=0;
          int deci=0;
          while(bNum > 0){
               int ld=bNum%10;
               deci=deci + ld * (int)Math.pow(2,pow);
               bNum=bNum/10;
               pow++;
          }
          System.out.print("Decimal of "+b+"= "+deci);
     }
     
     public static void main(String[] args) {
          binaryToDecimal(11);
     }
}
