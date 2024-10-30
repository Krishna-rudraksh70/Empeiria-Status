import java.util.Scanner;

public class longestNonReapeatedSubstring {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String r = "", max="";

        for(int i=0; i<s.length(); i++){
            if(!r.contains(Character.toString(s.charAt(i)))){
                r += s.charAt(i);
            }
            else{
                r = Character.toString(s.charAt(i));
            }

            if(r.length() > max.length())
                max = r;
        }

        System.out.println(max);
        sc.close();
    }
}
