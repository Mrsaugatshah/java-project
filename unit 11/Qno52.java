import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class Qno52 {

    public static void main(String[] args) {

        JFrame f = new JFrame("Registration Form");

        JLabel l1 = new JLabel("Name:");
        l1.setBounds(30, 30, 100, 30);
        JTextField t1 = new JTextField();
        t1.setBounds(120, 30, 150, 30);

        JLabel l2 = new JLabel("Mobile:");
        l2.setBounds(30, 70, 100, 30);
        JTextField t2 = new JTextField();
        t2.setBounds(120, 70, 150, 30);

        JLabel l3 = new JLabel("Gender:");
        l3.setBounds(30, 110, 100, 30);

        JRadioButton r1 = new JRadioButton("Male");
        r1.setBounds(120, 110, 70, 30);
        JRadioButton r2 = new JRadioButton("Female");
        r2.setBounds(190, 110, 80, 30);

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        JCheckBox cb = new JCheckBox("Please Accept the terms and conditions");
        cb.setBounds(30, 150, 250, 30);

        JButton b = new JButton("Submit");
        b.setBounds(120, 190, 100, 30);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (cb.isSelected()) {
                    try {
                        FileWriter fw = new FileWriter("exam.txt", true);
                        String name = t1.getText();
                        String mobile = t2.getText();
                        String gender = r1.isSelected() ? "Male" : "Female";

                        fw.write("Name: " + name + "\nMobile: " + mobile + "\nGender: " + gender + "\n\n");
                        fw.close();

                        JOptionPane.showMessageDialog(f, "Data Saved Successfully");

                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                } else {
                    JOptionPane.showMessageDialog(f, "Please accept the terms and conditions first");
                }

            }
        });

        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(l3);
        f.add(r1);
        f.add(r2);
        f.add(cb);
        f.add(b);

        f.setSize(350, 300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}