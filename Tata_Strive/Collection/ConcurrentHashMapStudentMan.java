import java.util.concurrent.ConcurrentHashMap;

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

public class ConcurrentHashMapStudentMan {
    public static void main(String[] args) {

        ConcurrentHashMap<Integer, Student> studentMap = new ConcurrentHashMap<>();

        studentMap.put(1, new Student("Alice", 20));
        studentMap.put(2, new Student("Bob", 22));
        studentMap.put(3, new Student("Charlie", 21));

        int searchId = 2;
        Student student = studentMap.get(searchId);
        if (student != null) {
            System.out.println("Student with ID " + searchId + ": " + student);
        } else {
            System.out.println("Student with ID " + searchId + " not found.");
        }

        studentMap.remove(2);

        studentMap.forEach((id, s) -> System.out.println("ID: " + id + ", Student: " + s));
    }
}
