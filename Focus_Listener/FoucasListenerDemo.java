
package Focus_Listener;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author abirh
 */
public class FoucasListenerDemo extends JFrame{
     Container c;
     JButton button;
     JTextArea ta; 
     JScrollPane scroll;
    FoucasListenerDemo(){
        initComponants();
    }
    
    public void initComponants(){
        this.setVisible(true);
        this.setBounds(900, 100, 350, 350);
        this.setTitle("Focus Listener: ");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.pink);
        
        button = new JButton("Button");
        button.setBounds(20, 50, 100, 40);
        c.add(button);
        
        ta = new JTextArea();
        
        scroll = new JScrollPane(ta);
        scroll.setBounds(20, 100, 200, 200);
        c.add(scroll);
    
        
        button.addFocusListener(new FocusListener(){
            @Override
            public void focusGained(FocusEvent fe) {
                ta.append("Focus Gained \n");
            }

            @Override
            public void focusLost(FocusEvent fe) {
                ta.setText("Focus Lost \n");
            }
        
        
        });
    }
    
    public static void main(String[] args) {
        FoucasListenerDemo frame = new FoucasListenerDemo();
    }
}
