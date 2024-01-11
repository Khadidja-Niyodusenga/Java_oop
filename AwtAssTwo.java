/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trial;

import java.awt.*;
import javax.swing.*;
 public class AwtAssTwo extends JPanel{//graphics
   public void paintComponent(Graphics g){
   g.drawOval(100, 50, 200, 200);
   g.fillOval(130, 100, 50, 50);
   g.fillOval(227, 100, 50, 50);
   g.drawArc(160, 160, 90, 40, 180, 180);
   }
     public static void main(String[] args) {
         AwtAssTwo   Obj=new  AwtAssTwo();
        JFrame frameobj=new JFrame();
        frameobj.add(Obj);
        frameobj.setSize(new Dimension(450, 500));
        frameobj.setTitle("Graphics Example");
        frameobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frameobj.setLayout(null);
        frameobj.setVisible(true);
        
     }
    
}
