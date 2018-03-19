
import java.awt.FlowLayout;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Piyush Veerbhan
 */
public class AppMain extends javax.swing.JFrame  {
    public static void main(String[] args){
    JFrame f=new JFrame();
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
    f.getContentPane().add(new Home());
    f.setSize(600, 280);
    f.setVisible(true);
    
    
    }
    
}
