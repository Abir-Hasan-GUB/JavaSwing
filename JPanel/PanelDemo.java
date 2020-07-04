
package JPanel;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author abirh
 */
public class PanelDemo extends JFrame{
    
    Container c;
    JPanel panel1, panel2;
    JButton btn1,btn2,btn3;
    
    PanelDemo(){
        initComponants();
    }
    
    public void initComponants(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.pink);
        
        
        panel1 = new JPanel();
        panel1.setBounds(100, 100, 250, 300);
        panel1.setBackground(Color.red);
        c.add(panel1);
    
        
        panel2 = new JPanel();
        panel2.setBounds(355, 100, 250, 300);
        panel2.setBackground(Color.green);
        c.add(panel2);
    
        btn1 = new JButton("1");
        btn2 = new JButton("2");
        panel1.add(btn1);
        panel1.add(btn2);
        
        btn3 = new JButton("3");
        panel2.add(btn3);
        
    }
    
    public static void main(String[] args) {
        PanelDemo frame = new PanelDemo();
        
        frame.setVisible(true);
        frame.setTitle("Panel Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setBounds(100, 100, 670, 500);

    }
}
