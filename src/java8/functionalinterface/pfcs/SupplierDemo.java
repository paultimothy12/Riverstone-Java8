package java8.functionalinterface.pfcs;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        //Supplier takes no input but returns a value when it's called.
        Supplier<Date> dateSupplier = ()->{
            return new Date();
        };

        System.out.println(dateSupplier.get());

        //No BiSupplier, as supplier never takes an input from the user.
    }
}
