import javax.swing.*;
import java.awt.event.*;

public class sum {
    sum() {
        JFrame f = new JFrame("sum calculator");
        JLabel lblFirstNumber = new JLabel("first number");
        lblFirstNumber.setBounds(10, 20, 200, 20);
        f.add(lblFirstNumber);
        JTextField txtFirstNumber = new JTextField();
        txtFirstNumber.setBounds(100, 20, 100, 20);
        f.add(txtFirstNumber);
        JLabel lblSecondNumber = new JLabel("Second Number");
        lblSecondNumber.setBounds(10, 50, 200, 20);
        f.add(lblSecondNumber);
        JTextField txtSecondNumber = new JTextField();
        txtSecondNumber.setBounds(100, 50, 100, 20);
        f.add(txtSecondNumber);
        JLabel txtResult = new JLabel("Result");
        txtResult.setBounds(100,80, 100,20);
        f.add(txtResult);
        JTextField txstResult = new JTextField();
        JButton btnSum = new JButton("sum");
        btnSum.setBounds(30, 130, 70, 20);
        f.add(btnSum);
        JButton btnCancel = new JButton("cancel");
        btnCancel.setBounds(110, 130, 100, 20);
        f.add(btnCancel);
        f.setSize(400, 500);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        btnSum.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                int a = Integer.parseInt(txtFirstNumber.getText());
                int b = Integer.parseInt(txtSecondNumber.getText());
                int c = a + b;
                txtResult.setText("" + c);
            }

        });
        btnCancel.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                txtFirstNumber.setText("");
                txtSecondNumber.setText("");
                txtResult.setText("");
            }

        });

    }

    public static void main(String args[]) {
        new sum();
    }

}
