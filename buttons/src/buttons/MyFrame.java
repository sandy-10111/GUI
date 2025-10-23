/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buttons;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author PC
 */
public class MyFrame extends JFrame implements ActionListener{
    
    JButton bb;
    JLabel label;
    MyFrame(){
        ImageIcon im = new ImageIcon("C:\\Users\\PC\\Desktop\\verysmall.png");
        ImageIcon im2 = new ImageIcon("C:\\Users\\PC\\Desktop\\12344.png");
        label = new JLabel();
        label.setIcon(im2);
        label.setBounds(150, 250, 150, 150);
        label.setVisible(false);
         bb = new JButton();
        bb.setBounds(100, 100, 250, 100);
        //this method is the same
        bb.addActionListener(this);
        // bb.addActionListener(e -> System.out.println("aaa"));
        bb.setText("press_Me");
        bb.setFocusable(false);
        bb.setIcon(im);
        bb.setHorizontalAlignment(JButton.CENTER);
        bb.setVerticalAlignment(JButton.TOP);
        bb.setFont(new Font("comic sans",Font.BOLD,25));
        bb.setIconTextGap(-5);
        bb.setForeground(Color.red);  //changing the color of the text that above the buttons
        bb.setBackground(Color.lightGray);
        bb.setBorder(BorderFactory.createEtchedBorder());   //make border for the button 
        //if i want to disable the button 
       // bb.setEnabled(false);
        
        this.setSize(500, 500);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.add(bb);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      if(e.getSource() == bb){
          // System.out.println("sss");
           //if i want to click once and disable this button
          // bb.setEnabled(false);
          label.setVisible(true);
      }
   }
    
}
