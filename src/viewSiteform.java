
import java.awt.HeadlessException;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBox;
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
 * @author Dell
 */
public class viewSiteform extends javax.swing.JFrame {
    Connection con = null;
PreparedStatement pst = null;
ResultSet rs = null;
validateFields vf=new validateFields();
int id=0;
 

    /**
     * Creates new form siteForm
     */
    public viewSiteform() {
        initComponents();
        showTableData();
    }
public void showTableData(){
try{
con = DriverManager.getConnection("jdbc:mysql://localhost/user","root","root");
String sql = "SELECT * FROM site";
pst = con.prepareStatement(sql);
rs=pst.executeQuery();
siterTable.setModel(DbUtils.resultSetToTableModel(rs));
}
catch(Exception ex){

 
}
 
}
    /**
     * This method is called from within the constructor to initialize the form.
     WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        sitenamefield = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        sitelocationfield = new javax.swing.JTextField();
        siteDateChooserstart = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        enddatechoosersite = new com.toedter.calendar.JDateChooser();
        newsitelabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        siterTable = new javax.swing.JTable();
        btnsubmitsite = new javax.swing.JButton();
        btnsitedel = new javax.swing.JButton();
        btnsiteupdate = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        addConbutsite = new javax.swing.JButton();
        addempbtn = new javax.swing.JButton();
        btntools = new javax.swing.JButton();
        btnwork = new javax.swing.JButton();
        btnclient = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

        jMenuItem1.setText("jMenuItem1");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jMenu1.setText("jMenu1");

        jMenu4.setText("jMenu4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Site Name");

        sitenamefield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                sitenamefieldFocusLost(evt);
            }
        });
        sitenamefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sitenamefieldActionPerformed(evt);
            }
        });

        jLabel9.setText("Location");

        sitelocationfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                sitelocationfieldFocusLost(evt);
            }
        });
        sitelocationfield.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                sitelocationfieldInputMethodTextChanged(evt);
            }
        });

        jLabel10.setText("Start Date");

        jLabel11.setText("End Date");

        newsitelabel.setText("Site 1");

        siterTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Site Name ", "Location", "Start Date", "End Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        siterTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                siterTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(siterTable);

        btnsubmitsite.setText("Submit");
        btnsubmitsite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubmitsiteActionPerformed(evt);
            }
        });

        btnsitedel.setText("Delete");
        btnsitedel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsitedelActionPerformed(evt);
            }
        });

        btnsiteupdate.setText("Update");
        btnsiteupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsiteupdateActionPerformed(evt);
            }
        });

        jButton1.setText("Material");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        addConbutsite.setText("Add Contractor");
        addConbutsite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addConbutsiteActionPerformed(evt);
            }
        });

        addempbtn.setText("Add Employee");
        addempbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addempbtnActionPerformed(evt);
            }
        });

        btntools.setText("Tools");
        btntools.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntoolsActionPerformed(evt);
            }
        });

        btnwork.setText("Work Done");
        btnwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnworkActionPerformed(evt);
            }
        });

        btnclient.setText("Client Bills");
        btnclient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclientActionPerformed(evt);
            }
        });

        jButton2.setText("Advance Payment");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sitelocationfield, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sitenamefield, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(siteDateChooserstart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(enddatechoosersite, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
            .addGroup(layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(newsitelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addConbutsite)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(addempbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btntools, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btnsubmitsite)
                        .addGap(54, 54, 54)
                        .addComponent(btnsiteupdate)
                        .addGap(60, 60, 60)
                        .addComponent(btnsitedel)))
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnwork, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnclient, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(newsitelabel)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(sitenamefield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(sitelocationfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(siteDateChooserstart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(enddatechoosersite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsubmitsite)
                    .addComponent(btnsiteupdate)
                    .addComponent(btnsitedel))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addConbutsite)
                    .addComponent(addempbtn)
                    .addComponent(btnwork)
                    .addComponent(jButton2))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btntools)
                    .addComponent(btnclient))
                .addContainerGap(160, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sitelocationfieldInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_sitelocationfieldInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_sitelocationfieldInputMethodTextChanged

    private void btnsubmitsiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubmitsiteActionPerformed
        
        
      //vf.validateName(sitelocationfield,"Site Location Can not be Empty");
        try {
                    
               if(sitenamefield.getText().length()==0 || sitelocationfield.getText().length()==0){
                vf.validateName(sitenamefield,"Site Name or Site Location  Can not be Empty");
        return;
        }     
                    
                    
     
        
        String tablename="site";
        con = DriverManager.getConnection("jdbc:mysql://localhost/user","root","root");
        

rs=con.getMetaData().getTables(null, null, null, null);
while(rs.next()){
    String check=rs.getString("Table_Name");
if(check!=null &&check.equalsIgnoreCase(tablename)){
String sql = "INSERT INTO "+tablename
        +"(SiteName, SiteLocation, StartDate, EndDate)"
+"VALUES (?,?,?,?)";
con = DriverManager.getConnection("jdbc:mysql://localhost/user","root","root");
pst = con.prepareStatement(sql);
pst.setString(1,sitenamefield.getText());
pst.setString(2,sitelocationfield.getText());
pst.setString(3,((JTextField) siteDateChooserstart.getDateEditor().getUiComponent()).getText());
pst.setString(4,((JTextField) enddatechoosersite.getDateEditor().getUiComponent()).getText());

pst.executeUpdate();
showTableData();
refresh();
return ;
}

} 
  //System.out.println("chal bc");
String sql1="CREATE TABLE "+ tablename +
                "("+"ID INT NOT NULL AUTO_INCREMENT,SiteName VARCHAR(35), SiteLocation VARCHAR(75), StartDate TEXT(25),EndDate TEXT(25),PRIMARY KEY(ID))";
//System.out.println(sql1);
con = DriverManager.getConnection("jdbc:mysql://localhost/user","root","root");
pst = con.prepareStatement(sql1);

pst.executeUpdate(sql1);
String sql = "INSERT INTO "+tablename
        +"(SiteName, SiteLocation, StartDate, EndDate)"
+"VALUES (?,?,?,?)";
con = DriverManager.getConnection("jdbc:mysql://localhost/user","root","root");
pst = con.prepareStatement(sql);
pst.setString(1,sitenamefield.getText());
pst.setString(2,sitelocationfield.getText());
pst.setString(3,((JTextField) siteDateChooserstart.getDateEditor().getUiComponent()).getText());
pst.setString(4,((JTextField) enddatechoosersite.getDateEditor().getUiComponent()).getText());

pst.executeUpdate();
refresh();
showTableData();



       
        
        
    } catch (SQLException ex) {
       
        Logger.getLogger(NewcontractorForm.class.getName()).log(Level.SEVERE, null, ex);
    }
   
    }//GEN-LAST:event_btnsubmitsiteActionPerformed

    private void btnsitedelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsitedelActionPerformed
        try{
            if(id==0){
                JOptionPane.showMessageDialog(null, "Please select Site From Table");
                return;
            }
            String sql = "DELETE FROM site WHERE ID=?";
            con = DriverManager.getConnection("jdbc:mysql://localhost/user","root","root");
            pst = con.prepareStatement(sql);
            pst.setInt(1,id);
            pst.executeUpdate();
            showTableData();
            JOptionPane.showMessageDialog(null, "delete successfully");
refresh();
id=0;
        }
        catch(SQLException | HeadlessException ex){
            JOptionPane.showMessageDialog(null,  "please enter all the details or fill it correctly");
    }//GEN-LAST:event_btnsitedelActionPerformed
    
    }
    
    private void btnsiteupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsiteupdateActionPerformed
        try{
             if(id==0){
               JOptionPane.showMessageDialog(null, "Please Select Site From Table");
        return;}
            String sql = "UPDATE site SET SiteName=?,SiteLocation=?,StartDate=?,EndDate=? WHERE ID=?";
       
            con = DriverManager.getConnection("jdbc:mysql://localhost/user","root","root");
            pst = con.prepareStatement(sql);
            pst.setString(1, sitenamefield.getText());
            pst.setString(2,sitelocationfield.getText());
            pst.setString(3,((JTextField) siteDateChooserstart.getDateEditor().getUiComponent()).getText());
             pst.setString(4,((JTextField) enddatechoosersite.getDateEditor().getUiComponent()).getText());
             pst.setInt(5,id);
           
            pst.executeUpdate();
            showTableData();
            JOptionPane.showMessageDialog(null, "updated successfully");
            refresh();
id=0;
        }
        catch(SQLException | HeadlessException ex){
            JOptionPane.showMessageDialog(null,  ex);
        }
    }//GEN-LAST:event_btnsiteupdateActionPerformed

    private void addConbutsiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addConbutsiteActionPerformed
      
        new NewcontractorForm().setVisible(true);
        //System.out.println("kya hua");
       this.setVisible(false);
    }//GEN-LAST:event_addConbutsiteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Material().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void siterTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_siterTableMouseClicked
         int i=siterTable.getSelectedRow();
        TableModel model=siterTable.getModel();
        id=Integer.parseInt(model.getValueAt(i,0).toString());
        sitenamefield.setText(model.getValueAt(i,1).toString());
        sitelocationfield.setText(model.getValueAt(i,2).toString());
        String date1=model.getValueAt(i,3).toString();
        ((JTextField) siteDateChooserstart.getDateEditor().getUiComponent()).setText(date1);
       
        
        String date2=model.getValueAt(i,4).toString();
        ((JTextField) enddatechoosersite.getDateEditor().getUiComponent()).setText(date2);
        
        
        

    }//GEN-LAST:event_siterTableMouseClicked

    private void addempbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addempbtnActionPerformed
        try {
            new Employee().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(viewSiteform.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
    }//GEN-LAST:event_addempbtnActionPerformed

    private void btntoolsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntoolsActionPerformed
        try {
            new Tools().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(viewSiteform.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
    }//GEN-LAST:event_btntoolsActionPerformed

    private void btnclientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnclientActionPerformed

    private void btnworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnworkActionPerformed
        new WorkDone().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnworkActionPerformed

    private void sitenamefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sitenamefieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sitenamefieldActionPerformed

    private void sitenamefieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sitenamefieldFocusLost
        vf.validateName(sitenamefield,"Site Name Can not be Empty");
    }//GEN-LAST:event_sitenamefieldFocusLost

    private void sitelocationfieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sitelocationfieldFocusLost
       vf.validateName(sitelocationfield,"Site Location Can not be Empty");
    }//GEN-LAST:event_sitelocationfieldFocusLost

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            new AdvanceAmount().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(viewSiteform.class.getName()).log(Level.SEVERE, null, ex);
        }
  this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed
 private void refresh(){
 sitenamefield.setText("");
 sitelocationfield.setText("");
 
 }
 
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
            java.util.logging.Logger.getLogger(viewSiteform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewSiteform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewSiteform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewSiteform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewSiteform().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addConbutsite;
    private javax.swing.JButton addempbtn;
    private javax.swing.JButton btnclient;
    private javax.swing.JButton btnsitedel;
    private javax.swing.JButton btnsiteupdate;
    private javax.swing.JButton btnsubmitsite;
    private javax.swing.JButton btntools;
    private javax.swing.JButton btnwork;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private com.toedter.calendar.JDateChooser enddatechoosersite;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel newsitelabel;
    private com.toedter.calendar.JDateChooser siteDateChooserstart;
    private javax.swing.JTextField sitelocationfield;
    public javax.swing.JTextField sitenamefield;
    public javax.swing.JTable siterTable;
    // End of variables declaration//GEN-END:variables



}