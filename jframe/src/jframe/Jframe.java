/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jframe;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author PC
 */
public class Jframe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame();
        frame.setTitle("i love java");
        frame.setSize(777, 777);
        frame.setResizable(false);  //to prevent resizable
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // to change the java logo into another logo i want
        ImageIcon im = new ImageIcon("C:\\Users\\PC\\Desktop\\java.png");
        frame.setIconImage(im.getImage());
        // change the back ground color
        //frame.getContentPane().setBackground(Color.red);
        //costom color with rgp
       frame.getContentPane().setBackground(new Color(0,0,0));
        //color with hexa
       // frame.getContentPane().setBackground(new Color(0xFFFFFF));
       
        
    }
    
}
