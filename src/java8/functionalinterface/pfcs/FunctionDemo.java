package java8.functionalinterface.pfcs;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        //Function<u,v> takes an input  of Type u and returns a value of Type v based on a condition.

        Function<String,String> concat = (str)-> {
            return str+" Appending text";
        };

        System.out.println(concat.apply("Hello"));
        System.out.println(concat.apply("Riverstone"));

        //Function Chaining(2 functions)
        Function<Integer,Integer> addFunction =(a)->{
            return a+a;
        };
        Function<Integer,Integer> cubeFunction = (a) ->{
          return a*a*a;
        };

        //AndThen
        System.out.println(addFunction.andThen(cubeFunction).apply(3));
        System.out.println(cubeFunction.andThen(addFunction).apply(3));

        //Or
        System.out.println(addFunction.compose(cubeFunction).apply(3));
        System.out.println(cubeFunction.compose(addFunction).apply(3));

        //BiFunction is a concept of function taking 2 inputs
        BiFunction<Integer,Integer,Integer> addBiFunction =(a,b)->{
            return a+b;
        };

        System.out.println(addBiFunction.apply(10,15));
        System.out.println(addBiFunction.apply(160,197));
    }
}
