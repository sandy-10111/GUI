/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package checkbox;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

/**
 *
 * @author PC
 */
public class myframe extends JFrame implements ActionListener{
   JButton bt;
   JCheckBox hh;
   ImageIcon x;
   ImageIcon t;
    
    myframe(){
        x = new ImageIcon("C:\\Users\\PC\\Desktop\\false.png");
        t = new ImageIcon("C:\\Users\\PC\\Desktop\\true.png");
        bt = new JButton();
        bt.setText("submit");
        bt.addActionListener(this);
        hh = new JCheckBox();
        hh.setText("I'm not a robot");
        hh.setFocusable(false);
        hh.setFont(new Font("consolas" , Font.PLAIN,35));
        hh.setIcon(x);
        hh.setSelectedIcon(t);
        
        this.add(hh);
        this.add(bt);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.pack();
        this.setVisible(true);
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()== bt){
           System.out.println(hh.isSelected());
       }
    }
    
    
}
