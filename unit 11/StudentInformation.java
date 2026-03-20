import javax.swing.*;

public class StudentInformation {

    public StudentInformation() {

        JFrame f = new JFrame("Student Information");
        f.setLayout(null);

        JLabel lblRollno = new JLabel("Roll no");
        lblRollno.setBounds(10, 20, 200, 20);
        f.add(lblRollno);

        JTextField txtRollno = new JTextField();
        txtRollno.setBounds(100, 20, 200, 20);
        f.add(txtRollno);

        JLabel lblName = new JLabel("Name");
        lblName.setBounds(10, 50, 200, 20);
        f.add(lblName);

        JTextField txtName = new JTextField();
        txtName.setBounds(100, 50, 200, 20);
        f.add(txtName);

        JLabel lblAddress = new JLabel("Address");
        lblAddress.setBounds(10, 80, 200, 20);
        f.add(lblAddress);

        JTextArea txtAddress = new JTextArea();
        txtAddress.setBounds(100, 80, 200, 40);
        f.add(txtAddress);

        JLabel lblSubjects = new JLabel("Subjects");
        lblSubjects.setBounds(10, 130, 200, 20);
        f.add(lblSubjects);

        JCheckBox chJava = new JCheckBox("OOP in Java");
        chJava.setBounds(100, 130, 200, 20);
        f.add(chJava);

        JCheckBox chSAD = new JCheckBox("System Analysis and Design");
        chSAD.setBounds(100, 160, 250, 20);
        f.add(chSAD);

        JCheckBox chPS = new JCheckBox("Probability and Statistics");
        chPS.setBounds(100, 190, 250, 20);
        f.add(chPS);

        JCheckBox chDSA = new JCheckBox("Data Structure and Algorithms");
        chDSA.setBounds(100, 220, 250, 20);
        f.add(chDSA);

        JCheckBox chWEB = new JCheckBox("Web Technology");
        chWEB.setBounds(100, 250, 200, 20);
        f.add(chWEB);

        JLabel lblProgram = new JLabel("Program");
        lblProgram.setBounds(10, 280, 200, 20);
        f.add(lblProgram);

        String[] Program = { "BCA", "BBS", "BIM", "BIT" };
        JComboBox cmbProgram = new JComboBox(Program);
        cmbProgram.setBounds(100, 280, 200, 20);
        f.add(cmbProgram);

        JLabel lblGender = new JLabel("Gender");
        lblGender.setBounds(10, 320, 70, 20);
        f.add(lblGender);

        JRadioButton btnMale = new JRadioButton("Male");
        btnMale.setBounds(100, 320, 70, 20);
        f.add(btnMale);

        JRadioButton btnFemale = new JRadioButton("Female");
        btnFemale.setBounds(170, 320, 90, 20);
        f.add(btnFemale);

        JRadioButton btnOther = new JRadioButton("Other");
        btnOther.setBounds(260, 320, 90, 20);
        f.add(btnOther);

        ButtonGroup btnGender = new ButtonGroup();
        btnGender.add(btnMale);
        btnGender.add(btnFemale);
        btnGender.add(btnOther);

        JLabel lblHobby = new JLabel("Hobby");
        lblHobby.setBounds(10, 330, 200, 20);
        f.add(lblHobby);

        DefaultListModel d = new DefaultListModel<>();
        d.addElement("Football");
        d.addElement("cricket");
        d.addElement("Volleyball");
        d.addElement("BasketBall");

        JList listHobby = new JList(d);
        listHobby.setBounds(100, 330, 200, 70);
        f.add(listHobby);

        JButton btnSubmit = new JButton("Submit");
        btnSubmit.setBounds(40, 420, 80, 20);
        f.add(btnSubmit);
        JButton btnCancel = new JButton("Cancel");
        btnCancel.setBounds(130, 420, 80, 20);
        f.add(btnCancel);

        f.setSize(500, 600);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new StudentInformation();
    }
}