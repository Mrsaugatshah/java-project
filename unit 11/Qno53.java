import javax.swing.*;
import java.awt.event.*;

public class Qno53 {

    public static void main(String[] args) {

        JFrame f = new JFrame("Square Calculator");

        JLabel l1 = new JLabel("Square Calculator");
        l1.setBounds(120, 20, 150, 30);
        l1.setFont(l1.getFont().deriveFont(16.0f));

        JLabel l2 = new JLabel("Enter any number:");
        l2.setBounds(30, 70, 120, 30);
        JTextField t1 = new JTextField();
        t1.setBounds(150, 70, 150, 30);

        JButton b = new JButton("Calculate Square");
        b.setBounds(120, 120, 130, 30);

        JLabel l3 = new JLabel("Square of Entered number:");
        l3.setBounds(30, 170, 150, 30);
        JTextField t2 = new JTextField();
        t2.setBounds(180, 170, 120, 30);
        t2.setEditable(false);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                try {
                    String input = t1.getText();

                    if (input.isEmpty()) {
                        JOptionPane.showMessageDialog(f, "Please enter a number");
                        return;
                    }

                    double number = Double.parseDouble(input);
                    double square = number * number;

                    t2.setText(String.valueOf(square));

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(f, "Please enter a valid number");
                    t2.setText("");
                }
            }
        });

        // Add components to frame
        f.add(l1);
        f.add(l2);
        f.add(t1);
        f.add(b);
        f.add(l3);
        f.add(t2);

        f.setSize(350, 250);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
    }
}