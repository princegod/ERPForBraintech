
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class showTable {
    Connection con=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
   public void showTableData(JTable tableN,JComboBox cb,String s){
try{
    
        String name=cb.getSelectedItem().toString();
        String tablename=name+s;
con = DriverManager.getConnection("jdbc:mysql://localhost/user","root","root");
rs=con.getMetaData().getTables(null, null, null, null);
while(rs.next()){
    String check=rs.getString("Table_Name");
if(check!=null &&check.equalsIgnoreCase(tablename)){
String sql = "SELECT * FROM "+tablename;
pst = con.prepareStatement(sql);
rs=pst.executeQuery();
tableN.setModel(DbUtils.resultSetToTableModel(rs));
}}}
catch(Exception ex){
 JOptionPane.showMessageDialog(null,"Please Add A Site First");
 
}
 
}
 
 public void ShowdropDown(JComboBox cb){
       
         //cb.removeAllItems();
        try{
con = DriverManager.getConnection("jdbc:mysql://localhost/user","root","root");
String sql = "SELECT * FROM site";
pst = con.prepareStatement(sql);
rs=pst.executeQuery(sql);
while((rs.next())){
    String name=rs.getString("sitename");
cb.addItem(name);
}
 }catch(Exception ex){
     JOptionPane.showMessageDialog(null,"Please Add A Site First");
     
 }
    }
 
 public void FillTableUSingcombo(JComboBox cb,JTable tb,String s){
      try{
    
        String name=cb.getSelectedItem().toString();
        String tablename=name+s;
con = DriverManager.getConnection("jdbc:mysql://localhost/user","root","root");
rs=con.getMetaData().getTables(null, null, null, null);
while(rs.next()){
    String check=rs.getString("Table_Name");
if(check!=null &&check.equalsIgnoreCase(tablename)){
String sql = "SELECT * FROM "+tablename;
pst = con.prepareStatement(sql);
//System.out.print(sql);
rs=pst.executeQuery();

tb.setModel(DbUtils.resultSetToTableModel(rs));
}}}
catch(Exception ex){
JOptionPane.showMessageDialog(null, ex);
 
}
 }
public void savefle(JTable tb, File file,JComboBox cb,String s) throws IOException, SQLException{
    String name=cb.getSelectedItem().toString();
        String tablename=name+s;
        System.out.println(tablename);
con = DriverManager.getConnection("jdbc:mysql://localhost/user","root","root");
rs=con.getMetaData().getTables(null, null, null, null);
while(rs.next()){
    String check=rs.getString("Table_Name");
if(check!=null &&check.equalsIgnoreCase(tablename)){
    
TableModel model=tb.getModel();
FileWriter out=new FileWriter(file);
    BufferedWriter bw= new BufferedWriter(out);
    for(int i=0; i<model.getColumnCount();i++){
    bw.write(model.getColumnName(i)+"\t");
        System.out.println("chal");
    }
    bw.write("\n");
    for(int i=0; i<model.getRowCount();i++){
    for(int j=0; j<model.getColumnCount();j++){
    bw.write(model.getValueAt(i, j)+"\t");
    
    }
    bw.write("\n");
    }
    bw.close();
}}
    
}
    void FillTableUSingcombo(JTable tablecable, JComboBox selectSite, String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
