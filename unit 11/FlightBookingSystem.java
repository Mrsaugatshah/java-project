package LAB1;

import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class FlightBookingSystem {

    FlightBookingSystem()
    {
        JFrame f = new JFrame("Flight Booking System");

        // Passenger Name
        JLabel lblName = new JLabel("Passenger Name:");
        lblName.setBounds(30,30,120,20);
        JTextField txtName = new JTextField();
        txtName.setBounds(150,30,200,20);

        // Flight Number
        JLabel lblFlight = new JLabel("Flight Number:");
        lblFlight.setBounds(30,60,120,20);
        JTextField txtFlight = new JTextField();
        txtFlight.setBounds(150,60,200,20);

        // Seat Preference
        JLabel lblSeat = new JLabel("Seat Preference:");
        lblSeat.setBounds(30,90,120,20);
        String seat[] = {"Window","Aisle","Middle"};
        JComboBox cbSeat = new JComboBox(seat);
        cbSeat.setBounds(150,90,200,20);

        // Checkbox
        JCheckBox chkRules = new JCheckBox("I agree to baggage rules");
        chkRules.setBounds(150,120,200,20);

        // Button
        JButton btnConfirm = new JButton("Confirm Booking");
        btnConfirm.setBounds(120,160,150,30);

        // Add components
        f.add(lblName);
        f.add(txtName);
        f.add(lblFlight);
        f.add(txtFlight);
        f.add(lblSeat);
        f.add(cbSeat);
        f.add(chkRules);
        f.add(btnConfirm);

        f.setSize(400,300);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

        // Button Action
        btnConfirm.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                String name = txtName.getText();
                String flight = txtFlight.getText();
                String seat = cbSeat.getSelectedItem().toString();

                if(!chkRules.isSelected())
                {
                    JOptionPane.showMessageDialog(f,"Accept baggage rules first.");
                }
                else
                {
                    try
                    {
                        FileWriter fw = new FileWriter("E:\\flight.txt", true);
                        fw.write("\nPassenger Name: "+name+
                                 ", \nFlight No: "+flight+
                                 ", \nSeat: "+seat+"\n");
                        fw.close();

                        JOptionPane.showMessageDialog(f,"Registration Successful");

                    }
                    catch(Exception e)
                    {
                        System.out.println(e);
                    }
                }
            }
        });
    }

    public static void main(String args[])
    {
        new FlightBookingSystem();
    }
}