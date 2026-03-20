import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*
<applet code="Qno57" width=400 height=300>
</applet>
*/

public class Qno57 extends Applet implements ActionListener {

    Label l1, l2, l3;
    TextField t1, t2;
    Button b1;

    public void init() {
        setLayout(null);
        setBackground(Color.CYAN);

        l1 = new Label("Simple Calculator Applet");
        l1.setBounds(100, 30, 200, 30);
        l1.setFont(new Font("Arial", Font.BOLD, 16));

        l2 = new Label("Enter Number:");
        l2.setBounds(50, 80, 100, 30);

        t1 = new TextField();
        t1.setBounds(160, 80, 100, 30);

        b1 = new Button("Square");
        b1.setBounds(120, 130, 80, 30);

        l3 = new Label("Result:");
        l3.setBounds(50, 180, 200, 30);
        l3.setFont(new Font("Arial", Font.BOLD, 14));

        add(l1);
        add(l2);
        add(t1);
        add(b1);
        add(l3);

        b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int num = Integer.parseInt(t1.getText());
            int square = num * num;
            l3.setText("Result: Square = " + square);
        } catch (NumberFormatException ex) {
            l3.setText("Result: Please enter valid number");
        }
    }

    public void paint(Graphics g) {
        g.drawRect(20, 20, 360, 260);
        g.drawString("Applet Demo Program", 130, 40);
    }
}