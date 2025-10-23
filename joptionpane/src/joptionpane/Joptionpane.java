/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package joptionpane;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/**
 *
 * @author PC
 */
public class Joptionpane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //JOptionPane.showMessageDialog(null, "this is some useless info", "title", JOptionPane.PLAIN_MESSAGE);
        //JOptionPane.showMessageDialog(null, "this is some useless info", "info", JOptionPane.INFORMATION_MESSAGE);
       // JOptionPane.showMessageDialog(null, "this is some useless info", "for more knowlage", JOptionPane.QUESTION_MESSAGE);
       //this while loop will run forever untill you stop the program
       //while(true){
       // JOptionPane.showMessageDialog(null, "your computer has a virus!!!", "warning", JOptionPane.WARNING_MESSAGE);
       //}
       // JOptionPane.showMessageDialog(null, "this is some useless info", "error", JOptionPane.ERROR_MESSAGE);
        
        // System.out.println(  JOptionPane.showConfirmDialog(null,"bro did you even code", "title", JOptionPane.YES_NO_CANCEL_OPTION));  
        String name = JOptionPane.showInputDialog("What is your name ?");
       // System.out.println("Hello "+ name);
       JOptionPane.showMessageDialog(null,"hello " + name,"kkkk", JOptionPane.PLAIN_MESSAGE);
       String [] arr ={"lip stick","blusher","foundation","concelear"};
       ImageIcon ss = new ImageIcon("C:\\Users\\PC\\Desktop\\verysmall.png");
       JOptionPane.showOptionDialog(null, "you are the one ", "secret message ", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE , ss, arr, 0);
        
    }
    
}
