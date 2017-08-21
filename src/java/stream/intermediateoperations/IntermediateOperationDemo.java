package stream.intermediateoperations;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class IntermediateOperationDemo {

    public List<String> filterDemo() {
        Stream<String> stringMultiple = Stream.of("Ayush", "Aggarwal", "aman", "1234567");
        return stringMultiple.filter(value -> value.length() == 7).collect(Collectors.toList());

    }

    public List<String> distinctDemo() {
        Stream<String> stringMultiple = Stream.of("Ayush", "Aggarwal", "aman", "1234567");
        return stringMultiple.distinct().collect(Collectors.toList());
    }

    public List<String> skipDemo() {
        Stream<String> stringMultiple = Stream.of("Ayush", "Aggarwal", "aman", "1234567");
        return stringMultiple.skip(1).limit(2).collect(Collectors.toList());
    }

    public List<String> mapDemo() {
        Stream<String> stringMultiple = Stream.of("Ayush", "Aggarwal", "aman", "1234567");
        return stringMultiple.skip(1).limit(2).map(value -> value + " end").collect(Collectors.toList());
    }

    public List<String> flatmapDemo() {

        List<String> zero = Arrays.asList();
        List<String> one = Arrays.asList("Ayu");
        List<String> two = Arrays.asList("hello1", "hello2");
        Stream<List<String>> listStream = Stream.of(zero, one, two);
        return listStream.skip(1).limit(2).flatMap(Collection::stream).collect(Collectors.toList());
    }

    public List<String> sortedDemo() {
        Stream<String> stringMultiple = Stream.of("Ayush", "Aggarwal", "aman", "1234567");
        return stringMultiple.sorted().collect(Collectors.toList());
    }

    public List<String> peekDemo() {
        Stream<String> stringMultiple = Stream.of("Ayush", "Aggarwal", "aman", "1234567");
        return stringMultiple.sorted().collect(Collectors.toList());
    }

        /*System.out.println("peek");
        Stream<String> stringMultiple = Stream.of("Ayush", "Aggarwal", "aman", "1234567");
        stringMultiple.peek(System.out::println).forEach(System.out::println);
*/

}
