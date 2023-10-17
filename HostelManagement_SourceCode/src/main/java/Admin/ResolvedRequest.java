/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Admin;

import static Admin.RejectedApplication.model;
import static Admin.RejectedApplication.studentHostelApplicationTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class ResolvedRequest extends javax.swing.JFrame {

    /**
     * Creates new form ResolvedRequest
     */
    public static DefaultTableModel model;
    public ResolvedRequest() {
        initComponents();
        model = (DefaultTableModel) maintenanceRequestTable.getModel();
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
        maintenanceRequestTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        backButtonTF = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        maintenanceRequestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request ID", "Request Date", "Room No", "Request", "Comment"
            }
        ));
        maintenanceRequestTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                maintenanceRequestTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(maintenanceRequestTable);

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Resolved Request");

        backButtonTF.setBackground(new java.awt.Color(0, 102, 102));
        backButtonTF.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        backButtonTF.setForeground(new java.awt.Color(255, 255, 255));
        backButtonTF.setText("BACK");
        backButtonTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonTFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backButtonTF)
                        .addGap(136, 136, 136)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(backButtonTF, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void maintenanceRequestTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maintenanceRequestTableMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_maintenanceRequestTableMouseClicked

    private void backButtonTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonTFActionPerformed
        // TODO add your handling code here:
        MaintenanceRequestMenu maintenanceRequestMenu = new MaintenanceRequestMenu();
        maintenanceRequestMenu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backButtonTFActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButtonTF;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable maintenanceRequestTable;
    // End of variables declaration//GEN-END:variables
}
