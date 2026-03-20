import javax.swing.*;

public class jmenubarExample extends JFrame {
    static JMenuBar mb;
    static JMenu file, edit, format, view, help, zoom;
    static JMenuItem neww, newWindow, open, save, saveAs, pageSetup, print, exit, zoomIn, zoomOut;

    static JFrame f;

    public static void main(String args[]) {
        jmenubarExample m = new jmenubarExample();
        f = new JFrame("Menu demo");
        mb = new JMenuBar();
        file = new JMenu("file");
        edit = new JMenu("Edit");
        format = new JMenu("format");
        view = new JMenu("view");
        help = new JMenu("help");
        zoom = new JMenu("zoom");
        neww = new JMenuItem("neww");
        newWindow = new JMenuItem("newwindow");
        open = new JMenuItem("open");

        save = new JMenuItem("save");
        saveAs = new JMenuItem("saveas");
        pageSetup = new JMenuItem("pagesetup");
        print = new JMenuItem("print");
        exit = new JMenuItem("exit");
        zoomIn = new JMenuItem("zoomIn");
        zoomOut = new JMenuItem("zoomout");

        file.add(neww);
        file.add(newWindow);
        file.add(open);
        file.add(save);
        file.add(saveAs);
        file.add(pageSetup);
        file.add(print);
        file.add(exit);
        file.add(zoomIn);
        file.add(zoomOut);
        mb.add(file);
        mb.add(edit);
        mb.add(format);
        mb.add(view);
        mb.add(help);
        f.setJMenuBar(mb);
        f.setSize(400, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

}
