package practice.interviewprep.warmup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SockMerchant {

    static int sockMerchant(int n, int[] ar) {
        int pairsSum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (ar[i] == ar[j]) {
                    ar[i] = i * -1;
                    ar[j] = j * -1;
                    pairsSum++;
                }
            }
        }
        return pairsSum;
    }

    @Test
    public void testSockMerchant() {
        assertEquals(3, sockMerchant(9, new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20}));
        assertEquals(4, sockMerchant(10, new int[]{1, 1, 3, 1, 2, 1, 3, 3, 3, 3}));
    }
}
