/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package keylistener;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author PC
 */
public class solu extends JFrame implements KeyListener{
    
    JLabel label;
    ImageIcon im;
    solu(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.addKeyListener(this);
        label = new JLabel();
        label.setBounds(0, 0, 100, 100);
        im = new ImageIcon("C:\\Users\\PC\\Desktop\\roc.png");
        label.setIcon(im);
       // label.setBackground(Color.red);
        //label.setOpaque(true);
        
        //if we want to change the backgroundcolor for this frame
        this.getContentPane().setBackground(Color.BLACK);
        this.add(label);
        this.setVisible(true);
    }

    
    
    
    @Override
    public void keyTyped(KeyEvent e) {
       switch(e.getKeyChar()){
           case 'a': label.setLocation(label.getX()-10, label.getY());
             break;
           case 'w': label.setLocation(label.getX(), label.getY()-10);
             break;  
           case 's': label.setLocation(label.getX(), label.getY()+10);
             break;  
           case 'd': label.setLocation(label.getX()+10, label.getY());
             break;  
       }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch(e.getKeyCode()){
           case 37: label.setLocation(label.getX()-10, label.getY());
             break;
           case 38: label.setLocation(label.getX(), label.getY()-10);
             break;  
           case 39: label.setLocation(label.getX()+10, label.getY());
             break;  
           case 40: label.setLocation(label.getX(), label.getY()+10);
             break;  
       }
       
    }

    @Override
    public void keyReleased(KeyEvent e) {
       // System.out.println("you released key "+ e.getKeyChar());
        System.out.println("you released key " +e.getKeyCode());
    }
    
}
