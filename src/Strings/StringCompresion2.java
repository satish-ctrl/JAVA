package Strings;

public class StringCompresion2 {
     public static String stringCompresion(String str){
          StringBuffer newStr=new StringBuffer("");
          for(int i=0; i<str.length(); i++){
               Integer count=1;
               while (i<str.length()-1 && str.charAt(i)==str.charAt(i+1)) {
                    count++;
                    i++;
               }
               newStr.append(str.charAt(i));
               if (count>1) {
                    newStr.append(count.toString());
               }
          }
          return newStr.toString();
     }
     public static void main(String args[]){
          String str="aaabbccccd";
          System.out.println(stringCompresion(str));
     }
}
