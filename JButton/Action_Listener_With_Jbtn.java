
package JButton;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author abirh
 */
public class Action_Listener_With_Jbtn extends JFrame{
    private Container c;
    private JButton btn;
    private JTextField tf;
    Action_Listener_With_Jbtn(){
        initCoponants();
    }
    
    void initCoponants(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.yellow);
        
        tf = new JTextField();
        tf.setBounds(50, 50, 150, 50);
        c.add(tf);
        
        btn = new JButton("Clear");
        btn.setBounds(50, 110, 80, 50);
        c.add(btn);
        // create action listener with butn
        btn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
                tf.setText("");  // set empty charecter for clear
            }
        });
        
        
    }
    
    public static void main(String[] args) {
        Action_Listener_With_Jbtn frame = new Action_Listener_With_Jbtn();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,50,500,400);
        frame.setTitle("JButton Action Listener Demo");
        frame.setResizable(false);
    }
}
