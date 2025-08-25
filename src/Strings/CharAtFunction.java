package Strings;

public class CharAtFunction {
     public static void main(String[] args) {
          String firstName="Amit";
          String lastName="Kumar";
          String fullName=firstName+" "+lastName;
          System.out.println(fullName);
          for(int i=0; i<fullName.length(); i++){
               System.out.print(fullName.charAt(i)+" ");
          }
     }
}
