
package p1;

import javax.swing.JButton;
import javax.swing.JFrame;


public class Q2 extends JFrame{
    //Create a Button Compoment
    private JButton jbtn = new JButton("Hello");

    public Q2() {
        //add button into Jframe
        add(jbtn);
        
        //Set Jframe setting
        setSize(500,600);
        setTitle("One Frame");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    
}
