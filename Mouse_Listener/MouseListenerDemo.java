
package Mouse_Listener;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author abirh
 */


public class MouseListenerDemo extends JFrame{
   private Container c;
   private JTextField tf;
   private JTextArea ta;
   private JScrollPane scroll;
MouseListenerDemo(){
    initComponants();
}

public void initComponants(){
    c = this.getContentPane();
    c.setLayout(null);
    c.setBackground(Color.yellow);
    
    tf = new JTextField();
    tf.setBounds(20, 20, 150, 50);
    c.add(tf);
    
    ta = new JTextArea();
    ta.setBackground(Color.pink);
    
    
    
    scroll = new JScrollPane(ta);
    scroll.setBounds(10, 80, 300, 300);
    c.add(scroll);
    
    
    tf.addMouseListener(new MouseListener(){
        @Override
        public void mouseClicked(MouseEvent me) {
            ta.append("Mouse Clicked\n");
        }

        @Override
        public void mousePressed(MouseEvent me) {
            ta.append("Mouse Pressed\n");
        }

        @Override
        public void mouseReleased(MouseEvent me) {
            ta.append("Mouse Released\n");
        }

        @Override
        public void mouseEntered(MouseEvent me) {
            ta.append("Mouse Entered\n");
        }

        @Override
        public void mouseExited(MouseEvent me) {
            ta.append("Mouse Exit\n");
        }
    
    
    });
}
    
    public static void main(String[] args) {
        MouseListenerDemo frame = new MouseListenerDemo();
        
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(900, 50, 350, 500);
        frame.setResizable(false);
        frame.setTitle("Mouse Listener");
    }
}
