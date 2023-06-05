package tms.karpovich.lesson16Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamEx {
    public static void main(String[] args) {
//        MyBestInterface intStr = str -> str.substring(0,2);
//        intStr.test("a");

        List<Integer> testValues = Arrays.asList(1, 2, 3, 4, 5);
        Map<Integer, Long> result = testValues.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(testValues);


        List<User> users = Arrays.asList(new User(20, "Nick"),new User(25, "Mike"),new User(30, "Ada"),new User(35, "Violetta"));
        Map<Integer, List<User>> usersByAge = users.stream().collect(Collectors.groupingBy(User::getAge));
        System.out.println(" users by age" + usersByAge);

        var employees = Arrays.asList(new Employee("Worker", 200), new Employee("Worker", 300), new Employee("Manager", 1000), new Employee("Manager", 1100));
        var averageSalary = employees.stream().mapToDouble(Employee::getSalary).average().getAsDouble();
        System.out.println(averageSalary);

        var employeesByCategory = employees.stream().collect(Collectors.groupingBy(Employee::getCategory));
        var salariesByCategory = employees.stream().collect(Collectors.groupingBy(Employee::getCategory, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println("salaries by category" + salariesByCategory);
        var minSalariesByCategory = employees.stream().collect(Collectors.groupingBy(Employee::getCategory, Collectors.minBy(Comparator.comparingDouble(Employee::getSalary))));
        System.out.println("min salaries by category" + minSalariesByCategory);
        Map<Employee, String> tests = employees.stream().collect(Collectors.toMap(Function.identity(), Employee::getCategory));
        System.out.println("tests" + employeesByCategory);
    }
}
