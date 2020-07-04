
package JComboBox;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author abirh
 */
public class ComboBoxDemo extends JFrame{
    
   private Container c;
   private Font f;
   private JComboBox cb;
   private String[] proLanguage = {"C","C++","JAVA","PHP","Python"};
   private JLabel label,btnlabel;
   private JButton btn;
   private Cursor cursor;
    ComboBoxDemo(){
        initComponants();
    }
    
    public void initComponants(){
    c = this.getContentPane();
    c.setLayout(null);
    c.setBackground(Color.yellow);
    
    f = new Font("Arial",Font.BOLD,16);
    label = new JLabel("No Item Select..");
    label.setBounds(160, 150, 200, 50);
    c.add(label);
    
    btnlabel = new JLabel("Select by Btn: ");
    btnlabel.setBounds(160, 250, 200, 50);
    c.add(btnlabel);
    
    cursor = new Cursor(Cursor.HAND_CURSOR); // chenge cursor
    //comboBox
    
    cb = new JComboBox(proLanguage);
    cb.setBounds(50, 150, 100, 50);
    cb.setEditable(true); // do editable menu
    c.add(cb);
    
    //JButton///
    
    btn = new JButton("Show");
    btn.setBounds(50, 250, 80, 50);
    c.add(btn);
    btn.setCursor(cursor); // set cursor
    
//        cb.setSelectedIndex(3); // preSelected item of combo box
//        cb.setSelectedItem("JAVA"); // preselected by direct string
//        System.out.println("TOtal Item = "+cb.getItemCount()); // count all item of combo box
        cb.addItem("Abir"); //add extra item in combo box..
//        cb.removeItem("JAVA"); // remove java from list
//        cb.removeItemAt(4); //remove an item by index
//        cb.removeAll();// remove all from item
        
    // Action Listener...
    cb.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            String s = cb.getSelectedItem().toString();
            label.setText("You Have Selected: "+s);
        }
        
    });
    btn.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            String s = cb.getSelectedItem().toString();
            btnlabel.setText("You Have Selected (BTN): "+s);
        }
        
    });
    
    
    }
    public static void main(String[] args) {
        ComboBoxDemo frame = new ComboBoxDemo();
        
        frame.setVisible(true);
        frame.setBounds(100, 100, 500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setTitle("JCombo BOx Demo");
    }
}
