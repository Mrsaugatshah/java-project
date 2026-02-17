import javax.swing.*;

public class FrameByInheritance extends JFrame {
    FrameByInheritance() {
        setTitle("Frame By Inheritance");
        setSize(500, 600);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String args[]) {
        new FrameByInheritance();
    }
}
