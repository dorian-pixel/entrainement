package deqo;

import org.junit.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class QuestionAChoixMultipleTest {



    QuestionAChoixMultiple q1 = new QuestionAChoixMultiple("q1" ,new ArrayList<Integer>(Arrays.asList(2,3,5, 6)));


    @Test
    public void getEnonce() {
        assertEquals("q1", q1.getEnonce());
    }

    @Test
    public void getScoreForIndice() {
        assertEquals(25, q1.getScoreForIndice(3), 0);
        assertEquals(0, q1.getScoreForIndice(1), 0);
    }
}