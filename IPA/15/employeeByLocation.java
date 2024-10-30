import java.util.Scanner;

public class employeeByLocation {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); sc.nextLine();
        String[] loc = new String[n];
        String[] emp = new String[n];

        for(int i=0; i<n; i++){
            emp[i] = sc.nextLine();
            loc[i] = sc.nextLine();
        }    
        
        String r = "";

        for(int i=0; i<loc.length; i++){
            if(!r.contains(loc[i]))
                r += loc[i] + " : " + emp[i];

            for(int j=i+1; j<loc.length; j++){
                if(loc[i].equalsIgnoreCase(loc[j])){
                    r += ", " + emp[j];
                }
            }

            r += "\n";
        }

        System.out.println(r);

        sc.close();
    }
}
