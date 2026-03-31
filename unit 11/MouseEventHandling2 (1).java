/*Write a program to creste a GUI application in Java that identifies the smaller and greater number between two
input numbers taken through two text fields and displays the result in a label. If the user presses the mouse it 
should display the smaller number and if the user releases the mouse it should display the greater number. */
package Unit11;
import javax.swing.*;
import java.awt.event.*;
public class MouseEventHandling2 implements MouseListener {
     JLabel lblFirstNumber,lblSecondNumber,lblResult;
     JTextField txtFirstNumber,txtSecondNumber;
     MouseEventHandling2()
     {
         JFrame f=new JFrame("Smaller and Larger");
        lblFirstNumber=new JLabel("First Number");
        lblFirstNumber.setBounds(10, 20, 150, 20);
        f.add(lblFirstNumber);
        txtFirstNumber=new JTextField();
        txtFirstNumber.setBounds(150, 20, 150, 20);
        f.add(txtFirstNumber);
        lblSecondNumber=new JLabel("Second Number");
        lblSecondNumber.setBounds(10, 50, 150, 20);
        f.add(lblSecondNumber);
        txtSecondNumber=new JTextField();
        txtSecondNumber.setBounds(150, 50, 150, 20);
        f.add(txtSecondNumber);
        lblResult=new JLabel();
        lblResult.setBounds(10, 80, 150, 20);
        f.add(lblResult);
        f.addMouseListener(this);
        f.setSize(400,500);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }        
      public static void main(String args[])
    {
        new MouseEventHandling2();
    }        

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        int a=Integer.parseInt(txtFirstNumber.getText());
        int b=Integer.parseInt(txtSecondNumber.getText());
        if(a<b)
            lblResult.setText(a+" is Smaller");
        else
            lblResult.setText(b+" is Smaller");

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        int a=Integer.parseInt(txtFirstNumber.getText());
        int b=Integer.parseInt(txtSecondNumber.getText());
        if(a>b)
            lblResult.setText(a+" is Greater");
        else
            lblResult.setText(b+" is Greater");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}
