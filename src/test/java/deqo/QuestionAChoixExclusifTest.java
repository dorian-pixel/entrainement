package deqo;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuestionAChoixExclusifTest {

    private QuestionAChoixExclusif q1 = new QuestionAChoixExclusif("q1", 3);


    @Test
    public void getEnonce() {
        assertEquals("q1", q1.getEnonce());
    }

    @Test
    public void getScoreForIndice() {
        assertEquals(100, q1.getScoreForIndice(3), 0);
        assertEquals(0, q1.getScoreForIndice(2), 0);
    }
}