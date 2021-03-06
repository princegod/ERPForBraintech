
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

/**
 *
 * @author piyush veerbhan
 */
public class PccAllSite extends javax.swing.JFrame {
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



    /**
     * Creates new form PccAllSite
     */
    public PccAllSite() {
        initComponents();
       st.ShowdropDown(allpccsitecombo);
        st.showTableData(allsitepcctable, allpccsitecombo, "pcc");
    }
public void refresh(){
    
    
    allsitepccfiled.setText("0");
    alsitepccquantity.setText("0");
    allpccdressfiled.setText("0");
     pccrate.setText("0");
    pccrate1.setText("0");
    allpccdressfiled.setText("0");
   // allpccdate.setDateFormatString("0");
    dressingrate.setText("0");
    }
    void total(){
         Dressing =Float.parseFloat(allpccdressfiled.getText())*Float.parseFloat(dressingrate.getText());
         pcc =Float.parseFloat(allsitepccfiled.getText())*Float.parseFloat(pccrate.getText());
          quantity =Float.parseFloat(allpccdressfiled.getText())*Float.parseFloat(pccrate1.getText());
          totalamount=Dressing+pcc+quantity;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DAte = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        allsitepccfiled = new javax.swing.JTextField();
        allpccdate = new com.toedter.calendar.JDateChooser();
        allsiteadd = new javax.swing.JButton();
        btndel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        allsitepcctable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnbck = new javax.swing.JButton();
        allpccdressfiled = new javax.swing.JTextField();
        alsitepccquantity = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        dressingrate = new javax.swing.JTextField();
        pccrate = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        selectsitelabel = new javax.swing.JLabel();
        allpccsitecombo = new javax.swing.JComboBox<>();
        pccrate1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        DAte.setText("Quantity");

        jLabel4.setText("Pcc");

        allsitepccfiled.setText("0");
        allsitepccfiled.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                allsitepccfiledFocusLost(evt);
            }
        });
        allsitepccfiled.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allsitepccfiledActionPerformed(evt);
            }
        });
        allsitepccfiled.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                allsitepccfiledKeyTyped(evt);
            }
        });

        allsiteadd.setText("Add");
        allsiteadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allsiteaddActionPerformed(evt);
            }
        });

        btndel.setText("Delete");
        btndel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndelActionPerformed(evt);
            }
        });

        jLabel1.setText("Date");

        allsitepcctable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Date", "Dressing", "Pcc", "Quantity", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        allsitepcctable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                allsitepcctableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(allsitepcctable);

        jLabel2.setText("Dressing");

        btnbck.setText("Back");
        btnbck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbckActionPerformed(evt);
            }
        });

        allpccdressfiled.setText("0");
        allpccdressfiled.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                allpccdressfiledFocusLost(evt);
            }
        });
        allpccdressfiled.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allpccdressfiledActionPerformed(evt);
            }
        });
        allpccdressfiled.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                allpccdressfiledKeyTyped(evt);
            }
        });

        alsitepccquantity.setText("0");
        alsitepccquantity.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                alsitepccquantityFocusLost(evt);
            }
        });
        alsitepccquantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                alsitepccquantityKeyTyped(evt);
            }
        });

        jLabel3.setText("Rate");

        dressingrate.setText("0");
        dressingrate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                dressingrateFocusLost(evt);
            }
        });
        dressingrate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dressingrateKeyTyped(evt);
            }
        });

        pccrate.setText("0");
        pccrate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                pccrateFocusLost(evt);
            }
        });
        pccrate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pccrateActionPerformed(evt);
            }
        });
        pccrate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pccrateKeyTyped(evt);
            }
        });

        jLabel5.setText("PCC All Site");

        selectsitelabel.setText("Select Site");

        allpccsitecombo.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                allpccsitecomboPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        allpccsitecombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allpccsitecomboActionPerformed(evt);
            }
        });

        pccrate1.setText("0");
        pccrate1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                pccrate1FocusLost(evt);
            }
        });
        pccrate1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pccrate1KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(allsiteadd, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(137, 137, 137)
                        .addComponent(btndel))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnbck))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DAte, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)
                                .addComponent(alsitepccquantity))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(allsitepccfiled)
                                    .addComponent(allpccdressfiled, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(selectsitelabel)
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(allpccsitecombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(allpccdate, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE))))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pccrate1, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                            .addComponent(dressingrate, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                            .addComponent(pccrate, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectsitelabel)
                    .addComponent(allpccsitecombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(allpccdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(allpccdressfiled, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dressingrate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(allsitepccfiled, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pccrate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DAte)
                    .addComponent(alsitepccquantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pccrate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(allsiteadd)
                    .addComponent(btndel))
                .addGap(77, 77, 77)
                .addComponent(btnbck)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 122, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void allsitepccfiledActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allsitepccfiledActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_allsitepccfiledActionPerformed

    private void btnbckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbckActionPerformed
        new WorkDone().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnbckActionPerformed

    private void allpccdressfiledActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allpccdressfiledActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_allpccdressfiledActionPerformed

    private void allpccsitecomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allpccsitecomboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_allpccsitecomboActionPerformed

    private void allsiteaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allsiteaddActionPerformed

          try {
              
              
              if(((JTextField) allpccdate.getDateEditor().getUiComponent()).getText().length()==0){
             JOptionPane.showMessageDialog(null, "Date Can not be empty");
             return;
                    }
                   total();
                     remian();

                     float New_total=total+totalamount;
        String name=allpccsitecombo.getSelectedItem().toString();
        
        String tablename=name+"pcc";
        con = DriverManager.getConnection("jdbc:mysql://localhost/user","root","root");
        

rs=con.getMetaData().getTables(null, null, null, null);
while(rs.next()){
    String check=rs.getString("Table_Name");
if(check!=null &&check.equalsIgnoreCase(tablename)){
String sql = "INSERT INTO "+tablename
        +"(Date, Dressing, Pcc, Quantity, Totalamount)"
+"VALUES (?,?,?,?,?)";
con = DriverManager.getConnection("jdbc:mysql://localhost/user","root","root");
pst = con.prepareStatement(sql);
pst.setString(1,((JTextField) allpccdate.getDateEditor().getUiComponent()).getText());
 pst.setFloat(2,Dressing);
                    
                    pst.setFloat(3,pcc);
                    pst.setFloat(4,quantity);
                    pst.setFloat(5,New_total);
pst.executeUpdate();
st.showTableData(allsitepcctable, allpccsitecombo, "pcc");
refresh();
return ;
}

} 
  System.out.println("chal bc");
String sql1="CREATE TABLE "+ tablename +
                "("+"ID INT NOT NULL AUTO_INCREMENT,Date TEXT(20),Dressing FLOAT(25),Pcc FLOAT(10),Quantity FLOAT(15),Totalamount FLOAT(30),PRIMARY KEY(ID))";
con = DriverManager.getConnection("jdbc:mysql://localhost/user","root","root");
pst = con.prepareStatement(sql1);
pst.executeUpdate(sql1);
//System.out.println(sql1);

//System.out.println("chal bc");
String sql = "INSERT INTO "+tablename
        +"(Date, Dressing, Pcc, Quantity, Totalamount)"
+"VALUES (?,?,?,?,?)";
con = DriverManager.getConnection("jdbc:mysql://localhost/user","root","root");
pst = con.prepareStatement(sql);
pst.setString(1,((JTextField) allpccdate.getDateEditor().getUiComponent()).getText());
 pst.setFloat(2,Dressing);
                    
                    pst.setFloat(3,pcc);
                    pst.setFloat(4,quantity);
                    pst.setFloat(5,New_total);
pst.executeUpdate();
st.showTableData(allsitepcctable, allpccsitecombo, "pcc");
refresh();


       
        
        
    } catch (SQLException ex) {
       
        Logger.getLogger(NewcontractorForm.class.getName()).log(Level.SEVERE, null, ex);
    }
              
        
    }//GEN-LAST:event_allsiteaddActionPerformed

    private void btndelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndelActionPerformed
         try {
       if(id==0){
                JOptionPane.showMessageDialog(null, "Please select The Field From Table First");
                return;
            }
        String name=allpccsitecombo.getSelectedItem().toString();
        String tablename=name+"pcc";
        con = DriverManager.getConnection("jdbc:mysql://localhost/user","root","root");
        

rs=con.getMetaData().getTables(null, null, null, null);
while(rs.next()){
    String check=rs.getString("Table_Name");
if(check!=null &&check.equalsIgnoreCase(tablename)){
String sql = "DELETE FROM "+tablename+" WHERE date=?";
            con = DriverManager.getConnection("jdbc:mysql://localhost/user","root","root");
            pst = con.prepareStatement(sql);
            pst.setString(1,((JTextField) allpccdate.getDateEditor().getUiComponent()).getText());
            pst.executeUpdate();
            st.showTableData(allsitepcctable, allpccsitecombo, "pcc");
            JOptionPane.showMessageDialog(null, "delete successfully");
refresh();
return ;
}

}
        } catch (SQLException ex) {
       
        JOptionPane.showMessageDialog(null,  "please enter all the details or fill it correctly");
    }
    }//GEN-LAST:event_btndelActionPerformed

    private void allsitepcctableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_allsitepcctableMouseClicked
       int i = allsitepcctable.getSelectedRow();
        TableModel model = allsitepcctable.getModel();
     id=Integer.parseInt(model.getValueAt(i, 0).toString());
        String date = model.getValueAt(i, 1).toString();

        ((JTextField) allpccdate.getDateEditor().getUiComponent()).setText(date);

    }//GEN-LAST:event_allsitepcctableMouseClicked

    private void allpccsitecomboPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_allpccsitecomboPopupMenuWillBecomeInvisible
          st.FillTableUSingcombo(allpccsitecombo, allsitepcctable, "pcc");
    }//GEN-LAST:event_allpccsitecomboPopupMenuWillBecomeInvisible

    private void pccrateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pccrateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pccrateActionPerformed

    private void allpccdressfiledKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_allpccdressfiledKeyTyped
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
}       // TODO add your handling code here:
    }//GEN-LAST:event_allpccdressfiledKeyTyped

    private void dressingrateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dressingrateKeyTyped
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
}       // TODO add your handling code here:
    }//GEN-LAST:event_dressingrateKeyTyped

    private void allsitepccfiledKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_allsitepccfiledKeyTyped
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
}       // TODO add your handling code here:
    }//GEN-LAST:event_allsitepccfiledKeyTyped

    private void pccrateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pccrateKeyTyped
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
}        // TODO add your handling code here:
    }//GEN-LAST:event_pccrateKeyTyped

    private void alsitepccquantityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_alsitepccquantityKeyTyped
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
}       // TODO add your handling code here:
    }//GEN-LAST:event_alsitepccquantityKeyTyped

    private void pccrate1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pccrate1KeyTyped
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
}       // TODO add your handling code here:
    }//GEN-LAST:event_pccrate1KeyTyped

    private void allpccdressfiledFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_allpccdressfiledFocusLost
