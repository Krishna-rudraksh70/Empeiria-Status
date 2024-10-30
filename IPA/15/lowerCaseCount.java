import java.util.Scanner;

public class lowerCaseCount
{
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int count = 0;

        for(int i=0; i<s.length(); i++){
            if(Character.isLowerCase(s.charAt(i))){
                count++;
            }
        }

        System.out.println(count);
        
        sc.close();
	}
}