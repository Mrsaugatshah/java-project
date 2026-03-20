import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class Qno54 {

    public static void main(String[] args) {

        JFrame f = new JFrame("Flight Booking System");

        JLabel title = new JLabel("Flight Booking System");
        title.setBounds(100, 20, 200, 30);
        title.setFont(title.getFont().deriveFont(16.0f));

        JLabel l1 = new JLabel("Passenger Name:");
        l1.setBounds(30, 70, 120, 30);
        JTextField t1 = new JTextField();
        t1.setBounds(150, 70, 150, 30);

        JLabel l2 = new JLabel("Flight Number:");
        l2.setBounds(30, 110, 120, 30);
        JTextField t2 = new JTextField();
        t2.setBounds(150, 110, 150, 30);

        JLabel l3 = new JLabel("Seat Preference:");
        l3.setBounds(30, 150, 120, 30);

        JRadioButton r1 = new JRadioButton("Window");
        r1.setBounds(150, 150, 80, 30);
        JRadioButton r2 = new JRadioButton("Aisle");
        r2.setBounds(230, 150, 70, 30);
        JRadioButton r3 = new JRadioButton("Middle");
        r3.setBounds(300, 150, 80, 30);

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);

        // Select Window by default as shown in image
        r1.setSelected(true);

        JCheckBox cb = new JCheckBox("I agree to baggage rules");
        cb.setBounds(30, 190, 200, 30);

        JButton b = new JButton("Confirm Booking");
        b.setBounds(120, 230, 130, 30);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (cb.isSelected()) {
                    try {
                        FileWriter fw = new FileWriter("flight.txt", true);

                        String name = t1.getText();
                        String flight = t2.getText();

                        // Check if name and flight are not empty
                        if (name.isEmpty() || flight.isEmpty()) {
                            JOptionPane.showMessageDialog(f, "Please fill all fields");
                            return;
                        }

                        String seat = "Window";
                        if (r2.isSelected())
                            seat = "Aisle";
                        if (r3.isSelected())
                            seat = "Middle";

                        fw.write("Passenger Name: " + name +
                                "\nFlight Number: " + flight +
                                "\nSeat Preference: " + seat +
                                "\n\n");
                        fw.close();

                        JOptionPane.showMessageDialog(f, "Booking Confirmed Successfully");

                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                } else {
                    JOptionPane.showMessageDialog(f, "Accept baggage rules first");
                }
            }
        });

        // Add components to frame
        f.add(title);
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(l3);
        f.add(r1);
        f.add(r2);
        f.add(r3);
        f.add(cb);
        f.add(b);

        f.setSize(450, 320);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
    }
}
