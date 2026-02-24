
//write a java program that display two internal frame within same parent frame
import javax.swing.*;
import java.awt.event.*;

public class InternalFrameExample {
    public static void main(String args[]) {
        JFrame parentFrame = new JFrame("Parent Frame");
        parentFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        parentFrame.setSize(600, 400);
        // create inter frames
        JInternalFrame internalFrame1 = new JInternalFrame("Internal frame 1", true, true, true, true);
        internalFrame1.setBounds(50, 50, 200, 150);
        internalFrame1.setVisible(true);
        JInternalFrame internalFrame2 = new JInternalFrame("Internal frame 2", true, true, true, true);
        internalFrame2.setBounds(250, 100, 200, 150);
        internalFrame2.setVisible(true);
        // Add internal frames to desktop pane
        JDesktopPane destopPane = new JDesktopPane();
        destopPane.add(internalFrame1);
        destopPane.add(internalFrame2);

        parentFrame.add(destopPane);
        parentFrame.setVisible(true);

    }

}
