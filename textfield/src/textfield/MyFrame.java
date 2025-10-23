/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package textfield;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author PC
 */
public class MyFrame extends JFrame implements ActionListener{

    
    JButton b;
    TextField text;
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        
        b = new JButton("submit");
        b.addActionListener(this);
        text = new TextField();
        text.setPreferredSize(new Dimension(250,40));
        text.setFont(new Font("null",Font.PLAIN, 35));
        text.setForeground(new Color(0x00FF00));
        text.setBackground(Color.red);
        text.setText("first name");
        // if you want to nobody edit the text field that we write above
        //text.setEditable(false);
        this.add(text);
        this.add(b);
        this.pack();
        this.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
      if(e.getSource() == b){
   //The getText() function in Java to retrieve text from components such as text fields, labels, buttons, and text areas.
          System.out.println(text.getText());
          //if i want to prevent anyone to write his first name twice
          text.setEnabled(false);
          text.setEditable(false);
      }
        
    }
    
}
