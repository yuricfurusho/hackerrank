package challenges;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HackLandElection {

    static String electionWinner(String[] votes) {
        Arrays.sort(votes);
        List<String> votesList = Arrays.asList(votes);

        String actualCandidate = votesList.get(0);
        int previousCandidateFrequency = Collections.frequency(votesList, votesList.get(0));
        int actualCandidateFrequency = Collections.frequency(votesList, votesList.get(0));
        String elected = actualCandidate;


        for (int i = 0; i < votesList.size(); i++) {
            if (!actualCandidate.equalsIgnoreCase(votesList.get(i))) {
                actualCandidate = votesList.get(i);
                previousCandidateFrequency = actualCandidateFrequency;
                actualCandidateFrequency = Collections.frequency(votesList, votesList.get(i));
                if (actualCandidateFrequency >= previousCandidateFrequency)
                    elected = votesList.get(i);
            }
        }

        return elected;

    }

    @Test
    public void testJumpingOnClouds() {
        assertEquals("Michael", electionWinner(new String[]{"Alex", "Michael", "Harry", "Dave", "Michael", "Victor", "Harry", "Alex", "Mary", "Mary"}));
        assertEquals("Veronica", electionWinner(new String[]{"Victor", "Veronica", "Ryan", "Dave", "Maria", "Maria", "Farah", "Farah", "Ryan", "Veronica"}));
    }
}
