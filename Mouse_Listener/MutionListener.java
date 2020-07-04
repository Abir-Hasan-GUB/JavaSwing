
package Mouse_Listener;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author abirh
 */
public class MutionListener extends JFrame{
   private Container c;
   private JTextArea ta;
   private JTextField tf;
    MutionListener(){
        initComponants();
    }
    
    public void initComponants(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.pink);
        
        ta = new JTextArea();
        ta.setBounds(10, 20, 200, 200);
        c.add(ta);
        
        tf = new JTextField();
        tf.setBounds(220, 20, 150, 50);
        c.add(tf);
        
        
        ta.addMouseMotionListener(new MouseMotionListener(){
            @Override
            public void mouseDragged(MouseEvent me) {
                tf.setText("Mouse Drug " + me.getX() + " "+me.getY());
            }

            @Override
            public void mouseMoved(MouseEvent me) {
                tf.setText("Mouse Moved " + me.getX() + " "+me.getY());
            }
        
        
        });
    }
    
    public static void main(String[] args) {
        MutionListener frame = new MutionListener();
        
        frame.setVisible(true);
        frame.setBounds(900, 100, 400, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Mouse Mution Listener: ");
        frame.setResizable(false);
    }
}
