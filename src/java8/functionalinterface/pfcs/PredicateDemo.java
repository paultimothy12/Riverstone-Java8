package java8.functionalinterface.pfcs;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        //Predicate<t> takes an input of type t and produces a boolean value based on a condition.

        Predicate<String> predicate = (a) -> a.length() > 10;
        System.out.println(predicate.test("Hello Riverstone"));
        System.out.println(predicate.test("Hello"));

        //Predicate Chaining(2 predicates):

        Predicate<String> endsWithPredicate = (str) -> str.endsWith("ing");
        Predicate<String> sizePredicate = (b) -> b.length() > 5;

        //And
        System.out.println(endsWithPredicate.and(sizePredicate).test("Running"));
        System.out.println(endsWithPredicate.and(sizePredicate).test("Wing"));

        //Or
        System.out.println(endsWithPredicate.or(sizePredicate).test("Running"));
        System.out.println(endsWithPredicate.or(sizePredicate).test("Wing"));

        //Negate
        System.out.println(endsWithPredicate.negate().test("Wing"));
        System.out.println(sizePredicate.negate().test("Running"));

        //BiPredicate is concept of predicate using 2 inputs
        BiPredicate<String,String> equalsPredicate = (a,b)-> a.equals(b);

        System.out.println(equalsPredicate.test("Hello","Hello"));
        System.out.println(equalsPredicate.test("Ye","Yeh"));
    }
}
