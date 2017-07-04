package com.example.whitepaw.a8ball;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Reece on 03/07/2017.
 */

public class Answers implements Answerable {
    private ArrayList<String> answers;

    public Answers() {
        this.answers = new ArrayList<String>();
        this.setAnswers();
    }

    public Answers(ArrayList<String> newAnswers) {
        this.answers = newAnswers;
    }

    public String getAnswer() {
        Random rand = new Random();
        int listSize = this.getLength();
        int index = rand.nextInt(listSize);//note:this is the ruby rand method .rand(1..6)
        String answer = this.getAnswerAtIndex(index);
        return answer;
    }

    private void setAnswers() {
        String[] newAnswers = {
                "Yes", "No", "Are you kidding!", "Eye Might!", "Nar Bra", "Shag a dog", "Eye'll she'll be right!"
        };

        for (String answer : newAnswers) {
            answers.add(answer);
        }//Note: this is private so no one out of the method and effect it.

    }

    public ArrayList<String> getAnswers() {
        return new ArrayList<String>(answers);
    }

    public int getLength() {
        return this.answers.size();
    }

    public void add(String newItem) {
        answers.add(newItem);
    }

    public String getAnswerAtIndex(int item) {
        return this.answers.get(item);
    }

}
