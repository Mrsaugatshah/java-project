
import javax.swing.*;
import java.awt.event.*;

public class SquareCalculator {

    SquareCalculator() {
        JFrame f = new JFrame("Even or Odd");
        JLabel lblNumber = new JLabel("Enter a number");
        lblNumber.setBounds(10, 20, 200, 20);
        JTextField txtNumber = new JTextField();
        txtNumber.setBounds(100, 20, 200, 20);
        f.add(txtNumber);
        JButton btnCheck = new JButton("check");
        btnCheck.setBounds(30, 70, 100, 20);
        f.add(btnCheck);
        JLabel lblResult = new JLabel();
        lblResult.setBounds(10, 100, 200, 20);
        f.add(lblResult);
        f.add(lblNumber);
        f.setSize(400, 500);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        btnCheck.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                int a = Integer.parseInt(txtNumber.getText());
                int square = a * a;
                lblResult.setText("square of" + a + "is" + square);

            }

        });

    }

    public static void main(String args[]) {
        new SquareCalculator();
    }

}
