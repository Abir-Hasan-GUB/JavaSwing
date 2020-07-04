
package JTabbedPane;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 *
 * @author abirh
 */
public class JTabbedPaneDemo extends JFrame{
    Container c;
    JTabbedPane tb;
    JPanel panel1,panel2,panel3;
    JLabel label1,label2,label3;
    ImageIcon home,help;
    
    JTabbedPaneDemo(){
        initComponants();
    }
        public void initComponants(){
            c = this.getContentPane();
            c.setLayout(null);
            c.setBackground(Color.yellow);
            
            tb = new JTabbedPane();
            tb.setBounds(50, 50, 300, 300);
            c.add(tb);
            
            home = new ImageIcon("src/JTabbedPane/home.jpg");
            help = new ImageIcon("src/JTabbedPane/help.png");
            
            panel1  = new JPanel();
            panel1.setBackground(Color.green);
            panel2  = new JPanel();
            panel2.setBackground(Color.red);
            panel3  = new JPanel();
            panel3.setBackground(Color.blue);
            
            tb.addTab("Home",home, panel1); // name, icon, position in panel
            tb.addTab("About", panel2);
            tb.addTab("Contuct",help, panel3,"Hello I am Help"); // 4th parameter is tooltip
            
            label1 = new JLabel("This is Label 1");
            panel1.add(label1);
            
            label2 = new JLabel("This is Label 2");
            panel2.add(label2);
            
            label3 = new JLabel("This is Label 3");
            panel3.add(label3);
            
            
            
        }
    public static void main(String[] args) {
        
        JTabbedPaneDemo frame = new JTabbedPaneDemo();
        frame.setVisible(true);
        frame.setTitle("JTabbed Pane:");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(700, 100, 400, 450);
        frame.setResizable(false);
    }
    
}
