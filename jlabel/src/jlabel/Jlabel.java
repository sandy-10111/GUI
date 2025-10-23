/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jlabel;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

/**
 *
 * @author PC
 */
public class Jlabel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create border
        Border b = BorderFactory.createLineBorder(Color.yellow ,5);
        // TODO code application logic here
        // adding image 
         ImageIcon image = new ImageIcon("C:\\Users\\PC\\Desktop\\111.png");
        JLabel label = new JLabel();
        label.setText("Bro , do you even code!");
        label.setIcon(image);
        //change text position
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
       //change the text color
       label.setForeground(Color.red);
       //change font
       label.setFont(new Font("MV Boli",Font.PLAIN,20));
        //set how far the image from the text
        label.setIconTextGap(10);
        
        label.setBackground(Color.black);  //set background color
        label.setOpaque(true);  //display the background color
        
        label.setBorder(b);  //set border
        //changing the label position icon and text
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        //set x,y position within frame as well as dimention
       // label.setBounds(100, 100, 350, 450);
        JFrame myframe = new JFrame();
        myframe.setSize(700,700);
        //myframe.setLayout(null);
        myframe.setVisible(true);
        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myframe.add(label);
        //this will resize the size of the frame to com all component that i have instead of layout and set bounds
        myframe.pack();
    }
    
}
