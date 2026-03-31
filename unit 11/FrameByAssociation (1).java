package Unit11;
import javax.swing.*;
public class FrameByAssociation {
    FrameByAssociation()
    {
        JFrame f=new JFrame("Frame by Association");
        f.setSize(500,600);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }    
    public static void main(String args[])
    {
        new FrameByAssociation();
    }        
}
