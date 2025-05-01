package API_And_Anotation;
import java.util.*;
import java.util.stream.*;

public class StreamAPI2 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3, 8,1,4,5,2);
        System.out.println(list);

        Stream<Integer> streamData = list.stream();

        Stream<Integer> finalData = streamData.filter(n->n%2==0)
                .map(n->n*2)
                .sorted();


        /*     Stream<Integer> mapData = filData.map(n->n*2);
             Stream<Integer> sortData = mapData.sorted();  */

        finalData.forEach(n->System.out.println(n));
    }
}
