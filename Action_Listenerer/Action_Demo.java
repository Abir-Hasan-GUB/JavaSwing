package Action_Listenerer;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author abirh
 */
public class Action_Demo extends JFrame {

    private Container c;
    private JTextField tf1, tf2;

    Action_Demo() {
        initComponants();
    }

    void initComponants() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.orange);

        tf1 = new JTextField();
        tf1.setBounds(50, 50, 150, 50);
        c.add(tf1);
        tf2 = new JTextField();
        tf2.setBounds(50, 110, 150, 50);
        c.add(tf2);

        Handler handler = new Handler();  // crate class ob of handeler class.
        tf1.addActionListener(handler); // action listener add through sub class object
        tf2.addActionListener(handler); // action listener add through sub class object

        /*
       ================== Reugler system of set action listener..... ===================
       
        tf2.addActionListener(new ActionListener(){  // create action listeneer and decler
            
            public void actionPerformed(ActionEvent e)  // creat action performed ** must ** 
            {
                String s = tf2.getText();   // recive text
                if(s.isEmpty()){
                    JOptionPane.showMessageDialog(null, "You Did't Enter Anythings..");
                }else{
                JOptionPane.showMessageDialog(null, "Text Field 2 = "+" "+s);
                    
                }
            }
        });
         */
    }

    class Handler implements ActionListener {  // create a subclass and impliments AcL

        public void actionPerformed(ActionEvent e) // creat action performed ** must ** 
        {

            if (e.getSource() == tf1) // create condition for spacify or select exact action lestener
            {
                String s = tf1.getText();   // recive text
                if (s.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "You Did't Enter Anythings..");
                } else {
                    JOptionPane.showMessageDialog(null, "Text Field 1 = " + " " + s);

                }
            } else {
                String s = tf2.getText();   // recive text
                if (s.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "You Did't Enter Anythings..");
                } else {
                    JOptionPane.showMessageDialog(null, "Text Field 2 = " + " " + s);

                }
            }

        }
    }

    public static void main(String[] args) {
        Action_Demo frame = new Action_Demo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 50, 500, 400);
        frame.setTitle("ActionListener Demo");
        frame.setResizable(false);
    }

}
