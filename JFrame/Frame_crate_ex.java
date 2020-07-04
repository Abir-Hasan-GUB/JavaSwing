
package JFrame;

import javax.swing.JFrame;

/**
 *
 * @author abirh
 */
public class Frame_crate_ex extends JFrame{
    
       Frame_crate_ex(){  //constractor main function e kora jai na
        setBounds(50, 50, 500, 500);
       setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Frame Demo \" With constractor  \""); 
    }
    
    public static void main(String[] args) {
        Frame_crate_ex frame = new Frame_crate_ex();
        
    }
    }

