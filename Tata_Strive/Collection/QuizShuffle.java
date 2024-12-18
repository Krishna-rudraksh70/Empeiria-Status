import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Collections;

class Quizz {
    String QId;
    String Question;
    String[] Ans;

    static int count = 0;

    public Quizz(String qId, String question, String[] ans) {
        QId = qId;
        Question = question;
        Ans = ans;
    }

    public String getQId() {
        return QId;
    }

    public void setQId(String qId) {
        QId = qId;
    }

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String question) {
        Question = question;
    }

    public String[] getAns() {
        return Ans;
    }

    public void setAns(String[] ans) {
        Ans = ans;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("QId: ").append(this.getQId()).append("\tQNo: ").append(++count)
                .append("\t\tQuestion: ").append(this.getQuestion()).append("\tAnswers: ");

        QuizShuffle.shuffleOptions(this.getAns());

        for (String s : this.getAns()) {
            sb.append(s).append(" ");
        }

        return sb.toString().trim();
    }

}

public class QuizShuffle {
    public static void main(String[] args) {

        List<Quizz> qz = new ArrayList<>();

        Collections.addAll(qz,
                new Quizz("101", "What is the default value of a boolean variable?",
                        new String[] { "true", "false", "null", "0" }),
                new Quizz("102", "Which of the following is a valid keyword in Java?",
                        new String[] { "interface", "implement", "inherits", "extends" }),
                new Quizz("103", "What does the `static` keyword mean in Java?",
                        new String[] { "The method or variable is global",
                                "The method or variable belongs to the class", "The method or variable is final",
                                "The method or variable cannot be changed" }),
                new Quizz("104", "Which of these data types are used for storing large integer values in Java?",
                        new String[] { "int", "long", "double", "float" }),
                new Quizz("105", "Which method is used to start a thread in Java?",
                        new String[] { "start()", "run()", "execute()", "init()" }),
                new Quizz("106",
                        "What is the output of the following code snippet? `int x = 10; System.out.println(x++);`",
                        new String[] { "10", "11", "0", "Compilation error" }),
                new Quizz("107", "What is the purpose of the `finally` block in Java?",
                        new String[] { "To handle exceptions", "To clean up resources after try block execution",
                                "To throw an exception", "To test code before execution" }),
                new Quizz("108", "Which of the following is not a primitive data type in Java?",
                        new String[] { "char", "int", "String", "float" }),
                new Quizz("109",
                        "Which exception is thrown when a program tries to access an element outside the bounds of an array?",
                        new String[] { "IndexOutOfBoundsException", "ArrayIndexOutOfBoundsException",
                                "NullPointerException", "IllegalArgumentException" }),
                new Quizz("110", "Which access modifier allows a member to be accessible only within its own package?",
                        new String[] { "private", "public", "protected", "default" }));

        Collections.shuffle(qz);

        qz.forEach(q -> System.out.println(q));
    }

    static void shuffleOptions(String[] s) {
        Random r = new Random();
        for (int i = s.length - 1; i > 0; i--) {
            int index = r.nextInt(i + 1);
            String a = s[index];
            s[index] = s[i];
            s[i] = a;
        }
    }
}
