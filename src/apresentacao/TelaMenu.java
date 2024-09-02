package apresentacao;

import eda.*;
import java.awt.Color;
import static java.awt.Frame.MAXIMIZED_BOTH;
import negocio.NegocioFacade;

public class TelaMenu extends javax.swing.JFrame {
    Administrador admAtual;
    Funcionario funcAtual;
    
    public TelaMenu(int id,Administrador adm, Funcionario func) {
        this.admAtual = adm;
        this.funcAtual = func;
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);  
        Color minhaCor = new Color(122, 197, 205);    
        getContentPane().setBackground(minhaCor); 
        
        if(id == 1){
            botaoCadAdm.setEnabled(false);
            botaoCadFornecedor.setEnabled(false);
            botaoCadFuncionario.setEnabled(false);
            
        }
        if(id == 0){
            botaoVender.setEnabled(false);
        }
            
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoCadSorvete = new javax.swing.JButton();
        botaoCadCliente = new javax.swing.JButton();
        botaoCadAdm = new javax.swing.JButton();
        botaoCadFuncionario = new javax.swing.JButton();
        botaoCadFornecedor = new javax.swing.JButton();
        botaoEstoque = new javax.swing.JButton();
        botaoVender = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        botaoLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        botaoCadSorvete.setBackground(new java.awt.Color(255, 255, 255));
        botaoCadSorvete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botaoCadSorvete.setText("Cadastrar Sorvete");
        botaoCadSorvete.setBorder(null);
        botaoCadSorvete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadSorveteActionPerformed(evt);
            }
        });

        botaoCadCliente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botaoCadCliente.setText("Cadastrar Cliente");
        botaoCadCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadClienteActionPerformed(evt);
            }
        });

        botaoCadAdm.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botaoCadAdm.setText("Cadastrar Administrador");
        botaoCadAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadAdmActionPerformed(evt);
            }
        });

        botaoCadFuncionario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botaoCadFuncionario.setText("Cadastrar Funcionário");
        botaoCadFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadFuncionarioActionPerformed(evt);
            }
        });

        botaoCadFornecedor.setBackground(new java.awt.Color(255, 255, 255));
        botaoCadFornecedor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botaoCadFornecedor.setText("Cadastrar Fornecedor");
        botaoCadFornecedor.setBorder(null);
        botaoCadFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadFornecedorActionPerformed(evt);
            }
        });

        botaoEstoque.setBackground(new java.awt.Color(255, 255, 255));
        botaoEstoque.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botaoEstoque.setText("Estoque");
        botaoEstoque.setBorder(null);
        botaoEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEstoqueActionPerformed(evt);
            }
        });

        botaoVender.setBackground(new java.awt.Color(255, 255, 255));
        botaoVender.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botaoVender.setText("Vender");
        botaoVender.setBorder(null);
        botaoVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVenderActionPerformed(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Arquivos/Logo.jpg"))); // NOI18N

        botaoLogout.setBackground(new java.awt.Color(255, 255, 255));
        botaoLogout.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botaoLogout.setText("Logout");
        botaoLogout.setBorder(null);
        botaoLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botaoCadSorvete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoCadCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoCadAdm, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(botaoCadFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 591, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botaoEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoCadFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                    .addComponent(botaoVender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(292, 292, 292)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(293, 293, 293)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCadSorvete, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoCadFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(botaoVender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoCadCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoEstoque, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoCadAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(botaoLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(botaoCadFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(86, 86, 86)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(87, 87, 87)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCadSorveteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadSorveteActionPerformed
        TelaCadastroSorvete ts = new TelaCadastroSorvete(admAtual, funcAtual);
        ts.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoCadSorveteActionPerformed

    private void botaoCadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadClienteActionPerformed
        TelaCadastroClientes tc = new TelaCadastroClientes(admAtual, funcAtual);
        tc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoCadClienteActionPerformed

    private void botaoCadAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadAdmActionPerformed
        TelaCadastroAdministradores ta = new TelaCadastroAdministradores(admAtual, funcAtual);
        ta.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoCadAdmActionPerformed

    private void botaoCadFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadFuncionarioActionPerformed
        TelaCadastroFuncionarios tf = new TelaCadastroFuncionarios(admAtual, funcAtual);
        tf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoCadFuncionarioActionPerformed

    private void botaoCadFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadFornecedorActionPerformed
        TelaCadastroFornecedores ta = new TelaCadastroFornecedores(admAtual, funcAtual);
        ta.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoCadFornecedorActionPerformed

    private void botaoEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEstoqueActionPerformed
        TelaEstoque es = new TelaEstoque(admAtual, funcAtual);
        es.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoEstoqueActionPerformed

    private void botaoVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVenderActionPerformed
        TelaVenda ta = new TelaVenda(admAtual, funcAtual);
        ta.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoVenderActionPerformed

    private void botaoLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLogoutActionPerformed
        NegocioFacade.salvar();
        TelaLogin ta = new TelaLogin();
        ta.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoLogoutActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadAdm;
    private javax.swing.JButton botaoCadCliente;
    private javax.swing.JButton botaoCadFornecedor;
    private javax.swing.JButton botaoCadFuncionario;
    private javax.swing.JButton botaoCadSorvete;
    private javax.swing.JButton botaoEstoque;
    private javax.swing.JButton botaoLogout;
    private javax.swing.JButton botaoVender;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
