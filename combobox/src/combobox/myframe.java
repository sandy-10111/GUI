/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package combobox;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;

/**
 *
 * @author PC
 */
public class myframe extends JFrame implements ActionListener{
    JComboBox box;
    myframe(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        //if i want to do int array we should use rapper class
        Integer[] aa = {1,2,3,4};
        String[] animals = {"dog","cat","bird"};
         box = new JComboBox(animals);
         box.addActionListener(this);
         box.setEditable(true);
         //if i want to count from box
        //System.out.println(box.getItemCount());
        box.addItem("horse");
        box.insertItemAt("pig", 0);  //because this is not selected we do the below method to select this first item
        box.setSelectedIndex(0);
        this.add(box);
       
        this.pack();
        this.setVisible(true);
    }

    
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == box){
           // System.out.println(box.getSelectedItem());
            System.out.println(box.getSelectedIndex());
        }
    }
    
}
