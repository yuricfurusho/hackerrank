package challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HolesInANumber {

    public static int countHoles(int num) {
        String stringNumber = Integer.toString(num);

        int sumOfHoles = 0;

        for (int i = 0; i < stringNumber.length(); i++) {
            char s = stringNumber.charAt(i);
            switch (s) {
                case '1':
                case '2':
                case '3':
                case '5':
                case '7':
                    sumOfHoles = sumOfHoles + 0;
                    break;
                case '0':
                case '4':
                case '6':
                case '9':
                    sumOfHoles = sumOfHoles + 1;
                    break;
                case '8':
                    sumOfHoles = sumOfHoles + 2;
                    break;
                default:
                    sumOfHoles = sumOfHoles + 0;            }
        }


        return sumOfHoles;
    }

    @Test
    public void testCountHoles() {
        assertEquals(2, countHoles(630));
        assertEquals(4, countHoles(1288));
    }


}
