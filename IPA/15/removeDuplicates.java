import java.util.Scanner;

public class removeDuplicates {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        boolean[] ascii = new boolean[256];
        String s = sc.nextLine();
        String res = "";

        for(int i=0; i<s.length(); i++){
            if(!ascii[s.charAt(i)]){
                res += s.charAt(i);
                ascii[s.charAt(i)] = true;
            }

            // If " " (space) not has to be count
            // if(s.charAt(i) == ' '){
            //     res += s.charAt(i);
            // }
            // else if(!ascii[s.charAt(i)]){
            //     res += s.charAt(i);
            //     ascii[s.charAt(i)] = true;
            // }
        }

        System.out.println(res);

        sc.close();
    }
}
