
package java_swing_by_anisul_islam;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author abirh
 */
public class Mssage_Dialog_3 {
    public static void main(String[] args) {
        ImageIcon img = new ImageIcon("C:/Users/abirh/OneDrive - Green University of Bangladesh/Plannig & Achive Targate/Study File ( Targated )/Java Swing Practice By Anisul Islam/Java_Swing_by_Anisul_Islam/src/img/warning.png"); // import img with img obj.
        JOptionPane.showMessageDialog(null, "Hello World", "World!", JOptionPane.PLAIN_MESSAGE,img);
    }
}
