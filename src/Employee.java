
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
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
public class Employee extends javax.swing.JFrame {
Connection con = null;
PreparedStatement pst = null;
ResultSet rs = null;
validateFields vf=new validateFields();
    /**
     * Creates new form Employee
     */
    public Employee() throws SQLException {
        initComponents();
        ShowCombo();
        showTableData();
    }
     public void showTableData(){
try{
    //System.out.println("chal");
        String name=empcombox.getSelectedItem().toString();
        String tablename=name+"empolyee";
        //System.out.println(tablename);
con = DriverManager.getConnection("jdbc:mysql://localhost/user","root","root");
rs=con.getMetaData().getTables(null, null, null, null);
while(rs.next()){
    String check=rs.getString("Table_Name");
if(check!=null &&check.equalsIgnoreCase(tablename)){
String sql = "SELECT * FROM "+tablename;
//System.out.println(sql);
pst = con.prepareStatement(sql);
rs=pst.executeQuery();
emptable.setModel(DbUtils.resultSetToTableModel(rs));
}}}
catch(Exception ex){
JOptionPane.showMessageDialog(null,"Please Add A Site First");
 
}
 
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        empbtnbck = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        emptable = new javax.swing.JTable();
        empaddressfield = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        empbtndel = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        empbtnupdate = new javax.swing.JButton();
        empnamefiled = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        empaccountfield = new javax.swing.JTextField();
        empmobilefiled = new javax.swing.JTextField();
        empsalaryfiled = new javax.swing.JTextField();
        empadharfield = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        empbtnadd = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        empcombox = new javax.swing.JComboBox();
        typefield = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setText("Mobile no");

        empbtnbck.setText("Back");
        empbtnbck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empbtnbckActionPerformed(evt);
            }
        });

        jLabel6.setText("Salary");

        emptable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Type", "Adhar No", "Address", "Mobile No", "Salary", "Account No."
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        emptable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emptableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(emptable);

        jLabel2.setText("Name");

        empbtndel.setText("Delete");
        empbtndel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empbtndelActionPerformed(evt);
            }
        });

        jLabel8.setText("Address");

        empbtnupdate.setText("Update");
        empbtnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empbtnupdateActionPerformed(evt);
            }
        });

        empnamefiled.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                empnamefiledFocusLost(evt);
            }
        });
        empnamefiled.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empnamefiledActionPerformed(evt);
            }
        });

        jLabel9.setText("Account No.");

        empaccountfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empaccountfieldActionPerformed(evt);
            }
        });
        empaccountfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                empaccountfieldKeyTyped(evt);
            }
        });

        empmobilefiled.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                empmobilefiledFocusLost(evt);
            }
        });
        empmobilefiled.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                empmobilefiledKeyTyped(evt);
            }
        });

        empsalaryfiled.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empsalaryfiledActionPerformed(evt);
            }
        });
        empsalaryfiled.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                empsalaryfiledKeyTyped(evt);
            }
        });

        empadharfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                empadharfieldFocusLost(evt);
            }
        });
        empadharfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                empadharfieldKeyTyped(evt);
            }
        });

        jLabel3.setText("Adhar No.");

        empbtnadd.setText("Add");
        empbtnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empbtnaddActionPerformed(evt);
            }
        });

        jButton1.setText("Daily Report");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Add Employee Form");

        jLabel4.setText("Select Site Name");

        empcombox.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                empcomboxPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        typefield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                typefieldFocusLost(evt);
            }
        });

        jLabel7.setText("Type");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(empcombox, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(empnamefiled, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(typefield, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(empadharfield, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(empaddressfield, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(empmobilefiled, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(empsalaryfiled, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(empaccountfield, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(empbtnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(empbtnupdate)
                        .addGap(57, 57, 57)
                        .addComponent(empbtndel)))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(empbtnbck)
                .addGap(55, 55, 55)
                .addComponent(jButton1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel4))
                            .addComponent(empcombox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel2))
                            .addComponent(empnamefiled, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel7))
                            .addComponent(typefield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel3))
                            .addComponent(empadharfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(empaddressfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(empmobilefiled, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(empsalaryfiled, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel9))
                            .addComponent(empaccountfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(empbtnadd)
                            .addComponent(empbtnupdate)
                            .addComponent(empbtndel)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(empbtnbck)
                    .addComponent(jButton1))
                .addContainerGap(111, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void empbtnbckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empbtnbckActionPerformed
        new viewSiteform().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_empbtnbckActionPerformed

    private void empbtndelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empbtndelActionPerformed
try {
       
        String name=empcombox.getSelectedItem().toString();
        String tablename=name+"empolyee";
        con = DriverManager.getConnection("jdbc:mysql://localhost/user","root","root");
        

rs=con.getMetaData().getTables(null, null, null, null);
while(rs.next()){
    String check=rs.getString("Table_Name");
if(check!=null &&check.equalsIgnoreCase(tablename)){
String sql = "DELETE FROM "+tablename
        +" WHERE MobileNO=?";
con = DriverManager.getConnection("jdbc:mysql://localhost/user","root","root");
pst = con.prepareStatement(sql);
pst.setString(1,empmobilefiled.getText());
pst.executeUpdate();
showTableData();
refresh();
return ;
}}      
        
    } catch (SQLException ex) {
       
        Logger.getLogger(NewcontractorForm.class.getName()).log(Level.SEVERE, null, ex);
    }      
    }//GEN-LAST:event_empbtndelActionPerformed

    private void empbtnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empbtnupdateActionPerformed
        try {
       
        String name=empcombox.getSelectedItem().toString();
        String tablename=name+"empolyee";
        con = DriverManager.getConnection("jdbc:mysql://localhost/user","root","root");
        

rs=con.getMetaData().getTables(null, null, null, null);
while(rs.next()){
    String check=rs.getString("Table_Name");
if(check!=null &&check.equalsIgnoreCase(tablename)){
String sql = "UPDATE "+tablename
        +" SET Name=?, Type=?, Adhar=?, Address=?, MobileNO=?, Salary=?, AccountNO=? WHERE MobileNO=?";
con = DriverManager.getConnection("jdbc:mysql://localhost/user","root","root");
pst = con.prepareStatement(sql);
pst.setString(1,empnamefiled.getText());
pst.setString(2,typefield.getText());
pst.setString(3,empadharfield.getText());
pst.setString(4,empaddressfield.getText());
pst.setString(5,empmobilefiled.getText());
pst.setString(6,empsalaryfiled.getText());
pst.setString(7,empaccountfield.getText());
pst.setString(8,empmobilefiled.getText());
pst.executeUpdate();
showTableData();
refresh();
return ;
}}      
        
    } catch (SQLException ex) {
       
        Logger.getLogger(NewcontractorForm.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_empbtnupdateActionPerformed

    private void empbtnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empbtnaddActionPerformed
        try{
       if(empnamefiled.getText().length()==0||typefield.getText().length()==0||empmobilefiled.getText().length()==0||empadharfield.getText().length()==0){
       JOptionPane.showMessageDialog(null,"Any Field is Empty from Name,type,Adhar,Mobile No");
       return;
       }
        String name=empcombox.getSelectedItem().toString();
        String tablename=name+"empolyee";
        con = DriverManager.getConnection("jdbc:mysql://localhost/user","root","root");
        

rs=con.getMetaData().getTables(null, null, null, null);
while(rs.next()){
    String check=rs.getString("Table_Name");
if(check!=null &&check.equalsIgnoreCase(tablename)){
String sql = "INSERT INTO "+tablename
        +"(Name, Type, Adhar, Address, MobileNO, Salary, AccountNO)"
+"VALUES (?,?,?,?,?,?,?)";
con = DriverManager.getConnection("jdbc:mysql://localhost/user","root","root");
pst = con.prepareStatement(sql);
pst.setString(1,empnamefiled.getText());
pst.setString(2,typefield.getText());
pst.setString(3,empadharfield.getText());
pst.setString(4,empaddressfield.getText());
pst.setString(5,empmobilefiled.getText());
pst.setString(6,empsalaryfiled.getText());
pst.setString(7,empaccountfield.getText());
pst.executeUpdate();
showTableData();
refresh();
return ;
}

} 

pst.executeUpdate("CREATE TABLE "+ tablename +
                "("+"Name TEXT(25),Type TEXT(20),Adhar VARCHAR(250),Address VARCHAR(250),MobileNO VARCHAR(250),Salary VARCHAR(250),AccountNo VARCHAR(250))");
String sql = "INSERT INTO "+tablename
        +"(Name, Type, Adhar, Address, MobileNO, Salary, AccountNO)"
+"VALUES (?,?,?,?,?,?,?)";
con = DriverManager.getConnection("jdbc:mysql://localhost/user","root","root");
pst = con.prepareStatement(sql);
pst.setString(1,empnamefiled.getText());
pst.setString(2,typefield.getText());
pst.setString(3,empadharfield.getText());
pst.setString(4,empaddressfield.getText());
pst.setString(5,empmobilefiled.getText());
pst.setString(6,empsalaryfiled.getText());
pst.setString(7,empaccountfield.getText());
pst.executeUpdate();
showTableData();
refresh();


       
        
        
    } catch (SQLException ex) {
       
        Logger.getLogger(NewcontractorForm.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_empbtnaddActionPerformed

    private void empaccountfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empaccountfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empaccountfieldActionPerformed
 public void refresh(){
    
    empnamefiled.setText("");
        typefield.setText("");
        empadharfield.setText("");
        empaddressfield.setText("");
        empmobilefiled.setText("");
        empsalaryfiled.setText("");
        empaccountfield.setText("");
    
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    try {
        new EmpDailyrep().setVisible(true);
    } catch (SQLException ex) {
        Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
    }
       this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void empcomboxPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_empcomboxPopupMenuWillBecomeInvisible
        try{
    
        String name=empcombox.getSelectedItem().toString();
        String tablename=name+"empolyee";
con = DriverManager.getConnection("jdbc:mysql://localhost/user","root","root");
rs=con.getMetaData().getTables(null, null, null, null);
while(rs.next()){
    String check=rs.getString("Table_Name");
if(check!=null &&check.equalsIgnoreCase(tablename)){
String sql = "SELECT * FROM "+tablename;
pst = con.prepareStatement(sql);
rs=pst.executeQuery();
emptable.setModel(DbUtils.resultSetToTableModel(rs));
}}}
catch(Exception ex){
JOptionPane.showMessageDialog(null, ex);
 
}
    }//GEN-LAST:event_empcomboxPopupMenuWillBecomeInvisible

    private void emptableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emptableMouseClicked
         int i=emptable.getSelectedRow();
        TableModel model=emptable.getModel();
        empnamefiled.setText(model.getValueAt(i,0).toString());
        typefield.setText(model.getValueAt(i,1).toString());
        empadharfield.setText(model.getValueAt(i,2).toString());
        empaddressfield.setText(model.getValueAt(i,3).toString());
        empmobilefiled.setText(model.getValueAt(i,4).toString());
        empsalaryfiled.setText(model.getValueAt(i,5).toString());
        empaccountfield.setText(model.getValueAt(i,6).toString());
    }//GEN-LAST:event_emptableMouseClicked

    private void empnamefiledActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empnamefiledActionPerformed
        
    }//GEN-LAST:event_empnamefiledActionPerformed

    private void empnamefiledFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_empnamefiledFocusLost
vf.validateName(empnamefiled,"Contractor Name Can not be Empty");        // TODO add your handling code here:
    }//GEN-LAST:event_empnamefiledFocusLost

    private void typefieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_typefieldFocusLost
       vf.validateName(typefield,"Type Can not be Empty");
    }//GEN-LAST:event_typefieldFocusLost

    private void empadharfieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_empadharfieldFocusLost
      vf.validateAdhar(empadharfield,"Adhar must be of 12 digit");
    }//GEN-LAST:event_empadharfieldFocusLost

    private void empmobilefiledFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_empmobilefiledFocusLost
        vf.validateMoblie(empmobilefiled,"Mobile Must bi 10 digit");
    }//GEN-LAST:event_empmobilefiledFocusLost

    private void empadharfieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_empadharfieldKeyTyped
      char input=evt.getKeyChar();
       
    if((input<'0'|| input >'9') && input!= '\b'){
        JOptionPane.showMessageDialog(null,"Only Numbers");
    evt.consume();
    }
    }//GEN-LAST:event_empadharfieldKeyTyped

    private void empmobilefiledKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_empmobilefiledKeyTyped
char input=evt.getKeyChar();
       
    if((input<'0'|| input >'9') && input!= '\b'){
        JOptionPane.showMessageDialog(null,"Only Numbers");
    evt.consume();
    }        // TODO add your handling code here:
    }//GEN-LAST:event_empmobilefiledKeyTyped
int count=0;
    private void empsalaryfiledKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_empsalaryfiledKeyTyped
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
JOptionPane.showMessageDialog(null,"Two Decimals are not allow");}   // TODO add your handling code here:
    }//GEN-LAST:event_empsalaryfiledKeyTyped

    private void empaccountfieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_empaccountfieldKeyTyped
