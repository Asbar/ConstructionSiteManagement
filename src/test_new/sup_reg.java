/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_new;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;
import java.util.Vector;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static org.omg.IOP.CodecPackage.InvalidTypeForEncodingHelper.id;

/**
 *
 * @author Dilan Madura
 */
public class sup_reg extends javax.swing.JInternalFrame {
   

    /**
     * Creates new form sup_reg
     */
    public sup_reg() {
        initComponents();
        Random r = new Random();
        int a=r.nextInt(50)+1500;
        jTextField8.setText(a+"");
    }
 public void tableload(){
        
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
         try {
           ResultSet rs= db.getconnection().createStatement().executeQuery("select * from ");
           
           while(rs.next()){
                 Vector v = new Vector();
         
            v.add(rs.getString("Machine_no"));
            v.add(rs.getString("Machine_name"));
            v.add(rs.getString("Date_of_addition"));
            v.add(rs.getString("Store_keeper_job_id"));
          
             dtm.addRow(v);
      
           }
         }
         catch(Exception e){
         e.printStackTrace();
         
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField2 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox();
        jTextField5 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Supplier Name");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        jLabel3.setText("Address");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        jLabel4.setText("Supplier Type");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));

        jLabel5.setText("Contect Number");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, -1));

        jLabel6.setText("Email");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, -1));

        jLabel7.setText("Fax");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, -1, -1));

        jLabel8.setText("Bank");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, -1, 20));

        jLabel9.setText("Account Number");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, -1, -1));

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 200, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 200, 60));
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 200, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Material", "Meshion" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 200, -1));
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 200, -1));

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 200, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "BOC", "NSB", "Sampath Bank", "HNB", "People Bank", "Cormeshiol Bank", "RDB Bank" }));
        jPanel2.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 200, 20));

        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField5KeyPressed(evt);
            }
        });
        jPanel2.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, 200, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item No", "Item Name", "Type", "Price"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 80, 430, 400));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Add New Supplier");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, 30));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 400, 30));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("Add Meshion / Metirial Details");
        jPanel4.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, -3, -1, 30));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 960, 30));
        jPanel2.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 200, -1));

        jLabel33.setText("Supplier ID");
        jPanel2.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        jButton3.setText("Remove");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 500, 110, -1));

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Materail/Meshion List (Select Items)");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, 20));

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Materail/Meshion List");
        jPanel6.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, 20));

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 300, 20));

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Materail/Meshion List");
        jPanel7.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, 20));

        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("Materail/Meshion List");
        jPanel8.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, 20));

        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 300, 20));

        jPanel5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 300, 20));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, 360, 20));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item No", "Item Name"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable2);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 360, 440));

        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel24.setText("Selected Items ");
        jPanel9.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, -1, 20));

        jPanel2.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 50, 430, 20));

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, 90, -1));

        jButton7.setText("Delate");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 500, 90, -1));

        jButton9.setText("Udate");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 500, 90, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1390, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
       String met= jComboBox1.getSelectedItem().toString();
       DefaultTableModel dtm = (DefaultTableModel) jTable2.getModel();
       dtm.setRowCount(0);
       if(met.equals("Material")){
           try {
            ResultSet rs= db.getconnection().createStatement().executeQuery("select * from add_machine");
            while(rs.next()){
                Vector v = new Vector();
                v.add(rs.getString("Machine_no"));
                v.add(rs.getString("Machine_name"));
                  dtm.addRow(v);
          
              }
            } catch (Exception e) {
                e.printStackTrace();
            }
       }else{
            try {
            ResultSet rs= db.getconnection().createStatement().executeQuery("select * from add_meterial");
            while(rs.next()){
                Vector v = new Vector();
                v.add(rs.getString("material_no"));
                v.add(rs.getString("Mat_Name"));
                dtm.addRow(v);
            }
            
        } catch (Exception e) {
        }
       }
        
       
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int row=jTable1.getSelectedRow();
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.removeRow(row);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        int row= dtm.getRowCount();
        
        Vector v = new Vector();
        Vector v1 = new Vector();
        Vector v3 = new Vector();
        Vector v4 = new Vector();
        for(int i=0;i<row;i++){
            v.add(jTable1.getValueAt(i,0));
            v1.add(jTable1.getValueAt(i,1));
            v3.add(jTable1.getValueAt(i,2));
             v4.add(jTable1.getValueAt(i,3));
        }
        
        String id= jTextField8.getText();
        String name=jTextField1.getText();
        String sup_type=jComboBox1.getSelectedItem().toString();
        String cont_no=jTextField2.getText();
        String email=jTextField3.getText();
        String fax=jTextField4.getText();
        String address=jTextArea1.getText();
        String bank=jComboBox2.getSelectedItem().toString();
        String account=jTextField5.getText();
        if(id.isEmpty()){JOptionPane.showMessageDialog(null,"enter id","Error Message",JOptionPane.ERROR_MESSAGE);}
        else if(name.isEmpty()){JOptionPane.showMessageDialog(null,"enter name","Error Message",JOptionPane.ERROR_MESSAGE);}
        else if(sup_type.isEmpty()){JOptionPane.showMessageDialog(null,"select type","Error Message",JOptionPane.ERROR_MESSAGE);}
        else if(cont_no.isEmpty()){JOptionPane.showMessageDialog(null,"enter number","Error Message",JOptionPane.ERROR_MESSAGE);}
        else if(email.isEmpty()){JOptionPane.showMessageDialog(null,"enter email","Error Message",JOptionPane.ERROR_MESSAGE);}
        else if(fax.isEmpty()){JOptionPane.showMessageDialog(null,"enter fax","Error Message",JOptionPane.ERROR_MESSAGE);}
        else if(address.isEmpty()){JOptionPane.showMessageDialog(null,"enter address","Error Message",JOptionPane.ERROR_MESSAGE);}
        else if(bank.isEmpty()){JOptionPane.showMessageDialog(null,"select bank","Error Message",JOptionPane.ERROR_MESSAGE);}
        else if(account.isEmpty()){JOptionPane.showMessageDialog(null,"enter account","Error Message",JOptionPane.ERROR_MESSAGE);}
        else{
        try {
           
            for(int k=0;k<row;k++){
                double d = Double.parseDouble(v4.get(k).toString());
                 db.getconnection().createStatement().executeUpdate("insert into sup_orders (item, item_no, type, sup_id,amount)"
                    + " values ('"+v1.get(k)+"','"+v.get(k)+"','"+v3.get(k)+"','"+id+"','"+d+"')");
            }
            
            db.getconnection().createStatement().executeUpdate("insert into supplier (Supply_id, Name,type,address,contact,email,bank,fax,accountno)"
                + " values ('"+id+"','"+name+"','"+sup_type+"','"+cont_no+"','"+email+"','"+fax+"','"+address+"','"+bank+"','"+account+"')");
                JOptionPane.showMessageDialog(null,"Successfully Saved","Success Message",JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            e.printStackTrace();
        }}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        String id = jTextField8.getText();
        
        if(id.equals("")|| id.equals(null)){
            JOptionPane.showMessageDialog(null, "Please enter the Supplier ID","Error in Supplier ID", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        int x=JOptionPane.showConfirmDialog(null, "Do you want to Delete this");
       
       if(x==0){
       
           try {
               Statement st= db.getconnection().createStatement();
              
               st.executeUpdate("DELETE from supplier where Supply_id='"+id+"'");
           } catch (Exception e) {
               e.printStackTrace();
           }        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed
    }
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
      String id= jTextField8.getText();
        String name=jTextField1.getText();
        String sup_type=jComboBox1.getSelectedItem().toString();
        String cont_no=jTextField2.getText();
        String email=jTextField3.getText();
        String fax=jTextField4.getText();
        String address=jTextArea1.getText();
        String bank=jComboBox2.getSelectedItem().toString();
        String account=jTextField5.getText();
        
        try {
            db.getconnection().createStatement().executeUpdate("update supplier set Name = '"+name+"',type='"+sup_type+"',address='"+address+"',contact='"+cont_no+"',email='"+email+"',bank='"+bank+"',fax='"+fax+"',accountno='"+account+"' where Supply_id='"+id+"'");
            JOptionPane.showMessageDialog(null,"Updated Successfully","Updated Successfully", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_jButton9ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        int row= jTable2.getSelectedRow();
        
        String first= jTable2.getValueAt(row, 0).toString();
        String second= jTable2.getValueAt(row, 1).toString();
       
        
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
       
        Vector v = new Vector();
        v.add(first);
        v.add(second);
        v.add(jComboBox1.getSelectedItem().toString());
        dtm.addRow(v);
        
    }//GEN-LAST:event_jTable2MouseClicked

    private void jTextField5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyPressed

        char c = evt.getKeyChar();
    if (Character.isDigit(c)) {
        
    } else {
        JOptionPane.showMessageDialog(null,"Enter only numeric digits(0-9)");
        
      
    }        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5KeyPressed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1KeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
