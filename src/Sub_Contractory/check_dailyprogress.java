/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Sub_Contractory;

import test_new.*;
import java.io.File;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.Icon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author westlifzzz
 */
public class check_dailyprogress extends javax.swing.JInternalFrame {

    /**
     * Creates new form check_dailyprogress
     */
    public check_dailyprogress() {
        initComponents();
        
        
        
        
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
        jLabel1 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        setBorder(null);
        setPreferredSize(new java.awt.Dimension(1340, 620));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Date");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 50, -1));

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 200, 20));

        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 140, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sc ID", "Task ID", "Task name", "Project ID", "Start Date", "Due Date", "Info update Date", "Description"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 1030, 120));
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 200, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Status");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 4, 150, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1340, 40));

        jButton1.setText("ADD Daily Details");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, 140, 30));

        jLabel5.setText("Search by Sc ID");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Sc ID");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 60, -1));

        jLabel7.setText("TASK NAME");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 80, -1));

        jLabel8.setText("TASK STARTED DATE");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 110, -1));

        jLabel9.setText("DUE DATE");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 80, -1));

        jLabel11.setText("TASK ID");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 80, -1));
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 110, 20));
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 130, 20));
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 110, 20));
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 110, 20));
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 130, 20));

        jLabel16.setText("PROJECT ID");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, -1, -1));
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, 140, 20));

        jLabel2.setText("INFO UPDATE DATE");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 30, -1, -1));

        jLabel10.setText("DESRIPTION");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 60, -1, -1));

        jLabel18.setText("IMAGE");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 30, 40, -1));
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 30, 130, 20));
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 60, 130, 20));

        jLabel21.setText("jLabel21");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 30, 170, 160));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 1200, 270));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1650, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
       
        String sub_id=jTextField7.getText();
        String date1=null;
        Date date=jDateChooser1.getDate();
        
        
        try{
            DateFormat format=new SimpleDateFormat("yyyy-MM-dd");
             date1= format.format(date);
            
            jDateChooser1.setDate(date);
        }catch (Exception e){
            e.printStackTrace();
        
        }
        if(sub_id.equals("") || sub_id.equals(null)){
           JOptionPane.showMessageDialog(null,"Please Enter the sub_id","Error in Sub_id",JOptionPane.ERROR_MESSAGE);
           return;
       }
           DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);
           tableloadSearch(sub_id,date1); 
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int r =jTable1.getSelectedRow();
        
        jLabel6.setText(jTable1.getValueAt(r, 0).toString());
        jLabel12.setText(jTable1.getValueAt(r,1).toString());
        jLabel13.setText(jTable1.getValueAt(r,2).toString());
        jLabel17.setText(jTable1.getValueAt(r,3).toString());
        jLabel14.setText(jTable1.getValueAt(r,4).toString());
        jLabel15.setText(jTable1.getValueAt(r,5).toString());
        jLabel19.setText(jTable1.getValueAt(r,6).toString());
        jLabel20.setText(jTable1.getValueAt(r,7).toString());
        jLabel21.setText(jTable1.getValueAt(r,8).toString());
        
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        add_dailyinfo d= new add_dailyinfo();
        d.setVisible(true);

    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables

    private Icon ResizeImage(String path) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    void tableloadSearch(String sub_id, String date){
    
    DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
    
        
    try {
        //    ResultSet rs= db.getConnection().createStatement().executeQuery("select * from sub_daily_progress INNER JOIN task_allocate ON sub_id=SC_id where sub_id='"+sub_id+"'");
           
  //      ResultSet rs= db.getConnection().createStatement().executeQuery("select * from task_allocate where sub_id Like'%"+sub_id+"%' and Start_date='"+date+"' ");
//        ResultSet rs= db.getConnection().createStatement().executeQuery("select * from sub_daily_progress INNER JOIN task_allocate ON sub_id=SC_id where sub_id='"+sub_id+"'and Date='"+date+"'");       
        ResultSet rs= db.getConnection().createStatement().executeQuery("select * from sub_daily_progress INNER JOIN task_allocate ON sub_id=SC_id where sub_id like '%"+sub_id+"%' and Date='"+date+"'");
        while(rs.next()){  
                Vector v = new Vector();
                v.add(rs.getString("sub_id"));
                v.add(rs.getString("task_id"));
                v.add(rs.getString("Allocated_task"));
                v.add(rs.getString("pro_id"));
                v.add(rs.getString("Start_date"));
                v.add(rs.getString("Due_date"));
                v.add(rs.getString("Date"));
                v.add(rs.getString("Description"));
                v.add(rs.getString("Images"));
                
            
            
            dtm.addRow(v);

              
              }
        
        }catch(Exception e){
            e.printStackTrace();
        }
}
    public void tableload(){
        
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
         try {
           ResultSet rs= db.getConnection().createStatement().executeQuery("select * from task_allocate");
           
           while(rs.next()){
                 Vector v = new Vector();
         
            v.add(rs.getString("sub_id"));
            v.add(rs.getString("task_id"));
            v.add(rs.getString("Allocated_task"));
            v.add(rs.getString("pro_id"));  
            v.add(rs.getString("Start_date"));
            v.add(rs.getString("Due_date"));
            
            
            
             dtm.addRow(v);
      
           }
    }
         catch(Exception e){
         e.printStackTrace();
         
         }
   }
    
    
    
}
