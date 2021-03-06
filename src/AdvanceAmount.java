
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author piyush veerbhan
 */
public class AdvanceAmount extends javax.swing.JFrame {
Connection con = null;
PreparedStatement pst = null;
ResultSet rs = null;
 float remaining=0;
 int count=0;
 int id=0;
 showTable st=new showTable();
    public AdvanceAmount() throws SQLException {
        initComponents();
         ShowCombo();
         st.showTableData(advtable, combosite, "advance");
    }
private void ShowCombo() throws SQLException{
    
con = DriverManager.getConnection("jdbc:mysql://localhost/user","root","root");
String sql = "SELECT * FROM site";
pst = con.prepareStatement(sql);
rs=pst.executeQuery(sql);
while((rs.next())){
    String name=rs.getString("SiteName");
combosite.addItem(name);


}}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        combosite = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        amontfield = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        advcdate = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        namefield = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        amountfiled = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        purpose = new javax.swing.JTextField();
        btnupdate = new javax.swing.JButton();
        btnsub = new javax.swing.JButton();
        btndel = new javax.swing.JButton();
        btnbck = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        advtable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Advance Payment Form");

        jLabel2.setText("Name");

        combosite.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                combositePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        combosite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combositeActionPerformed(evt);
            }
        });

        jLabel3.setText("Advance Amount");

        amontfield.setText("0");
        amontfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                amontfieldFocusLost(evt);
            }
        });
        amontfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                amontfieldKeyTyped(evt);
            }
        });

        jLabel4.setText("Date");

        jLabel5.setText("Select Site");

        jLabel6.setText("Amount");

        amountfiled.setText("0");
        amountfiled.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                amountfiledFocusLost(evt);
            }
        });
        amountfiled.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                amountfiledKeyTyped(evt);
            }
        });

        jLabel7.setText("Purpose");

        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        btnsub.setText("Submit");
        btnsub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubActionPerformed(evt);
            }
        });

        btndel.setText("Delete");
        btndel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndelActionPerformed(evt);
            }
        });

        btnbck.setText("Back");
        btnbck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbckActionPerformed(evt);
            }
        });

        advtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Date", "Advance Amount", "Name", "Amount", "Purpose", "Reamining"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        advtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                advtableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(advtable);
        if (advtable.getColumnModel().getColumnCount() > 0) {
            advtable.getColumnModel().getColumn(0).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnbck)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(combosite, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(amontfield)
                            .addComponent(advcdate, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                            .addComponent(namefield)
                            .addComponent(amountfiled)
                            .addComponent(purpose)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnsub)
                        .addGap(18, 18, 18)
                        .addComponent(btnupdate)
                        .addGap(26, 26, 26)
                        .addComponent(btndel)))
                .addGap(51, 51, 51)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(combosite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(31, 31, 31)
                                .addComponent(jLabel4))
                            .addComponent(advcdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(amontfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(namefield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(amountfiled, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(purpose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnupdate)
                            .addComponent(btndel)
                            .addComponent(btnsub))
                        .addGap(58, 58, 58)
                        .addComponent(btnbck))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
       try {
       float remain;
       remian();
       //System.out.println(remaining);
     remain=(Float.parseFloat(amontfield.getText()))-(Float.parseFloat(amountfiled.getText()))+remaining;
        String name=combosite.getSelectedItem().toString();
        String tablename=name+"advance";
        con = DriverManager.getConnection("jdbc:mysql://localhost/user","root","root");
        

rs=con.getMetaData().getTables(null, null, null, null);
while(rs.next()){
    
    String check=rs.getString("Table_Name");
if(check!=null &&check.equalsIgnoreCase(tablename)){
String sql = "UPDATE "+tablename+" SET Date=?, AdvanceAmount=?, Name=?, Amount=?, Purpose=?, Remaining=? WHERE ID=?";
con = DriverManager.getConnection("jdbc:mysql://localhost/user","root","root");
pst = con.prepareStatement(sql);

                    pst.setString(1, ((JTextField) advcdate.getDateEditor().getUiComponent()).getText());
                    pst.setFloat(2,Float.parseFloat(amontfield.getText()));
                    pst.setString(3,namefield.getText());
                    pst.setFloat(4,Float.parseFloat(amountfiled.getText()));
                    pst.setString(5,purpose.getText());
                    pst.setFloat(6, remain);
                     pst.setInt(7,id);

                    pst.executeUpdate();
                    st.showTableData(advtable, combosite, "advance");
refresh();
//return ;
}

} 

        
 } catch (SQLException ex) {
       
        Logger.getLogger(NewcontractorForm.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btnsubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubActionPerformed
        try {
            
       
       
            
            if(((JTextField) advcdate.getDateEditor().getUiComponent()).getText().length()==0){
             JOptionPane.showMessageDialog(null, "Date Can not be empty");
             return;
                    }
                    if(namefield.getText().length()==0){
                        JOptionPane.showMessageDialog(null, "Name Can not be empty");
             return;
                    }
            //total();
                    float remain;
                    remian();
 remain=(Float.parseFloat(amontfield.getText()))-(Float.parseFloat(amountfiled.getText()))+remaining;
            System.out.println(remaining);
            String name = combosite.getSelectedItem().toString();

            String tablename = name + "advance";
            con = DriverManager.getConnection("jdbc:mysql://localhost/user", "root", "root");

            rs = con.getMetaData().getTables(null, null, null, null);
            while (rs.next()) {
                String check = rs.getString("Table_Name");
                if (check != null && check.equalsIgnoreCase(tablename)) {
                    String sql = "INSERT INTO " + tablename
                            + "(Date, AdvanceAmount, Name, Amount, Purpose,Remaining)"
                            + "VALUES (?,?,?,?,?,?)";
                    con = DriverManager.getConnection("jdbc:mysql://localhost/user", "root", "root");
                    pst = con.prepareStatement(sql);
                   
                    pst.setString(1, ((JTextField) advcdate.getDateEditor().getUiComponent()).getText());
                    pst.setFloat(2,Float.parseFloat(amontfield.getText()));
                    pst.setString(3,namefield.getText());
                    pst.setFloat(4,Float.parseFloat(amountfiled.getText()));
                    pst.setString(5,purpose.getText());
                    pst.setFloat(6, remain);
                    

                    pst.executeUpdate();
                    st.showTableData(advtable, combosite, "advance");
refresh();
                    return;
                }

            }
            //System.out.println("chal bc");
            String sql1 = "CREATE TABLE " + tablename
                    + "(" + "ID INT NOT NULL AUTO_INCREMENT,Date TEXT(20),AdvanceAmount FLOAT(25),Name VARCHAR(35),Amount FLOAT(15),Purpose VARCHAR(100),Remaining FLOAT(35),PRIMARY KEY(ID))";
            //System.out.println(sql1);
            con = DriverManager.getConnection("jdbc:mysql://localhost/user", "root", "root");
            pst = con.prepareStatement(sql1);
                   // float remain;
                    remian();
 remain=(Float.parseFloat(amontfield.getText()))-(Float.parseFloat(amountfiled.getText()))+remaining;
            pst.executeUpdate(sql1);
             String sql = "INSERT INTO " + tablename
                            + "(Date, AdvanceAmount, Name, Amount, Purpose,Remaining)"
                            + "VALUES (?,?,?,?,?,?)";
                    con = DriverManager.getConnection("jdbc:mysql://localhost/user", "root", "root");
                    pst = con.prepareStatement(sql);
                   
                    pst.setString(1, ((JTextField) advcdate.getDateEditor().getUiComponent()).getText());
                    pst.setFloat(2,Float.parseFloat(amontfield.getText()));
                    pst.setString(3,namefield.getText());
                    pst.setFloat(4,Float.parseFloat(amountfiled.getText()));
                    pst.setString(5,purpose.getText());
                    pst.setFloat(6, remain);
                    

                    pst.executeUpdate();
                    st.showTableData(advtable, combosite, "advance");
refresh();
        } catch (SQLException ex) {

            Logger.getLogger(NewcontractorForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnsubActionPerformed
private void remian(){
try{
   if(combosite.getSelectedItem()!=null){
        String name=combosite.getSelectedItem().toString();
        String tablename=name+"advance";
con = DriverManager.getConnection("jdbc:mysql://localhost/user","root","root");
rs=con.getMetaData().getTables(null, null, null, null);
while(rs.next()){
    String check=rs.getString("Table_Name");
if(check!=null &&check.equalsIgnoreCase(tablename)){
String sql = "SELECT Remaining FROM "+tablename+" ORDER BY ID DESC LIMIT 1";
    //System.out.println(sql);
pst = con.prepareStatement(sql);
rs=pst.executeQuery();
rs.next();
remaining=rs.getInt(1);
//System.out.println(remaining);
}}}
   else{
   return;
   }

}
catch(Exception ex){
    System.out.println("mai chal tha");
    remaining=0;
//JOptionPane.showMessageDialog(null, ex);
 
}


}
    private void btndelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndelActionPerformed
        try {
       
        String name=combosite.getSelectedItem().toString();
        String tablename=name+"advance";
        con = DriverManager.getConnection("jdbc:mysql://localhost/user","root","root");
        

rs=con.getMetaData().getTables(null, null, null, null);
while(rs.next()){
    
    String check=rs.getString("Table_Name");
if(check!=null &&check.equalsIgnoreCase(tablename)){
 String sql = "DELETE FROM "+tablename+" WHERE ID=?";
con = DriverManager.getConnection("jdbc:mysql://localhost/user","root","root");
pst = con.prepareStatement(sql);
pst.setInt(1,id);
pst.executeUpdate();
 st.showTableData(advtable, combosite, "advance");
refresh();
return ;
}

} 

        
 } catch (SQLException ex) {
       
        Logger.getLogger(NewcontractorForm.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_btndelActionPerformed

    private void btnbckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbckActionPerformed
      new viewSiteform().setVisible(true);
      this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_btnbckActionPerformed

    private void combositeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combositeActionPerformed
       
    }//GEN-LAST:event_combositeActionPerformed

    private void amontfieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_amontfieldKeyTyped
char input=evt.getKeyChar();
       
    if((input<'0'|| input >'9') && input!= '\b' && input!='.'){
        JOptionPane.showMessageDialog(null,"Only Numbers");
    evt.consume();
    }
if(input=='.'){
count++;}
if(count>1){
    System.out.println();
    evt.consume();
    count--;
}        // TODO add your handling code here:
    }//GEN-LAST:event_amontfieldKeyTyped

    private void amontfieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_amontfieldFocusLost
count=0;        // TODO add your handling code here:
    }//GEN-LAST:event_amontfieldFocusLost

    private void amountfiledKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_amountfiledKeyTyped
    char input=evt.getKeyChar();
       
    if((input<'0'|| input >'9') && input!= '\b' && input!='.'){
        JOptionPane.showMessageDialog(null,"Only Numbers");
    evt.consume();
    }
if(input=='.'){
count++;}
if(count>1){
    System.out.println();
    evt.consume();
    count--;}      // TODO add your handling code here:
    }//GEN-LAST:event_amountfiledKeyTyped

    private void amountfiledFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_amountfiledFocusLost
count=0;        // TODO add your handling code here:
    }//GEN-LAST:event_amountfiledFocusLost

    private void refresh(){
    amontfield.setText("0");
    namefield.setText("");
    amountfiled.setText("0");
    purpose.setText("");
    
    }
    private void combositePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_combositePopupMenuWillBecomeInvisible
try{
    
        String name=combosite.getSelectedItem().toString();
        String tablename=name+"advance";
con = DriverManager.getConnection("jdbc:mysql://localhost/user","root","root");
rs=con.getMetaData().getTables(null, null, null, null);
while(rs.next()){
    String check=rs.getString("Table_Name");
if(check!=null &&check.equalsIgnoreCase(tablename)){
String sql = "SELECT * FROM "+tablename;
pst = con.prepareStatement(sql);
rs=pst.executeQuery();
advtable.setModel(DbUtils.resultSetToTableModel(rs));
}}}
catch(Exception ex){
JOptionPane.showMessageDialog(null, ex);        // TODO add your handling code here:
    }//GEN-LAST:event_combositePopupMenuWillBecomeInvisible
    }
    private void advtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_advtableMouseClicked
        int i=advtable.getSelectedRow();
        TableModel model=advtable.getModel();
        id=Integer.parseInt(model.getValueAt(i,0).toString());
        System.out.println(id);
        String date=model.getValueAt(i,1).toString();
        amontfield.setText(model.getValueAt(i,2).toString());
        namefield.setText(model.getValueAt(i,3).toString());
        amountfiled.setText(model.getValueAt(i,4).toString());
       purpose.setText(model.getValueAt(i,4).toString());
        
        ((JTextField) advcdate.getDateEditor().getUiComponent()).setText(date);
    }//GEN-LAST:event_advtableMouseClicked
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdvanceAmount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdvanceAmount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdvanceAmount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdvanceAmount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new AdvanceAmount().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(AdvanceAmount.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser advcdate;
    private javax.swing.JTable advtable;
    private javax.swing.JTextField amontfield;
    private javax.swing.JTextField amountfiled;
    private javax.swing.JButton btnbck;
    private javax.swing.JButton btndel;
    private javax.swing.JButton btnsub;
    private javax.swing.JButton btnupdate;
    private javax.swing.JComboBox combosite;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField namefield;
    private javax.swing.JTextField purpose;
    // End of variables declaration//GEN-END:variables
}
