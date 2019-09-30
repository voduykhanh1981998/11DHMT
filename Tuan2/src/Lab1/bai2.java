/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author E5-575G
 */
public class bai2 extends JFrame{
   public bai2() {
       super("Demo Window");
       setDefaultCloseOperation(EXIT_ON_CLOSE);
   }
       
       public static void main(String[] args) {
        bai2 JPanel = new bai2();
        JPanel.setSize(400, 300);
        JPanel.setLocationRelativeTo(null);
        JPanel.setVisible(true);
          
        //FlowLayout
       JPanel pnFlow = new JPanel();
       pnFlow.setLayout(new FlowLayout());
       pnFlow.setBackground(Color.yellow);
       JButton btn1 = new JButton("FlowLayout");
       JButton btn2 = new JButton("Add các control");
       JButton btn3 = new JButton("Trên 1 dòng");
       JButton btn4 = new JButton("Hết chổ chứa");
       JButton btn5 = new JButton("Thì xuống dòng");
       pnFlow.add(btn1);pnFlow.add(btn2);
       pnFlow.add(btn3);pnFlow.add(btn4);
       pnFlow.add(btn5);
       
       JPanel.add(pnFlow);
       
       

      
   }
}
