import java.util.HashMap;
import java.util.Map;

class StudentNew {
    private String name;
    private int age;

    public StudentNew(String name, int age) {
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
        return "StudentNew{name='" + name + "', age=" + age + "}";
    }
}

public class HashMapStudentMan {
    public static void main(String[] args) {
        Map<Integer, StudentNew> StudentNewMap = new HashMap<>();

        StudentNewMap.put(101, new StudentNew("Alice", 20));
        StudentNewMap.put(102, new StudentNew("Bob", 22));
        StudentNewMap.put(103, new StudentNew("Charlie", 21));

        System.out.println("StudentNew with ID 101: " + StudentNewMap.get(101));
        System.out.println("StudentNew with ID 102: " + StudentNewMap.get(102));
        System.out.println("StudentNew with ID 103: " + StudentNewMap.get(103));

        System.out.println("\nAll StudentNews:");
        for (Map.Entry<Integer, StudentNew> entry : StudentNewMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", " + entry.getValue());
        }

        System.out.println("\nDoes StudentNew with ID 104 exist? " + StudentNewMap.containsKey(104));

        StudentNewMap.remove(102);
        System.out.println("\nAfter removing StudentNew with ID 102:");
        for (Map.Entry<Integer, StudentNew> entry : StudentNewMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", " + entry.getValue());
        }
    }
}
