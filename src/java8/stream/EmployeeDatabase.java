package java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeDatabase {

    public static List<Employee> getAllEmpData() {
        return new ArrayList<>(
                Arrays.asList(
                        new Employee(1, "Sammie", 35,23),
                        new Employee(2, "Daniel", 19,25),
                        new Employee(3, "Noelle", 34,23)
                )
        );
    }
}
