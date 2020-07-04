
package java_swing_by_anisul_islam;

import javax.swing.JOptionPane;

/**
 *
 * @author abirh
 */
public class Mssage_Dialog_2 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "You Are Hacked!!!", "Warning!", JOptionPane.ERROR_MESSAGE); // use full messsage
        JOptionPane.showMessageDialog(null, "Hacked!!!", "Warning!", 2); //use IDE valu on 4th parameter.
        /*
            1st Parameter = window location
            2nd Parameter = Dispalay Dialog
            3rd Parameter = Title chenger
            4th Parameter = Icon Chenger ( Two Type )- 1. Full Messges likhte hoi. 2. only  IDE value dilei kaj hoi
        */
    }
}
