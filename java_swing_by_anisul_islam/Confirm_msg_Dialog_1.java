
package java_swing_by_anisul_islam;

import javax.swing.JOptionPane;

/**
 *
 * @author abirh
 */
public class Confirm_msg_Dialog_1 {
    public static void main(String[] args) {
        int choice = JOptionPane.showConfirmDialog(null, "Do You Want to Quit ?", "Quit !!!",JOptionPane.YES_NO_OPTION);
        if(choice == JOptionPane.YES_OPTION){
            System.exit(0);
        }else{
            System.out.println("You will Select No Option !");
        }
    }
}
