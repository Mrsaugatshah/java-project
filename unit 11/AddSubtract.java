
/*
 * write a gui program using swing components to calculate sum and difference of
 * two number .use two text field for input and pre-built dialog box for output
 * .your program should display sum if add button and difference if subtract
 * button is clicked
 */
import javax.swing.*;
import java.awt.event.*;

public class AddSubtract {
    AddSubtract() {
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
        JLabel lblResult = new JLabel("Result");
        lblResult.setBounds(10, 100, 200, 20);
        f.add(lblResult);
        JTextField txtResult = new JTextField();
        txtResult.setBounds(230, 100, 200, 20);
        f.add(txtResult);
        JButton btnSum = new JButton("sum");
        btnSum.setBounds(240, 100, 170, 20);
        f.add(btnSum);
        JButton btnDifference = new JButton("difference");
        btnDifference.setBounds(110, 130, 100, 20);
        f.add(btnDifference);
        f.setSize(400, 500);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        btnSum.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                int a = Integer.parseInt(txtFirstNumber.getText());
                int b = Integer.parseInt(txtSecondNumber.getText());
                int c = a + b;
                JOptionPane.showMessageDialog(f, "sum:" + c);
            }

        });
        btnDifference.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                int a = Integer.parseInt(txtFirstNumber.getText());
                int b = Integer.parseInt(txtSecondNumber.getText());
                int c = a - b;
                JOptionPane.showMessageDialog(f, "Difference:" + c);
            }

        });
        // btnCancel.addActionListener(new ActionListener() {

        // public void actionPerformed(ActionEvent ae) {
        // txtFirstNumber.setText("");
        // txtSecondNumber.setText("");
        // txtResult.setText("");
        // }

        // });

    }

    public static void main(String args[]) {
        new sum();
    }

}
