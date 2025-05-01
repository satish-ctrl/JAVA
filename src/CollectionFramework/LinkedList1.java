package CollectionFramework;

import java.util.*;
public class LinkedList1 {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.add("abc");
        list.add(45);
        System.out.println(list);
        list.set(1,33);
        System.out.println(list);
        list.add(2, 66);
        list.get(1);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        list.remove("66");
        System.out.println(list);
    }
}
