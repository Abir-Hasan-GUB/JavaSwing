
package Practice_Seassion;

import javax.swing.JFrame;

/**
 *
 * @author abirh
 */
public class Practice_Frame_Demo extends JFrame {
    public static void main(String[] args) {
        Practice_Frame_Demo frame = new Practice_Frame_Demo();
        
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setTitle("Hello World !!");
        frame.setSize(500,400);
        frame.setResizable(false);
        
        frame.setBounds(100,100,500,400);
       
        
    }
}
