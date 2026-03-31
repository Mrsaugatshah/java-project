/*Write a GUI application to find the sum and difference of two integer numbers. Use two text fields for input and third
text field for output. Your program should display sum if user presses the mouse and difference if the user releases
the mouse.*/
package Unit11;
import javax.swing.*;
import java.awt.event.*;
public class MouseEventHandling1 implements MouseListener {
    JLabel lblFirstNumber,lblSecondNumber,lblResult;
    JTextField txtFirstNumber,txtSecondNumber,txtResult;
    MouseEventHandling1()
    {
        JFrame f=new JFrame("Sum and Difference");
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
        lblResult=new JLabel("Result");
        lblResult.setBounds(10, 80, 150, 20);
        f.add(lblResult);
        txtResult=new JTextField();
        txtResult.setBounds(150, 80, 150, 20);
        f.add(txtResult);
        txtResult.addMouseListener(this);
        f.setSize(400,500);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }        
    public static void main(String args[])
    {
        new MouseEventHandling1();
    }        

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        int a=Integer.parseInt(txtFirstNumber.getText());
        int b=Integer.parseInt(txtSecondNumber.getText());
        int c=a+b;
        lblResult.setText("Sum");
        txtResult.setText(""+c);

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        int a=Integer.parseInt(txtFirstNumber.getText());
        int b=Integer.parseInt(txtSecondNumber.getText());
        int c=a-b;
        lblResult.setText("Difference");
        txtResult.setText(""+c);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    
}
