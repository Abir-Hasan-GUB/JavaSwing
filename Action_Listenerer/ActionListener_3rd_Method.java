
package Action_Listenerer;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author abirh
 */
public class ActionListener_3rd_Method extends JFrame implements ActionListener{
    Container c;
    Font f;
    Cursor cursor;
    JButton btn1,btn2,btn3;
    ActionListener_3rd_Method(){
        intComponants();
    }
    
    void intComponants(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.yellow);
        
        f = new Font("Times New ROman",Font.BOLD,14);
        
        cursor = new Cursor(Cursor.HAND_CURSOR);
        
        btn1 = new JButton("RED");
        btn1.setBounds(50, 50, 100, 60);
        btn1.setCursor(cursor);
        c.add(btn1);
        
        btn2 = new JButton("GREEN");
        btn2.setBounds(50, 200, 100, 60);
        btn2.setCursor(cursor);
        c.add(btn2);
        
        btn3 = new JButton("BLUE");
        btn3.setBounds(50, 350, 100, 60);
        btn3.setCursor(cursor);
        c.add(btn3);
        
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
      /*  
        //button 1
        btn1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                c.setBackground(Color.red);
            }
            
        });
        
        //button 2
        btn2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                c.setBackground(Color.green);
            }
            
        });
        
        //button 3
        btn3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                c.setBackground(Color.blue);
            }
            
        });
        */
      
      
    }
    
    public static void main(String[] args) {
        ActionListener_3rd_Method frame = new ActionListener_3rd_Method();
        
        frame.setVisible(true);
        frame.setBounds(100, 100, 600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setTitle("Action Listener 3rd Method");
    }
        //3rd method of action listener...
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource().equals(btn1)){
            c.setBackground(Color.red);
        }
        else if(e.getSource().equals(btn2)){
            c.setBackground(Color.green);
        }
        else{
            c.setBackground(Color.blue);
        }
    }
}
