import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class StudentGUI {
    private JButton btnVisa;
    private JTextField tfForNamn;
    private JTextArea taOutPut;
    private JPanel mainPanel;
    private JTextField tfEfternamn;
    private JTextField tfStartTermin;
    private JTextField tfUsername;
    private JTextField tfEmail;
    private JButton btnButton;

    private ArrayList<Student> studentList;

    public StudentGUI() {
        studentList = new ArrayList<>();

        btnVisa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String forNamn = tfForNamn.getText();
                String efterNamn = tfEfternamn.getText();
                String startTermin = tfStartTermin.getText();

                Student student1 = new Student();

                student1.setForNamn(forNamn);
                student1.setEfterNamn(efterNamn);
                student1.setStartTermin(startTermin);


                String username = student1.getUserName();
                String email = student1.getEpost();



                Student newStudent = new Student(forNamn, efterNamn, startTermin, email, username);
                studentList.add(newStudent);
                tfUsername.setText(newStudent.getUserName());
                tfEmail.setText(newStudent.getEpost());
                taOutPut.setText(""); // Clear the text area

                for (Student student : studentList) {
                    taOutPut.append("Namn: " + student.getForNamn() + " Efternamn: " + student.getEfterNamn() +
                            " Användarnamn: " + student.getUserName() + " Epost: " + student.getEpost() + "\n");
                }
            }
        });
        btnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                taOutPut.setText("");
                tfUsername.setText("");
                tfEmail.setText("");
                tfForNamn.setText("");
                tfEfternamn.setText("");
                tfStartTermin.setText("");

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("StudentGUI");
        frame.setContentPane(new StudentGUI().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
