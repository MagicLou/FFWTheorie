package me.magic_lou;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Question {

    private final int nr;
    private final String question;
    private final List<String> answers = new LinkedList<>();

    private final List<Integer> corrected = new LinkedList<>();

    public Question(int nr, String question, List<String> answersList, List<Integer> correct) {
        this.nr = nr;
        this.question = question;

        List<String> unsorted = new LinkedList<>();
        for (String s : answersList) {
            answers.add(s);
            unsorted.add(s);
        }

        Collections.shuffle(answers);
        int i = 0;
        for (String answer : answers) {
            try {
                i++;
                if (Objects.equals(answer, unsorted.get(0)) && correct.contains(1)) corrected.add(i);
                if (Objects.equals(answer, unsorted.get(1)) && correct.contains(2)) corrected.add(i);
                if (Objects.equals(answer, unsorted.get(2)) && correct.contains(3)) corrected.add(i);
                if (Objects.equals(answer, unsorted.get(3)) && correct.contains(4)) corrected.add(i);
                if (Objects.equals(answer, unsorted.get(4)) && correct.contains(5)) corrected.add(i);
                if (Objects.equals(answer, unsorted.get(5)) && correct.contains(6)) corrected.add(i);
            }catch (IndexOutOfBoundsException e){
                //Ignored
            }
        }

    }


    public int getNr() {
        return nr;
    }

    public String getQuestion() {
        return question;
    }

    public List<String> getAnswers(){
        return answers;
    }

    public List<Integer> getCorrected(){
        return corrected;
    }

}
