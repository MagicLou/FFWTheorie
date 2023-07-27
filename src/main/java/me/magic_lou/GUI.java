package me.magic_lou;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class GUI extends JFrame {
    private final List<Question> questions;
    private final List<Question> correct = new LinkedList<>();
    private final List<Question> wrong = new LinkedList<>();
    private JPanel panel1;
    private JLabel nr;
    private JLabel question;
    private JCheckBox ans1;
    private JButton done;
    private JCheckBox ans6;
    private JCheckBox ans5;
    private JCheckBox ans4;
    private JCheckBox ans3;
    private JCheckBox ans2;
    private final List<JCheckBox> boxes = new LinkedList<>();
    private long startTime;

    public GUI(List<Question> questions) {
        this.questions = questions;
        setContentPane(panel1);
        setTitle("");
        setSize(600, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        startTime = System.currentTimeMillis();

        boxes.add(ans1);
        boxes.add(ans2);
        boxes.add(ans3);
        boxes.add(ans4);
        boxes.add(ans5);
        boxes.add(ans6);

        ask(questions.get(0));
        done.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (check(questions.get(0))) correct.add(questions.get(0));
                else wrong.add(questions.get(0));
                if(!questions.isEmpty())
                    questions.remove(0);
                if(questions.isEmpty()){
                    System.out.println("Time:" + getTitle());
                    System.out.println("Richtig: " + correct.size() + "/40");
                    if(correct.size() == 40){
                        System.out.println("Falsch: 0");
                    }else {
                        System.out.println("Falsch:");
                        for (Question question : wrong) {
                            System.out.println(question.getNr());
                        }
                        for (Question question : wrong) {
                            questions.add(question);
                        }
                        wrong.clear();
                    }

                }
                if(questions.isEmpty()){
                    System.out.println("Final Time:" + getTitle());
                    System.exit(0);

                }

                for (JCheckBox box : boxes) {
                    box.setSelected(false);
                    box.setVisible(true);
                    box.setText("CheckBox");
                }

                ask(questions.get(0));


            }
        });
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateLaufzeit();
            }
        });
        timer.start();
    }

    private void updateLaufzeit() {
        long currentTime = System.currentTimeMillis();
        long elapsedTime = currentTime - startTime;

        SimpleDateFormat sdf = new SimpleDateFormat("mm:ss");
        Date date = new Date(elapsedTime);
        setTitle( sdf.format(date));
    }

    private boolean check(Question question) {
        for (Integer i : question.getCorrected()) {
            switch (i) {
                case 1 -> {
                    if (ans1.isSelected()) ;
                    else return false;
                }
                case 2 -> {
                    if (ans2.isSelected()) ;
                    else return false;
                }
                case 3 -> {
                    if (ans3.isSelected()) ;
                    else return false;
                }
                case 4 -> {
                    if (ans4.isSelected()) ;
                    else return false;
                }
                case 5 -> {
                    if (ans5.isSelected()) ;
                    else return false;
                }
                case 6 -> {
                    if (ans6.isSelected()) ;
                    else return false;
                }
            }
        }
        return true;
    }


    private void ask(Question q) {
        nr.setText(q.getNr() + "/40");
        try {
            question.setText(q.getQuestion());
            ans1.setText(q.getAnswers().get(0));
            ans2.setText(q.getAnswers().get(1));
            ans3.setText(q.getAnswers().get(2));
            ans4.setText(q.getAnswers().get(3));
            ans5.setText(q.getAnswers().get(4));
            ans6.setText(q.getAnswers().get(5));
        } catch (IndexOutOfBoundsException e) {
            if (ans1.getText().equals("CheckBox")) ans1.setVisible(false);
            if (ans2.getText().equals("CheckBox")) ans2.setVisible(false);
            if (ans3.getText().equals("CheckBox")) ans3.setVisible(false);
            if (ans4.getText().equals("CheckBox")) ans4.setVisible(false);
            if (ans5.getText().equals("CheckBox")) ans5.setVisible(false);
            if (ans6.getText().equals("CheckBox")) ans6.setVisible(false);
        }


    }


}
