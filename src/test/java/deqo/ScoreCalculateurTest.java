package deqo;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class ScoreCalculateurTest {


    ArrayList a1 = new ArrayList<Integer>(Arrays.asList(1, 4));
    ArrayList a2 = new ArrayList<Integer>(Arrays.asList(2, 3));
    ArrayList a3 = new ArrayList<Integer>(Arrays.asList(2, 3, 5));
    ArrayList a4 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
    ArrayList a5 = new ArrayList<Integer>(Arrays.asList(1, 2, 3));


    QuestionAChoix q1 = new QuestionAChoixMultiple("q1",new ArrayList<Integer>(Arrays.asList(2,3,5)));



    ScoreCalculateur s1 = new ScoreCalculateur();


    @Test
    public void calculeScore() {
        assertEquals(66.66, s1.calculeScore(a2, q1), 0.01);
        assertEquals(0, s1.calculeScore(a1, q1), 0.01);
        assertEquals(100, s1.calculeScore(a3, q1), 0.01);
        assertEquals(33.33, s1.calculeScore(a4, q1), 0.01);
        assertEquals(33.33, s1.calculeScore(a5, q1), 0.01);
    }
}