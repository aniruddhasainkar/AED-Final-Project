/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Ui.UserandPoliceUI;

import Ui.IndividualProfileUI.ViewIndividualProfileJPanel;
import java.awt.CardLayout;
import javax.swing.JRootPane;

/**
 *
 * @author aniruddhasainkar
 */
public class ViewUserJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewUserJPanel
     */
    public ViewUserJPanel() {
        initComponents();
       //CardLayout layout = (CardLayout) panel.getLayout();
 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paneltable = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        UserTable = new javax.swing.JTable();
        jLabel31 = new javax.swing.JLabel();
        txtEmailuser2 = new javax.swing.JTextField();
        txtPhoneuser2 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txtNameuser2 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txtAgeuser2 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        caseID2 = new javax.swing.JLabel();
        caseIDinput2 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        container = new javax.swing.JPanel();

        UserTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Case ID", "Name", "Age", "Email ", "Phone No", "Case Type", "Status"
            }
        ));
        UserTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(UserTable);

        jLabel31.setForeground(new java.awt.Color(2, 5, 105));
        jLabel31.setText("Phone:");

        txtEmailuser2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailuserActionPerformed(evt);
            }
        });

        txtPhoneuser2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneuserActionPerformed(evt);
            }
        });

        jLabel30.setForeground(new java.awt.Color(2, 5, 105));
        jLabel30.setText("Name:");

        txtNameuser2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameuserActionPerformed(evt);
            }
        });

        jLabel29.setBackground(new java.awt.Color(2, 5, 105));
        jLabel29.setText("Age:");

        jLabel28.setForeground(new java.awt.Color(2, 5, 105));
        jLabel28.setText("Email:");

        txtAgeuser2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeuserActionPerformed(evt);
            }
        });

        jLabel27.setForeground(new java.awt.Color(2, 5, 105));
        jLabel27.setText("Type of Case:");

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Criminal", "Civil", "Cyber", "Corporate" }));

        caseID2.setText("Case ID:");

        btnBack.setText("Back");

        javax.swing.GroupLayout paneltableLayout = new javax.swing.GroupLayout(paneltable);
        paneltable.setLayout(paneltableLayout);
        paneltableLayout.setHorizontalGroup(
            paneltableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneltableLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(paneltableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(paneltableLayout.createSequentialGroup()
                        .addGroup(paneltableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel31)
                            .addComponent(jLabel28)
                            .addComponent(jLabel29)
                            .addComponent(jLabel30)
                            .addComponent(caseID2))
                        .addGap(23, 23, 23)
                        .addGroup(paneltableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(paneltableLayout.createSequentialGroup()
                                .addComponent(caseIDinput2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(125, 125, 125)
                                .addComponent(jLabel27)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtNameuser2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAgeuser2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmailuser2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(paneltableLayout.createSequentialGroup()
                                .addComponent(txtPhoneuser2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBack)))))
                .addContainerGap(183, Short.MAX_VALUE))
        );
        paneltableLayout.setVerticalGroup(
            paneltableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneltableLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(paneltableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(caseID2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(caseIDinput2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneltableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel27)
                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addGroup(paneltableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNameuser2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(paneltableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(txtAgeuser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(paneltableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(txtEmailuser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(paneltableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(txtPhoneuser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack))
                .addGap(123, 123, 123))
        );

        container.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paneltable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paneltable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtAgeuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeuserActionPerformed

    private void txtNameuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameuserActionPerformed

    private void txtPhoneuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneuserActionPerformed

    private void txtEmailuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailuserActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        // 543209r453e2wq1  ac]4UserTable.setVisible(false);
         container.setVisible(true);
          paneltable.setVisible(false);
         ViewIndividualProfileJPanel panel = new ViewIndividualProfileJPanel();
        container.add("ManageEnterpriseJPanel", panel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
        //paneltable.setVisible(false);     

    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable UserTable;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel caseID2;
    private javax.swing.JLabel caseIDinput2;
    private javax.swing.JPanel container;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel paneltable;
    private javax.swing.JTextField txtAgeuser2;
    private javax.swing.JTextField txtEmailuser2;
    private javax.swing.JTextField txtNameuser2;
    private javax.swing.JTextField txtPhoneuser2;
    // End of variables declaration//GEN-END:variables
}
