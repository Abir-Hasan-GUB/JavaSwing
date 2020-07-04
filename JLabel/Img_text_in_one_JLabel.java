
package JLabel;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author abirh
 */
public class Img_text_in_one_JLabel extends JFrame{
    private Container c;
    private JLabel label;
    private ImageIcon image;
    Img_text_in_one_JLabel(){
        initComponants();
    }
    void initComponants(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.magenta);
        
        image = new ImageIcon(getClass().getResource("cat1.png"));
        
        label = new JLabel("This is a cat",image,JLabel.LEFT); // initialize img and text in label
        label.setBounds(50, 50, 250, 50); // label location
        c.add(label); // add label in container
    }
    
    public static void main(String[] args) {
        Img_text_in_one_JLabel frame = new Img_text_in_one_JLabel();
        
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 500, 400);
        frame.setTitle("Text and Imag in One Label");
        frame.setResizable(false);
        
    }
}
