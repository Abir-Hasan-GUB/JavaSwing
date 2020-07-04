
package JTable;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author abirh
 */
public class JTableDemo extends JFrame{
    
    private Container c;
    private JLabel label;
    private Font f;
    private JTable table;
    private String cols[] = {"ID","Name","GPA"};
    private String rows[][] = {
                        {"181","Abir Hasan","3.80"},
                        {"182","Nahid Hasan","3.50"},
                        {"183","Nasir Hasan","3.70"},
                        {"184","Ashraful Islam","3.40"},
                        {"181","Abir Hasan","3.80"},
                        {"182","Nahid Hasan","3.50"},
                        {"183","Nasir Hasan","3.70"},
                        {"184","Ashraful Islam","3.40"},
                        {"181","Abir Hasan","3.80"},
                        {"182","Nahid Hasan","3.50"},
                        {"183","Nasir Hasan","3.70"},
                        {"184","Ashraful Islam","3.40"},
                        {"181","Abir Hasan","3.80"},
                        {"182","Nahid Hasan","3.50"},
                        {"183","Nasir Hasan","3.70"},
                        {"184","Ashraful Islam","3.40"},
    
    };
    private JScrollPane scroll;
    JTableDemo(){
        
        initComponants();
    
    }
    
    public void initComponants(){
        c = this.getContentPane();
        c.setLayout(null);
        f  = new Font("Arial",Font.BOLD,22);
        
        c.setBackground(Color.orange);
        label = new JLabel("Students Details");
        label.setBounds(290, 20, 350, 50);
        label.setFont(f);
        c.add(label);
        
        table = new JTable(rows,cols);
        scroll = new JScrollPane(table);
        scroll.setBounds(70, 80, 600, 150);
        c.add(scroll);
//        table.setEnabled(false); // off edit
        table.setSelectionBackground(Color.green); // set color in selected row
    }
    
    public static void main(String[] args) {
        JTableDemo frame = new JTableDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setBounds(400, 200, 750, 300);
        frame.setTitle("JTable Demo");
    }
}
