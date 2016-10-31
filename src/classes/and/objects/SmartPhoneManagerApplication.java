/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes.and.objects;

import javax.swing.JOptionPane;

/**
 *
 * @author 1609963 (benjamin Chinwe)
 * 
 * Task A Implement (i.e. write the code) the SmartPhone Class. Include header comments
 * about Author, date and purpose of class at the top of file. Lay out your code in a
 * clear, readable format. Include comments describing what each method does.
 * 
 * Task B Create a simple test application that allows you to test that your SmartPhone Class
 * methods are functioning properly.
 * 
 * Task C Implement a SmartPhoneManagerApplication that uses the methods of the
 * SmartPhone Class to create and use a SmartPhone object using a basic user menu.
 */
public class SmartPhoneManagerApplication {

    private static String userName;
    private static double userBalance;
    private static int choice;

    public static void main(String[] args) {
        userName = JOptionPane.showInputDialog("Enter name:");
        userBalance = Double.parseDouble(JOptionPane.showInputDialog("Enter initial Balance:"));
        SmartPhone smartPhone = new SmartPhone(userName, userBalance);
        do {
            choice = Integer.parseInt(JOptionPane.showInputDialog("1 - top-up balance\n"
                    + "2 - make call\n3 - send text\n4 - purchase an app\n"
                    + "5 - display balance\n"
                    + "6 - display all account info(name balance account type)\n"
                    + "7 - refund balance\n8 - Transfer balance\n0 - Quit"));
            switch (choice) {
                case 1:
                    smartPhone.topup(Integer.parseInt(JOptionPane.showInputDialog("Enter amount to top-up")));
                    JOptionPane.showMessageDialog(null, smartPhone.getBalancePence() + " pence or " + smartPhone.getBalancePounds() + " pounds.");
                    break;
                case 2:
                    smartPhone.deductCallCost(Double.parseDouble(JOptionPane.showInputDialog("Enter call duration")));
                    JOptionPane.showMessageDialog(null, smartPhone.getBalancePence() + " pence or " + smartPhone.getBalancePounds() + " pounds.");
                    break;
                case 3:
                    smartPhone.deductTextCost();
                    JOptionPane.showMessageDialog(null, smartPhone.getBalancePence() + " pence or " + smartPhone.getBalancePounds() + " pounds.");
                    break;
                case 4:
                    smartPhone.deductAppCost(Double.parseDouble(JOptionPane.showInputDialog("Enter App cost")));
                    JOptionPane.showMessageDialog(null, smartPhone.getBalancePence() + " pence or " + smartPhone.getBalancePounds() + " pounds.");
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, smartPhone.getBalancePence() + " pence or " + smartPhone.getBalancePounds() + " pounds.");
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, smartPhone.toString());
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, smartPhone.getBalancePence() + " pence or " + smartPhone.getBalancePounds() + " pounds. To refund!");
                    break;
                case 8:
                    smartPhone.balanceTransfer(Integer.parseInt(JOptionPane.showInputDialog("Enter amount to transfer:")));
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Thanks for stopping by and using my app. CHISOFT INC");
            }
        } while (choice != 0);

    }
}
