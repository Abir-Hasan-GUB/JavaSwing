
package Project_01__Login_Frame;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author abirh
 */
public class LoginFrame extends JFrame{
    Container c;
    private JLabel userLabel, passLabel;
    private JTextField tf;
    private JPasswordField pf;
    private JButton loginButton, clearButton;
    private Font f;
    
    LoginFrame(){
        initComponants();
        
    }
    
    void initComponants(){
        setVisible(true);
        setBounds(100, 50, 420, 350);
        setTitle("Login Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.orange);
        
        f = new Font("Aral", Font.BOLD, 16);
        
        userLabel = new JLabel("Username: ");
        userLabel.setFont(f);
        userLabel.setBounds(50, 50, 150, 50);
        c.add(userLabel);
        
        tf = new JTextField();
        tf.setBounds(170,50,200,50);
        tf.setBackground(Color.white);
        tf.setForeground(Color.blue);
        tf.setFont(f);
        c.add(tf);
        
        
        
        passLabel = new JLabel("Password: ");
        passLabel.setBounds(50, 120, 150, 50);
        passLabel.setFont(f);
        c.add(passLabel);
        
        pf = new JPasswordField();
        pf.setBounds(170,120,200,50);
        pf.setBackground(Color.white);
        pf.setForeground(Color.blue);
        pf.setFont(f);
        c.add(pf);
        
        loginButton = new JButton("Login"); 
        loginButton.setBounds(170, 190, 90, 50);
        loginButton.setFont(f);
        c.add(loginButton);
        
        clearButton = new JButton("Clear"); 
        clearButton.setBounds(280, 190, 90, 50);
        clearButton.setFont(f);
        c.add(clearButton);
        
        clearButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
                tf.setText("");  // set empty charecter for clear
                pf.setText("");  // set empty charecter for clear
            }
        });
        
        loginButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                String userName = tf.getText();
                String password = pf.getText();
                
                if(userName.equals("abir") && password.equals("2247"))
                {
                     tf.setText("");  // set empty charecter for clear
                pf.setText("");  // set empty charecter for clear
                    JOptionPane.showMessageDialog(null,"You Will Sucessfully Login..!!!");
                    dispose(); // for off parents frame.
                    Student st = new Student(); // create ob anothers frame class
                    st.setVisible(true);
                   //LoginFrame frames = new LoginFrame();
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Password or UserName Incorrect..!","Warning !", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        
    }
    
    public static void main(String[] args) {
        LoginFrame frame = new LoginFrame();
    }
}
