import javax.swing.*;
import java.awt.event.*;

public class Qno50 {

    public static void main(String[] args) {

        JFrame f = new JFrame("Addition");

        JLabel l1 = new JLabel("First Number:");
        l1.setBounds(30, 30, 100, 30);

        JTextField t1 = new JTextField();
        t1.setBounds(150, 30, 100, 30);

        JLabel l2 = new JLabel("Second Number:");
        l2.setBounds(30, 70, 100, 30);

        JTextField t2 = new JTextField();
        t2.setBounds(150, 70, 100, 30);

        JButton b = new JButton("Add");
        b.setBounds(100, 110, 80, 30);

        JLabel result = new JLabel("Result:");
        result.setBounds(30, 150, 200, 30);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int sum = a + b;
                result.setText("Result: " + sum);
            }
        });

        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(b);
        f.add(result);

        f.setSize(300, 250);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}