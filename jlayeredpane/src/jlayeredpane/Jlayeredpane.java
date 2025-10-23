/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jlayeredpane;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

/**
 *
 * @author PC
 */
public class Jlayeredpane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        
        JLabel lab1 = new JLabel();
        lab1.setOpaque(true);
        lab1.setBackground(Color.red);
        lab1.setBounds(50,50,200,200);
        
        JLabel lab2 = new JLabel();
        lab2.setOpaque(true);
        lab2.setBackground(Color.green);
        lab2.setBounds(100,100,200,200);
        
        JLabel lab3 = new JLabel();
        lab3.setOpaque(true);
        lab3.setBackground(Color.blue);
        lab3.setBounds(150,150,200,200);
        
         JLayeredPane pp = new JLayeredPane();
         pp.setBounds(0,0,500,500);
         pp.add(lab1);
         pp.add(lab2);
         pp.add(lab3);
        //this is tho sepicify which lab1 will be in the bottom and which will be in the top with to different ways
       // pp.add(lab1, Integer.valueOf(0));
      // pp.add(lab1, JLayeredPane.DEFAULT_LAYER);
        
        JFrame frame = new JFrame();
        frame.add(pp);
        frame.setSize(600, 600);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
