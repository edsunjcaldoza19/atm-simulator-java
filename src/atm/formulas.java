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
public class formulas extends msgs {
    msgs obj = new msgs();
    public void withdraw(){
         global.balance[global.index] -= global.withdraw[global.index];
         global.totalwithdraw[global.index] += global.withdraw[global.index];
         obj.displayMsgWithdraw();
    }
    public void deposit(){
        global.balance[global.index] += global.deposit[global.index];
        global.totaldeposit[global.index] += global.deposit[global.index];
        poly obj = new poly();
        obj.displayMsgDeposit();
       
    }
}
