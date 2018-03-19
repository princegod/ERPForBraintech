
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
public class Steel extends javax.swing.JFrame {
Connection con = null;
PreparedStatement pst = null;
ResultSet rs = null;
 float remaining=0;
 int count;
    /**
     * Creates new form Steel
     */
    public Steel() throws SQLException {
        initComponents();
        ShowCombo();
        showTableData();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SiteNamelabel1 = new javax.swing.JLabel();
        SiteNamelabel6 = new javax.swing.JLabel();
        steelbtnupdate = new javax.swing.JButton();
        steeldate = new com.toedter.calendar.JDateChooser();
        SiteNamelabel2 = new javax.swing.JLabel();
        Steelbtnbck = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        SiteNamelabel3 = new javax.swing.JLabel();
        steelfieldrate = new javax.swing.JTextField();
        steelfieldconsume = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        SiteNamelabel4 = new javax.swing.JLabel();
        steelfieldvichle = new javax.swing.JTextField();
        steelfieldrec = new javax.swing.JTextField();
        steelfieldsuppler = new javax.swing.JTextField();
        SiteNamelabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Steeltable = new javax.swing.JTable();
        SiteNamelabel = new javax.swing.JLabel();
        steelfieldbill = new javax.swing.JTextField();
        steelbtnsubmit = new javax.swing.JButton();
        SiteNamelabel5 = new javax.swing.JLabel();
        typefiled = new javax.swing.JTextField();
        btndel = new javax.swing.JButton();
        SiteNamelabel8 = new javax.swing.JLabel();
        combosite = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SiteNamelabel1.setText("   Receive");

        SiteNamelabel6.setText("Suppler Name");

        steelbtnupdate.setText("Update");
        steelbtnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                steelbtnupdateActionPerformed(evt);
            }
        });

        SiteNamelabel2.setText("Type");

        Steelbtnbck.setText("Back");
        Steelbtnbck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SteelbtnbckActionPerformed(evt);
            }
        });

        jLabel1.setText("Tons");

        SiteNamelabel3.setText("  Rate");

        steelfieldrate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                steelfieldrateFocusLost(evt);
            }
        });
        steelfieldrate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                steelfieldrateKeyTyped(evt);
            }
        });

        steelfieldconsume.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                steelfieldconsumeFocusLost(evt);
            }
        });
        steelfieldconsume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                steelfieldconsumeActionPerformed(evt);
            }
        });
        steelfieldconsume.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                steelfieldconsumeKeyTyped(evt);
            }
        });

        jLabel2.setText("Tons");

        SiteNamelabel4.setText("  Consume");

        steelfieldrec.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                steelfieldrecFocusLost(evt);
            }
        });
        steelfieldrec.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                steelfieldrecKeyTyped(evt);
            }
        });

        steelfieldsuppler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                steelfieldsupplerActionPerformed(evt);
            }
        });

        SiteNamelabel7.setText("Bill No.");

        Steeltable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Date", "Receive", "Consume", "Size", "Rate", "Suppler Name", "Bill No.", "Vehicle No.", "Remaining"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Steeltable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SteeltableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Steeltable);

        SiteNamelabel.setText("Select Site Name");

        steelbtnsubmit.setText("Submit");
        steelbtnsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                steelbtnsubmitActionPerformed(evt);
            }
        });

        SiteNamelabel5.setText(" Vehicle No.");

        btndel.setText("Delete");
        btndel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndelActionPerformed(evt);
            }
        });

        SiteNamelabel8.setText("    Date");

        combosite.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                combositePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Steelbtnbck)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(steelbtnsubmit)
                        .addGap(18, 18, 18)
                        .addComponent(steelbtnupdate)
                        .addGap(18, 18, 18)
                        .addComponent(btndel))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(SiteNamelabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SiteNamelabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SiteNamelabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SiteNamelabel5)
                                .addComponent(SiteNamelabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(SiteNamelabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(SiteNamelabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SiteNamelabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(steeldate, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(steelfieldbill, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(steelfieldsuppler, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(steelfieldvichle, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(steelfieldrate, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(steelfieldconsume, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(steelfieldrec, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(typefiled, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(SiteNamelabel)
                        .addGap(18, 18, 18)
                        .addComponent(combosite, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SiteNamelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combosite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(steeldate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SiteNamelabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SiteNamelabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(steelfieldrec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SiteNamelabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(steelfieldconsume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SiteNamelabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(typefiled, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SiteNamelabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(steelfieldrate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SiteNamelabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(steelfieldvichle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SiteNamelabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(steelfieldsuppler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(steelfieldbill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SiteNamelabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(steelbtnsubmit)
                    .addComponent(steelbtnupdate)
                    .addComponent(btndel))
                .addGap(45, 45, 45)
                .addComponent(Steelbtnbck)
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SteelbtnbckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SteelbtnbckActionPerformed
        new Material().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_SteelbtnbckActionPerformed

    private void steelfieldconsumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_steelfieldconsumeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_steelfieldconsumeActionPerformed

    private void steelfieldsupplerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_steelfieldsupplerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_steelfieldsupplerActionPerformed
public void showTableData(){

 try{
    
        String name=combosite.getSelectedItem().toString();
        String tablename=name+"steel";
con = DriverManager.getConnection("jdbc:mysql://localhost/user","root","root");
rs=con.getMetaData().getTables(null, null, null, null);
while(rs.next()){
    String check=rs.getString("Table_Name");
if(check!=null &&check.equalsIgnoreCase(tablename)){
String sql = "SELECT * FROM "+tablename;
pst = con.prepareStatement(sql);
rs=pst.executeQuery();
Steeltable.setModel(DbUtils.resultSetToTableModel(rs));
}}}
catch(Exception ex){
 JOptionPane.showMessageDialog(null,"Please Add A Site First");
 
}

 
}
    private void steelbtnsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_steelbtnsubmitActionPerformed
         try {
             
             if(((JTextField) steeldate.getDateEditor().getUiComponent()).getText().length()==0){
             JOptionPane.showMessageDialog(null, "Date Can not be empty");
             return;
            }
            if(steelfieldrec.getText().length()==0||steelfieldconsume.getText().length()==0||steelfieldrate.getText().length()==0){
            JOptionPane.showMessageDialog(null, "Any field from Receive,consume or rate is Empty");
            return;
            }
             
       float remain;
       remian();
       //System.out.println(remaining);
    remain=(Float.parseFloat(steelfieldrec.getText()))-(Float.parseFloat(steelfieldconsume.getText()))+remaining;
             System.out.println(remaining);
        String name=combosite.getSelectedItem().toString();
        String tablename=name+"steel";
        con = DriverManager.getConnection("jdbc:mysql://localhost/user","root","root");
        

rs=con.getMetaData().getTables(null, null, null, null);
while(rs.next()){
    
    String check=rs.getString("Table_Name");
if(check!=null &&check.equalsIgnoreCase(tablename)){
String sql = "INSERT INTO "+tablename
        +"(Date, Receive, Consume, Type, Rate, VehicleNo, SupplerName, Receipt, Remaining)"
+"VALUES (?,?,?,?,?,?,?,?,?)";
con = DriverManager.getConnection("jdbc:mysql://localhost/user","root","root");
pst = con.prepareStatement(sql);
pst.setString(1,((JTextField) steeldate.getDateEditor().getUiComponent()).getText());
pst.setString(2,steelfieldrec.getText());
pst.setString(3,steelfieldconsume.getText());
pst.setString(4,typefiled.getText());
pst.setString(5,steelfieldrate.getText());
pst.setString(6,steelfieldvichle.getText());
pst.setString(7,steelfieldsuppler.getText());
pst.setString(8,steelfieldbill.getText());
pst.setFloat(9,remain);
pst.executeUpdate();
showTableData();
refresh();
return ;
}

} 

pst.executeUpdate("CREATE TABLE "+ tablename +
                "("+"Date TEXT(25),Receive FLOAT(10),Consume FLOAT"
        + "(10),Type VARCHAR(200),Rate FLOAT(10),VehicleNo VARCHAR(20),SupplerName TEXT(30),Receipt VARCHAR(25),Remaining FLOAT(20))");
String sql = "INSERT INTO "+tablename
        +"(Date, Receive, Consume, Type, Rate, VehicleNo, SupplerName, Receipt, Remaining)"
+"VALUES (?,?,?,?,?,?,?,?,?)";
con = DriverManager.getConnection("jdbc:mysql://localhost/user","root","root");
pst = con.prepareStatement(sql);
pst.setString(1,((JTextField) steeldate.getDateEditor().getUiComponent()).getText());
pst.setString(2,steelfieldrec.getText());
pst.setString(3,steelfieldconsume.getText());
pst.setString(4,typefiled.getText());
pst.setString(5,steelfieldrate.getText());
pst.setString(6,steelfieldvichle.getText());
pst.setString(7,steelfieldsuppler.getText());
pst.setString(8,steelfieldbill.getText());
pst.setFloat(9,remain);
pst.executeUpdate();
showTableData();
refresh();


       
        
        
    } catch (SQLException ex) {
       
        Logger.getLogger(NewcontractorForm.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_steelbtnsubmitActionPerformed

    private void combositePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_combositePopupMenuWillBecomeInvisible
       try{
    
        String name=combosite.getSelectedItem().toString();
        String tablename=name+"steel";
con = DriverManager.getConnection("jdbc:mysql://localhost/user","root","root");
rs=con.getMetaData().getTables(null, null, null, null);
while(rs.next()){
    String check=rs.getString("Table_Name");
if(check!=null &&check.equalsIgnoreCase(tablename)){
String sql = "SELECT * FROM "+tablename;
pst = con.prepareStatement(sql);
rs=pst.executeQuery();
Steeltable.setModel(DbUtils.resultSetToTableModel(rs));
}}}
catch(Exception ex){
JOptionPane.showMessageDialog(null, ex);
 
}
    }//GEN-LAST:event_combositePopupMenuWillBecomeInvisible
private void refresh(){
    //steeldate.setDateFormatString("");
steelfieldrec.setText("");
steelfieldconsume.setText("");
typefiled.setText("");
steelfieldrate.setText("");
steelfieldvichle.setText("");
steelfieldsuppler.setText("");
steelfieldbill.setText("");
//steelfieldrec.setText("");




}
    private void SteeltableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SteeltableMouseClicked
        int i=Steeltable.getSelectedRow();
        TableModel model=Steeltable.getModel();
        String date=model.getValueAt(i,0).toString();
        steelfieldrec.setText(model.getValueAt(i,1).toString());
        steelfieldconsume.setText(model.getValueAt(i,2).toString());
        typefiled.setText(model.getValueAt(i,3).toString());
        steelfieldrate.setText(model.getValueAt(i,4).toString());
        steelfieldvichle.setText(model.getValueAt(i,5).toString());
        steelfieldsuppler.setText(model.getValueAt(i,6).toString());
        steelfieldbill.setText(model.getValueAt(i,7).toString());
        ((JTextField) steeldate.getDateEditor().getUiComponent()).setText(date);
    }//GEN-LAST:event_SteeltableMouseClicked

    private void steelbtnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_steelbtnupdateActionPerformed
        try {
       float remain;
       remian();
       //System.out.println(remaining);
    remain=(Float.parseFloat(steelfieldrec.getText()))-(Float.parseFloat(steelfieldconsume.getText()))+remaining;
        String name=combosite.getSelectedItem().toString();
        String tablename=name+"steel";
        con = DriverManager.getConnection("jdbc:mysql://localhost/user","root","root");
        

rs=con.getMetaData().getTables(null, null, null, null);
while(rs.next()){
    
    String check=rs.getString("Table_Name");
if(check!=null &&check.equalsIgnoreCase(tablename)){
String sql = "UPDATE "+tablename
        +" SET Date=?, Receive=?, Consume=?, Type=?, Rate=?, VehicleNo=?, SupplerName=?, Receipt=?, Remaining=? WHERE Date=?";
con = DriverManager.getConnection("jdbc:mysql://localhost/user","root","root");
pst = con.prepareStatement(sql);
pst.setString(1,((JTextField) steeldate.getDateEditor().getUiComponent()).getText());
pst.setString(2,steelfieldrec.getText());
pst.setString(3,steelfieldconsume.getText());
pst.setString(4,typefiled.getText());
pst.setString(5,steelfieldrate.getText());
pst.setString(6,steelfieldvichle.getText());
pst.setString(7,steelfieldsuppler.getText());
pst.setString(8,steelfieldbill.getText());
pst.setFloat(9,remain);
pst.setString(10,((JTextField) steeldate.getDateEditor().getUiComponent()).getText());
pst.executeUpdate();
showTableData();
refresh();
return ;
}

} 

    } catch (SQLException ex) {
       
        Logger.getLogger(NewcontractorForm.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_steelbtnupdateActionPerformed

    private void btndelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndelActionPerformed
        try {
       float remain;
       remian();
       //System.out.println(remaining);
   remain=(Float.parseFloat(steelfieldrec.getText()))-(Float.parseFloat(steelfieldconsume.getText()))+remaining;
        String name=combosite.getSelectedItem().toString();
        String tablename=name+"steel";
        con = DriverManager.getConnection("jdbc:mysql://localhost/user","root","root");
        

rs=con.getMetaData().getTables(null, null, null, null);
while(rs.next()){
    
    String check=rs.getString("Table_Name");
if(check!=null &&check.equalsIgnoreCase(tablename)){
String sql = "DELETE FROM "+tablename
        +" WHERE Date=?";
con = DriverManager.getConnection("jdbc:mysql://localhost/user","root","root");
pst = con.prepareStatement(sql);
pst.setString(1,((JTextField) steeldate.getDateEditor().getUiComponent()).getText());
pst.executeUpdate();
showTableData();
refresh();
return ;
}

} 

    } catch (SQLException ex) {
       
        Logger.getLogger(NewcontractorForm.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_btndelActionPerformed

    private void steelfieldrecKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_steelfieldrecKeyTyped
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
//JOptionPane.showMessageDialog(null,"Two Decimals are not allow");
}
    }//GEN-LAST:event_steelfieldrecKeyTyped

    private void steelfieldconsumeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_steelfieldconsumeKeyTyped
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
//JOptionPane.showMessageDialog(null,"Two Decimals are not allow");
}
    }//GEN-LAST:event_steelfieldconsumeKeyTyped

    private void steelfieldrateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_steelfieldrateKeyTyped
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
//JOptionPane.showMessageDialog(null,"Two Decimals are not allow");
}
    }//GEN-LAST:event_steelfieldrateKeyTyped

    private void steelfieldrecFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_steelfieldrecFocusLost
count=0;        // TODO add your handling code here:
    }//GEN-LAST:event_steelfieldrecFocusLost

    private void steelfieldconsumeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_steelfieldconsumeFocusLost
count=0;        // TODO add your handling code here:
    }//GEN-LAST:event_steelfieldconsumeFocusLost

    private void steelfieldrateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_steelfieldrateFocusLost
count=0;        // TODO add your handling code here:
    }//GEN-LAST:event_steelfieldrateFocusLost
private void remian(){
try{
   if(combosite.getSelectedItem()!=null){
        String name=combosite.getSelectedItem().toString();
        String tablename=name+"steel";
con = DriverManager.getConnection("jdbc:mysql://localhost/user","root","root");
rs=con.getMetaData().getTables(null, null, null, null);
while(rs.next()){
    String check=rs.getString("Table_Name");
if(check!=null &&check.equalsIgnoreCase(tablename)){
String sql = "SELECT LAST (Remaining) FROM "+tablename+"";
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
    //remaining=0;
//JOptionPane.showMessageDialog(null, ex);
 
}


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
            java.util.logging.Logger.getLogger(Steel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Steel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Steel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Steel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Steel().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Steel.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SiteNamelabel;
    private javax.swing.JLabel SiteNamelabel1;
    private javax.swing.JLabel SiteNamelabel2;
    private javax.swing.JLabel SiteNamelabel3;
    private javax.swing.JLabel SiteNamelabel4;
    private javax.swing.JLabel SiteNamelabel5;
    private javax.swing.JLabel SiteNamelabel6;
    private javax.swing.JLabel SiteNamelabel7;
    private javax.swing.JLabel SiteNamelabel8;
    private javax.swing.JButton Steelbtnbck;
    private javax.swing.JTable Steeltable;
    private javax.swing.JButton btndel;
    private javax.swing.JComboBox combosite;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton steelbtnsubmit;
    private javax.swing.JButton steelbtnupdate;
    private com.toedter.calendar.JDateChooser steeldate;
    private javax.swing.JTextField steelfieldbill;
    private javax.swing.JTextField steelfieldconsume;
    private javax.swing.JTextField steelfieldrate;
    private javax.swing.JTextField steelfieldrec;
    private javax.swing.JTextField steelfieldsuppler;
    private javax.swing.JTextField steelfieldvichle;
    private javax.swing.JTextField typefiled;
    // End of variables declaration//GEN-END:variables
}
