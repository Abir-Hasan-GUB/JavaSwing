
package Layout_Maneger;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class FolowLayout extends JFrame{

    
  private  Container c;
  private Cursor cursor;
  private  JButton button[];  // buttons array
  private  FlowLayout fLayout;
    
    FolowLayout(){
        initComponants();
    }
    
    public void initComponants(){
      
      fLayout = new FlowLayout(FlowLayout.LEFT,10,10); // set alignment, distence
      c = this.getContentPane();
      c.setLayout(fLayout);
      c.setBackground(Color.yellow);
      
      cursor = new Cursor(Cursor.HAND_CURSOR);
      button = new JButton[9]; // button array decler
      
      
        for (int i = 0; i < 9; i++) {
            button[i] = new JButton(""+ (i+1) ); // button create by loop
            c.add(button[i]); // add button in container
            button[i].setCursor(cursor); // set cursor
        }
      
    }
    
    public static void main(String[] args) {
        FolowLayout frame = new FolowLayout();
        frame.setVisible(true);
        frame.setBounds(100, 100, 250, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Flow LayOut Maneger: ");
    }
}
