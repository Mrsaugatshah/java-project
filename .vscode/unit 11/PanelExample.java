import java.awt.Color;

import javax.swing.*;

public class PanelExample {
    PanelExample() {
        JFrame f = new JFrame("Panel Example");
        JPanel p = new JPanel();
        JButton b1 = new JButton("Ok");
        p.add(b1);
        JButton b2 = new JButton("cancel");
        p.add(b2);
        p.setBounds(40, 80, 200, 40);
        p.setBackground(Color.red);
        f.add(p);
        f.setSize(500, 600);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String args[]) {
        new PanelExample();
    }
}
