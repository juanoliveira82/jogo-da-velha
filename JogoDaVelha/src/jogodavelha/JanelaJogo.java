// Autor: Juan Carlos Cardoso de Oliveira
package jogodavelha;

import javax.swing.JOptionPane;

public class JanelaJogo extends javax.swing.JFrame {

    public JanelaJogo() {
        initComponents();
    }
    Jogo jogo = new Jogo();
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnTopoEsq = new javax.swing.JButton();
        btnTopoMeio = new javax.swing.JButton();
        btnTopoDir = new javax.swing.JButton();
        btnMeioDir = new javax.swing.JButton();
        btnMeioMeio = new javax.swing.JButton();
        btnMeioEsq = new javax.swing.JButton();
        btnBaseDir = new javax.swing.JButton();
        btnBaseMeio = new javax.swing.JButton();
        btnBaseEsq = new javax.swing.JButton();
        lblLogs = new javax.swing.JLabel();
        menuBarJogo = new javax.swing.JMenuBar();
        menuCategoryJogo = new javax.swing.JMenu();
        menuNovoJogo = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenuItem();
        menuCategoryOptions = new javax.swing.JMenu();
        menuSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo da Velha");

        btnTopoEsq.setFont(new java.awt.Font("Segoe UI", 0, 70)); // NOI18N
        btnTopoEsq.setEnabled(false);
        btnTopoEsq.setFocusPainted(false);
        btnTopoEsq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTopoEsqActionPerformed(evt);
            }
        });

        btnTopoMeio.setFont(new java.awt.Font("Segoe UI", 0, 70)); // NOI18N
        btnTopoMeio.setEnabled(false);
        btnTopoMeio.setFocusPainted(false);
        btnTopoMeio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTopoMeioActionPerformed(evt);
            }
        });

        btnTopoDir.setFont(new java.awt.Font("Segoe UI", 0, 70)); // NOI18N
        btnTopoDir.setEnabled(false);
        btnTopoDir.setFocusPainted(false);
        btnTopoDir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTopoDirActionPerformed(evt);
            }
        });

        btnMeioDir.setFont(new java.awt.Font("Segoe UI", 0, 70)); // NOI18N
        btnMeioDir.setEnabled(false);
        btnMeioDir.setFocusPainted(false);
        btnMeioDir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMeioDirActionPerformed(evt);
            }
        });

        btnMeioMeio.setFont(new java.awt.Font("Segoe UI", 0, 70)); // NOI18N
        btnMeioMeio.setEnabled(false);
        btnMeioMeio.setFocusPainted(false);
        btnMeioMeio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMeioMeioActionPerformed(evt);
            }
        });

        btnMeioEsq.setFont(new java.awt.Font("Segoe UI", 0, 70)); // NOI18N
        btnMeioEsq.setEnabled(false);
        btnMeioEsq.setFocusPainted(false);
        btnMeioEsq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMeioEsqActionPerformed(evt);
            }
        });

        btnBaseDir.setFont(new java.awt.Font("Segoe UI", 0, 70)); // NOI18N
        btnBaseDir.setEnabled(false);
        btnBaseDir.setFocusPainted(false);
        btnBaseDir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBaseDirActionPerformed(evt);
            }
        });

        btnBaseMeio.setFont(new java.awt.Font("Segoe UI", 0, 70)); // NOI18N
        btnBaseMeio.setEnabled(false);
        btnBaseMeio.setFocusPainted(false);
        btnBaseMeio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBaseMeioActionPerformed(evt);
            }
        });

        btnBaseEsq.setFont(new java.awt.Font("Segoe UI", 0, 70)); // NOI18N
        btnBaseEsq.setEnabled(false);
        btnBaseEsq.setFocusPainted(false);
        btnBaseEsq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBaseEsqActionPerformed(evt);
            }
        });

        lblLogs.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        menuCategoryJogo.setText("Jogo");

        menuNovoJogo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        menuNovoJogo.setText("Novo Jogo");
        menuNovoJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNovoJogoActionPerformed(evt);
            }
        });
        menuCategoryJogo.add(menuNovoJogo);

        menuSair.setText("Sair");
        menuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSairActionPerformed(evt);
            }
        });
        menuCategoryJogo.add(menuSair);

        menuBarJogo.add(menuCategoryJogo);

        menuCategoryOptions.setText("Opções");

        menuSobre.setText("Sobre");
        menuSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSobreActionPerformed(evt);
            }
        });
        menuCategoryOptions.add(menuSobre);

        menuBarJogo.add(menuCategoryOptions);

        setJMenuBar(menuBarJogo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblLogs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnTopoEsq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMeioEsq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBaseEsq, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnTopoMeio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMeioMeio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBaseMeio, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBaseDir, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                            .addComponent(btnMeioDir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTopoDir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnTopoDir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTopoMeio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTopoEsq, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnMeioDir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMeioMeio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMeioEsq, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBaseDir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBaseMeio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBaseEsq, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblLogs, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSobreActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Criado por: Juan Carlos Cardoso de Oliveira", "Sobre", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_menuSobreActionPerformed

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuSairActionPerformed

    private void btnTopoEsqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTopoEsqActionPerformed
        jogo.realizaJogada();
        btnTopoEsq.setText(String.valueOf(jogo.simboloJogada));
        btnTopoEsq.setEnabled(false);
        if(jogo.jog1.getSimbolo().equals(jogo.simboloJogada))
            jogo.TopoEsqJog1=1;
        else if(jogo.jog2.getSimbolo().equals(jogo.simboloJogada))
            jogo.TopoEsqJog2=1;       
        jogo.verificaCampeao();
    }//GEN-LAST:event_btnTopoEsqActionPerformed

    private void btnTopoMeioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTopoMeioActionPerformed
        jogo.realizaJogada();
        btnTopoMeio.setText(String.valueOf(jogo.simboloJogada));
        btnTopoMeio.setEnabled(false);
        if(jogo.jog1.getSimbolo().equals(jogo.simboloJogada))
            jogo.TopoMeioJog1=1;
        else if(jogo.jog2.getSimbolo().equals(jogo.simboloJogada))
            jogo.TopoMeioJog2=1;
        jogo.verificaCampeao();
    }//GEN-LAST:event_btnTopoMeioActionPerformed

    private void btnTopoDirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTopoDirActionPerformed
        jogo.realizaJogada();
        btnTopoDir.setText(String.valueOf(jogo.simboloJogada));
        btnTopoDir.setEnabled(false);
        if(jogo.jog1.getSimbolo().equals(jogo.simboloJogada))
            jogo.TopoDirJog1=1;
        else if(jogo.jog2.getSimbolo().equals(jogo.simboloJogada))
            jogo.TopoDirJog2=1;
        jogo.verificaCampeao();
    }//GEN-LAST:event_btnTopoDirActionPerformed

    private void btnMeioEsqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMeioEsqActionPerformed
        jogo.realizaJogada();
        btnMeioEsq.setText(String.valueOf(jogo.simboloJogada));
        btnMeioEsq.setEnabled(false);
        if(jogo.jog1.getSimbolo().equals(jogo.simboloJogada))
            jogo.MeioEsqJog1=1;
        else if(jogo.jog2.getSimbolo().equals(jogo.simboloJogada))
            jogo.MeioEsqJog2=1;
        jogo.verificaCampeao();
    }//GEN-LAST:event_btnMeioEsqActionPerformed

    private void btnMeioMeioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMeioMeioActionPerformed
        jogo.realizaJogada();
        btnMeioMeio.setText(String.valueOf(jogo.simboloJogada));
        btnMeioMeio.setEnabled(false);
        if(jogo.jog1.getSimbolo().equals(jogo.simboloJogada))
            jogo.MeioMeioJog1=1;
        else if(jogo.jog2.getSimbolo().equals(jogo.simboloJogada))
            jogo.MeioMeioJog2=1;
        jogo.verificaCampeao();
    }//GEN-LAST:event_btnMeioMeioActionPerformed

    private void btnMeioDirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMeioDirActionPerformed
        jogo.realizaJogada();
        btnMeioDir.setText(String.valueOf(jogo.simboloJogada));
        btnMeioDir.setEnabled(false);
        if(jogo.jog1.getSimbolo().equals(jogo.simboloJogada))
            jogo.MeioDirJog1=1;
        else if(jogo.jog2.getSimbolo().equals(jogo.simboloJogada))
            jogo.MeioDirJog2=1;
        jogo.verificaCampeao();
    }//GEN-LAST:event_btnMeioDirActionPerformed

    private void btnBaseMeioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBaseMeioActionPerformed
        jogo.realizaJogada();
        btnBaseMeio.setText(String.valueOf(jogo.simboloJogada));
        btnBaseMeio.setEnabled(false);
        if(jogo.jog1.getSimbolo().equals(jogo.simboloJogada))
            jogo.BaseMeioJog1=1;
        else if(jogo.jog2.getSimbolo().equals(jogo.simboloJogada))
            jogo.BaseMeioJog2=1;
        jogo.verificaCampeao();
    }//GEN-LAST:event_btnBaseMeioActionPerformed

    private void btnBaseEsqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBaseEsqActionPerformed
        jogo.realizaJogada();
        btnBaseEsq.setText(String.valueOf(jogo.simboloJogada));
        btnBaseEsq.setEnabled(false);
        if(jogo.jog1.getSimbolo().equals(jogo.simboloJogada))
            jogo.BaseEsqJog1=1;
        else if(jogo.jog2.getSimbolo().equals(jogo.simboloJogada))
            jogo.BaseEsqJog2=1;
        jogo.verificaCampeao();
    }//GEN-LAST:event_btnBaseEsqActionPerformed

    private void btnBaseDirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBaseDirActionPerformed
        jogo.realizaJogada();
        btnBaseDir.setText(String.valueOf(jogo.simboloJogada));
        btnBaseDir.setEnabled(false);
        if(jogo.jog1.getSimbolo().equals(jogo.simboloJogada))
            jogo.BaseDirJog1=1;
        else if(jogo.jog2.getSimbolo().equals(jogo.simboloJogada))
            jogo.BaseDirJog2=1;
        jogo.verificaCampeao();
    }//GEN-LAST:event_btnBaseDirActionPerformed

    private void menuNovoJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNovoJogoActionPerformed
        // Reinicia as variáveis de contagem.
        jogo.novoJogo();
        
        // Pede os nomes dos jogadores e os símbolos, e atribui nas variáveis.
        jogo.NomeJog1=JOptionPane.showInputDialog(rootPane, "Informe seu nome", "Jogador 1 - Nome", JOptionPane.QUESTION_MESSAGE);
        jogo.simboloJog1=JOptionPane.showInputDialog(rootPane, "Informe o símbolo que deseja utilizar", "Jogador 1 - Símbolo", JOptionPane.QUESTION_MESSAGE);
        jogo.NomeJog2=JOptionPane.showInputDialog(rootPane, "Informe seu nome", "Jogador 2 - Nome", JOptionPane.QUESTION_MESSAGE);
        jogo.simboloJog2=JOptionPane.showInputDialog(rootPane, "Informe o símbolo que deseja utilizar", "Jogador 2 - Símbolo", JOptionPane.QUESTION_MESSAGE);
        
        // Compara os símbolos, e caso sejam iguais, impede a continuação do jogo.
        if(jogo.simboloJog1.equals(jogo.simboloJog2)){
            JOptionPane.showMessageDialog(rootPane, "Não é permitido o uso do mesmo símbolo", "Erro!", JOptionPane.QUESTION_MESSAGE);
            jogo.desabilitaBotoes();
        } else {
            // Inicia o jogo definindo os nomes e símbolos dos jogadores e habilitando os botões.          
            jogo.definirNomeSimbolo(jogo.NomeJog1, jogo.simboloJog1, jogo.NomeJog2, jogo.simboloJog2);            
            jogo.iniciarJogo();
            if(jogo.turnoJogador==1){
                lblLogs.setText("O jogador "+jogo.jog1.getNome()+" inicia o jogo.");
            }
        }
    }//GEN-LAST:event_menuNovoJogoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnBaseDir;
    public static javax.swing.JButton btnBaseEsq;
    public static javax.swing.JButton btnBaseMeio;
    public static javax.swing.JButton btnMeioDir;
    public static javax.swing.JButton btnMeioEsq;
    public static javax.swing.JButton btnMeioMeio;
    public static javax.swing.JButton btnTopoDir;
    public static javax.swing.JButton btnTopoEsq;
    public static javax.swing.JButton btnTopoMeio;
    public static javax.swing.JLabel lblLogs;
    private javax.swing.JMenuBar menuBarJogo;
    private javax.swing.JMenu menuCategoryJogo;
    private javax.swing.JMenu menuCategoryOptions;
    private javax.swing.JMenuItem menuNovoJogo;
    private javax.swing.JMenuItem menuSair;
    private javax.swing.JMenuItem menuSobre;
    // End of variables declaration//GEN-END:variables
}
