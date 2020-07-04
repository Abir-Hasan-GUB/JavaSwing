
package JRadioButton;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author abirh
 */
public class RedioButtonDemo extends JFrame{
    Container c;
    private JRadioButton male, female;
    private ButtonGroup grp;
    private Font f;
    private JTextArea ta;
    private JScrollPane scroll;
    RedioButtonDemo(){
        initComponants();
    }
    
  void initComponants(){
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setBounds(100, 50, 400, 400);
    this.setTitle("Radio Button Demo");
    c = this.getContentPane();
    c.setLayout(null);
    c.setBackground(Color.orange);
    f = new Font("Arial",Font.BOLD,18);
    grp = new ButtonGroup();
    //crate button
    male = new JRadioButton("Male");
    male.setBounds(50, 50, 100, 50);
    male.setFont(f);
   // male.setSelected(true);  // pre select a button...
    male.setBackground(Color.orange);
    c.add(male);
    
    female = new JRadioButton("Female");
    female.setBounds(160, 50, 100, 50);
    female.setFont(f);
   // female.setEnabled(false);  // disable a radio button
    female.setBackground(Color.orange);
    c.add(female);
    
    
    //Group button
    grp.add(male);  // container e button add korar por butn group korte hoi...
    grp.add(female);
    
    // text area
    ta =new JTextArea();
    ta.setBounds(50, 100, 300, 100);
    c.add(ta);
    ta.setFont(f);
    
    ///ta.setBounds(50, 100, 300, 100);
    //add scroll
   /// scroll = new JScrollPane(ta,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
    
    
    // Action Listener.
    Handler handler = new Handler();
    male.addActionListener(handler);
    female.addActionListener(handler);
}
  
  class Handler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            //if(e.getSource() == male)  // 1st method
            if(male.isSelected())  // 2nd method
            {
                ta.append("You Have Selected Male\n");
            }else{
                ta.append("You Have Selected FeMale\n");
                
            }
        }
  }
    
    public static void main(String[] args) {
        RedioButtonDemo frame = new RedioButtonDemo();
        frame.setVisible(true);
        frame.setResizable(false);
    }
}
