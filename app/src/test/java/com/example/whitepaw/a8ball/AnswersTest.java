package com.example.whitepaw.a8ball;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;
/**
 * Created by Reece on 03/07/2017.
 */

public class AnswersTest {
    Answers answers;
    ArrayList<String> testAnswers;

    @Before
    public void before() {
        answers = new Answers();
        testAnswers = new ArrayList<String>();
        testAnswers.add("Yes");
        testAnswers.add("No");
        testAnswers.add("Maybe");
    }

    @Test
    public void getAnswersTest() {
        Answers answers = new Answers();
        assertNotNull(answers.getAnswers());
    }

    @Test
    public void setUpAnswers() {
        assertEquals(2, answers.getLength());
    }

    @Test
    public void createAnswersWithList() {
        Answers answers = new Answers(testAnswers);
        assertEquals(3, answers.getLength());
    }

    @Test
    public void addAnswer() {
        int originalNumberOfAnswers = answers.getLength();
        answers.add("Maybe BABY");
        assertEquals(originalNumberOfAnswers + 1, answers.getLength());
    }

    @Test
    public void getAnswerAtIndex() {
        Answers answers = new Answers(testAnswers);
        String result = answers.getAnswerAtIndex(1);
        assertEquals("No", result);
    }

    @Test
    public void getAnswer() {
        Answers answers = new Answers(testAnswers);

        String answer = answers.getAnswer();

        System.out.println("getAnswerTest. Answer: " + answer);
        assertNotNull(answer);
    }
}
