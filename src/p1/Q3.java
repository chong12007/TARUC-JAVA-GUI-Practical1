package p1;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Q3 extends JFrame {

    private JTextField jtxRegNum = new JTextField();
    private JTextField jtxStudentName = new JTextField();
    private JTextField jtxProgrammeCode = new JTextField();
    private JButton jbSubmitbtn = new JButton("Submit");
  

    public Q3() {
        //Q3 layout
        //setLayout(new FlowLayout());
        setLayout(new GridLayout(0,2));
        add(new JLabel("Registration Number :"));
        add(jtxRegNum);
        add(new JLabel("Student Name :"));
        add(jtxStudentName);
        add(new JLabel("Programme Code :"));
        add(jtxProgrammeCode);
        add(new JLabel());

        
        
        add(jbSubmitbtn);

        //Set Jframe setting
        setSize(500, 200);
        setTitle("Student Information");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

}
