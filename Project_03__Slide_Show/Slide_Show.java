
package Project_03__Slide_Show;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author abirh
 */
public class Slide_Show extends JFrame implements ActionListener{
    
   private Container c;
   private JPanel panel;
   private JButton prevBtn, nextBtn;
   private ImageIcon icon;
   private JLabel label;
   private CardLayout card;
   private Cursor cursor;
   
    Slide_Show(){
        initComponants();
        showImg();
    }
    
    public void showImg(){
        String imgeName[] = {"1.jpg","2.jpg","3.jpg"};
        for (String n: imgeName) {
        icon = new ImageIcon("src/cat/"+n);
        // resize image:::
        Image img = icon.getImage();
        Image newImage = img.getScaledInstance(panel.getWidth(), panel.getHeight(), Image.SCALE_SMOOTH);
        icon = new ImageIcon(newImage);
        
        
        label = new JLabel(icon);
        panel.add(label);
        
        }
    }
    
    public void initComponants(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.pink);
        
        cursor = new Cursor(Cursor.HAND_CURSOR);
        
        card = new CardLayout();
        
        panel = new JPanel(card);
        panel.setBounds(17, 10, 560, 380);
        c.add(panel);
        
        prevBtn = new JButton("Prev");
        prevBtn.setBounds(10, 400, 100, 50);
        c.add(prevBtn);
        prevBtn.setCursor(cursor);
        
        nextBtn = new JButton("Next");
        nextBtn.setBounds(470, 400, 100, 50);
        c.add(nextBtn);
        nextBtn.setCursor(cursor);
        
        prevBtn.addActionListener(this);
        nextBtn.addActionListener(this);
        
    }
    
    public static void main(String[] args) {
        Slide_Show frame = new Slide_Show();
        frame.setVisible(true);
        frame.setTitle("Slide Show: ");
        frame.setBounds(100, 100, 600, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == prevBtn) {
            card.previous(panel);
        }
        if (e.getSource() == nextBtn) {
            card.next(panel);
        }
    }
}