import java.util.function.*;

interface NumbersStatic {
    static void add(){
        System.out.println("this is static method");
    }
}
interface CodeRefactorTutorial {
    void codeRef();
}
class a implements CodeRefactorTutorial{
    public void codeRef(){
        System.out.println("hi");
    }
}
public class SuppliesDemo {

    public static  void main(String ... Args){

        Predicate<Integer> predicate=x -> x <5;
        boolean result =predicate.test(3);
        System.out.println("Result"+result);

        Supplier<String> supplier = () -> "hello world";
        String result1=supplier.get();
        System.out.println("Result"+result1);

        UnaryOperator<Integer> unaryOperator = unaryValue -> unaryValue;
        int result2 = unaryOperator.apply(2);
        System.out.println(result2);

        BinaryOperator<Integer> binaryOperator = (value1, value2) -> (value1 - value2);
        System.out.println(binaryOperator.apply(2,9));
        Consumer<String> consumer = System.out::println;
        consumer.accept("Consumer called");

        Function<Integer,Integer> function = (value) -> value+2;
        System.out.println(function.apply(3));

        NumbersStatic.add();

        CodeRefactorTutorial obj=()->System.out.println("hello");

        obj.codeRef();

        CodeRefactorTutorial abc = new a();
        abc.codeRef();

    }
}
