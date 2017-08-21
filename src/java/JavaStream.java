import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class JavaStream {

    Stream<Integer> empty = Stream.empty();
    Stream<Integer> single = Stream.of();
    Stream<Integer> multiple = Stream.of(1,2,4);

    List<String> list = Arrays.asList("a","b","c");
    Stream<String> fromList = list.stream();

    int[] array = {1,2,3,4,5};




}
