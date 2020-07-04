
package JSpineer;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author abirh
 */
public class JSpinnerDemo extends JFrame implements ChangeListener{
    
    private Container c;
    private JSpinner spinner;
    private JLabel label;
    
    JSpinnerDemo(){
        initComponants();
    }
    
    public void initComponants(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.yellow);
        
        SpinnerNumberModel value = new SpinnerNumberModel(0,0,10,1); //modify range of spinner
        
        spinner = new JSpinner(value);
        spinner.setBounds(150, 150, 70, 50);
        c.add(spinner);
        
        label = new JLabel("Current value : 10");
        label.setBounds(100, 200, 250, 50);
        c.add(label);
        
        //add changeListener
        spinner.addChangeListener(this);
    }
    
    public static void main(String[] args) {
        JSpinnerDemo frame = new JSpinnerDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(500, 100, 450, 450);
        frame.setTitle("JSpenner Demo: ");
        frame.setResizable(false);
        
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        String number = spinner.getValue().toString();// collect value and convert to string
        int value = Integer.parseInt(number);
        label.setText("Current Value: "+value);
    }
    
}