count=0;        // TODO add your handling code here:
    }//GEN-LAST:event_allpccdressfiledFocusLost

    private void dressingrateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dressingrateFocusLost
count=0;        // TODO add your handling code here:
    }//GEN-LAST:event_dressingrateFocusLost

    private void allsitepccfiledFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_allsitepccfiledFocusLost
count=0;         // TODO add your handling code here:
    }//GEN-LAST:event_allsitepccfiledFocusLost

    private void pccrateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pccrateFocusLost
count=0;         // TODO add your handling code here:
    }//GEN-LAST:event_pccrateFocusLost

    private void alsitepccquantityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_alsitepccquantityFocusLost
count=0;         // TODO add your handling code here:
    }//GEN-LAST:event_alsitepccquantityFocusLost

    private void pccrate1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pccrate1FocusLost
count=0;         // TODO add your handling code here:
    }//GEN-LAST:event_pccrate1FocusLost

    
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
            java.util.logging.Logger.getLogger(PccAllSite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PccAllSite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PccAllSite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PccAllSite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PccAllSite().setVisible(true);
            }
        });
    }
    private void remian(){
try{
   if(allpccsitecombo.getSelectedItem()!=null){
        String name=allpccsitecombo.getSelectedItem().toString();
        String tablename=name+"pcc";
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
total=rs.getFloat(1);
 System.out.println(total);
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
    private javax.swing.JLabel DAte;
    private com.toedter.calendar.JDateChooser allpccdate;
    private javax.swing.JTextField allpccdressfiled;
    private javax.swing.JComboBox<String> allpccsitecombo;
    private javax.swing.JButton allsiteadd;
    private javax.swing.JTextField allsitepccfiled;
    private javax.swing.JTable allsitepcctable;
    private javax.swing.JTextField alsitepccquantity;
    private javax.swing.JButton btnbck;
    private javax.swing.JButton btndel;
    private javax.swing.JTextField dressingrate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField pccrate;
    private javax.swing.JTextField pccrate1;
    private javax.swing.JLabel selectsitelabel;
    // End of variables declaration//GEN-END:variables
}
