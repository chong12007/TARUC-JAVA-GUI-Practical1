
package p1;

import java.awt.*;
import javax.swing.*;


public class Q5 extends JFrame{
    private JPanel panel1 = new JPanel(new GridLayout(2,1));
    private JPanel panel2 = new JPanel(new GridLayout(2,1));
     private JButton btn1 = new JButton("button1");
      private JButton btn2 = new JButton("button2");
    
    public Q5() {
        
        setLayout(new BorderLayout());
         
         
        panel1.add(btn1);
        panel1.add(btn2);
        panel2.add(btn1);
        panel2.add(btn2);
        add(panel1, BorderLayout.SOUTH);
        add(panel2,BorderLayout.CENTER);
        
        //Set Jframe setting
       
        setSize(500, 200);
        setTitle("Q5");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    
}
