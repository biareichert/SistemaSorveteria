package apresentacao;

import eda.*;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import negocio.*;

public final class TelaVenda extends javax.swing.JDialog {
    Administrador admAtual;
    Funcionario funcAtual;
    String data;
    static Random r = new Random();
    int codigo = r.nextInt(200);
    
    public TelaVenda(Administrador admAtual, Funcionario funcAtual) {
        initComponents();
        this.admAtual = admAtual;
        this.funcAtual = funcAtual;
        Color minhaCor = new Color(160, 032, 240);
        getContentPane().setBackground(minhaCor);
        this.setModal(true);
        Calendar cal = Calendar.getInstance();
        data = cal.get(Calendar.DAY_OF_MONTH) +"/"+cal.get(Calendar.MONTH)+"/"+cal.get(Calendar.YEAR);
        inputData.setText(data);
        inputData.setEnabled(false);
        inputId.setText("" + codigo );
        inputIdFunc.setText(""+ funcAtual.getCodigo());
        inputIdFunc.setEnabled(false);
        inputId.setEnabled(false);
        inputCliente.setEnabled(false);
        inputFuncionario.setEnabled(false);
        inputFuncionario.setText(""+funcAtual.getNome());
        inputSabor.setEnabled(false);
        inputMarca.setEnabled(false);
        inputQuantidade.setEnabled(false);
        inputValor.setEnabled(false);
        botaoConcluir.setEnabled(false);
        botaoCalcular.setEnabled(false);
        OrganizaTabela();
    }

    @SuppressWarnings("unchecked")
    
