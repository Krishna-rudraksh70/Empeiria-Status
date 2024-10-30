import java.util.Scanner;

public class chnRevrese {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        char[] ch = s.toCharArray();

        s = "";

        for(int i=0; i<ch.length; i++){
            if((ch[i]=='C' || ch[i]=='c') && (ch[i+1]=='H' || ch[i+1]=='h') && (ch[i+2]=='N' || ch[i+2]=='n')){
                i += 3;
                
                for(int j=ch.length-1; j>=i; j--){
                    s += ch[j];
                }

                break;
            }
            else{
                s += ch[i];
            }
                
        }  
        
        System.out.println(s);

        sc.close();
    }
}
