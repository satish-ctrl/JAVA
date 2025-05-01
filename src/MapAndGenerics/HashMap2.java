package MapAndGenerics;

import java.util.*;
import java.util.Map.*;

class Student{
    private String name;
    private int age;
    private String city;

    public Student(String name, int age,  String city){
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public String toString(){
        return name+" "+age+" "+city;
    }
}
public class HashMap2 {
    public static void main(String[] args) {

        Map map = new HashMap();

        Student st1 = new Student("Anup", 33, "Ghaziput");
        Student st2 = new Student("Amit", 29, "Uttar Pradesh");
        Student st3 = new Student("Sonu", 25, "India");

        map.put(1, st1);
        map.put(2, st2);
        map.put(3, st3);
        System.out.println(map);

        Set entrySet = map.entrySet();
        Iterator itr = entrySet.iterator();
        while (itr.hasNext())
        {
//            System.out.println(itr.next());

  /* yaha maine Map.Entry nhi likha kyoki maine pahle hi ese import kr diya hai*/

            Entry data = (Entry) itr.next();
            System.out.println(data.getKey() +" : "+ data.getValue());
        }

    }
}
