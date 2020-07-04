
package Practice_Seassion;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author abirh
 */
public class ShowMessage {
    public static void main(String[] args) {
       // JOptionPane.showMessageDialog(null, "Hellow World");
       ImageIcon img = new ImageIcon("C:/Users/abirh/OneDrive - Green University of Bangladesh/Plannig & Achive Targate/Study File ( Targated )/Java Swing Practice By Anisul Islam/Java_Swing_by_Anisul_Islam/src/img/warning.png");
        //JOptionPane.showMessageDialog(null, "Hellow World","Warning!",2);
        JOptionPane.showMessageDialog(null, "Hellow World","Warning!",-1,img);
        
    }
}
