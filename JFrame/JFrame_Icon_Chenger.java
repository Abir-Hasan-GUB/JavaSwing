
package JFrame;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author abirh
 */
public class JFrame_Icon_Chenger extends JFrame{
    
        private ImageIcon icon; // ekhane decler korci jate sob jaiga theke access korte pari.
        // tachara locally "ImageIcon icon =  new ImageIcon();" eivabeo decler korte partam...
        
        JFrame_Icon_Chenger(){
            
            initComponants();
        }
        
        public void initComponants(){
            icon = new ImageIcon(getClass().getResource("calculatior.png"));
            this.setIconImage(icon.getImage());
        }
    
    public static void main(String[] args) {
        JFrame_Icon_Chenger frame = new JFrame_Icon_Chenger();
        
        frame.setVisible(true);
        frame.setBounds(200,200,500,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Frame Title !");
        frame.setResizable(false);
    }
}
