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
public class msgs extends msg_class{
    public void displayMsgWithdraw(){
        msg_class obj = new msg_class();
        obj.transfer();
    }
    public void displaymsgWithdrawErr(){
       msg_class obj = new msg_class();
        obj.transferErr();
    }
}
//POLYMORPHISM
class poly{
     public void displayMsgDeposit(){
         JOptionPane.showMessageDialog(null, "You deposit " + global.deposit[global.index] + " to your account.");
    }
}
class polymorph extends poly{
    @Override
    public void displayMsgDeposit(){
        JOptionPane.showMessageDialog(null, "You deposit " + global.deposit[global.index] + " to your account.");
    }
}