    public void OrganizaTabela(){
        DefaultTableModel modelo = new DefaultTableModel();
        DefaultTableModel modelo1 = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Marca");
        modelo.addColumn("Descrição");
        modelo1.addColumn("ID");
        modelo1.addColumn("Cliente");
        ArrayList<Cliente> cli = NegocioFacade.listaCliente();
        ArrayList<Sorvete> sorvetes = NegocioFacade.listaSorvetes();
        if(sorvetes.isEmpty()){
            modelo.addRow(new String[]{"Sem informações","Sem informações","Sem informações"});
        }else{
            for (Sorvete sorvete : sorvetes) {
                modelo.addRow(new Object[]{sorvete.getCodigo(), sorvete.getMarca(), sorvete.getDescricao()});
            }
        }
        tabela1.setModel(modelo);
        
        if(cli.isEmpty()){
            modelo1.addRow(new String[]{"Sem informações","Sem informações"});
        }else{
            for (Cliente c : cli) {
                modelo1.addRow(new Object[]{c.getCodigo(), c.getNome()});
            }
        }
        tabela.setModel(modelo1);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        botaoConcluir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        inputQuantidade = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        inputIdCliente = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        inputIdSorvete = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        inputIdFunc = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        botaoCalcular = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        inputValor = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        boxDinheiro = new javax.swing.JCheckBox();
        boxCartao = new javax.swing.JCheckBox();
        boxCheque = new javax.swing.JCheckBox();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabela1 = new javax.swing.JTable();
        botaoVoltar = new javax.swing.JButton();
        botaoPesquisar = new javax.swing.JButton();
        inputCliente = new javax.swing.JTextField();
        inputId = new javax.swing.JTextField();
        inputFuncionario = new javax.swing.JTextField();
        inputSabor = new javax.swing.JTextField();
        inputMarca = new javax.swing.JTextField();
        inputData = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bem Vindo a Sorveteria Dream Ice!");

        botaoConcluir.setText("Concluir Venda");
        botaoConcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConcluirActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Dia de hoje:");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ID:");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Quantidade:");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Id Cliente:");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Id Sorvete:");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Id Funcionário:");

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Sabor:");

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Valor:");

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Marca:");

        botaoCalcular.setText("Calcular");
        botaoCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCalcularActionPerformed(evt);
            }
        });

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Cliente:");

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Funcionário:");

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Cliente"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tabela);

        boxDinheiro.setForeground(new java.awt.Color(255, 255, 255));
        boxDinheiro.setText("Dinheiro");

        boxCartao.setForeground(new java.awt.Color(255, 255, 255));
        boxCartao.setText("Cartão");

        boxCheque.setForeground(new java.awt.Color(255, 255, 255));
        boxCheque.setText("Cheque");

        tabela1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Marca", "Descricao"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tabela1);

        botaoVoltar.setText("Voltar");
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        botaoPesquisar.setText("Pesquisar");
        botaoPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botaoVoltar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botaoConcluir))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(inputValor, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(boxDinheiro)
                                .addGap(41, 41, 41)
                                .addComponent(boxCartao)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel5)
                            .addComponent(jLabel14)
                            .addComponent(jLabel10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel12)
                                .addComponent(jLabel13)))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(inputIdSorvete, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(inputIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(inputData, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(inputCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(inputId, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(inputMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel11)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel15)
                                            .addGap(150, 150, 150)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8))
                                        .addGap(25, 25, 25)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(inputSabor)
                                            .addComponent(inputQuantidade)
                                            .addComponent(inputFuncionario)
                                            .addComponent(inputIdFunc)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(botaoCalcular)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(16, 16, 16))
            .addGroup(layout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoPesquisar)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(boxCheque)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(inputData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(inputIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(14, 14, 14))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(botaoPesquisar)
                                .addGap(18, 18, 18)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(inputIdFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(inputFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(inputIdSorvete, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputSabor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(boxDinheiro)
                                    .addComponent(boxCartao)
                                    .addComponent(boxCheque))
                                .addGap(30, 30, 30)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botaoConcluir)
                            .addComponent(botaoVoltar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputValor, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoCalcular))))
                .addGap(23, 23, 23))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoConcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConcluirActionPerformed
        String idVenda = inputId.getText();
        String idFuncionario = inputIdFunc.getText();
        String idCliente = inputIdCliente.getText();
        String quantidade = inputQuantidade.getText();
        String idSorvete = inputIdSorvete.getText();
        Pagamento p = null;
        
        try{
            int id = Integer.parseInt(idVenda);
            int idf = Integer.parseInt(idFuncionario);
            int q = Integer.parseInt(quantidade);
            int idc = Integer.parseInt(idCliente);
            int ids = Integer.parseInt(idSorvete);
            Sorvete s = NegocioFacade.validarSorvete(ids);
           
            if(boxDinheiro.isSelected()){
                p = Pagamento.DINHEIRO;
            }
            if(boxCartao.isSelected()){
                p = Pagamento.CARTAO;
            }
            if(boxCheque.isSelected()){
                p = Pagamento.CHEQUE;
            }

            Venda v = new Venda(6,id,idf,data,idc,p,q);
            NegocioFacade.addVenda(v);
            NegocioFacade.atualizarQuantidade(q, s);
            JOptionPane.showMessageDialog(null, "Venda concluída com sucesso! ", "Venda", 1);
            TelaMenu menu = new TelaMenu(TelaLogin.id, admAtual, funcAtual);
            menu.setVisible(true);
            dispose();            
         
        } catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Digite um valor válido para os campos.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
           
       
             
    }//GEN-LAST:event_botaoConcluirActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       

    }//GEN-LAST:event_formWindowOpened

    private void botaoCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCalcularActionPerformed
        String quantidade = inputQuantidade.getText();
        String idSorvete = inputIdSorvete.getText();
        try{
            int q = Integer.parseInt(quantidade);
            int ids = Integer.parseInt(idSorvete);
            boolean i = SegurancaOperacoes.verificarQuantidade(q);
            if(i){
                Sorvete s = NegocioFacade.validarSorvete(ids);
                boolean j = SegurancaOperacoes.verificarDisponibilidade(s, q);
                if(j){
                    double valor = SegurancaOperacoes.atualizaValor(q, s.getValor());
                    inputValor.setText(""+valor);
                    botaoConcluir.setEnabled(true);
                }else{
                    JOptionPane.showMessageDialog(null, "Quantidade indisponível.", "Erro", JOptionPane.ERROR_MESSAGE);
                   
                }
            }else{
                JOptionPane.showMessageDialog(null, "Informe uma quantidade maior que 0.", "Erro", JOptionPane.ERROR_MESSAGE);
            
            }
            
        } catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Digite um valor inteiro para os IDs.", "Erro", JOptionPane.ERROR_MESSAGE);
           
        }
        
     

    }//GEN-LAST:event_botaoCalcularActionPerformed

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        TelaMenu menu = new TelaMenu(TelaLogin.id, admAtual, funcAtual);
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void botaoPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisarActionPerformed
        String idCliente = inputIdCliente.getText();
        String idSorvete = inputIdSorvete.getText();
        
        try{
            int idc = Integer.parseInt(idCliente);
            int ids = Integer.parseInt(idSorvete);
            Sorvete s = NegocioFacade.validarSorvete(ids);
            Cliente c = NegocioFacade.validarCliente(idc);
            if(s != null && c != null){
                inputCliente.setText(""+c.getNome());
                inputSabor.setText(""+s.getSabor());
                inputMarca.setText(""+s.getMarca());
                inputQuantidade.setEnabled(true);
                botaoCalcular.setEnabled(true);
                
            }else{
                JOptionPane.showMessageDialog(null, "ID do cliente ou do sorvete inválido.", "ERRO", 1);
                TelaVenda tc = new TelaVenda(admAtual, funcAtual);
                tc.setVisible(true);
                dispose(); 
            }
            
        } catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Digite um valor inteiro para os IDs.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_botaoPesquisarActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCalcular;
    private javax.swing.JButton botaoConcluir;
    private javax.swing.JButton botaoPesquisar;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JCheckBox boxCartao;
    private javax.swing.JCheckBox boxCheque;
    private javax.swing.JCheckBox boxDinheiro;
    private javax.swing.JTextField inputCliente;
    private javax.swing.JTextField inputData;
    private javax.swing.JTextField inputFuncionario;
    private javax.swing.JTextField inputId;
    private javax.swing.JTextField inputIdCliente;
    private javax.swing.JTextField inputIdFunc;
    private javax.swing.JTextField inputIdSorvete;
    private javax.swing.JTextField inputMarca;
    private javax.swing.JTextField inputQuantidade;
    private javax.swing.JTextField inputSabor;
    private javax.swing.JTextField inputValor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tabela;
    private javax.swing.JTable tabela1;
    // End of variables declaration//GEN-END:variables
}
