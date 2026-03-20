import javax.swing.*;
import java.awt.event.*;

public class Qno55 {

    public static void main(String[] args) {

        JFrame f = new JFrame("Factorial and Cube");

        JLabel l1 = new JLabel("Enter Number:");
        l1.setBounds(30, 30, 120, 30);

        JTextField t1 = new JTextField();
        t1.setBounds(150, 30, 100, 30);

        JButton btn = new JButton("Result");
        btn.setBounds(90, 70, 100, 30);

        JLabel output = new JLabel("");
        output.setBounds(90, 110, 200, 30);

        btn.addMouseListener(new MouseAdapter() {

            public void mousePressed(MouseEvent e) {
                int n = Integer.parseInt(t1.getText());
                int fact = 1;
                for (int i = 1; i <= n; i++) {
                    fact = fact * i;
                }
                output.setText("Factorial: " + fact);
            }

            public void mouseReleased(MouseEvent e) {
                int n = Integer.parseInt(t1.getText());
                int cube = n * n * n;
                output.setText("Cube: " + cube);
            }

        });

        f.add(l1);
        f.add(t1);
        f.add(btn);
        f.add(output);

        f.setSize(300, 200);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
