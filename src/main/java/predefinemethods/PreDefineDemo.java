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
       return binaryOperator.apply(2, 9);
    }

   /* public void consumerDemo(){

        Consumer<String> consumer = x -> System.out.println(x);
        consumer.accept("Consumer called");
    }
*/
    public int functionDemo(){
        Function<Integer,Integer> function = (value) -> value+2;
        return function.apply(3);
    }


}