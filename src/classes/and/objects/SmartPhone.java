/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes.and.objects;

import com.sun.imageio.plugins.common.I18N;
import javax.swing.JOptionPane;

/**
 *
 * @author 1609963 (Benjamin Chinwe)
 *
 * A SmartPhone Class which should be capable of storing details of each
 * SmartPhone account, and be capable of facilitating a range of operations on
 * the account;
 */
public class SmartPhone {

    String name;
    double balance;
    double pencePerSecond = 0.17 / 100;
    double pencePerText = 12 / 100;

    //Constructor
    public SmartPhone(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    /*
    topup a void method to top-up the balance by an amount specified by a 
    double parameter
     */
    public void topup(double amount) {
        balance = balance + amount;
    }

    /*
    deductCallCost a void method to the deduct cost of a call from balance for a given call
    time in seconds specified by a double parameter
     */
    public void deductCallCost(double time) {
        if (balance < (pencePerSecond * time)) {
            //JOptionPane.showMessageDialog(null, getBalancePence() + " pence or " + getBalancePounds() + " pounds.");
            if (JOptionPane.showInputDialog(getBalancePence() + " pence or " + getBalancePounds() + " pounds.\n" + "Sorry you are in debt!\n Do you want top-up now (y/n)?").charAt(0) == 'y') {
                topup(Integer.parseInt(JOptionPane.showInputDialog("Enter amount to top-up")));
                JOptionPane.showMessageDialog(null, getBalancePence() + " pence or " + getBalancePounds() + " pounds.");
                balance = balance - (pencePerSecond * time);
                JOptionPane.showMessageDialog(null, "Call successful!");
            } else {
                JOptionPane.showMessageDialog(null, "Call failed!");
            }
        } else if (balance > pencePerText) {
            balance = balance - (pencePerSecond * time);
            JOptionPane.showMessageDialog(null, "Call successful!");
        }

    }

    /*
        deductTextCost a void method to deduct the cost of a single text message from balance
     */
    public void deductTextCost() {
        if (balance < pencePerText) {
            //JOptionPane.showMessageDialog(null, getBalancePence() + " pence or " + getBalancePounds() + " pounds.");
            if (JOptionPane.showInputDialog(getBalancePence() + " pence or " + getBalancePounds() + " pounds.\n" + "Sorry you insufficent balance!\n Do you want top-up now (y/n)?").charAt(0) == 'y') {
                topup(Integer.parseInt(JOptionPane.showInputDialog("Enter amount to top-up")));
                JOptionPane.showMessageDialog(null, getBalancePence() + " pence or " + getBalancePounds() + " pounds.");
                balance = balance - pencePerText;
                JOptionPane.showMessageDialog(null, "Texting successful!");
            } else {
                JOptionPane.showMessageDialog(null, "Texting failed!");
            }
        } else if (balance > pencePerText) {
            balance = balance - pencePerText;
            JOptionPane.showMessageDialog(null, "Texting successful!");
        }

    }

    /*
    deductAppCost a void method to purchase a smartphone app of a cost specified by a
    double parameter
     */
    public void deductAppCost(double appCost) {
        if (balance < appCost) {
            //JOptionPane.showMessageDialog(null, getBalancePence() + " pence or " + getBalancePounds() + " pounds.");
            if (JOptionPane.showInputDialog(getBalancePence() + " pence or " + getBalancePounds() + " pounds.\n" + "Sorry you insufficent balance!\n Do you want top-up now (y/n)?").charAt(0) == 'y') {
                topup(Integer.parseInt(JOptionPane.showInputDialog("Enter amount to top-up")));
                JOptionPane.showMessageDialog(null, getBalancePence() + " pence or " + getBalancePounds() + " pounds.");
                balance = balance - appCost;
                JOptionPane.showMessageDialog(null, "App purchase successful!");
            } else {
                JOptionPane.showMessageDialog(null, "App purchase failed!");
            }
        } else if (balance > appCost) {
            balance = balance - appCost;
            JOptionPane.showMessageDialog(null, "App purchase successful!");
        }
    }

    /*
    getBalancePence a method that returns a double value representing display the current
    balance of the account in pence
     */
    public double getBalancePence() {
        return balance * 100;
    }

    /*
    getBalancePounds a method that returns a double value representing display the current
    balance of the account in pounds
     */
    public double getBalancePounds() {
        return balance * 100;
    }

    /*
    getName a method returning a String equal to the customer’s name
     */
    public String getName() {
        return name;
    }

    /*
    toString a method returning a String describing the full details of the account (customer
    name and balance)
     */
    @Override
    public String toString() {
        return "SmartPhone{" + "name=" + getName() + ", balance=" + getBalancePence() + '}';
    }

    /*
    closeAccount a method that returns the remaining balance refund the remaining balance
    as a double, and sets the remaining balance to zero
     */
    public double closeAccount() {
        double endBal = 0.0;
        if (balance > 0.0) {
            endBal = balance;
            balance = 0.0;
        }
        return endBal;
    }

    /*
    setPencePerSecond a void method that takes one double parameter and uses it to set
    the value of the class-level variable pencePerSecond
     */
    public void setPencePerSecond(double amount) {
        pencePerSecond = amount;
    }

    /*
    setPencePerText a void method that takes one double parameter and uses it to set
    the value of the class-level variable pencePerText
     */
    public void setPencePerText(double amount) {
        pencePerText = amount;
    }

    public void balanceTransfer(double trfAmt) {
        double tempAmt = trfAmt;
        if (balance < 0.0) {
            //JOptionPane.showMessageDialog(null, getBalancePence() + " pence or " + getBalancePounds() + " pounds.");
            if (JOptionPane.showInputDialog(getBalancePence() + " pence or " + getBalancePounds() + " pounds.\n" + "Sorry you insufficent balance!\n Do you want top-up now (y/n)?").charAt(0) == 'y') {
                topup(Integer.parseInt(JOptionPane.showInputDialog("Enter amount to top-up")));
                balance = balance - trfAmt;
                JOptionPane.showMessageDialog(null, "Transfer successful!\nYour new balance " + getBalancePence() + " pence or " + getBalancePounds() + " pounds.");
            } else {
                JOptionPane.showMessageDialog(null, "Transfer failed!");

            }
        } else if (balance < trfAmt) {
            //JOptionPane.showMessageDialog(null, getBalancePence() + " pence or " + getBalancePounds() + " pounds.");
            if (JOptionPane.showInputDialog(getBalancePence() + " pence or " + getBalancePounds() + " pounds.\n" + "Sorry you insufficent balance!\n Do you want top-up now (y/n)?").charAt(0) == 'y') {
                topup(Integer.parseInt(JOptionPane.showInputDialog("Enter amount to top-up")));
                balance = balance - trfAmt;
                JOptionPane.showMessageDialog(null, "Transfer successful!\nYour new balance " + getBalancePence() + " pence or " + getBalancePounds() + " pounds.");
            } else {
                JOptionPane.showMessageDialog(null, "Transfer failed!");
            }
        } else if (balance > trfAmt) {
            balance = balance - trfAmt;
            JOptionPane.showMessageDialog(null, "Transfer successful!\nYour new balance " + getBalancePence() + " pence or " + getBalancePounds() + " pounds.");

        }
    }
}
