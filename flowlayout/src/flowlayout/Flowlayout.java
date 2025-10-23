/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package flowlayout;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author PC
 */
public class Flowlayout {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        
       
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
      //  JPanel p = new JPanel();
      //  p.setPreferredSize(new Dimension(250,250));
      //  p.setBackground(Color.red);
      //  p.setLayout(new FlowLayout());
   
        JButton b1 = new JButton("b1");
        JButton b2 = new JButton("b2");
        JButton b3 = new JButton("b3");
        JButton b4 = new JButton("b4");
        JButton b5 = new JButton("b5");
        JButton b6 = new JButton("b6");
        JButton b7 = new JButton("b7");
        JButton b8 = new JButton("b8");
        JButton b9 = new JButton("b9");
        JButton b10 = new JButton("b10");
        

   
        
        
        
      //  p.add(b1);
      //  p.add(b2);
      //  p.add(b3);
     //   p.add(b4);
     //   p.add(b5);
     //   p.add(b6);
     //   p.add(b7);
     //   p.add(b8);
     //   p.add(b9);
     //   p.add(b10);
        
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);
        frame.add(b6);
        frame.add(b7);
        frame.add(b8);
        frame.add(b9);
        frame.add(b10);
        
         frame.setVisible(true);
        // frame.add(p);
         
        
        
    }
    
}
