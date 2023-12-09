/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.Compra;

import javax.accessibility.AccessibleContext;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import view.Templates.*;

/**
 *
 * @author aluno
 */
public class PontoDeVendaView extends javax.swing.JDialog {
    
    /**
     * Creates new form TemplateCadastro
     */
    public PontoDeVendaView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        
        initComponents();
        utilities.Utilities.ativaDesativa(true, jPanelFim);
    }

    public JTextField getCodigoBarra() {
        return CodigoBarra;
    }

    public void setCodigoBarra(JTextField CodigoBarra) {
        this.CodigoBarra = CodigoBarra;
    }

    public JFormattedTextField getDataDeEmissao() {
        return DataDeEmissao;
    }

    public void setDataDeEmissao(JFormattedTextField DataDeEmissao) {
        this.DataDeEmissao = DataDeEmissao;
    }

    public JFormattedTextField getHoraDeEmissao() {
        return HoraDeEmissao;
    }

    public void setHoraDeEmissao(JFormattedTextField HoraDeEmissao) {
        this.HoraDeEmissao = HoraDeEmissao;
    }

    public JTextField getNomeCliente() {
        return NomeCliente;
    }

    public void setNomeCliente(JTextField NomeCliente) {
        this.NomeCliente = NomeCliente;
    }

    public JTextField getObservacao() {
        return Observacao;
    }

    public void setObservacao(JTextField Observacao) {
        this.Observacao = Observacao;
    }


    public JTable getTabelaListaProduto() {
        return TabelaListaProduto;
    }

    public void setTabelaListaProduto(JTable TabelaListaProduto) {
        this.TabelaListaProduto = TabelaListaProduto;
    }

    public JTextField getTotal() {
        return Total;
    }

    public void setTotal(JTextField Total) {
        this.Total = Total;
    }

    public JTextField getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(JTextField idCliente) {
        this.idCliente = idCliente;
    }

    public JLabel getjLabelCodigoBarra() {
        return jLabelCodigoBarra;
    }

    public void setjLabelCodigoBarra(JLabel jLabelCodigoBarra) {
        this.jLabelCodigoBarra = jLabelCodigoBarra;
    }

    public JLabel getjLabelDataDeEmissao() {
        return jLabelDataDeEmissao;
    }

    public void setjLabelDataDeEmissao(JLabel jLabelDataDeEmissao) {
        this.jLabelDataDeEmissao = jLabelDataDeEmissao;
    }

    public JLabel getjLabelHoraDeEmissao() {
        return jLabelHoraDeEmissao;
    }

    public void setjLabelHoraDeEmissao(JLabel jLabelHoraDeEmissao) {
        this.jLabelHoraDeEmissao = jLabelHoraDeEmissao;
    }

    public JLabel getjLabelIdCliente() {
        return jLabelIdCliente;
    }

    public void setjLabelIdCliente(JLabel jLabelIdCliente) {
        this.jLabelIdCliente = jLabelIdCliente;
    }

    public JLabel getjLabelNomeCliente() {
        return jLabelNomeCliente;
    }

    public void setjLabelNomeCliente(JLabel jLabelNomeCliente) {
        this.jLabelNomeCliente = jLabelNomeCliente;
    }

    public JLabel getjLabelObs() {
        return jLabelObs;
    }

    public void setjLabelObs(JLabel jLabelObs) {
        this.jLabelObs = jLabelObs;
    }

    public JLabel getjLabelProduto() {
        return jLabelProduto;
    }

    public void setjLabelProduto(JLabel jLabelProduto) {
        this.jLabelProduto = jLabelProduto;
    }

    public JLabel getjLabelValorUnitario() {
        return jLabelValorUnitario;
    }

    public void setjLabelValorUnitario(JLabel jLabelValorUnitario) {
        this.jLabelValorUnitario = jLabelValorUnitario;
    }

    public JLabel getjLtitulo() {
        return jLtitulo;
    }

    public void setjLtitulo(JLabel jLtitulo) {
        this.jLtitulo = jLtitulo;
    }

    public JMenu getjMenu1() {
        return Comandos;
    }

    public void setjMenu1(JMenu jMenu1) {
        this.Comandos = jMenu1;
    }

    public JMenuBar getjMenuBar1() {
        return jMenuBar1;
    }

    public void setjMenuBar1(JMenuBar jMenuBar1) {
        this.jMenuBar1 = jMenuBar1;
    }

    public JPanel getjPanelFim() {
        return jPanelFim;
    }

    public void setjPanelFim(JPanel jPanelFim) {
        this.jPanelFim = jPanelFim;
    }

    public JPanel getjPanelMeio() {
        return jPanelMeio;
    }

    public void setjPanelMeio(JPanel jPanelMeio) {
        this.jPanelMeio = jPanelMeio;
    }

    public JPanel getjPanelTitulo() {
        return jPanelTitulo;
    }

    public void setjPanelTitulo(JPanel jPanelTitulo) {
        this.jPanelTitulo = jPanelTitulo;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JTextField getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(JTextField valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public JMenu getComandos() {
        return Comandos;
    }

    public void setComandos(JMenu Comandos) {
        this.Comandos = Comandos;
    }

    public JMenuItem getCalculaTotal() {
        return calculaTotal;
    }

    public void setCalculaTotal(JMenuItem calculaTotal) {
        this.calculaTotal = calculaTotal;
    }

    public JMenuItem getCancelaItem() {
        return cancelaItem;
    }

    public void setCancelaItem(JMenuItem cancelaItem) {
        this.cancelaItem = cancelaItem;
    }

    public JMenuItem getFechaCaixa() {
        return fechaCaixa;
    }

    public void setFechaCaixa(JMenuItem fechaCaixa) {
        this.fechaCaixa = fechaCaixa;
    }

    public JMenuItem getLerCodigoBarra() {
        return lerCodigoBarra;
    }

    public void setLerCodigoBarra(JMenuItem lerCodigoBarra) {
        this.lerCodigoBarra = lerCodigoBarra;
    }

    public JMenuItem getPassaInfo() {
        return passaInfo;
    }

    public void setPassaInfo(JMenuItem passaInfo) {
        this.passaInfo = passaInfo;
    }

    public JTextField getProdutoNome1() {
        return ProdutoNome1;
    }

    public void setProdutoNome1(JTextField ProdutoNome1) {
        this.ProdutoNome1 = ProdutoNome1;
    }

    public JTextField getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(JTextField Quantidade) {
        this.Quantidade = Quantidade;
    }

    public JTextField getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(JTextField idFuncionario) {
        this.idFuncionario = idFuncionario;
    }
    
    
    
    

  
    

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTitulo = new javax.swing.JPanel();
        jLtitulo = new javax.swing.JLabel();
        jPanelMeio = new javax.swing.JPanel();
        Cliente = new javax.swing.JButton();
        Total = new javax.swing.JTextField();
        NomeCliente = new javax.swing.JTextField();
        idCliente = new javax.swing.JTextField();
        DataDeEmissao = new javax.swing.JFormattedTextField();
        jLabelIdCliente = new javax.swing.JLabel();
        jLabelDataDeEmissao = new javax.swing.JLabel();
        HoraDeEmissao = new javax.swing.JFormattedTextField();
        jLabelHoraDeEmissao = new javax.swing.JLabel();
        jLabelNomeCliente = new javax.swing.JLabel();
        jLabelCodigoBarra = new javax.swing.JLabel();
        CodigoBarra = new javax.swing.JTextField();
        jLabelProduto = new javax.swing.JLabel();
        Quantidade = new javax.swing.JTextField();
        Observacao = new javax.swing.JTextField();
        jLabelObs = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaListaProduto = new javax.swing.JTable();
        valorUnitario = new javax.swing.JTextField();
        jLabelValorUnitario = new javax.swing.JLabel();
        ProdutoNome1 = new javax.swing.JTextField();
        jLabelProduto1 = new javax.swing.JLabel();
        idFuncionario = new javax.swing.JTextField();
        jLabelIdFuncionario = new javax.swing.JLabel();
        jPanelFim = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Comandos = new javax.swing.JMenu();
        lerCodigoBarra = new javax.swing.JMenuItem();
        passaInfo = new javax.swing.JMenuItem();
        cancelaItem = new javax.swing.JMenuItem();
        calculaTotal = new javax.swing.JMenuItem();
        fechaCaixa = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setResizable(false);

        jPanelTitulo.setBackground(new java.awt.Color(0, 102, 153));
        jPanelTitulo.setForeground(new java.awt.Color(0, 102, 153));
        jPanelTitulo.setPreferredSize(new java.awt.Dimension(394, 56));

        jLtitulo.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        jLtitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLtitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLtitulo.setText("Ponto de Venda");
        jPanelTitulo.add(jLtitulo);

        jPanelMeio.setPreferredSize(new java.awt.Dimension(800, 530));
        jPanelMeio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Find.png"))); // NOI18N
        Cliente.setActionCommand("0");
        Cliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Cliente.setPreferredSize(new java.awt.Dimension(5, 19));
        Cliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClienteActionPerformed(evt);
            }
        });
        jPanelMeio.add(Cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 263, 50, 30));

        Total.setEnabled(false);
        jPanelMeio.add(Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(748, 407, 412, 67));

        NomeCliente.setActionCommand("1");
        NomeCliente.setEnabled(false);
        jPanelMeio.add(NomeCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 265, 336, -1));

        idCliente.setActionCommand("1");
        idCliente.setEnabled(false);
        jPanelMeio.add(idCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 265, 80, -1));

        try {
            DataDeEmissao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        DataDeEmissao.setEnabled(false);
        DataDeEmissao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataDeEmissaoActionPerformed(evt);
            }
        });
        jPanelMeio.add(DataDeEmissao, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 160, -1));

        jLabelIdCliente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelIdCliente.setText("ID Cliente");
        jPanelMeio.add(jLabelIdCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 242, -1, -1));

        jLabelDataDeEmissao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelDataDeEmissao.setText("Data de Emissão");
        jPanelMeio.add(jLabelDataDeEmissao, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 421, -1, -1));

        try {
            HoraDeEmissao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        HoraDeEmissao.setEnabled(false);
        HoraDeEmissao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HoraDeEmissaoActionPerformed(evt);
            }
        });
        jPanelMeio.add(HoraDeEmissao, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 450, 160, -1));

        jLabelHoraDeEmissao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelHoraDeEmissao.setText("Hora de Emissão");
        jPanelMeio.add(jLabelHoraDeEmissao, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 421, -1, -1));

        jLabelNomeCliente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelNomeCliente.setText("Nome Cliente");
        jPanelMeio.add(jLabelNomeCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 242, -1, -1));

        jLabelCodigoBarra.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelCodigoBarra.setText("Codígo de Barra");
        jPanelMeio.add(jLabelCodigoBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 11, -1, -1));

        CodigoBarra.setActionCommand("0");
        CodigoBarra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodigoBarraActionPerformed(evt);
            }
        });
        jPanelMeio.add(CodigoBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 34, 1113, 45));

        jLabelProduto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelProduto.setText("Quantidade");
        jPanelMeio.add(jLabelProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(536, 92, -1, -1));

        Quantidade.setActionCommand("1");
        Quantidade.setEnabled(false);
        Quantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuantidadeActionPerformed(evt);
            }
        });
        jPanelMeio.add(Quantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(536, 111, 74, 45));

        Observacao.setActionCommand("1");
        Observacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ObservacaoActionPerformed(evt);
            }
        });
        jPanelMeio.add(Observacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 329, 450, 80));

        jLabelObs.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelObs.setText("Observação");
        jPanelMeio.add(jLabelObs, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        TabelaListaProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Produto", "Valor", "Quantidade", "Status"
            }
        ));
        jScrollPane1.setViewportView(TabelaListaProduto);

        jPanelMeio.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 92, 510, 303));

        valorUnitario.setActionCommand("0");
        valorUnitario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorUnitarioActionPerformed(evt);
            }
        });
        jPanelMeio.add(valorUnitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 185, 450, 45));

        jLabelValorUnitario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelValorUnitario.setText("Valor Unitario");
        jPanelMeio.add(jLabelValorUnitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 162, -1, -1));

        ProdutoNome1.setActionCommand("1");
        ProdutoNome1.setEnabled(false);
        jPanelMeio.add(ProdutoNome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 111, 450, 45));

        jLabelProduto1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelProduto1.setText("Produto");
        jPanelMeio.add(jLabelProduto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 92, -1, -1));

        idFuncionario.setActionCommand("1");
        idFuncionario.setEnabled(false);
        idFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idFuncionarioActionPerformed(evt);
            }
        });
        jPanelMeio.add(idFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 446, 80, -1));

        jLabelIdFuncionario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelIdFuncionario.setText("ID Cliente");
        jPanelMeio.add(jLabelIdFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 411, -1, -1));

        jPanelFim.setBackground(new java.awt.Color(0, 102, 153));
        jPanelFim.setForeground(new java.awt.Color(0, 102, 153));
        jPanelFim.setPreferredSize(new java.awt.Dimension(631, 55));
        jPanelFim.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ler Codigo [F2]");
        jPanelFim.add(jLabel1);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Add Item [F3]");
        jPanelFim.add(jLabel2);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cancela Item [F4]");
        jPanelFim.add(jLabel3);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Calcular Total [ F5 ]");
        jPanelFim.add(jLabel4);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Fechar Caixa [ F6 ]");
        jPanelFim.add(jLabel5);

        jMenuBar1.setFocusable(false);

        Comandos.setBackground(new java.awt.Color(0, 102, 153));

        lerCodigoBarra.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        lerCodigoBarra.setText("lerCodigoBarra");
        lerCodigoBarra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lerCodigoBarraActionPerformed(evt);
            }
        });
        Comandos.add(lerCodigoBarra);

        passaInfo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        passaInfo.setText("passaInfo");
        Comandos.add(passaInfo);

        cancelaItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        cancelaItem.setText("cancelaItem");
        cancelaItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelaItemActionPerformed(evt);
            }
        });
        Comandos.add(cancelaItem);

        calculaTotal.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        calculaTotal.setText("calculaTotal");
        calculaTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculaTotalActionPerformed(evt);
            }
        });
        Comandos.add(calculaTotal);

        fechaCaixa.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, 0));
        fechaCaixa.setText("fechaCaixa");
        Comandos.add(fechaCaixa);

        jMenuBar1.add(Comandos);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFim, javax.swing.GroupLayout.DEFAULT_SIZE, 1181, Short.MAX_VALUE)
            .addComponent(jPanelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelMeio, javax.swing.GroupLayout.DEFAULT_SIZE, 1169, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelMeio, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jPanelFim, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DataDeEmissaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataDeEmissaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DataDeEmissaoActionPerformed

    private void HoraDeEmissaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HoraDeEmissaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HoraDeEmissaoActionPerformed

    private void CodigoBarraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodigoBarraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CodigoBarraActionPerformed

    private void ObservacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ObservacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ObservacaoActionPerformed

    private void valorUnitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorUnitarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorUnitarioActionPerformed

    private void lerCodigoBarraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lerCodigoBarraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lerCodigoBarraActionPerformed

    private void QuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QuantidadeActionPerformed

    private void cancelaItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelaItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelaItemActionPerformed

    private void calculaTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculaTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_calculaTotalActionPerformed

    private void idFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idFuncionarioActionPerformed

    private void ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClienteActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_ClienteActionPerformed

   


    
    
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
            java.util.logging.Logger.getLogger(PontoDeVendaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PontoDeVendaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PontoDeVendaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PontoDeVendaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PontoDeVendaView dialog = new PontoDeVendaView(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cliente;
    private javax.swing.JTextField CodigoBarra;
    private javax.swing.JMenu Comandos;
    private javax.swing.JFormattedTextField DataDeEmissao;
    private javax.swing.JFormattedTextField HoraDeEmissao;
    private javax.swing.JTextField NomeCliente;
    private javax.swing.JTextField Observacao;
    private javax.swing.JTextField ProdutoNome1;
    private javax.swing.JTextField Quantidade;
    private javax.swing.JTable TabelaListaProduto;
    private javax.swing.JTextField Total;
    private javax.swing.JMenuItem calculaTotal;
    private javax.swing.JMenuItem cancelaItem;
    private javax.swing.JMenuItem fechaCaixa;
    private javax.swing.JTextField idCliente;
    private javax.swing.JTextField idFuncionario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelCodigoBarra;
    private javax.swing.JLabel jLabelDataDeEmissao;
    private javax.swing.JLabel jLabelHoraDeEmissao;
    private javax.swing.JLabel jLabelIdCliente;
    private javax.swing.JLabel jLabelIdFuncionario;
    private javax.swing.JLabel jLabelNomeCliente;
    private javax.swing.JLabel jLabelObs;
    private javax.swing.JLabel jLabelProduto;
    private javax.swing.JLabel jLabelProduto1;
    private javax.swing.JLabel jLabelValorUnitario;
    private javax.swing.JLabel jLtitulo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanelFim;
    private javax.swing.JPanel jPanelMeio;
    private javax.swing.JPanel jPanelTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem lerCodigoBarra;
    private javax.swing.JMenuItem passaInfo;
    private javax.swing.JTextField valorUnitario;
    // End of variables declaration//GEN-END:variables
}
