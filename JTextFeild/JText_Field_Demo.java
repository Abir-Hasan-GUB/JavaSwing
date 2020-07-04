
package JTextFeild;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author abirh
 */
public class JText_Field_Demo extends JFrame{
    private Container c;
    private JTextField tf1,tf2; // JTextField decler and refferance create.
    private Font f;
    
    JText_Field_Demo(){
        intComponants();
    }
    
    void intComponants(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.yellow);
         
        f = new Font("Arial",Font.ITALIC + Font.BOLD,20);  // initialaize font
        
        tf1 = new JTextField(); // initialize TextField
        tf1.setBounds(50, 50, 200, 50); // set location for JTextField
        c.add(tf1); // add in container.
        tf1.setFont(f); /// set font in textfield
        tf1.setForeground(Color.yellow); // set foreground color
        tf1.setBackground(Color.green); // set bg color
        tf1.setHorizontalAlignment(JTextField.CENTER);  // text alignment in JTextField
       
        tf2 = new JTextField(); // initialize TextField
        tf2.setBounds(50, 110, 200, 50); // set location for JTextField
        tf2.setFont(f);
        c.add(tf2); // add in container.
        tf2.setForeground(Color.yellow); // set foreground color
        tf2.setBackground(Color.DARK_GRAY); // set bg color
        tf2.setHorizontalAlignment(JTextField.CENTER);  // text alignment in JTextField
        
    }
    
    public static void main(String[] args) {
        JText_Field_Demo frame = new JText_Field_Demo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,50,500,400);
        frame.setTitle("JText Field Demo");
        frame.setResizable(false);
    }
    
}
