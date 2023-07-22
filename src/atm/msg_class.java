/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */

public class msg_class{
    
    interface msgOption{
    public void displayMsgWithdraw();
    public void displayMsgWithdrawErr();
}
    class msg extends msg_class implements msg_class.msgOption{
        
       @Override
       public void displayMsgWithdraw(){
         JOptionPane.showMessageDialog(null, "You withdrawn a total of " + global.withdraw[global.index] + " from your account");
    }
       @Override
       public void displayMsgWithdrawErr(){
           JOptionPane.showMessageDialog(null, "Sorry, your current balance is not enough to proceed in this transaction: " + "\n" + "Current Balance" + global.balance [global.index]);
       }
    }
    
    public void transfer(){
        msgOption obj = new msg();
        obj.displayMsgWithdraw();
    }
     public void transferErr(){
        msgOption obj = new msg();
        obj.displayMsgWithdrawErr();
    }
}
