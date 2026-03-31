import java.sql.*;
import java.util.Scanner;
import javax.swing.*;

public class EmployeeOperation {
    EmployeeOperation() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:2207/company", "root", "");
            Scanner sc = new Scanner(System.in);
            int n;
            System.out.print("No of employee: ");
            n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                String sql = "insert int employee(EID,Ename,Salary,Department) values(?,?,?,?)";
                PreparedStatement ptst = conn.prepareStatement(sql);
                System.out.print("Eid:");
                int EID = sc.nextInt();
                System.out.print("EName: ");
                String Ename = sc.next();
                System.out.print("Salary: ");
                String Salary = sc.next();
                System.out.print("Department");
                String Department = sc.next();
                ptst.setInt(1, EID);
                ptst.setString(2, Ename);
                ptst.setString(3, Salary);
                ptst.setString(4, Department);
                ptst.executeUpdate();

            }
            String sql = "Select * from employee";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery(sql);
            System.out.println("EID\tEName\tSalary\tDepartment");
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
        new EmployeeOperation();
    }

}
;