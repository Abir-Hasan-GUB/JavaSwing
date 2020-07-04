
package JMenu;

import java.awt.Container;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

/**
 *
 * @author abirh
 */
public class JMenuDemo extends JFrame implements ActionListener{
    
    private Container  c;        
    private JMenuBar menu;
    private JMenu file,edit,help;
    private Cursor cursor;
    private JMenuItem newItem,openItem,exitItem,cutItem,copyItem,pasteItem,selectAllItem;
    private ImageIcon cutIcon,newIcon;
    
    JMenuDemo(){
        initComponants();
    }
    
    public void initComponants(){
        cursor = new Cursor(Cursor.HAND_CURSOR);
        
        menu = new JMenuBar();
        menu.setCursor(cursor);
        this.setJMenuBar(menu);
        
        cutIcon = new ImageIcon("src/JMenu/cut.png");
        newIcon = new ImageIcon("src/JMenu/new.png");
        
        file = new JMenu("File");
        edit = new JMenu("Edit");
        help = new JMenu("Help");
        
        menu.add(file);
        menu.add(edit);
        menu.add(help);
        //set icon
        newItem = new JMenuItem("New");
        newItem.setIcon(newIcon);
        //add keyboard shortcut
        newItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.CTRL_MASK));
        
        openItem = new JMenuItem("Open");
        exitItem = new JMenuItem("Exit");
       
        //set icon
        cutItem = new JMenuItem("Cut");
        cutItem.setIcon(cutIcon);
        
        copyItem = new JMenuItem("Copy");
        pasteItem = new JMenuItem("Past");
        selectAllItem = new JMenuItem("Select All");
        
        file.add(newItem);
        file.add(openItem);
        file.add(exitItem);
        
        edit.add(cutItem);
        edit.addSeparator();// for separet
        edit.add(copyItem);
        edit.add(pasteItem);
        
        help.add(selectAllItem);
        
        
        //Add actionListener
        newItem.addActionListener(this);
        exitItem.addActionListener(this);
    }
    
    public static void main(String[] args) {
        
        JMenuDemo frame = new JMenuDemo();
        frame.setVisible(true);
        frame.setBounds(300, 100, 600, 500);
        frame.setTitle("JMenu Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == newItem) {
            JFrame newFrame = new JFrame("New Frame");
            newFrame.setVisible(true);
            newFrame.setBounds(300, 100, 600, 500);
            newFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            newFrame.setResizable(false);
        }
        else if (e.getSource() == exitItem) {
            //dispose();
//                or
            System.exit(0);
        }
    }
}
