import java.sql.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class DeleteOperation {
    DeleteOperation() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/company", "root", "");
            String sql = "delete from employee where EID=?";
            PreparedStatement ptmt = conn.prepareStatement(sql);
            Scanner sc = new Scanner(System.in);
            System.out.print("enter Id tp delete record: ");
            int id = sc.nextInt();
            ptmt.setInt(1, id);
            ptmt.executeUpdate();
            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
    }

    public static void main(String args[]) {
        new DeleteOperation();
    }

}
