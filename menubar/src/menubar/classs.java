/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menubar;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author PC
 */
public class classs extends JFrame implements ActionListener{
      
    JMenuItem loaditem;
    JMenuItem saveitem;
    JMenuItem exititem;
    JMenu menu_file ;
    JMenu menu_edit ;
    JMenu menu_help ;
    classs(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        
        JMenuBar menubar = new JMenuBar();
        
         menu_file = new JMenu("file");
         menu_edit = new JMenu("edit");
         menu_help = new JMenu("help");
        
         loaditem = new JMenuItem("load");
         saveitem = new JMenuItem("save");
         exititem = new JMenuItem("exit");
         
        menu_file.add(loaditem);
        menu_file.add(saveitem);
        menu_file.add(exititem);
        
        loaditem.addActionListener(this);
        saveitem.addActionListener(this);
        exititem.addActionListener(this);
        
        
        //if i want to save or load or exit in menu bar with keyshift
        loaditem.setMnemonic(KeyEvent.VK_L);
        saveitem.setMnemonic(KeyEvent.VK_S);
        exititem.setMnemonic(KeyEvent.VK_E);
        
        menubar.add(menu_file);
        menubar.add(menu_edit);
        menubar.add(menu_help);
        
        this.setJMenuBar(menubar);
        this.setSize(500,500);
        this.setVisible(true);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==loaditem){
            System.out.println("now you are load your file");
        }
        if(e.getSource()==saveitem){
            System.out.println("now you are save your file");
        }
        if(e.getSource()==exititem){
            System.exit(0);
        }
    }

    private void setMenuBar(JMenuBar menubar) {
        
    }
    
    
    
}
