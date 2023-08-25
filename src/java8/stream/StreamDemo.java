package java8.stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        //We can convert any values into stream(sequence of values like a pipeline).
        Stream.of(1,"2",'H',true).forEach(System.out::println);

        //We can also store them in a collection variable, if we want.
    }
}
