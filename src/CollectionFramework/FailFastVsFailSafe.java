package CollectionFramework;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastVsFailSafe {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(23);
        al.add(45);
        al.add(85);
        System.out.println("Fail Fast");
        System.out.println(al);
        System.out.println("**************************************************");
        Iterator itr = al.iterator();
        while (itr.hasNext()){
//            Integer i=(Integer) itr.next();
//            System.out.println(i);
            System.out.println(itr.next());
//            al.add(100);
        }


        System.out.println("**************************************************");
        System.out.println("Fail Safe");

        CopyOnWriteArrayList al1 = new CopyOnWriteArrayList();

        al1.add(74);
        al1.add(45);
        al1.add(32);

        System.out.println(al1);

        Iterator itr1 = al1.iterator();

        while (itr1.hasNext())
        {
            System.out.println(itr1.next());
            al1.add(110);
        }
    }
}
