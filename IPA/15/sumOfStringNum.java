import java.util.Scanner;

public class sumOfStringNum {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int sum=0, num=0;

        for(int i=0; i<s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                num = (num*10)+Integer.parseInt(String.valueOf(s.charAt(i)));
            }
            else{
                sum += num;
                num = 0;
            }
        }

        System.out.println(sum+num);

        sc.close();
    }
}
