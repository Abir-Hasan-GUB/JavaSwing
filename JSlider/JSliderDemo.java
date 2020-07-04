
package JSlider;

import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JSlider;

/**
 *
 * @author abirh
 */
public class JSliderDemo extends JFrame{
    private Container c; 
    JSlider slider;
    JSliderDemo(){
        initComponants();
    }
    
    public void initComponants(){
        c = this.getContentPane();
        c.setLayout(null);
        slider = new JSlider(0,20,0);//min,max,position
        slider.setBounds(70, 100, 300, 50);
        c.add(slider);
        //select spacing for slider
        slider.setMinorTickSpacing(1); // minimum space
        slider.setMajorTickSpacing(5);// big space
        slider.setPaintTicks(true); // all are visiable for this method
        slider.setPaintLabels(true);//for add value in majorTiks
        
    }
    
    public static void main(String[] args) {
        JSliderDemo frame = new JSliderDemo();
        frame.setVisible(true);
        frame.setBounds(900, 100, 450, 300);
        frame.setTitle("JSlider Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
    }
    
}
