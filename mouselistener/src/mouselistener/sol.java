/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mouselistener;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author PC
 */
public class sol extends JFrame implements MouseListener{

    JLabel label;
    ImageIcon im1;
    ImageIcon im2;
    ImageIcon im3;
    ImageIcon im4;
    
    sol(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        
        label = new JLabel();
        label.setBounds(0,0,100,100);
        label.setBackground(Color.red);
        label.setOpaque(true);
        
     
         label.addMouseListener(this);
       this.setLocationRelativeTo(null);
       
        this.add(label);
        this.setSize(700, 700);
        this.setVisible(true);
    }
    
    
    
    
    
    
    
    
    
    
    @Override
    public void mouseClicked(MouseEvent e) {
       // System.out.println("you are clicked the mouse :)");
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
      
         System.out.println("you are pressed the mouse :)");
         label.setBackground(Color.black);
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //when we leave the mouse clicker
        System.out.println("you are released the mouse :)");
        label.setBackground(Color.green);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
         
        System.out.println("you are entered the mouse :)");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("you are exited the mouse :)");
        
    }
    
}
