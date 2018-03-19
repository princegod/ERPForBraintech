
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class validateFields {
    

  public boolean validateName(JTextField f,String mesg){
        if(f.getText().equals(""))
            return failedMessage(f, mesg);
        else 
            return true;
        
    }
    public boolean failedMessage(JTextField f, String errormsg)
{
  JOptionPane.showMessageDialog(null, errormsg); // give user feedback
  f.requestFocus(); // set focus on field, so user can change
  return false; // return false, as validation has failed
}
    public boolean validateMoblie(JTextField f,String mesg){
        if(f.getText().length()!=10||f.getText().equals(""))
            return failedMessage(f, mesg);
            else 
            return true;
        
    }
    
  
     public boolean validateAdhar(JTextField f,String mesg){
        if(f.getText().length()!=12||f.getText().equals(""))
            return failedMessage(f, mesg);
            else 
            return true;
        
    }
    
    
}
