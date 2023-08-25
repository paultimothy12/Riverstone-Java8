package java8.optional;

import java.util.Date;
import java.util.Optional;

public class OptionalDemo {
    public static String getData(){
        return null;
    }
    public static Optional<String> getOptionalData(){
        return Optional.empty();
    }
    public static void main(String[] args) {
        //Sometimes a returning value from a database or a method could be null,
        //to avoid getting NullPointerException, we wrap the data inside an Optional Container and send it to user.

//        System.out.println(getData().toUpperCase()); //throws NullPointerException

        if(getOptionalData().isPresent()){  //Only if data is present in the Optional container object.
            System.out.println(getOptionalData().get().toUpperCase());
        }

        //Wrapping:
        //Optional.of(value)
        //Optional.ofNullable(value or null)
        //Optional.empty(No Value Present)

        //if a non-null value is present, it returns the value or returns a default value
        System.out.println(getOptionalData().orElse("Default"));
        //if a non-null value is present, it returns the value or returns a default value
        System.out.println(getOptionalData().orElseGet(()->{
            return String.valueOf(new Date());
        }));
    }
}
