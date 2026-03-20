import javax.swing.*;

public class JTableExample {
    JTableExample() {
        JFrame f = new JFrame("JTable Example");
        String[] columnNames = { "Name", "Department" };
        String[][] data = {
                { "Riya", "BCA" },
                { "suhana Baral", "BIT" },
                { "Manisha", "BSCCSIT" }
        };
        JTable tbl = new JTable(data, columnNames);
        tbl.setBounds(30, 40, 200, 300);
        JScrollPane sp = new JScrollPane(tbl);
        f.add(sp);
        f.setSize(500, 200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String args[]) {
        new JTableExample();
    }
}
