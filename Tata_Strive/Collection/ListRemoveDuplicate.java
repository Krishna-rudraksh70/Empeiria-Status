import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

class removeDuplicates {
    public List<Integer> BruteForce(List<Integer> list) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {

            boolean isDup = false;

            for (int j = 0; j < res.size(); j++) {
                if (list.get(i) == res.get(j)) {
                    isDup = true;
                    break;
                }
            }

            if (!isDup)
                res.add(list.get(i));

            isDup = false;
        }

        return res;
    }

    public List<Integer> UsingSet(List<Integer> list) {
        List<Integer> res = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();

        for (int i = 0; i < list.size(); i++) {
            if (!seen.contains(list.get(i))) {
                res.add(list.get(i));
                seen.add(list.get(i));
            }
        }

        return res;
    }

    public List<Integer> nordered(List<Integer> list) {
        Set<Integer> seen = new HashSet<>(list);

        return new ArrayList<>(seen);
    }
    
    public List<Integer> Ordered(List<Integer> list) {
        Set<Integer> seen = new LinkedHashSet<>(list);

        return new ArrayList<>(seen);
    }
}

class ListRemoveDuplicate {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(5);

        removeDuplicates remover = new removeDuplicates();

        List<Integer> bruteForceResult = remover.BruteForce(list);
        System.out.println("BruteForce result: " + bruteForceResult);

        List<Integer> usingSetResult = remover.UsingSet(list);
        System.out.println("UsingSet result: " + usingSetResult);

        List<Integer> norderedResult = remover.nordered(list);
        System.out.println("nordered result: " + norderedResult);

        List<Integer> orderedResult = remover.Ordered(list);
        System.out.println("Ordered result: " + orderedResult);
    }
}