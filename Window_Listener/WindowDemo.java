
package Window_Listener;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;

/**
 *
 * @author abirh
 */
public class WindowDemo extends JFrame{
    private Container c;
    
    WindowDemo(){
        
        initComponants();
        
        this.setVisible(true);
        this.setBounds(100,100,500,500);
        this.setTitle("Window Listener: ");
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void initComponants(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.pink);
        
        this.addWindowListener(new WindowListener(){
            @Override
            public void windowOpened(WindowEvent we) {
                System.out.println("Window Opened");
            }

            @Override
            public void windowClosing(WindowEvent we) {
                System.out.println("Window Closing");
            }

            @Override
            public void windowClosed(WindowEvent we) {
                System.out.println("Window Closed");
            }

            @Override
            public void windowIconified(WindowEvent we) {
                System.out.println("Window Iconified");
            }

            @Override
            public void windowDeiconified(WindowEvent we) {
                System.out.println("Window DeIconified");
            }

            @Override
            public void windowActivated(WindowEvent we) {
                System.out.println("Window Activated");
            }

            @Override
            public void windowDeactivated(WindowEvent we) {
                System.out.println("Window Deactivated");
            }
        
        
        });
    }
    
    public static void main(String[] args) {
        WindowDemo frame = new WindowDemo();
    }
}
