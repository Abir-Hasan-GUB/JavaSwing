
package java_swing_by_anisul_islam;

import javax.swing.JOptionPane;

/**
 *
 * @author abirh
 */
public class Input_msg_Dialog_1 {
    public static void main(String[] args) {
        //String name = JOptionPane.showInputDialog("Enter Your Name: "); // Get input
        //JOptionPane.showMessageDialog(null, name + " Welcome to Swing"); // show output as a message.
       int choice = JOptionPane.showConfirmDialog(null,"Do You Want Quit ?","Title Chenger",JOptionPane.YES_NO_CANCEL_OPTION);
       if(choice == JOptionPane.YES_OPTION){
           System.out.println("You Select Yes Option"+choice);
       }
       else if(choice == JOptionPane.CANCEL_OPTION){
           System.out.println("You select Cancel Option"+choice);
       }
       else
            System.out.println("You Select No option"+choice);
    }
}
