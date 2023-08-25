package java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        //We can convert any values into stream(sequence of values like a pipeline).
//        Stream.of(1,"2",'H',true).forEach(System.out::println);

        //We can also store them in a collection variable, if we want.
        List anyList = Stream.of(1, "2", 'H', true).collect(Collectors.toList());
//        System.out.println(anyList);

        Set<Integer> integerSet = Stream.of(1, 2, 3, 4, 5, 6, 7).collect(Collectors.toSet());
//        System.out.println(integerSet);

        //We can also convert an array into stream
        int[] array = {1, 2, 3, 4, 5};
        Set<Integer> integerArraySet = Arrays.stream(array).boxed().collect(Collectors.toSet());
//        System.out.println(integerArraySet);

        //Features
        List<Integer> integerList = Arrays.asList(11, 20, 13, 44, 44, 20, 16, 5);

        //1.map() - accepts a Function and applies each value to the function and produces a new stream of values.
//        integerList.stream().map(i->i+i).forEach(System.out::println);

        //2.filter() - accepts a Predicate and checks the condition on each value
//        integerList.stream().filter(i->i>11).forEach(System.out::println);

        //3.sorting() - sorting the given collection
//        integerList.stream().sorted().forEach(System.out::println);
//        integerList.stream().sorted((a,b)->b.compareTo(a)).forEach(System.out::println);

        //4.distinct() - removes duplicate
//        integerList.stream().distinct().forEach(System.out::println);

        //5.count() - number of elements in the stream
        long count = Stream.of(1, "2", 'H', true).count();
//        System.out.println(count);

        //6.skip() - skip first n elements
//        integerList.stream().skip(3).forEach(System.out::println);

        //7.limit() - skips elements after n elements
//        integerList.stream().limit(3).forEach(System.out::println);

        //8.max() - takes a comparator like (a,b)-> a.compareTo(b)
        int max = integerList.stream().max((a, b) -> a.compareTo(b)).get();
//        System.out.println(max);

        //9.min() - takes a comparator like (a,b)-> a.compareTo(b)
        int min = integerList.stream().min((a, b) -> a.compareTo(b)).get();
//        System.out.println(min);

        //10.peek() - used for debugging purpose - to view the elements coming out of the stream
//        Set<Integer> integerSet1 = integerList.stream().filter(i->i>13).peek(System.out::println).map(i->i*i).peek(System.out::println).collect(Collectors.toSet());
//        System.out.println(integerSet1);

        //11.reduce() - combine all elements of the stream and produce a single value
        // 0 + a + b, where 0 is the initial value.
//        int sum = integerList.stream().reduce(0,(a,b)->a+b);
//        System.out.println(sum);

        //12.toArray() - converts the stream into OBJECT!!! array
//        Object[] objArray = integerList.stream().toArray();
//        for (Object obj :
//                objArray) {
//            System.out.println(obj);
//        }

        //13.findFirst() - takes a predicate and return back the first matching value
        Employee employee1 = EmployeeDatabase.getAllEmpData().stream()
                .filter(employee -> employee.getEmpName().contains("el")).findFirst().get();
        System.out.println(employee1);

        //14.findAny() - takes a predicate and return an object which matches but mostly returns the first Object which matches the condition
        Employee employee2 = EmployeeDatabase.getAllEmpData().parallelStream()
                .filter(employee -> employee.getEmpName().contains("el")).findAny().get();
        System.out.println(employee2);

        //15.anyMatch() - returns a boolean when finding a matching an element
        boolean anyMatch = EmployeeDatabase.getAllEmpData().stream().anyMatch(employee -> employee.getEmpName().contains("ni"));
        System.out.println(anyMatch);

        //16.allMatch() - returns a boolean when the predicate matches all the elements
        boolean allMatch = EmployeeDatabase.getAllEmpData().stream().allMatch(employee -> employee.getEmpName().contains("ie"));
        System.out.println(allMatch);

        //16.noMatch() - returns a boolean when the predicate matches nothing out of all the elements
        boolean noMatch = EmployeeDatabase.getAllEmpData().stream().noneMatch(employee -> employee.getEmpName().contains("po"));
        System.out.println(noMatch);
    }
}
