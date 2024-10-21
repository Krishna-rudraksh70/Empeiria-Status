import java.util.Scanner;

public class lowerCaseCount
{
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int count = 0;

        char[] ch = s.toCharArray();

        for(int i=0; i<ch.length; i++){
            if(Character.isLowerCase(ch[i])){
                count++;
            }
        }

        System.out.println(count);
        
        sc.close();
	}
}