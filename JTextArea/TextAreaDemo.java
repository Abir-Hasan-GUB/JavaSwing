
package JTextArea;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author abirh
 */
public class TextAreaDemo extends JFrame{
    
   private Container c;
   private JTextArea ta;  // decler JTExt area
   private Font f;
   private JScrollPane scroll;
    TextAreaDemo(){
        initComponants();
    }
    
    
    void initComponants(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.orange);
        // decler JTextArea//
        ta = new JTextArea();
       // ta.setBounds(50, 50, 300, 200);  // dorkar nai jehetu scrollpane use korci
        // c.add(ta); // eita ar dorkar nai bcz akn txtarea ace scrooll pane er moddhe tai scrool pane ke add korte hobe container er sathe
        
        // Line and word wrapping
        ta.setLineWrap(true); // for line by line control
        ta.setWrapStyleWord(true); //for word by word control
        
        // set font
        f = new Font("Arial",Font.BOLD,20);
        ta.setFont(f);
        
        //set bg and fg
        ta.setBackground(Color.green);
        ta.setForeground(Color.black);
        
        //create scroolPane
        scroll = new JScrollPane(ta, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS); // add text area with JScrollPane.
        scroll.setBounds(50, 50, 300, 200);
        c.add(scroll);
    }
    
    public static void main(String[] args) {
        TextAreaDemo frame = new TextAreaDemo();
        frame.setVisible(true);
        frame.setBounds(100, 50, 500, 400);
        frame.setTitle("Text Area Demo");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
