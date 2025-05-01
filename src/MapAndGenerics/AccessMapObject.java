package MapAndGenerics;

import java.util.*;

public class AccessMapObject {
    public static void main(String[] args) {

        Map map = new HashMap();
        map.put(1, "Ram");
        map.put(2, "Shyam" );
        map.put(3, "Raju");
        System.out.println(map);

        System.out.println("----------Access Only keys---------");

        Set keys=map.keySet();
        Iterator itr1 = keys.iterator();
        while (itr1.hasNext())
        {
//            System.out.println(itr1.next());
            Integer ik = (Integer) itr1.next();
            System.out.println(ik);
        }

        System.out.println("-----Access Only values-----");

        Collection values = map.values();
        Iterator itr2 = values.iterator();
        while (itr2.hasNext())
        {
//            System.out.println(itr2.next());
            String sv = (String) itr2.next();
            System.out.println(sv);
        }

        System.out.println("-----Access Both values-----");

        Set entrySet = map.entrySet();
        Iterator itr3 = entrySet.iterator();
        while (itr3.hasNext())
        {
//            System.out.println(itr3.next());
            Map.Entry data = (Map.Entry) itr3.next();
            System.out.println(data.getKey()+" : "+data.getValue());
        }
    }
}
