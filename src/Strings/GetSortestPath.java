package Strings;

import java.util.*;
public class GetSortestPath {
     public static double getSortestPath(String path){
          int x=0;
          int y=0;
          for(int i=0; i<path.length(); i++){
               if(path.charAt(i)=='E'){
                    x++;
               }
               else if(path.charAt(i)=='W'){
                    x--;
               }
               else if(path.charAt(i)=='N'){
                    y++;
               }
               else if(path.charAt(i)=='S'){
                    y--;
               }
          }
          int X2=x*x;
          int Y2=y*y;
          return (double)Math.sqrt(X2+Y2);
     }
     
     public static void main(String args[]){
          String path="WNEENESENNN";
          System.out.println(getSortestPath(path));
     }
}
