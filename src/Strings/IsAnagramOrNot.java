package Strings;

import java.util.Arrays;

public class IsAnagramOrNot {
     public static void main(String args[]){
          String s1="earth";
          String s2="heart";
          
          // check length
          if (s1.length()==s2.length()) {
               // convet lower case
               s1=s1.toLowerCase();
               s2=s2.toLowerCase();
               // convert char Arrays
               char[] s1charArray=s1.toCharArray();
               char[] s2charArray=s2.toCharArray();
               // Array sort
               Arrays.sort(s1charArray);
               Arrays.sort(s2charArray);
               
               boolean result=Arrays.equals(s1charArray,s2charArray);
               if(result)
               {
                    System.out.println(s1+" "+"and"+" "+s2+" "+"are anagram");
               }else{
                    System.out.println(s1+" "+"and"+" "+s2+" "+"are not anagram");
               }
          }
          else{
               System.out.println(s1+" "+"and"+" "+s2+" "+"are not anagram");
          }

     }
}
