package app;

import java.awt.*;
import javax.swing.*;
import java.lang.Thread;
import java.awt.event.*;

class FrontPage implements ActionListener{
    JFrame f;
    JLabel id,l1;
    JButton b;
    
    FrontPage(){
        
        f= new JFrame("E-MAILARC");         // object of JFrame class
        f.setBackground(Color.red);
        f.setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("app/icons/front.jpg"));   // setting up the image
        Image i2 = i1.getImage().getScaledInstance(1200, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0, 150, 1360, 530);
        f.add(l1);
        
        b = new JButton("Click here to Continue");
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        b.setBounds(500, 600, 300, 70);
        b.addActionListener(this);
        
        id = new JLabel();
        id.setBounds(0, 0, 1360, 750);
        id.setBackground(Color.CYAN);
        id.setLayout(null);
        
        JLabel lid = new JLabel("                     E-MAILARC");
        lid.setBounds(80,30,1500,100);
        lid.setFont(new Font("serif",Font.PLAIN,70));
        lid.setForeground(Color.red);
        id.add(lid);
        
        id.add(b);
        f.add(id);
        
        f.getContentPane().setBackground(Color.LIGHT_GRAY);
        
        f.setVisible(true);
        f.setSize(1360,750);
        f.setLocation(200,100);
        
        while(true){
            
            lid.setVisible(false);
            try{
                Thread.sleep(500);
            }catch (Exception e){};
            
            lid.setVisible(true);
            try{
                Thread.sleep(500);
            }catch (Exception e){};
        }
        
    }                                                // end of constructor
    
public void actionPerformed(ActionEvent ae){               // ae is the obj of the class ActionEvent
    if(ae.getSource()==b){
       f.setVisible(false);
       login l = new login();
    }
}

public static void main(String[] args){
    FrontPage f = new FrontPage();
}
    
    
    
}
