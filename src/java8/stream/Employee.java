package java8.stream;

public class Employee {
    int empId;
    String empName;
    int empContact;

    public Employee(int empId, String empName, int empContact) {
        this.empId = empId;
        this.empName = empName;
        this.empContact = empContact;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empContact=" + empContact +
                '}';
    }

    public int getEmpId() {
        return empId;
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

    public long getEmpContact() {
        return empContact;
    }

    public void setEmpContact(int empContact) {
        this.empContact = empContact;
    }
}
