
package Project_04__Color_Palet_Jslider;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author abirh
 */
public class sliderDemo extends JFrame implements ChangeListener{
    private Container c;
    private JSlider greenSlider,redSlider,blueSlider;
    private JTextField greenTf,redTf,blueTf;
    private JPanel panel;
    private JLabel redLabel,greenLabel,blueLabel,previewLabel;
    
    
    sliderDemo(){
        initComponants();
    }
    
    public void initComponants(){
        c = this.getContentPane();
        c.setLayout(null);
        
        redLabel = new JLabel("Red");
        redLabel.setBounds(50, 50, 300, 50);
        c.add(redLabel);
        
        redSlider = new JSlider(0,255,0);
        redSlider.setBounds(90, 50, 300, 50);
        c.add(redSlider);
        
        redTf = new JTextField();
        redTf.setHorizontalAlignment(JTextField.CENTER);
        redTf.setBounds(400, 50, 80, 40);
        c.add(redTf);
        
        //green
        
        greenLabel = new JLabel("Green");
        greenLabel.setBounds(50, 110, 300, 50);
        c.add(greenLabel);
        
        greenSlider = new JSlider(0,255,0);
        greenSlider.setBounds(90, 110, 300, 50);
        c.add(greenSlider);
        
        greenTf = new JTextField();
        greenTf.setHorizontalAlignment(JTextField.CENTER);
        greenTf.setBounds(400, 110, 80, 40);
        c.add(greenTf);
        
        //Blue
        
        blueLabel = new JLabel("Blue");
        blueLabel.setBounds(50, 170, 300, 50);
        c.add(blueLabel);
        
        blueSlider = new JSlider(0,255,0);
        blueSlider.setBounds(90, 170, 300, 50);
        c.add(blueSlider);
        
        blueTf = new JTextField();
        blueTf.setHorizontalAlignment(JTextField.CENTER);
        blueTf.setBounds(400, 170, 80, 40);
        c.add(blueTf);
        
        
        panel = new JPanel();
        panel.setBounds(550, 50, 200, 160);
        c.add(panel);
        panel.setBackground(Color.darkGray);
        
        previewLabel = new JLabel("Preview");
        previewLabel.setBounds(630, 200, 100, 50);
        c.add(previewLabel);
        
        //add chengeListener
        
        redSlider.addChangeListener(this);
        greenSlider.addChangeListener(this);
        blueSlider.addChangeListener(this);
        

    
    }
    
    public static void main(String[] args) {
        sliderDemo frame = new sliderDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Jslide Color Plate @Abir Hasan");
        frame.setResizable(false);
        frame.setBounds(100, 100, 800, 300);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        int redvalue = redSlider.getValue();
        int greenvalue = greenSlider.getValue();
        int bluevalue = blueSlider.getValue();
        
        redTf.setText(""+redvalue);
        greenTf.setText(""+greenvalue);
        blueTf.setText(""+bluevalue);
        
//        Create Color...
        
        Color color = new Color(redvalue,greenvalue,bluevalue);
        panel.setBackground(color);
        
    }
}
