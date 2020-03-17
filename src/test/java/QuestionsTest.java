import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class QuestionsTest {
    Questions questions = new Questions();

    @Test
    public void missingNumberTest() {
        int[] example1 = new int[]{0, 1, 2, 4, 5};
        int output1 = questions.missingNumber(example1);
        assertEquals(3, output1);

        int[] example2 = new int[]{0, 1, 2, 3, 4, 6, 7, 8};
        int output2 = questions.missingNumber(example2);
        assertEquals(5, output2);
    }

    @Test
    public void splitStringest() {
        String example1 = "RLRRLLRLRL";
        int actualOutput1 = questions.splitString(example1);
        assertEquals(4, actualOutput1);

        String example2 = "RLLLLRRRLR";
        int actualOutput2 = questions.splitString(example2);
        assertEquals(3, actualOutput2);

        String example3 = "LLLLRRRR";
        int actualOutput3 = questions.splitString(example3);
        assertEquals(1, actualOutput3);


    }

    @Test
    public void coinChangeTest() {
        int[] example1 = new int[]{1, 2, 5};
        int output1 = questions.coinChange(example1, 11);
        assertEquals(3, output1);

        int[] example2 = new int[]{2};
        int output2 = questions.coinChange(example2, 3);
        assertEquals(-1, output2);
    }

    @Test
    public void reOrganizeStringTest() {
        String example1 = "aab";
        String output1 = questions.reorganizeString(example1);
        String expectedOutput1 = "aba";
        assertEquals(expectedOutput1, output1);

        String example2 = "aaab";
        String output2 = questions.reorganizeString(example2);
        String expectedOutput2 = "";
        assertEquals(expectedOutput2, output2);

    }

    @Test
    public void shortestDistanceTest() {
        char[][] example1 = {
                {'S', '0', '1', '1'},
                {'1', '1', '0', '1'},
                {'0', '1', '1', '1'},
                {'1', '0', 'D', '1'}
        };
        int output1 = questions.shortestDistance(example1);
        assertEquals(5, output1);

        char[][] example2 = {
                {'S', '0', '1', '1'},
                {'1', '1', '0', '1'},
                {'0', '1', '1', '1'},
                {'1', '0', '0', 'D'}
        };
        int output2 = questions.shortestDistance(example2);
        assertEquals(6, output2);
    }

}