package MapAndGenerics;

import java.util.*;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        hm.put(1,"Satish");
        hm.put(02, "amit");
        hm.put("Anup",3);
        hm.put(3,"Satish");
        hm.put("anup",3);
        hm.put(4,"Satish");
        hm.remove(4);
//        hm.put(1,"Sonu");
//        hm.clear();
        System.out.println(hm);
        System.out.println(hm.keySet());
        System.out.println(hm.values());
        System.out.println(hm.size());
        System.out.println(hm.get(1));
        System.out.println(hm.isEmpty());

        LinkedHashMap lhm = new LinkedHashMap();
        lhm.put(1,"Satish");
        lhm.put(02, "amit");
        lhm.put("Anup",3);
        lhm.put(3,"Satish");
        lhm.put("anup",3);
        lhm.put(4,"Satish");
        lhm.remove(4);
        System.out.println(lhm);
    }
}
