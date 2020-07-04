
package Layout_Maneger;

import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author abirh
 */
public class Grid_Layout extends JFrame{
    private Container c;
    private GridLayout gl;
    private JButton btn1,btn2,btn3,btn4;
    
    Grid_Layout(){
        initComponants();
    }
    
    public void initComponants(){
        c = this.getContentPane();
        gl = new GridLayout(2,2);  //receve 2 parameter ( 1st = row, 2nd = column)
        c.setLayout(gl);
        
        btn1 =new JButton("1");
        btn2 =new JButton("2");
        btn3 =new JButton("3");
        btn4 =new JButton("4");
        
        c.add(btn1);
        c.add(btn2);
        c.add(btn3);
        c.add(btn4);
    }
    public static void main(String[] args) {
        Grid_Layout frame = new Grid_Layout();
        frame.setVisible(true);
        frame.setBounds(100, 100, 300, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Grid LayOut:");
    }
}
