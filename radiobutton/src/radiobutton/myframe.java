/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package radiobutton;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

/**
 *
 * @author PC
 */
public class myframe extends JFrame implements ActionListener{
     JRadioButton pizza;
     JRadioButton hamperger;
     JRadioButton hotdog;
    
    myframe(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        
         pizza = new JRadioButton("pizza");
         hamperger = new JRadioButton("hamperger");
         hotdog = new JRadioButton("hotdog");
        
        ButtonGroup group = new ButtonGroup();
        group.add(pizza);
        group.add(hamperger);
        group.add(hotdog);
        
         pizza.addActionListener(this);
         hamperger.addActionListener(this);
         hotdog.addActionListener(this);
        
        this.add(pizza);
        this.add(hamperger);
        this.add(hotdog);
        
        this.pack();
        this.setVisible(true);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == pizza){
            System.out.println("you ordered pizza");
        }
        else if(e.getSource() == hamperger){
        System.out.println("you ordered hamperger");
    }
        else if(e.getSource() ==hotdog){
            System.out.println("you ordered hotdog");
        }
       
    }
    
}
