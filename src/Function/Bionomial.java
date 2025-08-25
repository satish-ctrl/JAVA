package Function;

public class Bionomial {

     public static int factorial(int n){
          int fact=1;
          for(int i=n;i>0;i--){
               fact=fact*i;
          }
          return fact;
     }

     public static int bioCofficiant(int n,int r){
          int n_fact=factorial(n);
          int r_fact=factorial(r);
          int nmr_fact=factorial(n-r);
          int result=n_fact/(r_fact*nmr_fact);
          return result;
     }

     public static void main(String args[]){
          System.out.print("Binomial cofficiant:"+bioCofficiant(5,2));
          
     }
     
}
