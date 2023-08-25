package java8.stream;

import java.util.Objects;

public class Employee {
    int empId;
    String empName;
    int empContact;
    int age;

    public Employee(int empId, String empName, int empContact, int age) {
        this.empId = empId;
        this.empName = empName;
        this.empContact = empContact;
        this.age = age;
    }

    public int getEmpId() {
        return empId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(empName, employee.empName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empName, age);
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpContact() {
        return empContact;
    }

    public void setEmpContact(int empContact) {
        this.empContact = empContact;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empContact=" + empContact +
                ", age=" + age +
                '}';
    }
}
