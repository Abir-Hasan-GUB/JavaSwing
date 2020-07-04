
package JLabel;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author abirh
 */
public class Set_Img_In_Jlabel extends JFrame{
        private Container c;
        private JLabel imgLabel;
        private ImageIcon img;
        Set_Img_In_Jlabel(){
            intComponants();
        }
        
        void intComponants(){
           c = this.getContentPane();
           c.setLayout(null);
           c.setBackground(Color.yellow);
           
           img = new ImageIcon(getClass().getResource("cat1.png"));
           
           imgLabel = new JLabel(img);
           imgLabel.setBounds(50,30,img.getIconWidth(),img.getIconHeight());
           c.add(imgLabel);
           
        }
    public static void main(String[] args) {
        Set_Img_In_Jlabel frame = new Set_Img_In_Jlabel ();
        
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setBounds(100,100,500,400);
        frame.setTitle("Set Image in JLable - ");
    }
}
