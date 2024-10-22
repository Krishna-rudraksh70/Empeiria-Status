import java.util.Scanner;

public class largestWord {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String[] str = s.split(" ");
        int max = 0;
        
        s = "";

        for(String i:str){
            if(max < i.length()){
                max = i.length();
                s = i;
            }
        }

        System.out.println(s + " size of " + max);

        sc.close();
    }
}
