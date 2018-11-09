package practice.interviewprep.warmup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JumpingOnTheClouds {

    public static final int DOUBLE_JUMP = 2;
    public static final int SINGLE_JUMP = 1;

    static int jumpingOnClouds(int[] c) {
        int minimumJumps = 0;
        int currentCloudIndex = 0;
        while (currentCloudIndex != c.length - 1) {
            int doubleJumpPreviewIndex = currentCloudIndex + DOUBLE_JUMP;
            int singleJumpPreviewIndex = currentCloudIndex + SINGLE_JUMP;
            boolean doubleJumpGoesToCumulus = doubleJumpPreviewIndex < c.length && c[doubleJumpPreviewIndex] == 0;
            boolean singleJumpGoesToCumulus = singleJumpPreviewIndex < c.length && c[singleJumpPreviewIndex] == 0;
            boolean canDoubleJump = doubleJumpGoesToCumulus;
            boolean canSingleJump = singleJumpGoesToCumulus;
            if (canDoubleJump) {
                currentCloudIndex = doubleJumpPreviewIndex;
                minimumJumps++;
            } else if (canSingleJump) {
                currentCloudIndex = singleJumpPreviewIndex;
                minimumJumps++;
            }
        }
        return minimumJumps;
    }

    @Test
    public void testJumpingOnClouds() {
        assertEquals(3, jumpingOnClouds(new int[]{0, 0, 0, 0, 1, 0}));
        assertEquals(4, jumpingOnClouds(new int[]{0, 0, 1, 0, 0, 1, 0}));
        assertEquals(4, jumpingOnClouds(new int[]{0, 0, 1, 0, 0, 1, 0}));
        assertEquals(3, jumpingOnClouds(new int[]{0, 0, 0, 1, 0, 0}));
    }
}