char input=evt.getKeyChar();
       
    if((input<'0'|| input >'9') && input!= '\b'){
        JOptionPane.showMessageDialog(null,"Only Numbers");
    evt.consume();
    }        // TODO add your handling code here:
    }//GEN-LAST:event_empaccountfieldKeyTyped

    private void empsalaryfiledActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empsalaryfiledActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empsalaryfiledActionPerformed
private void ShowCombo(){
    try{
con = DriverManager.getConnection("jdbc:mysql://localhost/user","root","root");
String sql = "SELECT * FROM site";
pst = con.prepareStatement(sql);
rs=pst.executeQuery(sql);
while((rs.next())){
    String name=rs.getString("SiteName");
empcombox.addItem(name);


}
    }
catch(Exception ex){}
    JOptionPane.showMessageDialog(null,"Please Add A Site First");
   
    }
 public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Employee().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
 }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField empaccountfield;
    private javax.swing.JTextField empaddressfield;
    private javax.swing.JTextField empadharfield;
    private javax.swing.JButton empbtnadd;
    private javax.swing.JButton empbtnbck;
    private javax.swing.JButton empbtndel;
    private javax.swing.JButton empbtnupdate;
    private javax.swing.JComboBox empcombox;
    private javax.swing.JTextField empmobilefiled;
    private javax.swing.JTextField empnamefiled;
    private javax.swing.JTextField empsalaryfiled;
    private javax.swing.JTable emptable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField typefield;
    // End of variables declaration//GEN-END:variables
}
