/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author E5-575G
 */
public class bai4 extends JFrame {
    public bai4() {
    super("Demo Window");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        bai4 JPanel = new bai4 ();
        JPanel.setSize(400, 300);
        JPanel.setLocationRelativeTo(null);
        JPanel.setVisible(true);
        
        
        //BorderLayout
        JPanel pnBorder = new JPanel();
        pnBorder.setLayout(new BorderLayout());
        JPanel pnNorth = new JPanel();
        pnNorth.setBackground(Color.yellow);
        pnBorder.add(pnNorth,BorderLayout.NORTH);
        JPanel pnSouth = new JPanel();
        pnSouth.setBackground(Color.red);
        pnBorder.add(pnSouth,BorderLayout.SOUTH);
        JPanel pnWest = new JPanel();
        pnWest.setBackground(Color.blue);
        pnBorder.add(pnWest,BorderLayout.WEST);
        JPanel pnEast = new JPanel();
        pnEast.setBackground(Color.blue);
        pnBorder.add(pnEast,BorderLayout.EAST);
        JPanel pnCenter = new JPanel();
        pnCenter.setBackground(Color.yellow);
        pnBorder.add(pnCenter,BorderLayout.CENTER);
        
        JPanel.add(pnBorder);
        
                
                
            
    }
    
}
