
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author piyush veerbhan
 */
public class Intval {
    public void Intvaldat(JTextField jb){
    
    jb.addKeyListener(new KeyAdapter() {
    public void keytype(KeyEvent e){
    char input=e.getKeyChar();
    if((input<'0'|| input >'9') && input!='\b'){
    e.consume();
    JOptionPane.showMessageDialog(null,"Only Numbers");
    }
    
    }    
        
});
    
    }
    
}
