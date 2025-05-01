package API_And_Anotation;

import java.util.*;
import java.util.stream.*;

public class StreamAPI {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2,4,5,1,6);
        System.out.println(list);

        Stream<Integer> streamData = list.stream();
        streamData.forEach(p-> System.out.println(p));
    }
}
