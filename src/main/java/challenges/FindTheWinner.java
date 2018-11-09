package challenges;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindTheWinner {

    public static String winner(List<Integer> andrea, List<Integer> maria, String s) {
        // Write your code here

    }

    @Test
    public void testFindTheWinner() {

        List<Integer> andrea = new ArrayList<Integer>();
        andrea.add(1);
        andrea.add(2);
        andrea.add(3);

        List<Integer> maria = new ArrayList<Integer>();
        andrea.add(2);
        andrea.add(1);
        andrea.add(3);

        assertEquals("Maria", winner(andrea, maria, "Even"));
    }
}
