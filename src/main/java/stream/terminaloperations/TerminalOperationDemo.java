package stream.terminaloperations;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class TerminalOperationDemo {

    public boolean allMatchDemo(){
        Stream<Integer> empty = Stream.empty();
        Stream<String> stringMultiple = Stream.of("Ayush", "Aggarwal", "amangur", "1234567");
        return stringMultiple.allMatch(value -> value.length() == 7);

    }
    public boolean anyMatchDemo(){
        Stream<String> stringMultiple = Stream.of("Ayush", "Aggarwal", "aman", "1234567");
        return stringMultiple.anyMatch(value -> value.length() == 7);
    }

    public boolean noneMatchDemo(){
       Stream<String> stringMultiple = Stream.of("Ayush", "Aggarwal", "aman", "1234567");
        return stringMultiple.noneMatch(value -> value.length() == 7);
    }
    public Long countDemo(){

        Stream<Integer> listMultiple = Stream.of(1, 2, 3);
        return listMultiple.count();

    }
    public Optional<String> findFirstDemo(){
        Stream<String>  stringMultiple = Stream.of("Ayush", "Aggarwal", "aman", "1234567");
        return stringMultiple.findFirst();
    }

    public Optional<String> maxDemo(){
        Stream<String> stringMultiple = Stream.of("Ayush", "Aggarwal", "aman", "1234567");
        return stringMultiple.max(Comparator.comparing(String::length));
    }

    public Optional<String> minDemo(){
        Stream<String>  stringMultiple = Stream.of("Ayush", "Aggarwal", "aman", "1234567");
        return stringMultiple.min(Comparator.comparing(String::length));

    }

}
