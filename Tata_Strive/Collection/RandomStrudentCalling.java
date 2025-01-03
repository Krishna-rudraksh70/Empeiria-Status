import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;

class StudentNew1 {
    private int rollNo;
    private String name;

    public StudentNew1(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Roll No: " + rollNo + ", Name: " + name;
    }
}

public class RandomStrudentCalling {
    public static void main(String[] args) {
        List<String> Names = Arrays.asList("Alice", "Bob", "Charlie", "Alice", "Bob", "Alice",
                "David", "Eve", "Frank", "Grace", "Heidi", "Ivan",
                "Jack", "Kathy", "Leo", "Mallory", "Nina", "Oscar",
                "Paul", "Quincy", "Rita", "Sam", "Tom", "Uma", "Vera",
                "Wendy", "Xander", "Yara", "Zane", "Alice", "Bob",
                "Charlie", "David", "Eve", "Frank", "Grace", "Heidi",
                "Ivan", "Jack", "Kathy", "Leo", "Mallory", "Nina",
                "Oscar", "Paul", "Quincy", "Rita", "Sam", "Tom", "Uma", "Alice", "Bob", "Charlie", "Alice", "Bob",
                "Alice",
                "David", "Eve", "Frank", "Grace", "Heidi", "Ivan",
                "Jack", "Kathy", "Leo", "Mallory", "Nina", "Oscar",
                "Paul", "Quincy", "Rita", "Sam", "Tom", "Uma", "Vera",
                "Wendy", "Xander", "Yara", "Zane", "Alice", "Bob",
                "Charlie", "David", "Eve", "Frank", "Grace", "Heidi",
                "Ivan", "Jack", "Kathy", "Leo", "Mallory", "Nina",
                "Oscar", "Paul", "Quincy", "Rita", "Sam", "Tom", "Uma", "Alice", "Bob", "Charlie", "Alice", "Bob",
                "Alice",
                "David", "Eve", "Frank", "Grace", "Heidi", "Ivan",
                "Jack", "Kathy", "Leo", "Mallory", "Nina", "Oscar",
                "Paul", "Quincy", "Rita", "Sam", "Tom", "Uma", "Vera",
                "Wendy", "Xander", "Yara", "Zane", "Alice", "Bob",
                "Charlie", "David", "Eve", "Frank", "Grace", "Heidi",
                "Ivan", "Jack", "Kathy", "Leo", "Mallory", "Nina",
                "Oscar", "Paul", "Quincy", "Rita", "Sam", "Tom", "Uma");

        LinkedList<String> StudentNew1List1 = new LinkedList<>();

        Set<String> SNames = new HashSet<>();

        Random random = new Random();

        int n1 = 5;

        while (StudentNew1List1.size() < n1) {
            int index = random.nextInt(Names.size());

            String name = Names.get(index);

            if (!SNames.contains(name)) {
                StudentNew1List1.add(name);
                SNames.add(name);
            }
        }

        System.out.println("List of StudentNew1s: " + StudentNew1List1);

        LinkedList<StudentNew1> StudentNew1List2 = new LinkedList<>();

        Set<String> ANames = new HashSet<>();

        int n2 = 5;

        while (StudentNew1List2.size() < n2) {
            int index = random.nextInt(Names.size());

            String name = Names.get(index);

            if (!ANames.contains(name)) {
                int rollNo = random.nextInt(1000) + 1;

                StudentNew1 StudentNew1 = new StudentNew1(rollNo, name);
                StudentNew1List2.add(StudentNew1);

                ANames.add(name);
            }
        }

        System.out.println("List of StudentNew1s:");
        for (StudentNew1 StudentNew1 : StudentNew1List2) {
            System.out.println(StudentNew1);
        }
    }
}