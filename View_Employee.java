package app;

import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import javax.swing.*;

public class View_Employee implements ActionListener{
    
    JFrame f;
    JTextField t;
    JLabel l1,l2;
    JButton b,b2;
    
    View_Employee(){
        
        f=new JFrame("View");
        f.setBackground(Color.green);
        f.setLayout(null); 
        
        l1=new JLabel();
        l1.setBounds(15,0,500,260);
        l1.setLayout(null);
        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("app/icons/view.png"));
        
        Image i2 = img.getImage().getScaledInstance(180, 150, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(20, 40, 200, 150);
        f.add(l3);
        
        //l1.setIcon(img);
        
        l2=new JLabel("Employee Id");
        l2.setVisible(true);
        l2.setBounds(250,20,200,30);
        l2.setForeground(Color.black);
        Font F1 = new Font("serif",Font.BOLD,28);
        l2.setFont(F1); 
        l1.add(l2);
        f.add(l1);
        
        t=new JTextField();
        t.setBounds(220,80,220,30);
        l1.add(t);

        b=new JButton("Search");
        b.setBounds(220,150,100,30);
        b.addActionListener(this);
        l1.add(b);

        b2=new JButton("Cancel");
        b2.setBounds(340,150,100,30);
        b2.addActionListener(this);
        l1.add(b2);

        f.setSize(500,250);
        f.setLocation(450,250);
        f.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource()==b2){
            f.setVisible(false);
            EmpDetails d=new EmpDetails();
        }
        if(ae.getSource() == b){
            f.setVisible(false);
            
            try{
            conn con = new conn();
            String str = "select * from employee where emp_id==?";
          
            Print_Data p = new Print_Data(t.getText());
            
            
            }catch(Exception e){}  
        }
//        {
//               JOptionPane.showMessageDialog(null,"No such employee!!");
//               f.setVisible(false); 
//               new EmpDetails(); 
//            }   
        
    }
     
    public static void main(String[]ar){
        new View_Employee();
    }

}
