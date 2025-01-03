package JDK8Features.StreamQ;

import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }
}

class Employee {
    String name;
    String dept;
    int age;
    double salary;

    Employee(String name, String dept) {
        this.name = name;
        this.dept = dept;
    }

    Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }
}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

public class HappyNewYear {

    public static void main(String[] args) {

        List<Integer> input1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> evenNumbers = input1.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evenNumbers);

        List<String> input2 = Arrays.asList("apple", "banana");
        List<String> upperCaseStrings = input2.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(upperCaseStrings);

        List<Integer> input3 = Arrays.asList(5, 15, 25, 3);
        long count = input3.stream()
                .filter(num -> num > 10)
                .count();
        System.out.println(count);

        List<Integer> input4 = Arrays.asList(1, 2, 2, 3, 3, 3);
        List<Integer> uniqueNumbers = input4.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(uniqueNumbers);

        List<Integer> input5 = Arrays.asList(10, 15, 25, 30);
        Optional<Integer> firstMatch = input5.stream()
                .filter(num -> num > 20)
                .findFirst();
        System.out.println(firstMatch.orElse(null));

        List<Integer> input6 = Arrays.asList(3, 9, 1, 7);
        Optional<Integer> max = input6.stream().max(Integer::compareTo);
        Optional<Integer> min = input6.stream().min(Integer::compareTo);
        System.out.println("Max: " + max.orElse(null));
        System.out.println("Min: " + min.orElse(null));

        List<Student> students = Arrays.asList(new Student("Alice", 85), new Student("Bob", 72));
        List<Student> sortedStudents = students.stream()
                .sorted(Comparator.comparingInt(Student::getMarks))
                .collect(Collectors.toList());
        sortedStudents.forEach(student -> System.out.println(student.getName() + ": " + student.getMarks()));

        List<Employee> employees1 = Arrays.asList(new Employee("Alice", "HR"), new Employee("Bob", "IT"));
        Map<String, List<Employee>> groupedByDept = employees1.stream()
                .collect(Collectors.groupingBy(Employee::getDept));
        groupedByDept.forEach((dept, emps) -> {
            System.out.println(dept + ": " + emps.stream().map(Employee::getName).collect(Collectors.joining(", ")));
        });

        List<Integer> input9 = Arrays.asList(1, 2, 3);
        int sum = input9.stream().mapToInt(Integer::intValue).sum();
        double average = input9.stream().mapToInt(Integer::intValue).average().orElse(0);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

        List<Person> people = Arrays.asList(new Person("John", 20), new Person("Doe", 15));
        Map<Boolean, List<Person>> partitioned = people.stream()
                .collect(Collectors.partitioningBy(person -> person.getAge() >= 18));
        partitioned.forEach((isAdult, persons) -> {
            String group = isAdult ? "adults" : "minors";
            System.out.println(group + ": " + persons.stream().map(Person::getName).collect(Collectors.joining(", ")));
        });

        List<String> input11 = Arrays.asList("Alice", "Bob");
        String result = input11.stream()
                .collect(Collectors.joining(", "));
        System.out.println(result);

        List<Integer> input12 = Arrays.asList(90, 85, 78, 88, 92);
        List<Integer> top3 = input12.stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(top3);

        List<List<Integer>> input13 = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4));
        List<Integer> flattened = input13.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println(flattened);

        List<Integer> input14 = Arrays.asList(1, 2, 2, 3);
        Map<Integer, Long> frequency = input14.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        frequency.forEach((num, freq) -> System.out.println(num + ": " + freq));

        List<Integer> input15 = Arrays.asList(1, 2, 3, -1);
        boolean allPositive = input15.stream().allMatch(num -> num > 0);
        System.out.println(allPositive);

        List<Employee> employees2 = Arrays.asList(new Employee("Alice", 25), new Employee("Bob", 30));
        List<String> names = employees2.stream()
                .map(Employee::getName)
                .collect(Collectors.toList());
        System.out.println(names);

        List<Integer> randomNumbers = new Random().ints()
                .limit(5)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(randomNumbers);

        List<Product> products = Arrays.asList(new Product("A", 40), new Product("B", 60));
        List<Product> filteredProducts = products.stream()
                .filter(product -> product.getPrice() < 50)
                .collect(Collectors.toList());
        filteredProducts.forEach(product -> System.out.println(product.getName() + ": " + product.getPrice()));

        List<String> input19 = Arrays.asList("apple", "banana", "kiwi");
        Optional<String> longest = input19.stream()
                .max(Comparator.comparingInt(String::length));
        System.out.println(longest.orElse(null));

        List<Employee> employees3 = Arrays.asList(new Employee("A", 28, 60000), new Employee("B", 35, 45000));
        List<Employee> filteredEmployees = employees3.stream()
                .filter(emp -> emp.getSalary() > 50000 && emp.getAge() < 30)
                .collect(Collectors.toList());
        filteredEmployees
                .forEach(emp -> System.out.println(emp.getName() + ": " + emp.getAge() + ", " + emp.getSalary()));
    }

}