import java.util.Scanner;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Player[] arr = new Player[4];
        
        for(int i=0; i<4; i++){
            int a = sc.nextInt();
            sc.nextLine(); // To consume the newline character
            String b = sc.nextLine();
            int c = sc.nextInt();
            sc.nextLine(); // To consume the newline character
            String d = sc.nextLine();
            String e = sc.nextLine();
            arr[i] = new Player(a, b, c, d, e);
        }

        String s1 = sc.nextLine();
        int r = findPlayerWithLowestRuns(arr, s1);
        if(r > 0) 
            System.out.println(r); 
        else 
            System.out.println("No Such player");

        String s2 = sc.nextLine();
        Player[] p = findPlayerByMatchType(arr, s2);
        if(p == null){
            System.out.println("No Player with given matchType");
        } else{
            Arrays.sort(p, (d1, d2) -> (d2.getPlayerId() - d1.getPlayerId()));
            for(Player player : p){
                System.out.println(player.getPlayerId());
            }
        }
        sc.close();
    }

    public static int findPlayerWithLowestRuns(Player[] arr, String s){
        int min = Integer.MAX_VALUE;
        boolean found = false;
        
        for(Player i: arr){
            if(i.getPlayerType().equalsIgnoreCase(s) && i.getRuns() < min){
                min = i.getRuns();
                found = true;
            }
        }

        return found ? min : 0;
    }

    public static Player[] findPlayerByMatchType(Player[] arr, String s) {
        Player[] p = new Player[0];
        for (Player i : arr) {
            if (i.getMatchType().equalsIgnoreCase(s)) {
                p = Arrays.copyOf(p, p.length + 1);
                p[p.length - 1] = i;
            }
        }

        return p.length == 0 ? null : p;
    }
}

class Player {
    private int playerId;
    private String playerName;
    private int runs;
    private String playerType;
    private String matchType;

    public Player(int playerId, String playerName, int runs, String playerType, String matchType) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.runs = runs;
        this.playerType = playerType;
        this.matchType = matchType;
    }

    public int getPlayerId() {
        return this.playerId;
    }

    public int getRuns() {
        return this.runs;
    }

    public String getPlayerType() {
        return this.playerType;
    }

    public String getMatchType() {
        return this.matchType;
    }
}
