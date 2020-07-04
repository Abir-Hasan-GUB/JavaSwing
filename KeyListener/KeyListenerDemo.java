
package KeyListener;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author abirh
 */
public class KeyListenerDemo extends JFrame{
    Container c;
    Font f;
    JTextArea txt;
    JTextField tf;
    
    KeyListenerDemo(){
        initComponants();
    }
    
    void initComponants(){
        c = this.getContentPane();
        c.setLayout(null);
        //c.setBackground(Color.yellow);
        
        f = new Font("Arial",Font.BOLD,18);
        
        txt = new JTextArea();
        txt.setBounds(50, 150, 250, 200);
        txt.setBackground(Color.pink);
        c.add(txt);
        txt.setFont(f);
        
        tf = new JTextField();
        tf.setBounds(50, 50, 100, 50);
        tf.setBackground(Color.white);
        c.add(tf);
        
        //add key listener
        tf.addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e) {
                txt.append("Key Typed: "+e.getKeyChar()+"\n");
            }

            @Override
            public void keyPressed(KeyEvent e) {
                 txt.append("Key Pressed: "+e.getKeyChar()+"\n");
            }

            @Override
            public void keyReleased(KeyEvent e) {
                 txt.append("Key Released: "+e.getKeyChar()+"\n");
            }
        
        
        
        
        });
        
        
        
    }
    
    public static void main(String[] args) {
        KeyListenerDemo frame = new KeyListenerDemo();
        
        frame.setVisible(true);
        frame.setBounds(100, 100, 400, 400);
        frame.setTitle("Key Listener");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
