import javax.swing.*;
import java.awt.event.*;

public class Qno51 {

    public static void main(String[] args) {

        JFrame f = new JFrame("Even or Odd");

        JLabel l1 = new JLabel("Enter Number:");
        l1.setBounds(30, 30, 100, 30);

        JTextField t1 = new JTextField();
        t1.setBounds(150, 30, 100, 30);

        JButton b = new JButton("Check");
        b.setBounds(100, 70, 80, 30);

        JLabel result = new JLabel("");
        result.setBounds(100, 110, 100, 30);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int num = Integer.parseInt(t1.getText());

                if (num % 2 == 0)
                    result.setText("Even");
                else
                    result.setText("Odd");
            }
        });

        f.add(l1);
        f.add(t1);
        f.add(b);
        f.add(result);

        f.setSize(300, 200);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}