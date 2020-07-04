
package JButton;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author abirh
 */
public class ButtonDemo extends JFrame{
    Container c;
    JButton jbtn;
    Font f;
    Cursor cursor;
    ImageIcon img;
    ButtonDemo(){
        initComponants();
    }
    
    void initComponants(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.red);
        // cursor crete.
        cursor = new Cursor(Cursor.HAND_CURSOR);  // one parameter 
         // set img inside btn
        img = new ImageIcon(getClass().getResource("clear.png"));
       // jbtn.setIcon(img);
        
        // creat butn
        jbtn = new JButton(img); // direct img set
        jbtn.setBounds(50, 50, 100, 50);
        c.add(jbtn);
        jbtn.setText("Cleck");
        // set bg and fg
        jbtn.setBackground(Color.orange);
        jbtn.setForeground(Color.blue);
        // set cursor
         jbtn.setCursor(cursor);  // set jcursor in jbtn.  // button creat er sobar ses e ei function ti add korte h0i
        // set Font
        f = new Font("Arial",Font.BOLD,16);
        jbtn.setFont(f);
        
       
        
        
        
    }
    public static void main(String[] args) {
        ButtonDemo frame = new ButtonDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,50,500,400);
        frame.setTitle("JButton Demo");
        frame.setResizable(false);
    }
}
