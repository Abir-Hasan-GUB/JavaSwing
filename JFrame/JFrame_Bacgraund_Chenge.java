
package JFrame;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
  
public class JFrame_Bacgraund_Chenge extends JFrame{
        Container c;  // create container
        ImageIcon icon; // create img reciver
      JFrame_Bacgraund_Chenge(){   // create constructor 
          setVisible(true);
        setResizable(false);
        setBounds(200,200,500,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        initComponant(); // for set icon and others
}
    
    
   public void initComponant(){
       icon = new ImageIcon(getClass().getResource("calculatior.png")); // recive image for icon
       this.setIconImage(icon.getImage()); // initialize img in icon.
       c = this.getContentPane(); // container keep in contentpane
       c.setBackground(Color.MAGENTA);// set color in container
   } 
    
    public static void main(String[] args) {
        JFrame_Bacgraund_Chenge frame = new JFrame_Bacgraund_Chenge();
        
    }
}
