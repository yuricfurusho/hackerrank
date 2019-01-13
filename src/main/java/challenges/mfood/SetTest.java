package challenges.mfood;

import java.util.*;

public class SetTest {
    public static void main(String[] args) {
        Set<Integer> hash_Set = new HashSet<>();
        hash_Set.add(1);
        hash_Set.add(2);
        hash_Set.add(9);
        hash_Set.add(1);
        hash_Set.add(2);
        hash_Set.add(3);
        hash_Set.add(1);
        hash_Set.add(4);
        hash_Set.add(1);
        hash_Set.add(5);
        hash_Set.add(7);
        System.out.print("Set output without the duplicates");

        System.out.println(hash_Set);

        List arrayList = new ArrayList(hash_Set);
        Collections.sort(arrayList);

        System.out.println(arrayList);
        Collections.reverse(arrayList);
        System.out.println(arrayList);

    }
}
