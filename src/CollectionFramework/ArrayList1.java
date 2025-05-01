package CollectionFramework;

import java.util.*;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList al1 = new ArrayList();
        al1.add(100);
        al1.add(200);
        al1.add(300);
        al1.addFirst(23.5);
        al1.addLast("g9j4");
        System.out.println(al1);
        System.out.println("-------------------------------------------------------------");

        ArrayList al2 = new ArrayList();
        al2.add("Anup");
        al2.add("Amit");
        al2.add("Sonu");
        al2.add(1);
        System.out.println(al2);
        System.out.println("-------------------------------------------------------------");
        al2.add(al1);
        System.out.println(al2);
        System.out.println("-------------------------------------------------------------");
        al2.add(3,"b");
        System.out.println(al2);


    }
}
