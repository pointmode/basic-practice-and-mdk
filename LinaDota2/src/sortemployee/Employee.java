package sortemployee;

public class Employee {

    private String empName;
    private final String empCompany;
    private final int age;
    private final int salary;

    public Employee()
    {
        this.empName = Arr.arrName();
        this.empCompany = Arr.arrCompany();
        this.age = Age.getRandomAge();
        this.salary = Salary.getRandomSalary();
    }

    @Override
    public String toString()
    {
        return "\nEmployee\n--------" +
                "\nName = " + empName +
                "\nCompany = " + empCompany  +
                "\nAge = " + age +
                "\nSalary = " + salary + "$";
    }
}