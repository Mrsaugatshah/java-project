/*write a program to create a gui application in java that identifies the smaller and greater 
between two input numbers taken through tow text field and displays the result in a label
.if the user presses the mouse it should display the smaller num and if the user 
release the mouse it should display  the greater num */

import javax.swing.*;
import java.awt.event.*;

public class MouseEventHandling2 implements MouseListener{
    JLabel lblFirstNumber,lblSecondNumber,lblResult;
    JTextField txtFirstNumber,txtSecondNumber;
    MouseEventHandling2(){
        JFrame f=new JFrame("Smaller and larger");
        lblFirstNumber =new JLabel("first number");
        lblFirstNumber.setBounds(10,20,150,20);
        f.add(lblFirstNumber);

        txtFirstNumber=new JTextField();
        txtFirstNumber.setBounds(150,20,150,20);
        f.add(txtFirstNumber);

        lblSecondNumber =new JLabel("second number");
        lblSecondNumber.setBounds(null);
        f.add(lblSecondNumber);

        txtSecondNumber=new JTextField();
        txtSecondNumber.setBounds(null);
        f.add(txtSecondNumber);

        lblResult=new JLabel();
        lblResult.setBounds(10,80,150,20);
        f.add(lblResult);
        f.addMouseListener(this);
        f.setSize(400,500);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



    }
    public
    
    
}
