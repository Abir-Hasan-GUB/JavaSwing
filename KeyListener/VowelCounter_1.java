package KeyListener;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author abirh
 */
public class VowelCounter_1 extends JFrame{
   private Container c;
   private JLabel promptLabel,vowelLabel,aLabel,eLabel,iLabel,oLabel,uLabel;
   private JTextArea inputTextArea; 
   private JScrollPane scroll;
   
   int totalVowel = 1;
   int letter_a  =  0;
   int letter_e  =  0;
   int letter_i  =  0;
   int letter_o  =  0;
   int letter_u  =  0;
   
    VowelCounter_1(){
            initComponants();
        }
        
        public void initComponants(){
            c = this.getContentPane();
            c.setLayout(null);
            c.setBackground(Color.pink);
            
            promptLabel = new JLabel("Enter The Text: ");
            promptLabel.setBounds(10, 20, 100, 30);
            c.add(promptLabel);
            
            inputTextArea = new JTextArea();
            inputTextArea.setLineWrap(true);
            inputTextArea.setWrapStyleWord(true);
            
            scroll = new JScrollPane(inputTextArea);
            scroll.setBounds(110, 20, 350, 100);
            c.add(scroll);
            
            aLabel = new JLabel();
            aLabel.setBounds(110, 190, 150, 30);
            c.add(aLabel);
            
            eLabel = new JLabel();
            eLabel.setBounds(110, 230, 150, 30);
            c.add(eLabel);
            
            iLabel = new JLabel();
            iLabel.setBounds(110, 150, 250, 30);
            c.add(iLabel);
            
            oLabel = new JLabel();
            oLabel.setBounds(110, 310, 150, 30);
            c.add(oLabel);
            
            uLabel = new JLabel();
            uLabel.setBounds(110, 350, 150, 30);
            c.add(uLabel);
            
            inputTextArea.addKeyListener(new KeyListener(){
                @Override
                public void keyTyped(KeyEvent ke) {
                }

                @Override
                public void keyPressed(KeyEvent ke) { //work only this method
                    
                    if(ke.getSource() == inputTextArea){
                        if(ke.VK_A == ke.getKeyCode()){ // here "VK_A" is constant
                            letter_a++;
                            totalVowel++;
                            
                        }
                        
                        if(ke.VK_E == ke.getKeyCode()){ // here "VK_e" is constant
                            letter_e++;
                            totalVowel++;
                        }
                        
                        if(ke.VK_I == ke.getKeyCode()){ // here "VK_i" is constant
                            letter_i++;
                            totalVowel++;
                        }
                        
                        if(ke.VK_O == ke.getKeyCode()){ // here "VK_o" is constant
                            letter_o++;
                            totalVowel++;
                        }
                        
                        if(ke.VK_U == ke.getKeyCode()){ // here "VK_U" is constant
                            letter_u++;
                            totalVowel++;
                        }
                        
                        
                    }
                    
                    
                }

                @Override
                public void keyReleased(KeyEvent ke) {
                }
                
            });
            
            
        }
        
    public static void main(String[] args) {
        VowelCounter_1 frame = new VowelCounter_1();
        frame.setVisible(true);
        frame.setBounds(100,100,500,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setTitle("Vowel Counter App @ Abir Hasan:");
    }
}
