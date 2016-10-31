/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes.and.objects;

import javax.swing.JOptionPane;

/**
 *
 * @author 1609963
 */
public class IO {

    public int getInt(String message) {
        //int userInput = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
        return Integer.parseInt(JOptionPane.showInputDialog(message));
    }

    public double getDouble(String message) {
        return Double.parseDouble((JOptionPane.showInputDialog(message)));
    }

    public char getChar(String message) {
        return (JOptionPane.showInputDialog(message)).charAt(0);
    }

    public String getString(String message) {
        return (JOptionPane.showInputDialog(message));
    }

    public void show(String message) {
        JOptionPane.showMessageDialog(null, message);
    }
}
