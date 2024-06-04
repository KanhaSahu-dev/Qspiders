import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Set;

public class class15 {
    public static void main(String[] args) {
        // List<Integer> list = Arrays.asList(1, 32, 1, 34, 54, 32, 3);

        // // Create streams
        // Stream<Integer> stream = list.stream();
        // Stream<Integer> stream1 = list.stream().distinct();

        // // Collect elements of streams into lists
        // List<Integer> resultList = stream.collect(Collectors.toList());
        // List<Integer> distinctList = stream1.collect(Collectors.toList());

        // // Print the lists
        // System.out.println(resultList);
        // System.out.println(distinctList);

        // List<Integer> list2 = list.stream()
        //                         .distinct()
        //                         .collect(Collectors.toList());
        // System.out.println(list2);

        // list.stream().distinct().forEach(s->System.out.print(s + " "));

        List<Integer> list3 = Arrays.asList(1,3,2,5,8,12,9,15);

        // List<Integer> l = list3.stream().
        //                         map(e->e*e).
        //                         collect(Collectors.toList());
        // System.out.println(l);

        // list3.stream().map(e->e++).filter(e->e%2==0).distinct().forEach(s->System.out.println(s));

        // list3.stream().map(e->e++).filter(e->e%2==0).distinct().forEach(s->System.out.println(s));

        list3.stream().sorted().distinct().filter(e->e%2!=0).map(e->e+1).forEach(e->System.out.println(e));
    }
}
