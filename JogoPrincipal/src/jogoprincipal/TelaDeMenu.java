/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogoprincipal;

import javax.swing.JPanel;

/**
 *
 * @author Manoel
 */
public class TelaDeMenu extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaDeMenu() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        quadro2 = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        Menu = new javax.swing.JButton();
        sair = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        conMaq = new javax.swing.JButton();
        modoDesafiante = new javax.swing.JButton();
        modoDesafiar = new javax.swing.JButton();

        javax.swing.GroupLayout quadro2Layout = new javax.swing.GroupLayout(quadro2.getContentPane());
        quadro2.getContentPane().setLayout(quadro2Layout);
        quadro2Layout.setHorizontalGroup(
            quadro2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        quadro2Layout.setVerticalGroup(
            quadro2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(600, 400));
        setMinimumSize(new java.awt.Dimension(600, 400));

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        Menu.setBackground(new java.awt.Color(0, 204, 255));
        Menu.setText("Menu");
        Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuActionPerformed(evt);
            }
        });

        sair.setBackground(new java.awt.Color(0, 204, 255));
        sair.setForeground(new java.awt.Color(51, 51, 51));
        sair.setText("Sair");
        sair.setBorder(null);
        sair.setBorderPainted(false);
        sair.setFocusPainted(false);
        sair.setOpaque(false);
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 286, Short.MAX_VALUE)
                .addComponent(sair, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.WEST);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        conMaq.setBackground(new java.awt.Color(102, 102, 255));
        conMaq.setFont(new java.awt.Font("Vineta BT", 2, 14)); // NOI18N
        conMaq.setForeground(new java.awt.Color(51, 204, 255));
        conMaq.setText("Contra a Maquina");
        conMaq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conMaqActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 56;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(46, 115, 0, 113);
        jPanel1.add(conMaq, gridBagConstraints);

        modoDesafiante.setBackground(new java.awt.Color(102, 102, 255));
        modoDesafiante.setFont(new java.awt.Font("Vineta BT", 2, 14)); // NOI18N
        modoDesafiante.setForeground(new java.awt.Color(51, 204, 255));
        modoDesafiante.setText("Contra o Desafiante");
        modoDesafiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modoDesafianteActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 44;
        gridBagConstraints.ipady = 18;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(60, 109, 0, 113);
        jPanel1.add(modoDesafiante, gridBagConstraints);

        modoDesafiar.setBackground(new java.awt.Color(102, 102, 255));
        modoDesafiar.setFont(new java.awt.Font("Vineta BT", 2, 14)); // NOI18N
        modoDesafiar.setForeground(new java.awt.Color(51, 204, 255));
        modoDesafiar.setText("Desafiar");
        modoDesafiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modoDesafiarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 158;
        gridBagConstraints.ipady = 35;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(65, 115, 99, 113);
        jPanel1.add(modoDesafiar, gridBagConstraints);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void conMaqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conMaqActionPerformed
        // TODO add your handling code here:
        jPanel1.setVisible(false);
        Tela = new TelaDeJogo(new ContraMaquina());
        add(Tela);
        Tela.setVisible(true);
        
    }//GEN-LAST:event_conMaqActionPerformed

    private void modoDesafiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modoDesafiarActionPerformed
        // TODO add your handling code here:
        Tela = new TelaDeDesafio();
        jPanel1.setVisible(false);
        add(Tela);
        Tela.setVisible(true);
    }//GEN-LAST:event_modoDesafiarActionPerformed
    
    private void modoDesafianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modoDesafianteActionPerformed
        // TODO add your handling code here:
        jPanel1.setVisible(false);
        Tela = new TelaDeJogo(new ContraDesafiante());
        add(Tela);
        Tela.setVisible(true);
        
    }//GEN-LAST:event_modoDesafianteActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_sairActionPerformed
    
    //Botão de Menu, quando o usuario aperta esse botão ele desabilita
    // a tela atual que esta sendo usado e volta para a tela principal
    private void MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuActionPerformed
        // TODO add your handling code here:
        Tela.setVisible(false);
        add(jPanel1);
        remove(Tela);
        jPanel1.setVisible(true);
    }//GEN-LAST:event_MenuActionPerformed

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
            java.util.logging.Logger.getLogger(TelaDeMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDeMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDeMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDeMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDeMenu().setVisible(true);
                
               
            }
        });
        
        
    }
    private JPanel Tela;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Menu;
    private javax.swing.JButton conMaq;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton modoDesafiante;
    private javax.swing.JButton modoDesafiar;
    private javax.swing.JFrame quadro2;
    private javax.swing.JButton sair;
    // End of variables declaration//GEN-END:variables
}
