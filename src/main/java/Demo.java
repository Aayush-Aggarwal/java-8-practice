import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Demo {
    public static void main(String[] args) {

        Stream<Integer> empty = Stream.empty();
        Stream<String> stringMultiple = Stream.of("Ayush","Aggarwal","amangur","1234567");
        System.out.println(stringMultiple.allMatch(value-> value.length()==7));

        stringMultiple = Stream.of("Ayush","Aggarwal","aman","1234567");
        System.out.println(stringMultiple.anyMatch(value-> value.length()==7));

        stringMultiple = Stream.of("Ayush","Aggarwal","aman","1234567");
        System.out.println(stringMultiple.noneMatch(value-> value.length()==7));

        stringMultiple = Stream.of("Ayush","Aggarwal","aman","1234567");
        Stream<Integer> lengthStream = stringMultiple.map(value -> value.length());
        System.out.println(lengthStream.collect(Collectors.toList()));

        Stream<Integer> listMultiple = Stream.of(1,2,3);
        System.out.println(listMultiple.count());

        stringMultiple = Stream.of("Ayush","Aggarwal","aman","1234567");
        System.out.println(stringMultiple.findAny());

        stringMultiple = Stream.of("Ayush","Aggarwal","aman","1234567");
        System.out.println(stringMultiple.findFirst());

        stringMultiple = Stream.of("Ayush","Aggarwal","aman","1234567");
        stringMultiple.forEach(System.out::println);

        stringMultiple = Stream.of("Ayush","Aggarwal","aman","1234567");
        System.out.println(stringMultiple.max(Comparator.comparing(String::length)));

        stringMultiple = Stream.of("Ayush","Aggarwal","aman","1234567");
        System.out.println(stringMultiple.min(Comparator.comparing(String::length)));

        List<String> lines = Arrays.asList("spring", "node", "mkyong");

        List<String> result = lines.stream()
                .filter(line -> !"mkyong".equals(line))
                .collect(Collectors.toList());
        result.forEach(System.out::println);

        }
}
