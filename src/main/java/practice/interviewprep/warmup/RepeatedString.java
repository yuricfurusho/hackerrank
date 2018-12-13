package practice.interviewprep.warmup;

public class RepeatedString {


    static long repeatedString(String s, long n) {

        long sum = 0L;
        long singleStringSum = 0L;

        for (long i = 0; i < s.length(); i++) {
            if (s.charAt((int) i) == 'a')
                singleStringSum++;
        }

        long wholerepetitions  = n / s.length();
        sum = singleStringSum * wholerepetitions;
        long remainder =  n % s.length();

        for (int i = 0; i < remainder; i++) {
            if (s.charAt((int) i) == 'a')
                sum++;
        }
        

        // timeout to big:
//        for (int i = 0; i < n; i++) {
//            if (s.charAt(i % s.length()) == 'a')
//                sum++;
//        }
        return sum;

    }
}
