/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p1;

import javax.swing.*;

/**
 *
 * @author chong
 */
public class Q1 extends JFrame {

    public Q1() {

        int repeatAgain;
        do {

            try {
                //Get input from user
                String inputFahrenheit = JOptionPane.showInputDialog(null, "Please Enter Fahrenheit temperature :");
                //Try convert input to double
                double celsius = (5.0 / 9.0) * (Double.parseDouble(inputFahrenheit) - 32);
                //Display output
                JOptionPane.showMessageDialog(null, "The Celsius is " + String.format("%.2f", celsius) + "°C");
            } catch (NumberFormatException e) {
                //Error if cant convert input to double
                JOptionPane.showMessageDialog(null, "Please Enter Digit only!");
            }
            
            //Repeat process if user enter yes on the confirmDialog
            repeatAgain = JOptionPane.showConfirmDialog(null, "Would you like to enter another Fahrenheit?", "ConfrimDialog", JOptionPane.YES_NO_OPTION);
        } while (repeatAgain != 1);

    }

}
