
package Layout_Maneger;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author abirh
 */
public class CardLayoutDemo extends JFrame implements ActionListener{
    Container c;
    CardLayout cl;
    JButton btn1,btn2,btn3;
    CardLayoutDemo(){
        initComponants();
    }
    
    public void initComponants (){
        c = this.getContentPane();
        cl = new CardLayout();
        c.setLayout(cl);
        
        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        
        c.add(btn1,"first");
        c.add(btn2,"second");
        c.add(btn3,"third");
        
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
    }
    
    public static void main(String[] args) {
        CardLayoutDemo frame = new CardLayoutDemo();
        frame.setVisible(true);
        frame.setBounds(100, 100, 300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Card Layout: ");
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        cl.next(c);
    }
}
