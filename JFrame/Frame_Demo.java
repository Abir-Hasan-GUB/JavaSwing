
package JFrame;

import javax.swing.JFrame;

/**
 *
 * @author abirh
 */
public class Frame_Demo {
    public static void main(String[] args) {
        JFrame frame = new JFrame(); //create JFrame
        frame.setVisible(true); // Visiable JFrame
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //set exit option in defults
        
        //frame.setSize(400, 300); // FRame size height & width
       // frame.setLocationRelativeTo(null); // set frame location into middle size  // only defult size system. Amra use korbo na eta/
        //frame.setLocation(200,50); //set windo location ::: left , top.
        
        frame.setBounds(200, 50, 400, 300); //set location and frame size in one function/
                          /*  1st parameter = left
                            2nd parameter = top
                            3rd parameter = width
                            4th parameter = height*/
        
        frame.setTitle("Frame Demo by Abir Hasan");
        frame.setResizable(false);
        
    }
}
