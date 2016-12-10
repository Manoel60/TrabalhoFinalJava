/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogoprincipal;

import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

/**
 *
 * @author Manoel
 */
public class TelaDeJogo extends javax.swing.JPanel {

    /**
     * Creates new form ContraMaq
     */
    public TelaDeJogo(ModoDeJogo esc) {
        escolhaDoJogador =esc;
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

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        pedra = new javax.swing.JLabel();
        lagarto = new javax.swing.JLabel();
        spock = new javax.swing.JLabel();
        tesoura = new javax.swing.JLabel();
        jNomeMaq = new javax.swing.JLabel();
        player = new javax.swing.JLabel();
        TextMaq = new javax.swing.JTextField();
        TextJog = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Score = new javax.swing.JLabel();
        papel = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));
        jPanel3.setPreferredSize(new java.awt.Dimension(237, 272));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        pedra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iMAGES/p_1.png"))); // NOI18N
        pedra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pedra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pedraMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pedraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pedraMouseExited(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 18, 0, 0);
        jPanel3.add(pedra, gridBagConstraints);

        lagarto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iMAGES/lg1.png"))); // NOI18N
        lagarto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lagarto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lagartoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lagartoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lagartoMouseExited(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 18, 0, 0);
        jPanel3.add(lagarto, gridBagConstraints);

        spock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iMAGES/sp1.png"))); // NOI18N
        spock.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        spock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                spockMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                spockMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                spockMouseExited(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(1, 18, 0, 0);
        jPanel3.add(spock, gridBagConstraints);

        tesoura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iMAGES/t1.png"))); // NOI18N
        tesoura.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tesoura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tesouraMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tesouraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tesouraMouseExited(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(1, 52, 0, 0);
        jPanel3.add(tesoura, gridBagConstraints);

        jNomeMaq.setText("    :Maquina");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 19;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 4, 58, 0);
        jPanel3.add(jNomeMaq, gridBagConstraints);

        player.setText("Jogador:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(19, 35, 0, 0);
        jPanel3.add(player, gridBagConstraints);

        TextMaq.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        TextMaq.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 47;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(19, 3, 58, 0);
        jPanel3.add(TextMaq, gridBagConstraints);

        TextJog.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        TextJog.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 47;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(19, 10, 58, 0);
        jPanel3.add(TextJog, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel3.add(jLabel4, gridBagConstraints);

        jPanel2.setBackground(new java.awt.Color(90, 150, 211));

        Score.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        Score.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Score.setText(String.format("%d  X  %d",scoreP, scoreC));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Score, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Score)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 18, 0, 10);
        jPanel3.add(jPanel2, gridBagConstraints);

        papel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iMAGES/pp1.png"))); // NOI18N
        papel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        papel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                papelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                papelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                papelMouseExited(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(1, 18, 0, 0);
        jPanel3.add(papel, gridBagConstraints);

        jPanel1.add(jPanel3, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 457, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tesouraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tesouraMouseExited
        // TODO add your handling code here:
        tesoura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iMAGES/t1.png")));
    }//GEN-LAST:event_tesouraMouseExited

    private void tesouraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tesouraMouseEntered
        // TODO add your handling code here:
        tesoura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iMAGES/t2.png")));
    }//GEN-LAST:event_tesouraMouseEntered

    private void tesouraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tesouraMouseClicked
        // TODO add your handling code here:
        TextJog.setText("Tesoura");
        respostaDeEscolha = escolhaDoJogador.escolha(3);
        TextMaq.setText(respostaDeEscolha[1]);
        
        //vamos verificar quem recebe pontos nessa jogada
        verificaPontos(respostaDeEscolha[2]);
        
        javax.swing.JOptionPane.showMessageDialog(TelaDeJogo.this,respostaDeEscolha[0]);
    }//GEN-LAST:event_tesouraMouseClicked

    private void spockMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_spockMouseExited
        // TODO add your handling code here:
        spock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iMAGES/sp1.png")));
    }//GEN-LAST:event_spockMouseExited

    private void spockMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_spockMouseEntered
        // TODO add your handling code here:
        spock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iMAGES/sp2.png")));
    }//GEN-LAST:event_spockMouseEntered

    private void spockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_spockMouseClicked
        // TODO add your handling code here:
        TextJog.setText("SPOOK!");
        respostaDeEscolha = escolhaDoJogador.escolha(4);
        TextMaq.setText(respostaDeEscolha[1]);
        
        //vamos verificar quem recebe pontos nessa jogada
        verificaPontos(respostaDeEscolha[2]);
        
        //Ira mostrar uma messagem idicando qual foi o resultado da jogada
        javax.swing.JOptionPane.showMessageDialog(TelaDeJogo.this,respostaDeEscolha[0]);
      //  resulText.setText(escRes[0]);
    }//GEN-LAST:event_spockMouseClicked

    private void lagartoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lagartoMouseExited
        // TODO add your handling code here:
        lagarto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iMAGES/lg1.png")));
    }//GEN-LAST:event_lagartoMouseExited

    private void lagartoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lagartoMouseEntered
        // TODO add your handling code here:
        lagarto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iMAGES/lg2.png")));
    }//GEN-LAST:event_lagartoMouseEntered

    private void lagartoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lagartoMouseClicked
        // TODO add your handling code here:
        TextJog.setText("Lagarto");
        respostaDeEscolha = escolhaDoJogador.escolha(5);
        TextMaq.setText(respostaDeEscolha[1]);
        
        //vamos verificar quem recebe pontos nessa jogada
        verificaPontos(respostaDeEscolha[2]);
        
        javax.swing.JOptionPane.showMessageDialog(TelaDeJogo.this,respostaDeEscolha[0]);
    }//GEN-LAST:event_lagartoMouseClicked

    private void pedraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pedraMouseExited
        // TODO add your handling code here:
        pedra.setIcon(img1);
    }//GEN-LAST:event_pedraMouseExited

    private void pedraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pedraMouseEntered
        // TODO add your handling code here:
        pedra.setIcon(img2);
    }//GEN-LAST:event_pedraMouseEntered

    private void pedraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pedraMouseClicked
       
        TextJog.setText("Pedra");// irar indicar qual foi a escolha do usuário
        
        /* O programa irar comparar a escolha do jogador
        // e a escolha da maquina então irar armazena
        // as informaçoes processadas
        respostaDeEscolha = escolhaDoJogador.escolha(1);
        TextMaq.setText(respostaDeEscolha[1]);//O program irar informar a escolha da maquina
        
        //vamos verificar quem recebe pontos nessa jogada
        verificaPontos(respostaDeEscolha[2]);
        
        //irar informar ao usuario o resultado da jogada
        javax.swing.JOptionPane.showMessageDialog(TelaDeJogo.this,respostaDeEscolha[0]);
        */
        processarJogada(1);
    }//GEN-LAST:event_pedraMouseClicked

    private void papelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_papelMouseExited
        // TODO add your handling code here:
        papel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iMAGES/pp1.png")));
    }//GEN-LAST:event_papelMouseExited

    private void papelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_papelMouseEntered
        // Quando o mouse entrar na area do label
        papel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iMAGES/pp2.png")));
    }//GEN-LAST:event_papelMouseEntered

    private void papelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_papelMouseClicked
        // TODO add your handling code here:
        TextJog.setText("Papel");        
        respostaDeEscolha = escolhaDoJogador.escolha(2);
        TextMaq.setText(respostaDeEscolha[1]);
        
        //vamos verificar quem recebe pontos nessa jogada
        verificaPontos(respostaDeEscolha[2]);
        
        //Apresenta o resutado das jogadas
        javax.swing.JOptionPane.showMessageDialog(TelaDeJogo.this,respostaDeEscolha[0]);
    }//GEN-LAST:event_papelMouseClicked
   
    ModoDeJogo escolhaDoJogador;
    String[] respostaDeEscolha;
    private int scoreP=0, scoreC= 0;
    private Icon img2 = new ImageIcon(getClass().getResource("/iMAGES/p_2.png"));
    private Icon img1 = new ImageIcon(getClass().getResource("/iMAGES/p_1.png"));
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Score;
    private javax.swing.JTextField TextJog;
    private javax.swing.JTextField TextMaq;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jNomeMaq;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lagarto;
    private javax.swing.JLabel papel;
    private javax.swing.JLabel pedra;
    private javax.swing.JLabel player;
    private javax.swing.JLabel spock;
    private javax.swing.JLabel tesoura;
    // End of variables declaration//GEN-END:variables
    
    //Essa Classe irar verificar quem irar receber os pontos da jogada
    private void verificaPontos(String quemRecebeP) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if (quemRecebeP == "1")
        {
            scoreC++;
        }else if(quemRecebeP == "2")
        {
            scoreP++;
        }
        Score.setText(String.format("%d  X  %d",scoreP, scoreC));
    }
    
    private void processarJogada(int jogada)
    {
        // O programa irar comparar a escolha do jogador
        // e a escolha da maquina então irar armazena
        // as informaçoes processadas
        respostaDeEscolha = escolhaDoJogador.escolha(jogada);
        TextMaq.setText(respostaDeEscolha[1]);//O program irar informar a escolha da maquina
        
        //vamos verificar quem recebe pontos nessa jogada
        verificaPontos(respostaDeEscolha[2]);
        
        //irar informar ao usuario o resultado da jogada
        javax.swing.JOptionPane.showMessageDialog(TelaDeJogo.this,respostaDeEscolha[0]);
    }
}
