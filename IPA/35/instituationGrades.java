import java.util.Scanner;

public class instituationGrades {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Institution[] ins = new Institution[4];
        for(int i=0; i<ins.length; i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt(); sc.nextLine();
            int d = sc.nextInt(); sc.nextLine();
            String e = sc.nextLine();
            
            ins[i] = new Institution(a, b, c, d, e);
        }

        String loc = sc.nextLine();
        int cl = FindNumClearancedByLoc(ins, loc);
        if(cl==0)
            System.out.println("There are no cleared students in this particular location");
        else
            System.out.println(cl);

        String iName = sc.nextLine();
        Institution res = UpdateInstitutionGrade(ins, iName);
        if(res==null)
            System.out.println("No Institute is available with the specified name");
        else
            System.out.println(res.getInstitutionName() +" :: "+ res.getGrade());

        sc.close();
    }

    public static int FindNumClearancedByLoc(Institution[] arr, String s){
        int sum = 0;

        for(Institution i: arr){
            if(i.getLocation().equalsIgnoreCase(s)){
                sum += i.getNoOfStudentsCleared();
            }
        }

        return (sum==0)?0:sum;
    }

    public static Institution UpdateInstitutionGrade(Institution[] arr, String s){
        Institution in = null;

        for(Institution i: arr){
            int j = (i.getNoOfStudentsPlaced()*100)/(i.getNoOfStudentsCleared());

            if(j>=80)
                i.setGrade("A");
            else
                i.setGrade("B");

            if(i.getInstitutionName().equalsIgnoreCase(s))
                in = i;
        }

        return in;
    }
}

class Institution{
    private int institutionId;
    private String institutionName;
    private int noOfStudentsPlaced;
    private int noOfStudentsCleared;
    private String location;
    private String grade;
    
    public Institution(int institutionId, String institutionName, int noOfStudentsPlaced, int noOfStudentsCleared, String location) {
        this.institutionId = institutionId;
        this.institutionName = institutionName;
        this.noOfStudentsPlaced = noOfStudentsPlaced;
        this.noOfStudentsCleared = noOfStudentsCleared;
        this.location = location;
    }

    public int getInstitutionId() {
        return institutionId;
    }

    public void setInstitutionId(int institutionId) {
        this.institutionId = institutionId;
    }

    public String getInstitutionName() {
        return institutionName;
    }

    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }

    public int getNoOfStudentsPlaced() {
        return noOfStudentsPlaced;
    }

    public void setNoOfStudentsPlaced(int noOfStudentsPlaced) {
        this.noOfStudentsPlaced = noOfStudentsPlaced;
    }

    public int getNoOfStudentsCleared() {
        return noOfStudentsCleared;
    }

    public void setNoOfStudentsCleared(int noOfStudentsCleared) {
        this.noOfStudentsCleared = noOfStudentsCleared;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

}