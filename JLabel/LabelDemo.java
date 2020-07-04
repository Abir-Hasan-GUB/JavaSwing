
package JLabel;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author abirh
 */
public class LabelDemo extends JFrame{
           private Container c;  // container decler and create
           private JLabel userLabel,passLabel; // label decler and create
           private Font f;
        LabelDemo(){
            initComponants();
        }
        
        void initComponants(){
           c = this.getContentPane();
           c.setLayout(null);  // layout off kore dici akn coustom wise label gulo rakhte parbo.
           c.setBackground(Color.black);
           
           f = new Font("Arial",Font.BOLD,14); // initilaze font ob and set all propertice ( font name, font style, font size)
           
           userLabel = new JLabel(); /// JLabel er obj create korlam...
           userLabel.setText("Enter Your UserName: "); // label e ekti text rakhlam
            //System.out.println("User Label Txt is: "+userLabel.getText());  // show label text and print it from this method
           userLabel.setBounds(50,20,200,50);  /// label size in frame.
           c.add(userLabel); // userlabel ke container er moddhe rakhlam.
           userLabel.setFont(f);  // set font in label
           userLabel.setForeground(Color.white);
           userLabel.setOpaque(true); // label er bg colore age on korlam
           userLabel.setBackground(Color.orange); //set bg color of label.
           userLabel.setToolTipText("Enter Your Name");  // show a message when carsar is in a label
            System.out.println("Tool_Tip_Text is: "+userLabel.getToolTipText()); // show label  text when carsar in here and print it from this method
           
           passLabel = new JLabel("Enter Your Password: "); // create second label and direct initialize
           passLabel.setBounds(50,70,200,50);
           c.add(passLabel);
           passLabel.setFont(f);
           passLabel.setForeground(Color.black);
           passLabel.setBackground(Color.white);
           passLabel.setOpaque(true);
          
        }
    
    public static void main(String[] args) {
        LabelDemo frame = new LabelDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,200,500,400);
        frame.setTitle("JLabel Demo");
        frame.setResizable(false);
    }
    
}
