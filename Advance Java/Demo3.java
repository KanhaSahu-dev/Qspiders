import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Arrays;

public class Demo3{
    public static void m1(int a){
        System.out.println(a);
    }
    public static void main(String...args){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        Consumer<Integer> c1 = s->{
            System.out.println(s);
        };
        list.forEach(c1);
System.out.println();
        Consumer<Integer> consumer = Demo3::m1;
        list.forEach(consumer);
System.out.println();
        Consumer<Integer> c = System.out::println;
        list.forEach(c);
    }
}