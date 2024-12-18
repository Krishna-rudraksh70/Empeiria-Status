import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

class firstNonRepeatedCharacter {
    public List<Character> BruteForce(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }

        List<Character> list = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }

            if (count == 1) {
                list.add(ch);
            }
        }
        return list;
    }

    public List<Character> UsingMap(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }

        List<Character> list = new ArrayList<>();

        Map<Character, Integer> charCountMap = new LinkedHashMap<>();

        for (char ch : str.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }
        
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() == 1) {
                list.add(entry.getKey());
            }
        }

        return list;
    }

}

public class ListNonRepeatChar {
    public static void main(String[] args) {

        firstNonRepeatedCharacter nonRepeatedChar = new firstNonRepeatedCharacter();
        
        String str = "swiss";

        List<Character> bruteForceResult = nonRepeatedChar.BruteForce(str);
        System.out.println("BruteForce result: " + bruteForceResult);

        List<Character> mapResult = nonRepeatedChar.UsingMap(str);
        System.out.println("UsingMap result: " + mapResult);
    }
}

