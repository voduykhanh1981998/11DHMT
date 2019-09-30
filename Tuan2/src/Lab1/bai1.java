/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author E5-575G
 */
public class bai1 extends JFrame{
public bai1(){
    super("Demo Window");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       bai1 ui = new bai1();
       ui.setSize(400, 300);
       ui.setLocationRelativeTo(null);
       ui.setVisible(true);
       
        
        
    }
    
}
