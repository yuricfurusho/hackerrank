package practice.interviewprep.warmup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountingValleys {


    static int countingValleys(int n, String s) {
        int valleysSum = 0;
        int altitude = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'D') altitude--;
            if (s.charAt(i) == 'U') altitude++;
            if (altitude == 0 && s.charAt(i) == 'U') valleysSum++;
        }
        return valleysSum;
    }

    @Test
    public void testCountingValleys() {
        assertEquals(1, countingValleys(8, "DDUUUUDD"));
        assertEquals(1, countingValleys(4, "DDUU"));
        assertEquals(1, countingValleys(8, "UDDDUDUU"));
        assertEquals(2, countingValleys(12, "DDUUDDUDUUUD"));
    }

}
