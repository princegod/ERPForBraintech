
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author piyush veerbhan
 */
public class Growel extends javax.swing.JFrame {
    Connection con = null;
PreparedStatement pst = null;
ResultSet rs = null;
showTable st=new showTable();
int count=0;
float Dressing;
float pcc;
float quantity;
float totalamount;
float total;
int id;


    public Growel() {
        initComponents();
        st.ShowdropDown(selectsitegrowel);
        st.showTableData(groweltable, selectsitegrowel, "growel");
    }
    
    
     void total(){
         
          totalamount =Float.parseFloat(Drainexcavafield.getText())*Float.parseFloat(quantitiyrate.getText());
          
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        groweltable = new javax.swing.JTable();
        SiteNamelabel = new javax.swing.JLabel();
        btnsubmit = new javax.swing.JButton();
        SiteNamelabel7 = new javax.swing.JLabel();
        namefielddrain = new javax.swing.JTextField();
        DateGrowel = new com.toedter.calendar.JDateChooser();
        btnbck = new javax.swing.JButton();
        btndel = new javax.swing.JButton();
        Drainexcavafield = new javax.swing.JTextField();
        SiteNamelabel1 = new javax.swing.JLabel();
        quantitiyrate = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        selectsitegrowel = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        groweltable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Date", "Quantity", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
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
        groweltable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                groweltableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(groweltable);

        SiteNamelabel.setText("Name");

        btnsubmit.setText("Submit");
        btnsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubmitActionPerformed(evt);
            }
        });

        SiteNamelabel7.setText("    Date");

        namefielddrain.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                namefielddrainKeyTyped(evt);
            }
        });

        btnbck.setText("Back");
        btnbck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbckActionPerformed(evt);
            }
        });

        btndel.setText("Delete");
        btndel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndelActionPerformed(evt);
            }
        });

        Drainexcavafield.setText("0");
        Drainexcavafield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                DrainexcavafieldFocusLost(evt);
            }
        });
        Drainexcavafield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DrainexcavafieldKeyTyped(evt);
            }
        });

        SiteNamelabel1.setText("Quantity");

        quantitiyrate.setText("0");
        quantitiyrate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                quantitiyrateFocusLost(evt);
            }
        });
        quantitiyrate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                quantitiyrateKeyTyped(evt);
            }
        });

        jLabel1.setText("Rate");

        jLabel2.setText("Select Site");

        selectsitegrowel.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                selectsitegrowelPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnsubmit)
                            .addComponent(btnbck))
                        .addGap(96, 96, 96)
                        .addComponent(btndel))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SiteNamelabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SiteNamelabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(DateGrowel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Drainexcavafield, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                            .addComponent(selectsitegrowel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(quantitiyrate, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(658, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addComponent(SiteNamelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(namefielddrain, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(selectsitegrowel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SiteNamelabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DateGrowel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SiteNamelabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Drainexcavafield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantitiyrate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsubmit)
                    .addComponent(btndel))
                .addGap(50, 50, 50)
                .addComponent(btnbck)
                .addGap(110, 110, 110))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(49, 49, 49)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(SiteNamelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(namefielddrain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbckActionPerformed
        new WorkDone().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnbckActionPerformed

    private void btnsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubmitActionPerformed

        try {
             if(((JTextField) DateGrowel.getDateEditor().getUiComponent()).getText().length()==0){
             JOptionPane.showMessageDialog(null, "Date Can not be empty");
             return;
                    }
                    if(namefielddrain.getText().length()==0){
                        JOptionPane.showMessageDialog(null, "Name Can not be empty");
             return;
                    }
                     total();
                     remian();

                     float New_total=total+totalamount;
       
        String name=selectsitegrowel.getSelectedItem().toString();
        
        String tablename=name+"growel";
        con = DriverManager.getConnection("jdbc:mysql://localhost/user","root","root");
        

rs=con.getMetaData().getTables(null, null, null, null);
while(rs.next()){
    String check=rs.getString("Table_Name");
if(check!=null &&check.equalsIgnoreCase(tablename)){
String sql = "INSERT INTO "+tablename
        +"(Name, Date, Quantity,Rate,Totalamount)"
+"VALUES (?,?,?,?,?)";
con = DriverManager.getConnection("jdbc:mysql://localhost/user","root","root");
pst = con.prepareStatement(sql);
pst.setString(1, namefielddrain.getText());
pst.setString(2,((JTextField) DateGrowel.getDateEditor().getUiComponent()).getText());
pst.setString(3,Drainexcavafield.getText());
pst.setString(4,quantitiyrate.getText());
pst.setFloat(5,New_total);

pst.executeUpdate();
 st.showTableData(groweltable, selectsitegrowel, "growel");
refresh();
return ;
}

} 
  System.out.println("chal bc");
String sql1="CREATE TABLE "+ tablename +
                "("+"ID INT NOT NULL AUTO_INCREMENT,Name TEXT(20), Date TEXT(25),Quantity FLOAT(30),Rate FLOAT(30),Totalamount FLOAT(30),PRIMARY KEY(ID))";
System.out.println(sql1);
con = DriverManager.getConnection("jdbc:mysql://localhost/user","root","root");
pst = con.prepareStatement(sql1);

pst.executeUpdate(sql1);
String sql = "INSERT INTO "+tablename
        +"(Name, Date, Quantity,Rate,Totalamount)"
+"VALUES (?,?,?,?,?)";
con = DriverManager.getConnection("jdbc:mysql://localhost/user","root","root");
pst = con.prepareStatement(sql);
pst.setString(1, namefielddrain.getText());
pst.setString(2,((JTextField) DateGrowel.getDateEditor().getUiComponent()).getText());
pst.setString(3,Drainexcavafield.getText());
pst.setString(4,quantitiyrate.getText());
pst.setFloat(5,New_total);

pst.executeUpdate();
 st.showTableData(groweltable, selectsitegrowel, "growel");
//refresh();


       
        
        
    } catch (SQLException ex) {
       
        Logger.getLogger(NewcontractorForm.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_btnsubmitActionPerformed

    private void btndelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndelActionPerformed
         try {
             if(id==0){
                JOptionPane.showMessageDialog(null, "Please select The Field From Table First");
                return;
            }
       
        String name=selectsitegrowel.getSelectedItem().toString();
        String tablename=name+"growel";
        con = DriverManager.getConnection("jdbc:mysql://localhost/user","root","root");
        

rs=con.getMetaData().getTables(null, null, null, null);
while(rs.next()){
    String check=rs.getString("Table_Name");
if(check!=null &&check.equalsIgnoreCase(tablename)){
String sql = "DELETE FROM "+tablename+" WHERE date=?";
            con = DriverManager.getConnection("jdbc:mysql://localhost/user","root","root");
            pst = con.prepareStatement(sql);
            pst.setString(1,((JTextField) DateGrowel.getDateEditor().getUiComponent()).getText());
            pst.executeUpdate();
            st.showTableData(groweltable, selectsitegrowel, "growel");
            JOptionPane.showMessageDialog(null, "delete successfully");
//refresh();
return ;
}

}
        } catch (SQLException ex) {
       
        JOptionPane.showMessageDialog(null,  "please enter all the details or fill it correctly");
    }
    }//GEN-LAST:event_btndelActionPerformed

    private void selectsitegrowelPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_selectsitegrowelPopupMenuWillBecomeInvisible
        st.FillTableUSingcombo(selectsitegrowel, groweltable, "growel");

    }//GEN-LAST:event_selectsitegrowelPopupMenuWillBecomeInvisible

    private void groweltableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_groweltableMouseClicked
                int i = groweltable.getSelectedRow();
        TableModel model = groweltable.getModel();
      id=Integer.parseInt(model.getValueAt(i, 0).toString());
        namefielddrain.setText(model.getValueAt(i, 0).toString());
        String date = model.getValueAt(i, 1).toString();

        ((JTextField) DateGrowel.getDateEditor().getUiComponent()).setText(date);

    }//GEN-LAST:event_groweltableMouseClicked

    private void namefielddrainKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_namefielddrainKeyTyped
        
    }//GEN-LAST:event_namefielddrainKeyTyped

    private void DrainexcavafieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DrainexcavafieldKeyTyped
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
    }//GEN-LAST:event_DrainexcavafieldKeyTyped

    private void quantitiyrateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantitiyrateKeyTyped
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
    }//GEN-LAST:event_quantitiyrateKeyTyped

    private void DrainexcavafieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DrainexcavafieldFocusLost
count=0;        // TODO add your handling code here:
    }//GEN-LAST:event_DrainexcavafieldFocusLost

    private void quantitiyrateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_quantitiyrateFocusLost
count=0;        // TODO add your handling code here:
    }//GEN-LAST:event_quantitiyrateFocusLost

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
            java.util.logging.Logger.getLogger(Growel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Growel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Growel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Growel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Growel().setVisible(true);
            }
        });
    }
    public void refresh(){
    
    
    quantitiyrate.setText("0");
    namefielddrain.setText("0");
    Drainexcavafield.setText("0");
   // DateGrowel.setDateFormatString("");
    }

     private void remian(){
try{
   if(selectsitegrowel.getSelectedItem()!=null){
        String name=selectsitegrowel.getSelectedItem().toString();
        String tablename=name+"growel";
con = DriverManager.getConnection("jdbc:mysql://localhost/user","root","root");
rs=con.getMetaData().getTables(null, null, null, null);
while(rs.next()){
    String check=rs.getString("Table_Name");
if(check!=null &&check.equalsIgnoreCase(tablename)){
String sql = "SELECT Totalamount FROM "+tablename+" ORDER BY ID DESC LIMIT 1";
    System.out.println(sql);
pst = con.prepareStatement(sql);
rs=pst.executeQuery();
rs.next();
total=rs.getInt(1);
// System.out.println(total);
//System.out.println(remaining);
}}}
   else{
   return;
   }

}
catch(Exception ex){
    //System.out.println("mai chal tha");
    total=0;
//JOptionPane.showMessageDialog(null, ex);
 
}


}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DateGrowel;
    private javax.swing.JTextField Drainexcavafield;
    private javax.swing.JLabel SiteNamelabel;
    private javax.swing.JLabel SiteNamelabel1;
    private javax.swing.JLabel SiteNamelabel7;
    private javax.swing.JButton btnbck;
    private javax.swing.JButton btndel;
    private javax.swing.JButton btnsubmit;
    private javax.swing.JTable groweltable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField namefielddrain;
    private javax.swing.JTextField quantitiyrate;
    private javax.swing.JComboBox<String> selectsitegrowel;
    // End of variables declaration//GEN-END:variables
}
