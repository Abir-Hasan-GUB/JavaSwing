
package Layout_Maneger;

import java.awt.Color;
import java.awt.Container;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author abirh
 */
public class BoxLayout_Demo extends JFrame{
    private Container c;
    private BoxLayout box;
    private JButton btn1,btn2,btn3,btn4,btn5;
    BoxLayout_Demo(){
        initComponants();
    }
    
    public void initComponants(){
        c = this.getContentPane();
       box = new BoxLayout(c,BoxLayout.X_AXIS);  // paramenter 1 = set contaienr (jekhane 
                                                 // align korbe box.
                                               // parametter 2 = horizental or vertically
       c.setLayout(box);
       c.setBackground(Color.yellow);
       
       btn1 = new JButton("1");
       btn2 = new JButton("2");
       btn3 = new JButton("3");
       btn4 = new JButton("4");
       btn5 = new JButton("5");
       
       
       c.add(btn1);
       c.add(Box.createHorizontalStrut(10)); // for gap between box's
       c.add(btn2);
       c.add(Box.createHorizontalStrut(10)); // for gap between box's
       c.add(btn3);
       c.add(Box.createHorizontalStrut(10)); // for gap between box's
       c.add(btn4);
       c.add(Box.createHorizontalStrut(10)); // for gap between box's
       c.add(btn5);
    }
    
    public static void main(String[] args) {
        BoxLayout_Demo frame = new BoxLayout_Demo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 300, 300);
        frame.setTitle("Box Layout");
        frame.setResizable(false);
        
    }
    
}
