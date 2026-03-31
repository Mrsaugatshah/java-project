package Unit11;
import javax.swing.*;
import java.awt.event.*;
public class WindowEventListener implements WindowListener {
    WindowEventListener()
    {
        JFrame f=new JFrame("Window Event Example");
        f.addWindowListener(this);
        f.setSize(400, 500);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }    
     public static void main(String args[])
    {
        new WindowEventListener();
    }

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Window is Opened");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Window is Closing");

    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("Window is Closed");

    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Window is Iconified");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Window is Deiconified");
        }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Window is Activated ");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Window is Deactivated ");

    }
    
}
