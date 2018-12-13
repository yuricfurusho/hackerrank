package practice.interviewprep.warmup;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class RepeatedStringTest {

    RepeatedString SUT;

    @Before
    public void setUp() throws Exception {
        SUT = new RepeatedString();
    }

    @Test
    public void SHOULD_return_1_WHEN_string_a_and_n_1 (){
        long result = RepeatedString.repeatedString("a", 1);
        assertThat(result, is(1L));

    }

    @Test
    public void SHOULD_return_10_WHEN_string_a_and_n_10 (){
        long result = RepeatedString.repeatedString("a", 10);
        assertThat(result, is(10L));
    }

    @Test
    public void SHOULD_return_1_WHEN_string_abcac_and_n_1 (){
        long result = RepeatedString.repeatedString("abcac", 1);
        assertThat(result, is(1L));
    }

    @Test
    public void SHOULD_return_1_WHEN_string_abcac_and_n_2 (){
        long result = RepeatedString.repeatedString("abcac", 2);
        assertThat(result, is(1L));

    }

    @Test
    public void SHOULD_return_1_WHEN_string_abcac_and_n_3 (){
        long result = RepeatedString.repeatedString("abcac", 3);
        assertThat(result, is(1L));

    }

    @Test
    public void SHOULD_return_2_WHEN_string_abcac_and_n_4 (){
        long result = RepeatedString.repeatedString("abcac", 4);
        assertThat(result, is(2L));

    }

    @Test
    public void SHOULD_return_2_WHEN_string_abcac_and_n_5 (){
        long result = RepeatedString.repeatedString("abcac", 5);
        assertThat(result, is(2L));

    }

    @Test
    public void SHOULD_return_3_WHEN_string_abcac_and_n_6 (){
        long result = RepeatedString.repeatedString("abcac", 6);
        assertThat(result, is(3L));

    }

    @Test
    public void SHOULD_return_3_WHEN_string_abcac_and_n_7 (){
        long result = RepeatedString.repeatedString("abcac", 7);
        assertThat(result, is(3L));

    }

    @Test
    public void SHOULD_return_3_WHEN_string_abcac_and_n_8 (){
        long result = RepeatedString.repeatedString("abcac", 8);
        assertThat(result, is(3L));

    }

    @Test
    public void SHOULD_return_4_WHEN_string_abcac_and_n_9 (){
        long result = RepeatedString.repeatedString("abcac", 9);
        assertThat(result, is(4L));

    }

    @Test
    public void SHOULD_return_4_WHEN_string_abcac_and_n_10 (){
        long result = RepeatedString.repeatedString("abcac", 10);
        assertThat(result, is(4L));

    }

    @Test
    public void SHOULD_return_5_WHEN_string_abcac_and_n_11 (){
        long result = RepeatedString.repeatedString("abcac", 11);
        assertThat(result, is(5L));

    }

}