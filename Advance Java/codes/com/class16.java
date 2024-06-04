import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class class16 {
    public static void main(String[] args) {
        //range
        // IntStream.range(1,11).forEach(s->System.out.println(s));
        // boolean b = IntStream.range(1,10).anyMatch(s->s%2==0);
        // System.out.println(b);
        int num = 8;
        boolean b = IntStream.range(2,num).anyMatch(e->num%e==0);
        // System.out.println(b);

        if(b)
        System.out.println("not a prime number");  
        else
        System.out.println("prime number");
    }
}
