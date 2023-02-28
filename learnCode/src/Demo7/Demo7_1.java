package Demo7;


import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Demo7_1 extends JFrame implements ActionListener, ChangeListener {
    JFrame jFrame;
    JProgressBar progressBar;
    JLabel jLabel;
    Timer timer;
    JButton button;

    public static void main(String[] args) {

    }

    public Demo7_1() throws HeadlessException {
        jFrame = new JFrame("安装软件");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container container = jFrame.getContentPane();
        jLabel = new JLabel("", JLabel.CENTER);
        jLabel.setPreferredSize(new Dimension(300, 50));

        progressBar = new JProgressBar();
        progressBar.setOrientation(JProgressBar.HORIZONTAL);
        progressBar.setMinimum(0);
        progressBar.setMaximum(100);
        progressBar.setValue(0);
        progressBar.setStringPainted(true);
        progressBar.addChangeListener(this);

        progressBar.setPreferredSize(new Dimension(700,500));
        progressBar.setBorderPainted(true);
        progressBar.setBackground(Color.pink);
        JPanel jPanel = new JPanel();
        jPanel.setBorder(new EmptyBorder(200, 50, 50, 50));
        jPanel.add(progressBar);

        JPanel jPanel1 = new JPanel();
        button = new JButton("安装");
        button.setForeground(Color.blue);
        button.addActionListener(this);
        progressBar.add(button);
        timer = new Timer(10, this);

        container.add(progressBar);
        container.add(jLabel);
        container.add(button);

        jFrame.setVisible(true);

    }

    @Override

    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void stateChanged(ChangeEvent e) {

    }
}