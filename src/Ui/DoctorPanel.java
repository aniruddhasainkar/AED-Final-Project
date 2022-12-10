/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Ui;

import java.awt.CardLayout;

/**
 *
 * @author keerthanaakannan
 */
public class DoctorPanel extends javax.swing.JPanel {

    /**
     * Creates new form CheckupAdminPanel
     */
    public DoctorPanel() {
        initComponents();
        PatID.setVisible(false);
        patientidinput.setVisible(false);
        Name.setVisible(false);
        NameLabel.setVisible(false);
        Phone.setVisible(false);
        PhoneLabel.setVisible(false);
        AddDoctor.setVisible(false);
        UpdateDoctor.setVisible(false);
        AgeLabel.setVisible(false);
        Age.setVisible(false);
        emailLabel.setVisible(false);
        email.setVisible(false);
        deleteDoctor.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CheckupLabel = new javax.swing.JLabel();
        paneltable = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        UserTable = new javax.swing.JTable();
        Phone = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        PatID = new javax.swing.JLabel();
        patientidinput = new javax.swing.JLabel();
        PhoneLabel = new javax.swing.JLabel();
        Age = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        AgeLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        NameLabel = new javax.swing.JLabel();
        AddDoctor = new javax.swing.JButton();
        UpdateDoctor = new javax.swing.JButton();
        deleteDoctor = new javax.swing.JButton();
        container = new javax.swing.JPanel();

        CheckupLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        CheckupLabel.setText("CHECKUP");

        UserTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Patient ID", "Name", "Age", "Email ", "Phone No"
            }
        ));
        UserTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserTablejTable1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(UserTable);

        Phone.setForeground(new java.awt.Color(2, 5, 105));
        Phone.setText("Phone:");

        Name.setForeground(new java.awt.Color(2, 5, 105));
        Name.setText("Name:");

        PatID.setText("Patient ID");

        PhoneLabel.setText("jLabel5");

        Age.setBackground(new java.awt.Color(2, 5, 105));
        Age.setText("Age:");

        email.setForeground(new java.awt.Color(2, 5, 105));
        email.setText("Email:");

        AgeLabel.setText("jLabel6");

        emailLabel.setText("jLabel7");

        NameLabel.setText("jLabel8");

        AddDoctor.setBackground(new java.awt.Color(2, 33, 105));
        AddDoctor.setForeground(new java.awt.Color(255, 255, 255));
        AddDoctor.setText("Add");

        UpdateDoctor.setBackground(new java.awt.Color(2, 33, 105));
        UpdateDoctor.setForeground(new java.awt.Color(255, 255, 255));
        UpdateDoctor.setText("Update");

        deleteDoctor.setBackground(new java.awt.Color(2, 33, 105));
        deleteDoctor.setForeground(new java.awt.Color(255, 255, 255));
        deleteDoctor.setText("Delete");

        javax.swing.GroupLayout paneltableLayout = new javax.swing.GroupLayout(paneltable);
        paneltable.setLayout(paneltableLayout);
        paneltableLayout.setHorizontalGroup(
            paneltableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneltableLayout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(paneltableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(paneltableLayout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(paneltableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Name)
                            .addComponent(PatID)
                            .addGroup(paneltableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(paneltableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(email)
                                    .addComponent(Age))
                                .addComponent(Phone)))
                        .addGap(174, 174, 174)
                        .addGroup(paneltableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(paneltableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(emailLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(AgeLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(paneltableLayout.createSequentialGroup()
                                    .addGroup(paneltableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(PhoneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(4, 4, 4))
                                .addComponent(deleteDoctor, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGroup(paneltableLayout.createSequentialGroup()
                                .addComponent(patientidinput, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)))))
                .addContainerGap(110, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneltableLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AddDoctor)
                .addGap(72, 72, 72)
                .addComponent(UpdateDoctor)
                .addGap(336, 336, 336))
        );
        paneltableLayout.setVerticalGroup(
            paneltableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneltableLayout.createSequentialGroup()
                .addGroup(paneltableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneltableLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(PatID))
                    .addGroup(paneltableLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(patientidinput, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(paneltableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneltableLayout.createSequentialGroup()
                        .addComponent(Name)
                        .addGap(18, 18, 18)
                        .addGroup(paneltableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PhoneLabel)
                            .addComponent(Phone))
                        .addGap(33, 33, 33)
                        .addComponent(Age)
                        .addGap(18, 18, 18)
                        .addComponent(email))
                    .addGroup(paneltableLayout.createSequentialGroup()
                        .addComponent(NameLabel)
                        .addGap(60, 60, 60)
                        .addComponent(AgeLabel)
                        .addGap(18, 18, 18)
                        .addComponent(emailLabel)))
                .addGap(58, 58, 58)
                .addGroup(paneltableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteDoctor)
                    .addComponent(AddDoctor)
                    .addComponent(UpdateDoctor))
                .addGap(49, 49, 49))
        );

        container.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(471, 471, 471)
                .addComponent(CheckupLabel)
                .addContainerGap(471, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 159, Short.MAX_VALUE)
                    .addComponent(paneltable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 160, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(CheckupLabel)
                .addContainerGap(662, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 72, Short.MAX_VALUE)
                    .addComponent(paneltable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 73, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void UserTablejTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserTablejTable1MouseClicked
        // TODO add your handling code here:
        // 543209r453e2wq1  ac]4UserTable.setVisible(false);
        CheckupLabel.setVisible(false);
         addVitals panel = new addVitals();
        container.add("ManageEnterpriseJPanel", panel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
        paneltable.setVisible(false);   
        
    }//GEN-LAST:event_UserTablejTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddDoctor;
    private javax.swing.JLabel Age;
    private javax.swing.JLabel AgeLabel;
    private javax.swing.JLabel CheckupLabel;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JLabel PatID;
    private javax.swing.JLabel Phone;
    private javax.swing.JLabel PhoneLabel;
    private javax.swing.JButton UpdateDoctor;
    private javax.swing.JTable UserTable;
    private javax.swing.JPanel container;
    private javax.swing.JButton deleteDoctor;
    private javax.swing.JLabel email;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel paneltable;
    private javax.swing.JLabel patientidinput;
    // End of variables declaration//GEN-END:variables
}