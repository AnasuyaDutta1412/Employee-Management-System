package app;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Search_Employee implements ActionListener{
    JFrame f;
    JTextField t;
    JLabel l,l5;
    JButton b,b2;
    
    Search_Employee(){
        
        f=new JFrame("search");
        f.setBackground(Color.green);
        f.setLayout(null);
        
        l5=new JLabel();
        l5.setBounds(15,0,500,270);
        l5.setLayout(null);
        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("app/icons/search.png"));
        
        Image i2 = img.getImage().getScaledInstance(180, 150, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(20, 15, 200, 180);
        f.add(l3);
        
        //l5.setIcon(img);
        
        l=new JLabel("Employee Id");
        l.setVisible(true);
        l.setBounds(270,20,250,30);
        l.setForeground(Color.black);
        Font F1=new Font("serif",Font.BOLD,25);
        l.setFont(F1); 
        l5.add(l);
        f.add(l5);
        
        t=new JTextField();
        t.setBounds(230,60,220,30);
        l5.add(t);

        b=new JButton("Search");
        b.setBounds(230,150,100,30);
        b.addActionListener(this);
        l5.add(b);


        b2=new JButton("Cancel");
        b2.setBounds(350,150,100,30);
        b2.addActionListener(this);
        l5.add(b2);

        f.setSize(500,240);
        f.setLocation(450,250);
        f.setVisible(true);

    }
    
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource()==b2){
            f.setVisible(false);
            EmpDetails d=new EmpDetails();
        }
        
        if(ae.getSource()==b){
            f.setVisible(false);
            new Update_Employee(t.getText());
        
        }
    }
    
    public static void main(String[]ar){
        
        new Search_Employee();
    } 	
}
