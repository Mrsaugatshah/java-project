import javax.swing.*;
import java.sql.*;
import java.util.Scanner;

public class college {
    college() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:2207/college", "root", "");
            Scanner sc = new Scanner(System.in);
            int n;
            System.out.print("No of Students: ");
            n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                String sql = "insert int student1(Roll,Name,Address,Program) values(?,?,?,?)";
                PreparedStatement ptst = conn.prepareStatement(sql);
                System.out.print("Roll:");
                int roll = sc.nextInt();
                System.out.print("Name: ");
                String Sname = sc.next();
                System.out.print("Address: ");
                String address = sc.next();
                System.out.print("program");
                String program = sc.next();
                ptst.setInt(1, roll);
                ptst.setString(2, Sname);
                ptst.setString(3, address);
                ptst.setString(4, program);
                ptst.executeUpdate();

            }
            String sql = "Select * from student1";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery(sql);
            System.out.println("Roll\tName\tAddress\tprogram");
            while (rs.next()) {
                System.out.println(
                        rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4));
            }
            conn.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
    }

    public static void main(String args[]) {
        new college();
    }

}
