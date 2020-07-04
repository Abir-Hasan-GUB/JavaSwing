
package JFrame;

import javax.swing.JFrame;

/**
 *
 * @author abirh
 */
public class JFrame_Use_Constractor extends JFrame{
    
    JFrame_Use_Constractor(){
            setBounds(100, 100, 400, 400);
            setTitle("This is A Title: ");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        JFrame_Use_Constractor frame = new JFrame_Use_Constractor();
        frame.setVisible(true);
       
        
    }
}
