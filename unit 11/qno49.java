import javax.swing.*;
import java.awt.event.*;

public class qno49 implements ActionListener {

    JFrame frame;
    JLabel userLabel, passLabel;
    JTextField userText;
    JPasswordField passText;
    JButton loginButton;

    qno49() {
        frame = new JFrame("Login Form");

        userLabel = new JLabel("Username:");
        userLabel.setBounds(50, 50, 100, 30);
        frame.add(userLabel);

        userText = new JTextField();
        userText.setBounds(150, 50, 150, 30);
        frame.add(userText);

        passLabel = new JLabel("Password:");
        passLabel.setBounds(50, 100, 100, 30);
        frame.add(passLabel);

        passText = new JPasswordField();
        passText.setBounds(150, 100, 150, 30);
        frame.add(passText);

        loginButton = new JButton("Login");
        loginButton.setBounds(150, 150, 100, 30);
        loginButton.addActionListener(this);
        frame.add(loginButton);

        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        String username = userText.getText();
        String password = new String(passText.getPassword());

        if (username.equals("admin") && password.equals("1234")) {
            JOptionPane.showMessageDialog(frame, "Login Successful");
        } else {
            JOptionPane.showMessageDialog(frame, "Invalid Username or Password");
        }
    }

    public static void main(String[] args) {
        new qno49();
    }
}
