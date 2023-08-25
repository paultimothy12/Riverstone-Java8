package java8.functionalinterface.pfcs;

import java.util.Locale;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        //Consumer<t> consumes an input of type t and doesn't return any values, it just performs some operation based on user needs.

        Consumer<String> consumer = (s)-> System.out.println(s.toLowerCase());
        consumer.accept("Hello");
        consumer.accept("Riverstone");

        //Consumer chaining(2 consumer):
        Consumer<String> hashCodeConsumer = (x)-> System.out.println(x.hashCode());
        Consumer<String> stringConsumer = (y)-> System.out.println(y.toUpperCase());

        //AndThen
        hashCodeConsumer.andThen(stringConsumer).accept("Hello");
    }
}
