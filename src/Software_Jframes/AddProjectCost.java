
package Software_Jframes;

import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class AddProjectCost extends javax.swing.JFrame {

    /**
     * Creates new form AddProjectCost
     */
    public AddProjectCost() {
        initComponents();
       
        
       load load = new load();
       
       Access a = new Access();
       a.setdate(jLabel5);

        countPrice();
      
        load_data_table();
        
        
       loadpid();
       load.load_project_ids(jComboBox1);
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
        jComboBox1 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Project ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 200, -1));

        jLabel2.setText("Levels");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Select--" }));
        jComboBox2.setToolTipText("");
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 200, -1));

        jLabel3.setText("Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 70, -1));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 200, -1));

        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 140, 30));

        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 140, 30));

        jButton3.setText("Add");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 140, 30));

        jLabel4.setText("Date");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 140, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Project ID", "Levels", "Date", "Cost"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 740, 210));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 480, 200, -1));

        jLabel6.setText("Cost");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 70, -1));
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 200, -1));

        jPanel1.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 60, 140, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(856, 576));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        validation vl = new validation();
        String lvls = jComboBox1.getSelectedItem().toString();
        String pid = jComboBox2.getSelectedItem().toString();
        String cost = jTextField1.getText();
        String name = jTextField3.getText();
        String date = jLabel5.getText();

        if(pid.equals("--Select--")){
            this.dispose();
            JOptionPane.showMessageDialog(null, "Please Select the project ID", "Error Message", JOptionPane.ERROR_MESSAGE);
            this.setVisible(true);
            return;
        }
        
        vl.isEmpty_combo(jComboBox1, pid);
        
        
        if(lvls.equals("") || lvls.equals(null)){
                  this.dispose();
            JOptionPane.showMessageDialog(null, "Levels are not setted", "Error Message", JOptionPane.ERROR_MESSAGE);
            this.setVisible(true);
            return;
      
        }
        if (name.equals("") || name.equals(null)) {
            this.dispose();

            JOptionPane.showMessageDialog(null, "Please enter the name field", "Error Message", JOptionPane.ERROR_MESSAGE);
            this.setVisible(true);
            return;
        } else if (cost.equals("") || cost.equals(null)) {
            this.dispose();
            JOptionPane.showMessageDialog(null, "Please enter the cost field", "Error Message", JOptionPane.ERROR_MESSAGE);
            this.setVisible(true);
            return;

        } else if (!cost.matches("[0-9]+")) {
            this.dispose();
            JOptionPane.showMessageDialog(null, "Please enter the numbers", "Error", JOptionPane.ERROR_MESSAGE);
            this.setVisible(true);
            jTextField1.setText("");
            return;
        }

        double cost1 = Double.parseDouble(cost);

        try {
            db.statement().executeUpdate("insert into project_level_payment(level, cost, projectid, name,date) values ('" + lvls + "'," + cost1 + ",'" + pid + "','" + name + "','" + date + "')");
            this.dispose();
            JOptionPane.showMessageDialog(null, "Successfully Saved", "Succcess Message", JOptionPane.INFORMATION_MESSAGE);
            jTextField1.setText("");
            jTextField3.setText("");
            this.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        int no=0;
        try {
            String pid= jComboBox2.getSelectedItem().toString();
            ResultSet rs= db.statement().executeQuery("select no_levels from con_sites where id ='"+pid+"'");
            while(rs.next()){
                no = rs.getInt("no_levels");
            }
            for(int j=1;j<=no;j++){
                jComboBox1.addItem("Level "+j);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        countPrice();
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String pid=null;
        try {
             pid = jComboBox2.getSelectedItem().toString();
              if(pid.equals("--Select--")){
            this.dispose();
            JOptionPane.showMessageDialog(null, "Please Select the project ID", "Error Message", JOptionPane.ERROR_MESSAGE);
            this.setVisible(true);
            return;
        }
        } catch (Exception e) {
        }
        
        String lvls = jComboBox1.getSelectedItem().toString();
       
        String cost = jTextField1.getText();
        String name = jTextField3.getText();
        String date = jLabel5.getText();

        
        
        if (name.equals("") || name.equals(null)) {
            this.dispose();

            JOptionPane.showMessageDialog(null, "Please enter the name field", "Error Message", JOptionPane.ERROR_MESSAGE);
            this.setVisible(true);
            return;
        } else if (cost.equals("") || cost.equals(null)) {
            this.dispose();
            JOptionPane.showMessageDialog(null, "Please enter the cost field", "Error Message", JOptionPane.ERROR_MESSAGE);
            this.setVisible(true);
            return;

        } else if (!cost.matches("[0-9]+")) {
            this.dispose();
            JOptionPane.showMessageDialog(null, "Please enter the numbers", "Error", JOptionPane.ERROR_MESSAGE);
            this.setVisible(true);
            jTextField1.setText("");
            return;
        }

        double cost1 = Double.parseDouble(cost);

        try {
            db.statement().executeUpdate("update project_level_payment set name='" + name + "',cost=" + cost + " where projectid='" + pid + "' and level='" + lvls + "' ");
            this.dispose();
            JOptionPane.showMessageDialog(null, "Successfully Updated", "Succcess Message", JOptionPane.INFORMATION_MESSAGE);
            this.setVisible(true);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        String id = jComboBox3.getSelectedItem().toString();
        String ids[]= id.split("-");
        
        validation vl = new validation();
        vl.isEmpty_combo(jComboBox3,"Project cost id");
        
        
        
        try {
            db.statement().executeUpdate("delete from project_level_payment where idproject_level_payment='"+ids[0]+"'");
            this.dispose();
            JOptionPane.showMessageDialog(null, "Succcessfully Deleted", "Error Message", JOptionPane.ERROR_MESSAGE);
            this.setVisible(true);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        load_combos lb = new load_combos();
        lb.project_cost_delete(jComboBox2, jComboBox1, jComboBox3);
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(AddProjectCost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddProjectCost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddProjectCost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddProjectCost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddProjectCost().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables

    

    public void countPrice() {
        String pid = jComboBox2.getSelectedItem().toString();

        try {
            ResultSet rs = db.statement().executeQuery("select sum(cost) from project_level_payment where projectid='" + pid + "'");
            while (rs.next()) {

                jTextField2.setText(rs.getDouble("sum(cost)") + "");
            }
        } catch (Exception e) {
          
        }
    }

    public void load_data_table() {
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        try {
            ResultSet rs = db.statement().executeQuery("select * from project_level_payment");
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("projectid"));
                v.add(rs.getString("level"));
                v.add(rs.getString("date"));
                v.add(rs.getString("cost"));

                dtm.addRow(v);
            }
        } catch (Exception e) {
          
        }
    }

    private void loadpid() {
        try {

            ResultSet rs = db.statement().executeQuery("select id from con_sites");

            while (rs.next()) {
                jComboBox2.addItem(rs.getString("id"));
            }

        } catch (Exception e) {
          
        }
    }
}
