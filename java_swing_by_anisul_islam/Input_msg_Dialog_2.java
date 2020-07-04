
package java_swing_by_anisul_islam;

import javax.swing.JOptionPane;

/**
 *
 * @author abirh
 */
public class Input_msg_Dialog_2 {
    public static void main(String[] args) {
        String f_name = JOptionPane.showInputDialog(null,"Enter Your First Name: ", "Name !", 2);
        String l_name = JOptionPane.showInputDialog(null, "Enter Your Second Name: ", "Name !",2);
        String name = f_name +" " + " "+l_name;
        JOptionPane.showMessageDialog(null,"Your Name is: "+name);
        
    }
}
