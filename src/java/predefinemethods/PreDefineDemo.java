package predefinemethods;

import java.util.function.*;


public class PreDefineDemo {

    public Boolean predicateDemo(){
        Predicate<Integer> predicate = x -> x < 5;
        return predicate.test(3);

    }

    public String supplierDemo(){
        Supplier<String> supplier = () -> "hello world";
        return supplier.get();
    }
    public int unaryOperatorDemo(){

        UnaryOperator<Integer> unaryOperator = unaryValue -> unaryValue;
        return unaryOperator.apply(2);
    }

    public int binaryOperatorDemo(){

        BinaryOperator<Integer> binaryOperator = (value1, value2) -> (value1 - value2);
       return
               binaryOperator.apply(2, 9));
    }
    
    public static void main(String... Args) {





        BinaryOperator<Integer> binaryOperator = (value1, value2) -> (value1 - value2);
        System.out.println(binaryOperator.apply(2, 9));

        Consumer<String> consumer = System.out::println;
        consumer.accept("Consumer called");

        Function<Integer,Integer> function = (value) -> value+2;
        System.out.println(function.apply(3));

    }
}