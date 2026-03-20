import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

public class MouseAdapterExample extends MouseAdapter {
    JFrame f;
    JLabel lblResult;

    MouseAdapterExample() {
        f = new JFrame("mouse Adapter");
        lblResult = new JLabel();
        lblResult.setBounds(10, 20, 200, 20);
        f.add(lblResult);
        f.addMouseListener(this);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void mouseClicked(MouseEvent e) {
        lblResult.setText("Mouse is clicked");
    }

    public static void main(String args[]) {
        new MouseAdapterExample();

    }

}
