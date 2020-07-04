
package Project_05__Student_Managment_System;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author abirh
 */
public class Student extends JFrame implements ActionListener{
    
    private Container c;
    private JLabel titleLabel,fnLabel,lnLabel,phoneLabel,gpaLabel;
    private JTextField fnTf,lnTf,phoneTf,gpaTf;
    private JButton addButton,updateButton,deleteButton,clearButton;
    private Font f;
    private JTable table;
    private DefaultTableModel model;
    private JScrollPane scroll;
    private String[] columns = {"First name","Last name","Phone number","GPA"};
    private String[] rows = new String[4];
    
    Student(){
        initComponants();
    }
    
    public void initComponants(){
        this.setSize(765,690);
        this.setLocationRelativeTo(null);
        this.setTitle("Student Table ");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        
        f = new Font("Arial",Font.BOLD,18);
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.LIGHT_GRAY);
        // Label, textField, Button Create Here.
        
        //title label
        titleLabel = new JLabel("Student Registration");
        titleLabel.setFont(f);
        titleLabel.setBounds(240,10,250,50);
        c.add(titleLabel);
        
//        first name...
        
        fnLabel = new JLabel("First Name ");
        fnLabel.setBounds(10, 80, 140, 30);
        fnLabel.setFont(f);
        c.add(fnLabel);
        
        fnTf = new JTextField();
        fnTf.setBounds(110, 80, 200, 30);
        fnTf.setFont(f);
        c.add(fnTf);
     
        addButton = new JButton("Add");
        addButton.setBounds(400, 80, 100, 30);
        addButton.setFont(f);
        c.add(addButton);
           
        //Last Name
        lnLabel = new JLabel("Last Name ");
        lnLabel.setBounds(10, 130, 150, 30);
        lnLabel.setFont(f);
        c.add(lnLabel);
        
        lnTf = new JTextField();
        lnTf.setBounds(110, 130, 200, 30);
        lnTf.setFont(f);
        c.add(lnTf);
        
        updateButton = new JButton("Update");
        updateButton.setBounds(400, 130, 100, 30);
        updateButton.setFont(f);
        c.add(updateButton);
        
        //Phone...
        phoneLabel = new JLabel("Phone ");
        phoneLabel.setBounds(10, 180, 150, 30);
        phoneLabel.setFont(f);
        c.add(phoneLabel);
        
        phoneTf = new JTextField();
        phoneTf.setBounds(110, 180, 200, 30);
        phoneTf.setFont(f);
        c.add(phoneTf);
        deleteButton = new JButton("Delete");
        deleteButton.setBounds(400, 180, 100, 30);
        deleteButton.setFont(f);
        c.add(deleteButton);
        
        
        //GPA...
        gpaLabel = new JLabel("GPA ");
        gpaLabel.setBounds(10, 230, 150, 30);
        gpaLabel.setFont(f);
        c.add(gpaLabel);
        
        gpaTf = new JTextField();
        gpaTf.setBounds(110, 230, 200, 30);
        gpaTf.setFont(f);
        c.add(gpaTf);
        
        clearButton = new JButton("Clear");
        clearButton.setBounds(400, 230, 100, 30);
        clearButton.setFont(f);
        c.add(clearButton);
        
        // table Create..
        
        table = new JTable();
        
        model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        table.setModel(model);
        table.setFont(f);
        table.setSelectionBackground(Color.GREEN);
        table.setBackground(Color.white);
        table.setRowHeight(30);
        
        //Scroll Pane add
        scroll = new JScrollPane(table);
        scroll.setBounds(10, 360, 740, 265);
        c.add(scroll);
        
        //ActionListener//
        addButton.addActionListener(this);
        clearButton.addActionListener(this);
        deleteButton.addActionListener(this);
        updateButton.addActionListener(this);
        
        
        //Add Mouse Listenr for updadte data
        
        table.addMouseListener(new MouseAdapter(){
            
            @Override
            public void mouseClicked(MouseEvent me){
                int numberOfRow = table.getSelectedRow();
                //get value when i clecked a row/
                
                String f_name = model.getValueAt(numberOfRow, 0).toString();
                String l_name = model.getValueAt(numberOfRow, 1).toString();
                String phone = model.getValueAt(numberOfRow, 2).toString();
                String gpa = model.getValueAt(numberOfRow, 3).toString();
                
                //now receved value set to all specific text field.
                
                fnTf.setText(f_name);
                lnTf.setText(l_name);
                phoneTf.setText(phone);
                gpaTf.setText(gpa);
            }
        
        });
        

    }
    // Action Listener
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            //data add in row
            
            rows[0] = fnTf.getText();
            rows[1] = lnTf.getText();
            rows[2] = phoneTf.getText();
            rows[3] = gpaTf.getText();
            model.addRow(rows);
            
            //after add auto clear all textField
            fnTf.setText("");
            lnTf.setText("");
            phoneTf.setText("");
            gpaTf.setText("");
        }
        else if(e.getSource() == clearButton){
            //clear all text..
            
            fnTf.setText("");
            lnTf.setText("");
            phoneTf.setText("");
            gpaTf.setText("");
        }
        
        //for delete button
        
        else if(e.getSource() == deleteButton){ 
            
            int numberOfRow = table.getSelectedRow(); // get row number
            
            if (numberOfRow >= 0) { // row valu doesn't "<0" or "negetive"//
                model.removeRow(numberOfRow); // pass row index number
            }
            else{ // warning if dosen't select any row or not exist any row.
                JOptionPane.showMessageDialog(null, "No row is Selected or No row exist in Table!", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
        
        // Update button //
        
        else if(e.getSource() == updateButton){
            int numberOfRow = table.getSelectedRow();
            
           String f_name = fnTf.getText();
           String l_name = lnTf.getText();
           String phone = phoneTf.getText();
           String gpa = gpaTf.getText();
           
           // Now set all get value in textFeld
           model.setValueAt(f_name, numberOfRow, 0);
           model.setValueAt(l_name, numberOfRow, 1);
           model.setValueAt(phone, numberOfRow, 2);
           model.setValueAt(gpa, numberOfRow, 3);
        }
    }
    
    public static void main(String[] args) {
        Student frame = new Student();
        frame.setVisible(true);
    }

    
}
