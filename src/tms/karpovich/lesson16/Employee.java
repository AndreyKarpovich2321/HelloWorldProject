package tms.karpovich.lesson16;

public class Employee {
    private String category;
    private double salary;

    public Employee(String category, double salary) {
        this.category = category;
        this.salary = salary;
    }

    public String getCategory() {
        return category;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "category='" + category + '\'' +
                ", salary=" + salary +
                '}';
    }
}
