
package JColorChoser;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;

/**
 *
 * @author abirh
 */
public class ColorChooserDemo extends JFrame{
    Container c;
    JButton bt;
    ColorChooserDemo(){
        initComponants();
    }
    
    public void initComponants(){
        c = this.getContentPane();
        c.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(200, 100, 500, 400);
        this.setTitle("JColor Choocer: ");
        this.setResizable(false);
        
        bt = new JButton("Chooce a color");
        bt.setBounds(100, 50, 150, 50);
        c.add(bt);
      
        bt.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
               Color color = JColorChooser.showDialog(null , "Select a color", Color.yellow);
               c.setBackground(color);
            }
        
        });
        
    }
    
    public static void main(String[] args) {
        ColorChooserDemo frame = new ColorChooserDemo();
        frame.setVisible(true);
    }
}
