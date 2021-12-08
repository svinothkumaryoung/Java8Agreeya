import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Predicate;

/*
Consumer-> Represents an
operation that accepts a single input argument and returns no result

Consumer have two methods
1.accept(Abstract Method)
2.andThen(Default Method)

 */
public class ConsumerBasics {
    Predicate
    static Consumer<String> consumer=(n)->
    {
        System.out.println(n);
    };
    static Consumer<String> consumer1=n1->
    {
        String name=n1.toUpperCase();
        System.out.println(" "+ name);
    };

    public static void main(String[] args) {
        consumer.andThen(consumer1).accept("Welcome to Java8 World");
    }
}
