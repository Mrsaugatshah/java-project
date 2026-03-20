import javax.swing.*;
import java.awt.event.*;

public class Qno56 {

    public static void main(String[] args) {

        JFrame f = new JFrame("Sum and Difference");

        JLabel l1 = new JLabel("First Number:");
        l1.setBounds(30, 30, 120, 30);

        JTextField t1 = new JTextField();
        t1.setBounds(150, 30, 100, 30);

        JLabel l2 = new JLabel("Second Number:");
        l2.setBounds(30, 70, 120, 30);

        JTextField t2 = new JTextField();
        t2.setBounds(150, 70, 100, 30);

        JButton add = new JButton("Add");
        add.setBounds(40, 120, 80, 30);

        JButton sub = new JButton("Subtract");
        sub.setBounds(140, 120, 100, 30);

        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int sum = a + b;
                JOptionPane.showMessageDialog(f, "Sum = " + sum);
            }
        });

        sub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int diff = a - b;
                JOptionPane.showMessageDialog(f, "Difference = " + diff);
            }
        });

        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(add);
        f.add(sub);

        f.setSize(300, 220);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
