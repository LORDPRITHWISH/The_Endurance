//import java.text.Collator;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
//import Typed.*;

public class Looper {
    public static void main(String[] args) {
        var lst = List.of(1,2,3,4,5,6,7,8,9,10);
        Typed.details(lst);
        for(int i: lst){
            System.out.println("for"+i);
        }

        lst.forEach(System.out::println);

        System.out.println("-----------------");

        Stream.of(1, 2, 3, 4, 5)
                .filter(n -> n % 2 == 0)
                .map(n -> n * 100)
                .forEach(System.out::println);

        System.out.println("-----------------");

        lst.stream().filter(n-> n % 3 == 0)
                .map(n -> n * 10)
                .forEach(System.out::println);

        System.out.println("-----------------");

        lst.stream().map(n -> n * 10)
                .forEach(System.out::println);

        System.out.println("-----------------");

        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        for(int i: arr){
            System.out.println("arr for"+i);
        }

        Arrays.stream(arr).map(a->a*3).forEach(System.out::println);

        System.out.println("-----------------");

        Arrays.stream(arr).forEach(System.out::println);

        System.out.println("-----------------");

        List<Integer>  streamList = IntStream.range(1,10).boxed().collect(Collectors.toList());
        Typed.details(streamList);

    }
}
