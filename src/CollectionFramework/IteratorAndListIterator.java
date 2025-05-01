package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorAndListIterator {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();

        al.add(32);
        al.add(54);
        al.add(65);

        System.out.println(al);
        System.out.println("-----------------------------------");
        System.out.println("Iterator");
        Iterator itr = al.iterator();
        while (itr.hasNext())
        {
            Integer i = (Integer) itr.next();
            System.out.println(i);
//            System.out.println(itr.next());
        }

        System.out.println("-----------------------------------");
        System.out.println("List Iterator");

        ListIterator litr = al.listIterator() ;

        System.out.println("Forward Direction");
           while(litr.hasNext()){
               System.out.println(litr.next());
           }
           
        System.out.println("Previous Direction");
        while(litr.hasPrevious()){
            System.out.println(litr.previous());
        }

    }
}
