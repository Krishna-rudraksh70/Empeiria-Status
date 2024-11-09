import java.util.Scanner;
import java.util.Arrays;

public class foundStudent{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Student[] st = new Student[4];
        for(int i=0; i<st.length; i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            char d = sc.nextLine().charAt(0);
            String e = sc.nextLine();

            st[i] = new Student(a, b, c, d, e);
        }

        char g = sc.nextLine().charAt(0);
        int m = sc.nextInt(); sc.nextLine();

        Student[] res = findStudentByGradeAndMonth(st, g, m);
        if(res == null)
            System.out.println("No student found");
        else{
            for(Student i: res)
                System.out.println(i.getRollN0() + " " + i.getName() + " " + i.getSubject() + " " + i.getGrade() + " " + i.getDate());
            
            System.out.println(res.length);
        }

        sc.close();
    }

    public static Student[] findStudentByGradeAndMonth(Student[] arr, char g, int m){
        Student[] r = new Student[0];

        int mon = 0;
        
        for(Student i: arr){
            mon = Integer.parseInt(String.valueOf(i.getDate().substring(3, 5)));

            if(mon==m && i.getGrade()==g){
                r = Arrays.copyOf(r, r.length+1);
                r[r.length-1] = i;
            }
        }
        
        return (r.length<1)?null:r;
    }
}

class Student{
    private int rollN0;
    private String name;
    private String subject;
    private char grade;
    private String date;
       
    public Student(int rollN0, String name, String subject, char grade, String date) {
        this.rollN0 = rollN0;
        this.name = name;
        this.subject = subject;
        this.grade = grade;
        this.date = date;
    }

    public int getRollN0() {
        return rollN0;
    }
    public void setRollN0(int rollN0) {
        this.rollN0 = rollN0;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public char getGrade() {
        return grade;
    }
    public void setGrade(char grade) {
        this.grade = grade;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }    
}

/*Create a class Student with below attributes:

rollNo - int
name - String
subject - String
grade - char
date - String [DD/MM/YYYY]



The above attributes should be private.Write Getter and Setter and parametrized constructor as required.


Create class Solution with main method.
****************************************************************************
Implement one static method: findStudentByGradeAndMonth Solution Class.


findStudentByGradeAndMonth Method:

This method will take an array of Student objects, char value as grade and int value as month 
for input parameters.The method will find out all Students from the given grade and month. 
This method will return array of Student object assending based on their rollNo if found. 
If there is no Student that matches then the method should return null.

for this method- main method should print Student name, subject and total student found [The 
length of the list], if the returned value is not null. If the returned value is null then 
main method should print "No student found".


NOTE:
	1. For Taking char as input use sc.nextLine().charAt(0)
	2. To match/check the month You havee to convert int month in the parameter to String.
	3. No need to count the Student array if return not null just print the array length.


****************************************************************************



Consider the below input and output:


input1:

111
Arijit
Math
B
22/09/2023
101
Priyanka
English
A
30/03/2022
107
Shreosi
History
C
13/05/2022
105
Tatan
Physics
A
27/03/2022
A
3


output1:

Priyanka
English
Tatan
Physics
2





input2:

111
Sohel
Math
B
22/09/2022
101
Priyanka
English
A
30/03/2022
107
Gopa
History
C
12/05/2022
105
Kamal
Physics
A
27/03/2022
A
7



output 2:

No student found

*/