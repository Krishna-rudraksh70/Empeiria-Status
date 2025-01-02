// 7. 
// interface Innertemp {
//     int sum(int a, int b);
//     int sum(int a, int b, int c); 
// }

// public class temp{
//     public static void main(String[] args) {
//         Innertemp a = (s1, s2) -> s1+s2;
//         Innertemp b = (s1, s2, s3) -> s1+s2+s3; //need functional interface
//         System.out.println(a.sum(4, 5));
//         System.out.println(b.sum(5, 6, 7));
//     }
// }

// 6.
// class t implements Runnable{

//     @Override
//     public void run() {
//         System.out.println("Unimplemented method 'run'");
//     }

// }

// public class temp{
//     public static void main(String[] args) {
//         t T = new t();
//         t.run();
//     }
// }


// 5.
// public class temp{
//     public static void main(String[] args) {
//         int a = 10;
//         Integer i = new Integer(a);
//         System.out.println(i);
//     }
// }

// 4.
// import java.util.Arrays;
// import java.util.HashSet;
// import java.util.LinkedList;
// import java.util.List;
// import java.util.Random;
// import java.util.Set;

// public class temp {
//     public static void main(String[] args) {
//         List<String> possibleNames = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve", "Frank", "Grace", "Hannah", "Ian", "Jack");

//         LinkedList<String> studentList = new LinkedList<>();

//         Set<String> addedNames = new HashSet<>();

//         Random random = new Random();

//         int numOfStudents = 5;

//         while (studentList.size() < numOfStudents) {
//             int index = random.nextInt(possibleNames.size());

//             String name = possibleNames.get(index);

//             if (!addedNames.contains(name)) {
//                 studentList.add(name);
//                 addedNames.add(name);
//             }
//         }

//         System.out.println("List of Students: " + studentList);
//     }
// }


// 3.
// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.List;

// class overload{
//     public static <T> void fill(List<T> list, T obj, int start, int end) {
//         int size = list.size();

//         if (start<end && end<=size) {
//             for (int i=start; i<end; i++)
//                 list.set(i, obj);
//         }
//     }
// }
// class temp{
//     public static void main(String[] args) {
//         List<Integer> al = new ArrayList<>();

//         Collections.addAll(al, 15, 32, 23, 35, 43);
//         System.out.println(al);
        
//         overload.fill(al, 10, 2, 5);
//         System.out.println(al);
//     }
// }

// 1.
// import java.util.ArrayList;
// import java.util.List;

// class Animal {}
// class Dog extends Animal {}
// class Num extends Animal {}
// class Cat extends Animal {} 
// class Noon extends Num {}

// public class temp {
//     public static void main(String[] args) {
//     //     List<? super Num> list1 = new ArrayList<Num>();      // Valid, List of Num
//     //     List<? super Num> list2 = new ArrayList<Animal>();   // Valid, List of Animal (superclass of Num)
//     //     List<? super Num> list3 = new ArrayList<Object>();   // Valid, List of Object (superclass of all)
        
//     //     // List<? super Num> list4 = new ArrayList<Dog>();    // Invalid! Dog is not a superclass of Num

//     //     // This line has an issue
//     //     List<? extends Num> list5 = new ArrayList<Noon>(); // Valid, but let's clarify why
//     // Object[] arr = {1, "abc", 23.5};

//     }
// }

// 2.
// public class temp{
//     public static void main(String[] args) {
//     // for(Object i : arr){
//     //     System.out.println(i);
//     // }

//     // for(int i=0; i<arr.length; i++){
//     //     System.out.println(arr[i]);
//     // }
//     }
// }