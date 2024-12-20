import java.util.HashMap;
import java.util.Map;

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }
}

public class HashMapStudentMan {
    public static void main(String[] args) {
        Map<Integer, Student> studentMap = new HashMap<>();

        studentMap.put(101, new Student("Alice", 20));
        studentMap.put(102, new Student("Bob", 22));
        studentMap.put(103, new Student("Charlie", 21));

        System.out.println("Student with ID 101: " + studentMap.get(101));
        System.out.println("Student with ID 102: " + studentMap.get(102));
        System.out.println("Student with ID 103: " + studentMap.get(103));

        System.out.println("\nAll Students:");
        for (Map.Entry<Integer, Student> entry : studentMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", " + entry.getValue());
        }

        System.out.println("\nDoes student with ID 104 exist? " + studentMap.containsKey(104));

        studentMap.remove(102);
        System.out.println("\nAfter removing student with ID 102:");
        for (Map.Entry<Integer, Student> entry : studentMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", " + entry.getValue());
        }
    }
}
