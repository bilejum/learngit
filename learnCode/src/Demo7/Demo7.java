package Demo7;

import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;
import javax.swing.*;

public class Demo7 extends JFrame implements ActionListener {

    private JTextField hourField, minuteField;
    private JButton setButton;
    private Timer timer;

    public Demo7() {
        setTitle("Alarm Clock");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setSize(300, 100);

        JLabel hourLabel = new JLabel("Hour:");
        add(hourLabel);

        hourField = new JTextField(2);
        add(hourField);

        JLabel minuteLabel = new JLabel("Minute:");
        add(minuteLabel);

        minuteField = new JTextField(2);
        add(minuteField);

        setButton = new JButton("Set");
        add(setButton);

        setButton.addActionListener(this);

        timer = new Timer(1000, this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == setButton) {
            int hour = Integer.parseInt(hourField.getText());
            int minute = Integer.parseInt(minuteField.getText());
            timer.setInitialDelay(calculateDelay(hour, minute));
            timer.start();
            JOptionPane.showMessageDialog(this, "Alarm set for " + hour + ":" + minute);
        } else if (e.getSource() == timer) {
            timer.stop();
            JOptionPane.showMessageDialog(this, "Time's up!");
        }
    }

    private int calculateDelay(int hour, int minute) {
        int currentHour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        int currentMinute = Calendar.getInstance().get(Calendar.MINUTE);

        int delay = ((hour - currentHour) * 60 + (minute - currentMinute)) * 1000;
        if (delay < 0) {
            delay += 24 * 60 * 60 * 1000;
        }

        return delay;
    }

    public static void main(String[] args) {
        Demo7 clock = new Demo7();
        clock.setVisible(true);
    }
}