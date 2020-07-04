
package Layout_Maneger;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author abirh
 */
public class Layout_Maneger_Demo extends JFrame{
    
  private  Container c;
  private  JButton btn1,btn2,btn3,btn4,btn5;
  private  BorderLayout bLayout;
    
    Layout_Maneger_Demo(){
        initComponants();
    }
    
    public void initComponants(){
      c = this.getContentPane();
      // create border layout
      bLayout = new BorderLayout();
      c.setLayout(bLayout); // add border layout in container
      c.setBackground(Color.yellow);
      
      btn1 = new JButton("1");
      btn2 = new JButton("2");
      btn3 = new JButton("3");
      btn4 = new JButton("4");
      btn5 = new JButton("5");
      
      c.add(btn1,BorderLayout.NORTH);
      c.add(btn2,BorderLayout.SOUTH);
      c.add(btn3,BorderLayout.CENTER);
      c.add(btn4,BorderLayout.EAST);
      c.add(btn5,BorderLayout.WEST);
      
      //set gap between buttons
      bLayout.setHgap(15);
      bLayout.setVgap(10);
    }
    
    public static void main(String[] args) {
        Layout_Maneger_Demo frame = new Layout_Maneger_Demo();
        frame.setVisible(true);
        frame.setBounds(100, 100, 500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Border LayOut Maneger: ");
    }
}
