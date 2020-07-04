
package Password_Field;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPasswordField;

/**
 *
 * @author abirh
 */
public class Password_Field_Demo extends JFrame{
    private Container c;
    private JPasswordField pf;  // crate password field with reff...
    Password_Field_Demo(){
        initComponants();
    }
    
    void initComponants(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.blue);
        
        pf = new JPasswordField(); 
        pf.setEchoChar('*');  // chenge defult mode of password input
        pf.setBackground(Color.yellow);
        pf.setForeground(Color.blue);
        pf.setBounds(50, 20, 150, 50);
        c.add(pf);
        
    }
    
    public static void main(String[] args) {
        Password_Field_Demo frame = new Password_Field_Demo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,50,500,400);
        frame.setTitle("Password Field Demo");
        frame.setResizable(false);
    }
}
