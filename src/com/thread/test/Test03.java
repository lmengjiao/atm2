package com.thread.test;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Test03 extends JFrame implements Runnable {
    private JFrame frame;
    private JPanel timePanel;
    private JLabel timeLabel;
    private JLabel displayArea;
    private String DEFAULT_TIME_FORMAT = "HH:mm:ss";
    private int ONE_SECOND = 1000;

    public Test03() {
        timePanel = new JPanel();
        timeLabel = new JLabel("CurrentTime: ");
        displayArea = new JLabel();

        timePanel.add(timeLabel);
        timePanel.add(displayArea);
        this.add(timePanel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(new Dimension(200, 70));
        this.setLocationRelativeTo(null);
    }

    public void run() {
        while (true) {
            SimpleDateFormat dateFormatter = new SimpleDateFormat(DEFAULT_TIME_FORMAT);
            displayArea.setText(dateFormatter.format(Calendar.getInstance().getTime()));
            try {
                Thread.sleep(ONE_SECOND);
            } catch (Exception e) {
                displayArea.setText("Error!!!");
            }
        }
    }

    public static void main(String arg[]) {
        Test03 df2 = new Test03();
        df2.setVisible(true);

        Thread thread1 = new Thread(df2);
        thread1.start();
    }

}