
package JToggoleButton;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JToggleButton;

/**
 *
 * @author abirh
 */
public class ToggolDemo extends JFrame implements ActionListener{
    Container c;
    JToggleButton tb;
    JLabel label;
    ImageIcon OnIcon,OffIcon;
    
    ToggolDemo(){
        initComponants();
    }
    
    public void initComponants(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.pink);
        
        OnIcon = new ImageIcon("src/img/on.png");
        OffIcon = new ImageIcon("src/img/off.png");
        
         
        tb = new JToggleButton(OffIcon);
        tb.setBounds(50,50, 100, 100);
        c.add(tb);
        
        label = new JLabel("Hello World");
        label.setBounds(50, 150, 150, 50);
        c.add(label);
        label.setVisible(false);
        
        
        
        tb.addActionListener(this);
    }
    
    public static void main(String[] args) {
        ToggolDemo frame = new ToggolDemo();
        
        frame.setVisible(true);
        frame.setBounds(700, 100, 400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("J ToggolButton: ");
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
    
        if(tb.isSelected()){
            label.setVisible(true);
            tb.setIcon(OnIcon);
        }
        else{
            label.setVisible(false);
            tb.setIcon(OffIcon);
        }
    }
}
