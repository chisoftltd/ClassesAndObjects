/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes.and.objects;

/**
 *
 * @author 1609963
 */
public class IOApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        new IO().getInt("Enter a integer number: ");
        new IO().getDouble("Enter a double number (0.0): ");
        new IO().getChar("Enter a char: ");
        new IO().getString("Enter a string");
    }
    
}
