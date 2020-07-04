
package Project_01__Login_Frame;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author abirh
 */
public class NewFrame extends JFrame{
    Container c;
    private JLabel label;
    NewFrame(){
        initComponants();
    }
    
    void initComponants(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.pink);
        
        label = new JLabel("Welcome to new Frame");
        label.setBounds(110, 50, 250, 50);
        c.add(label);
        
       setBounds(420, 50, 400, 400);
       setTitle("New Frame");
       setVisible(true);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setResizable(false);
    }
    
    public static void main(String[] args) {
        NewFrame fr = new NewFrame();
        
    }
}
