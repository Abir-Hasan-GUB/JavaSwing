
package Project_02__Multiplection_Table;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author abirh
 */
public class Multiplection_Table extends JFrame{
    // All Method
    private Container c;
    private JLabel imgLabel, imgline, textLabel;
    private JTextArea ta;
    private JTextField tf;
    private JButton clearButton;
    private ImageIcon img,line;
    private Font f,f2;
    private Cursor cursor;
    private JScrollPane scrl;
    
    // Constructor
    Multiplection_Table(){
        intComponants();
        
    }
    
    // an method
    void intComponants(){
        
        // create container & initialize
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);
        
        // create font and initialize
        f = new Font("Times New Roman", Font.BOLD,25);
        f2 = new Font("Times New Roman", Font.BOLD,18);
        
        // get img
        
        img = new ImageIcon(getClass().getResource("multipleication.jpg"));
        imgLabel = new JLabel(img);
        imgLabel.setBounds(28, 10, img.getIconWidth(), img.getIconHeight());
        c.add(imgLabel);
        
        line = new ImageIcon(getClass().getResource("StateLine.png"));
        imgline = new JLabel(line);
        imgline.setBounds(28, 180, img.getIconWidth(), 10);
        c.add(imgline);
        
        // create jlabel for a message.
        textLabel = new JLabel("Enter Any Number: ");
        textLabel.setBounds(20, 200, 250,50);
        c.add(textLabel);
        textLabel.setFont(f);
        
        // create jextfield for input any number
        tf = new JTextField();
        tf.setBounds(242, 200, 90, 50);
        c.add(tf);
        tf.setBackground(Color.white);
        tf.setForeground(Color.blue);
        tf.setFont(f);
        tf.setHorizontalAlignment(JTextField.CENTER);
        
        // create cursor and initialize.
        cursor = new Cursor(Cursor.HAND_CURSOR);
        
        // create a button ( clear )
        clearButton = new JButton("Clear");
        clearButton.setBounds(242, 260, 90, 50);
        c.add(clearButton);
        clearButton.setCursor(cursor); // add cursor
        clearButton.setFont(f2); // add font
        
        // create text area.
        ta = new JTextArea();
        ta.setBackground(Color.DARK_GRAY);
        ta.setFont(f);
        ta.setForeground(Color.YELLOW);
        
        
        //scroll pane
        
        scrl = new JScrollPane(ta,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrl.setBounds(25, 330, 300, 330);
        c.add(scrl);
        
        // Action Listener/
        clearButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
                tf.setText("");
                ta.setText("");
            }
        
        });
        
        
        tf.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                ta.setText("");
                if(tf.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Plese Input Any Number !", "Warning !", JOptionPane.WARNING_MESSAGE);
                }
                else{
                    int num = Integer.parseInt( tf.getText());  // recived string convert to int value.
                
                for (int i = 1; i <= 10; i++) {
                   
                    String r = String.valueOf(num*i);  // covert number to string for text area.
                    String n = String.valueOf(num);
                    String incr = String.valueOf(i);
                    
                    ta.append(n +" X "+incr+ " = "+ r +"\n");  // set all multiplication in text area
                }
                }
                
            }
        
        });
        
    }
    
    
    // main mehtod
    public static void main(String[] args) {
        Multiplection_Table frame = new Multiplection_Table();
        
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setBounds(400, 20, 360, 700);
        frame.setTitle("Multipliction Table");
    }
}
