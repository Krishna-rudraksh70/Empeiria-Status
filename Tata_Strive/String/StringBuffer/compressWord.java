import java.util.Scanner;

public class compressWord {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        

        StringBuilder s = new StringBuilder();
        String str = sc.nextLine();
        int count=1, i=1;
        
        for(i=1; i<str.length(); i++){
            if((str.charAt(i-1) != str.charAt(i))){
                s.append(str.charAt(i-1));
                s.append(count);
                count = 0;
            }
            
            count++;
        }

        s.append(str.charAt(i-1));
        s.append(count);

        System.out.println(s.toString());

        sc.close();
    }
}
