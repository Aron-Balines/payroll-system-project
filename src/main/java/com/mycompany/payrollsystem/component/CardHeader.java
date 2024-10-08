/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.payrollsystem.component;

import com.mycompany.payrollsystem.Util;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;

/**
 *
 * @author Paul
 */
public class CardHeader extends javax.swing.JPanel {

    /**
     * Creates new form CardHeader
     */
    
    private boolean showPanel;
    private Util util;
    
    public CardHeader() {
        util = new Util();
        showPanel = false;
        initComponents();
        setOpaque(false);
        setBackground(new Color(47,71,186));
    }
    
    public void setupCardHeader(String cardHeaderText) {
        card_header_name.setText(cardHeaderText);
    }
    
    public void toggleCardHeaderPanel(JPanel panel) {
        
        icon_label.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                
                icon_panel.setBackground(new Color(180, 180, 180));
                
                if (!showPanel) {
                    icon_label.setIcon(util.toIcon("caret-arrow-up"));
                    panel.setVisible(true);
                    showPanel = true;
                } else {
                    icon_label.setIcon(util.toIcon("caret-down"));
                    panel.setVisible(false);
                    showPanel = false;
                }
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                icon_panel.setBackground(new Color(240, 240, 240));
            }
        });
    }
    
     @Override
    protected void paintComponent(Graphics g) {
        
        int width = getWidth();
        int height = getHeight();
        int arcWidth = 10;
        int arcHeight = 10;
        int cornerRadius = 10;
        
        super.paintComponent(g);
        Graphics2D graphics = (Graphics2D)g.create();
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graphics.setColor(getBackground());
        graphics.fillRoundRect(0, 0, width, height, arcWidth, arcHeight);
        graphics.fillRect(0, cornerRadius, width, height - cornerRadius);
        
        graphics.dispose();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this
     * code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        card_header_name = new javax.swing.JLabel();
        icon_panel = new com.mycompany.payrollsystem.swing.RoundedCornersPanel();
        icon_label = new javax.swing.JLabel();

        card_header_name.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        card_header_name.setForeground(new java.awt.Color(255, 255, 255));
        card_header_name.setText("Department");

        icon_panel.setPreferredSize(new java.awt.Dimension(40, 40));

        icon_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/payrollsystem/icons/caret-down.png"))); // NOI18N
        icon_label.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout icon_panelLayout = new javax.swing.GroupLayout(icon_panel);
        icon_panel.setLayout(icon_panelLayout);
        icon_panelLayout.setHorizontalGroup(
            icon_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icon_label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        icon_panelLayout.setVerticalGroup(
            icon_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icon_label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(card_header_name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 662, Short.MAX_VALUE)
                .addComponent(icon_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(icon_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(card_header_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel card_header_name;
    private javax.swing.JLabel icon_label;
    private com.mycompany.payrollsystem.swing.RoundedCornersPanel icon_panel;
    // End of variables declaration//GEN-END:variables
}
