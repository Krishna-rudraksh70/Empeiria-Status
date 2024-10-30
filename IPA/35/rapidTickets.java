import java.util.Arrays;
import java.util.Scanner;

public class rapidTickets {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        RRT[] arr = new RRT[4];
        for(int i=0; i<arr.length; i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt(); sc.nextLine();
            String e = sc.nextLine();

            arr[i] = new RRT(a,b,c,d,e);
        }

        String str = sc.nextLine();

        RRT k = getHighestPriorityTicket(arr, str);
        if(k == null)
            System.out.println("No such ticket");
        else{
            System.out.println(k.getTicketNo());
            System.out.println(k.getRaisedBy());
            System.out.println(k.getAssignedTo());
        }

        sc.close();
    }
    
    public static RRT getHighestPriorityTicket(RRT[] arr, String s){

        RRT r = null;

        Arrays.sort(arr, (d1, d2) -> (d1.getPriority() - d2.getPriority()));

        for(RRT i: arr){
            if(i.getProject().equalsIgnoreCase(s)){
                r = i;
                break;
            }
        }

        if(r == null)
            return null;
        else
            return r;

    }
}

class RRT{

    private int ticketNo;
    private String raisedBy;
    private String assignedTo;
    private int priority;
    private String project;

    public RRT(int ticketNo, String raisedBy, String assignedTo, int priority, String project) {
        this.ticketNo = ticketNo;
        this.raisedBy = raisedBy;
        this.assignedTo = assignedTo;
        this.priority = priority;
        this.project = project;
    }
    public RRT() {
    }
    public int getTicketNo() {
        return ticketNo;
    }
    public void setTicketNo(int ticketNo) {
        this.ticketNo = ticketNo;
    }
    public String getRaisedBy() {
        return raisedBy;
    }
    public void setRaisedBy(String raisedBy) {
        this.raisedBy = raisedBy;
    }
    public String getAssignedTo() {
        return assignedTo;
    }
    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
    }
    public int getPriority() {
        return priority;
    }
    public void setPriority(int priority) {
        this.priority = priority;
    }
    public String getProject() {
        return project;
    }
    public void setProject(String project) {
        this.project = project;
    }
}