package java8.functionalinterface;

import java.util.concurrent.Callable;

public class ImplClass {
    public static void main(String[] args) {
        //Traditional implementation via anonymous inner class
        InterfaceDemo interfaceDemo = new InterfaceDemo() {
            @Override
            public void concat(String s, String u) {
                System.out.println(s+u);
            }
        };
        interfaceDemo.concat("Hello"," Riverstone");

        //Lambda Expression("->")
        InterfaceDemo lambdaExp = (String s, String u)->{
            System.out.println(s+u);
        };
        lambdaExp.concat("Hello","Riverstone");
        //About:
        //1. Lambda expressions only work with functional interface(a interface with exactly only one abstract method).
        //2. Introduces functional programming in java.
        //3. Also, there are predefined functional interfaces in java like comparator,runnable,callable.
        // They are annotated with @FunctionalInterface to represent they only have one abstract method and not more than one.
        //4. Other useful functional interface are Predicate,Function,Consumer,Supplier.
    }
}
