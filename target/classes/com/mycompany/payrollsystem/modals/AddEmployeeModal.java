/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.payrollsystem.modals;

import com.mycompany.payrollsystem.cell.PanelActionButtons;
import com.mycompany.payrollsystem.cell.TableActionCellEditor;
import com.mycompany.payrollsystem.cell.TableActionCellRender;
import java.awt.Color;
import java.awt.Font;
import javax.swing.table.JTableHeader;
import com.mycompany.payrollsystem.event.TableEmployeeActionEvent;

/**
 *
 * @author Paul
 */
public class AddEmployeeModal extends javax.swing.JFrame {

    private final Font headerFont;
    private final JTableHeader tableHeader;
    
    /**
     * Creates new form AddEmployee
     */
    public AddEmployeeModal() {
        this.headerFont = new Font("Arial", Font.BOLD, 20);
        initComponents();
        setLocationRelativeTo(null);
        setBackground(new Color(0, 0, 0, 0));
       
        tableHeader = add_employee_table.getTableHeader();
        tableHeader.setFont(headerFont);
        
        TableActionCellRender tableActionCellRenderTest = new TableActionCellRender(new PanelActionButtons());
        add_employee_table
                .getColumnModel()
                .getColumn(2)
                .setCellRenderer(tableActionCellRenderTest);
        
        TableEmployeeActionEvent event = new TableEmployeeActionEvent() {
            @Override
            public void onAddIncome(int row) {
                System.out.println("Add Income Row: " + row);
                OtherIncomePayrollModal otherIncomePayrollModal = new OtherIncomePayrollModal();
                otherIncomePayrollModal.setVisible(true);
                AddEmployeeModal.this.dispose();
            }

            @Override
            public void onAddDeduction(int row) {
                System.out.println("Add Deduction Row: " + row);
                OtherDeductionModal otherDeductionModal = new OtherDeductionModal();
                otherDeductionModal.setVisible(true);
                AddEmployeeModal.this.dispose();
            }

            @Override
            public void onRemoveEmployee(int row) {
                System.out.println("Remove Employee Row: " + row);
            }
        };
        
        add_employee_table
                .getColumnModel()
                .getColumn(2)
                .setCellEditor(new TableActionCellEditor<>(PanelActionButtons.class, event));
        
                
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this
     * code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundedCornersPanel1 = new com.mycompany.payrollsystem.swing.RoundedCornersPanel();
        modal_title2 = new javax.swing.JLabel();
        close_icon_modal2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        backgroundLabelCode = new com.mycompany.payrollsystem.swing.BackgroundLabel();
        jComboBox9 = new javax.swing.JComboBox<>();
        roundedCornersPanel9 = new com.mycompany.payrollsystem.swing.RoundedCornersPanel();
        jLabel31 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        add_employee_table = new javax.swing.JTable();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        roundedCornersPanel1.setBackground(new java.awt.Color(245, 247, 248));

        modal_title2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        modal_title2.setForeground(new java.awt.Color(51, 51, 51));
        modal_title2.setText("ADD/EDIT EMPLOYEE");

        close_icon_modal2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close_icon_modal2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/payrollsystem/icons/x-icon.png"))); // NOI18N
        close_icon_modal2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                close_icon_modal2MousePressed(evt);
            }
        });

        backgroundLabelCode.setBackground(new java.awt.Color(0, 158, 251));
        backgroundLabelCode.setLabelText("Filter");

        jComboBox9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox9.setForeground(new java.awt.Color(102, 102, 102));
        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Type", "Department", "Branch", "Designation", "Agency Name", "Select Employee", " " }));
        jComboBox9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox9ActionPerformed(evt);
            }
        });

        roundedCornersPanel9.setBackground(new java.awt.Color(245, 247, 248));

        jLabel31.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(51, 51, 51));
        jLabel31.setText("Show");

        jComboBox5.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "25", "50", "100" }));

        jLabel32.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(51, 51, 51));
        jLabel32.setText("entries");

        jLabel33.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(51, 51, 51));
        jLabel33.setText("Search:");

        jTextField5.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N

        add_employee_table.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        add_employee_table.setForeground(new java.awt.Color(51, 51, 51));
        add_employee_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Code", "Basic Pay", "Action"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        add_employee_table.setRowHeight(50);
        add_employee_table.setSelectionBackground(new java.awt.Color(204, 204, 204));
        add_employee_table.setShowGrid(true);
        jScrollPane5.setViewportView(add_employee_table);

        jLabel34.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(51, 51, 51));
        jLabel34.setText("Showing 1 to 9 of 9 entries");

        jLabel35.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(51, 51, 51));
        jLabel35.setText("Previous");

        jLabel36.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("1");
        jLabel36.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel38.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(51, 51, 51));
        jLabel38.setText("Next");

        jButton1.setBackground(new java.awt.Color(204, 0, 0));
        jButton1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout roundedCornersPanel9Layout = new javax.swing.GroupLayout(roundedCornersPanel9);
        roundedCornersPanel9.setLayout(roundedCornersPanel9Layout);
        roundedCornersPanel9Layout.setHorizontalGroup(
            roundedCornersPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedCornersPanel9Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(roundedCornersPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundedCornersPanel9Layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 1030, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(roundedCornersPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundedCornersPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel38)
                .addGap(13, 13, 13))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundedCornersPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        roundedCornersPanel9Layout.setVerticalGroup(
            roundedCornersPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedCornersPanel9Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(roundedCornersPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(roundedCornersPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButton2.setBackground(new java.awt.Color(0, 204, 51));
        jButton2.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/payrollsystem/icons/circular_plus_icon_small.png"))); // NOI18N
        jButton2.setText("Other Income");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(204, 0, 0));
        jButton3.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/payrollsystem/icons/circular_minus_icon_small.png"))); // NOI18N
        jButton3.setText("Other Deduction");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout roundedCornersPanel1Layout = new javax.swing.GroupLayout(roundedCornersPanel1);
        roundedCornersPanel1.setLayout(roundedCornersPanel1Layout);
        roundedCornersPanel1Layout.setHorizontalGroup(
            roundedCornersPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedCornersPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(modal_title2)
                .addGap(35, 35, 35)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 444, Short.MAX_VALUE)
                .addComponent(close_icon_modal2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addComponent(jSeparator3)
            .addGroup(roundedCornersPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(backgroundLabelCode, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(roundedCornersPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(roundedCornersPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        roundedCornersPanel1Layout.setVerticalGroup(
            roundedCornersPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedCornersPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(roundedCornersPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(close_icon_modal2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(roundedCornersPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(modal_title2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(roundedCornersPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(backgroundLabelCode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox9))
                .addGap(15, 15, 15)
                .addComponent(roundedCornersPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(roundedCornersPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(roundedCornersPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void close_icon_modal2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close_icon_modal2MousePressed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_close_icon_modal2MousePressed

    private void jComboBox9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox9ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        OtherIncomePayrollModal otherIncomePayrollModal = new OtherIncomePayrollModal();
        otherIncomePayrollModal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        OtherDeductionModal otherDeductionModal = new OtherDeductionModal();
        otherDeductionModal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(AddEmployeeModal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(AddEmployeeModal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(AddEmployeeModal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(AddEmployeeModal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new AddEmployeeModal().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable add_employee_table;
    private com.mycompany.payrollsystem.swing.BackgroundLabel backgroundLabelCode;
    private javax.swing.JLabel close_icon_modal2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox9;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel modal_title2;
    private com.mycompany.payrollsystem.swing.RoundedCornersPanel roundedCornersPanel1;
    private com.mycompany.payrollsystem.swing.RoundedCornersPanel roundedCornersPanel9;
    // End of variables declaration//GEN-END:variables
}
