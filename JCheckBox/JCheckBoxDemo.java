package JCheckBox;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author abirh
 */

public class JCheckBoxDemo extends JFrame{
    
    Container c;
    JCheckBox javacheckBox,cCheckBox,mysQlCheckBox;
    ButtonGroup buttongroup;
    Font f;
    JLabel label;
    
    JCheckBoxDemo(){
        initComponants();
    }
    
    void initComponants(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.orange);
        buttongroup = new ButtonGroup(); // crate btn group
        f = new Font("Arial",Font.BOLD,18);
        
        javacheckBox = new JCheckBox("Java");
        javacheckBox.setBounds(50, 100, 100, 30);
        c.add(javacheckBox);
        javacheckBox.setBackground(Color.orange);
        buttongroup.add(javacheckBox);  // add btn group
        javacheckBox.setFont(f);
        //javacheckBox.setSelected(true);  // preselect a box
        
        cCheckBox = new JCheckBox("C Programming");
        cCheckBox.setBounds(50, 130, 130, 30);
        c.add(cCheckBox);
        cCheckBox.setBackground(Color.orange);
        cCheckBox.setFont(f);
        buttongroup.add(cCheckBox);
        
        mysQlCheckBox = new JCheckBox("mySQL");       
        mysQlCheckBox.setBounds(50, 160, 100, 30);
        c.add(mysQlCheckBox);
        mysQlCheckBox.setBackground(Color.orange);
        mysQlCheckBox.setFont(f);
        buttongroup.add(mysQlCheckBox);
        
        //jlabel
        label = new JLabel("You have not selected anythings..");
        label.setBounds(50, 200, 300, 30);
        c.add(label);
        /*
        // action listener add
        Handler handler = new Handler();
        javacheckBox.addActionListener(handler);
        cCheckBox.addActionListener(handler);
        mysQlCheckBox.addActionListener(handler);
        */
        
        //ItemListener
        Handler handler = new Handler();
        javacheckBox.addItemListener(handler);
        cCheckBox.addItemListener(handler);
        mysQlCheckBox.addItemListener(handler);
    }
    // action listener class
    /*
    class Handler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
           if(javacheckBox.isSelected()){
               label.setText("Java Select...");
           }
           else if(cCheckBox.isSelected()){
               label.setText("C Programming selected...");
           }
           else
               label.setText("MySQL Selected...");
        }
        
    }
*/
    
//    Start Item LIstener...
    class Handler implements ItemListener{

        @Override
        public void itemStateChanged(ItemEvent e) {
            if(e.getSource() == javacheckBox){
                label.setText("Java is Selected");
            }
            else if(e.getSource() == cCheckBox){
                label.setText("C programming is Selected");
            }
            else{
                label.setText("MysQL is Selected");
            }
        }
        
    } 
    
    public static void main(String[] args) {
        JCheckBoxDemo frame = new JCheckBoxDemo();
        frame.setVisible(true);
        frame.setBounds(100,50,400,400);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("JCheck Box Demo");
    }
    
}
