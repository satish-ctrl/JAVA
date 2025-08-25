package Strings;

public class PrintSubstring {
     public static String printSubstring(String str, int si, int ei){
          String s="";
          for(int i=si; i<ei; i++){
               s+=str.charAt(i);
          }
          return s;
     }
     public static void main(String args[]){
          String str="HelloWorld";
          System.out.println(str.substring(0,5));
          System.out.println(printSubstring(str, 1, 5));
     }
}
