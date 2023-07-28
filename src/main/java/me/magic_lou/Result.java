package me.magic_lou;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Result extends JFrame {
    private JPanel panel1;
    private JLabel richtig;
    private JLabel falsch;
    private JLabel welche;
    private JButton wiederholen;
    private JButton done;
    private JLabel time;

    public Result(int r, int w, long t, List<Question> wrong) {
        setContentPane(panel1);
        setTitle("Ergebnis");
        setSize(450, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        SimpleDateFormat sdf = new SimpleDateFormat("mm:ss");
        Date date = new Date(t);
        time.setText(sdf.format(date));
        richtig.setText("Richtig: " + r + "/40");
        falsch.setText("Falsch: " + w + "/40");
        wiederholen.setVisible(false);
        if (!wrong.isEmpty()) {
            StringBuilder builder = new StringBuilder();
            builder.append("Falsch beantwortete Fragen: ").append("\n");
            int i = 0;
            for (Question question : wrong) {
                builder.append("Nr.").append(question.getNr()).append(", ");
                i++;
                if(i > 5){
                    builder.append("\n");
                    i = 0;
                }
            }
            builder.replace(builder.length() - 2, builder.length(), "");
            welche.setText(builder.toString());
            wiederholen.setVisible(true);
        }


        wiederholen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new GUI(wrong);
            }
        });
        done.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }


}
