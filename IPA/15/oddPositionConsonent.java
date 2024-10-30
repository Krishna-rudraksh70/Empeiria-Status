import java.util.Scanner;

public class oddPositionConsonent {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        StringBuilder str = new StringBuilder();
        String v = "aAiIeEoOuU";

        s = s.replace(' ', (char) 0);

        for(int i=0; i<s.length(); i++){
            if(!v.contains(Character.toString(s.charAt(i))) && i%2!=0){
                str.append(s.charAt(i));
            }
        }

        System.out.println(str);

        sc.close();
    }
}
