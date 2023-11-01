/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.Cadastro;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import view.Busca.EnderecoView;

/**
 *
 * @author aluno
 */
public class CadastroPessoaView extends javax.swing.JDialog {
    
    /**
     * Creates new form CadastroPessoaView
     */
    public CadastroPessoaView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        
        initComponents();
        
    }

    public JButton getjButton1() {
        return jButton1;
    }

    public void setjButton1(JButton jButton1) {
        this.jButton1 = jButton1;
    }

    public JButton getjButtonBuscar() {
        return jButtonBuscar;
    }

    public void setjButtonBuscar(JButton jButtonBuscar) {
        this.jButtonBuscar = jButtonBuscar;
    }

    public JButton getjButtonCancelar() {
        return jButtonCancelar;
    }

    public void setjButtonCancelar(JButton jButtonCancelar) {
        this.jButtonCancelar = jButtonCancelar;
    }

    public JButton getjButtonEndereco() {
        return jButtonEndereco;
    }

    public void setjButtonEndereco(JButton jButtonEndereco) {
        this.jButtonEndereco = jButtonEndereco;
    }

    public JButton getjButtonGravar() {
        return jButtonGravar;
    }

    public void setjButtonGravar(JButton jButtonGravar) {
        this.jButtonGravar = jButtonGravar;
    }

    public JButton getjButtonNovo() {
        return jButtonNovo;
    }

    public void setjButtonNovo(JButton jButtonNovo) {
        this.jButtonNovo = jButtonNovo;
    }

    public JButton getjButtonSair() {
        return jButtonSair;
    }

    public void setjButtonSair(JButton jButtonSair) {
        this.jButtonSair = jButtonSair;
    }

    public JComboBox<String> getjComboBox1() {
        return jComboBox1;
    }

    public void setjComboBox1(JComboBox<String> jComboBox1) {
        this.jComboBox1 = jComboBox1;
    }

    public JTextField getjTextFieldLogradouro() {
        return jTextFieldLogradouro;
    }

    public void setjTextFieldLogradouro(JTextField jTextFieldLogradouro) {
        this.jTextFieldLogradouro = jTextFieldLogradouro;
    }

    public JFormattedTextField getjFormattedTextFieldCEP() {
        return jFormattedTextFieldCEP;
    }

    public void setjFormattedTextFieldCEP(JFormattedTextField jFormattedTextFieldCEP) {
        this.jFormattedTextFieldCEP = jFormattedTextFieldCEP;
    }

    public JComboBox<String> getjComboBoxTipoCadastro() {
        return jComboBoxTipoCadastro;
    }

    public void setjComboBoxTipoCadastro(JComboBox<String> jComboBoxTipoCadastro) {
        this.jComboBoxTipoCadastro = jComboBoxTipoCadastro;
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

    public JFormattedTextField getjFormattedTextFieldCNPJ() {
        return jFormattedTextFieldCNPJ;
    }

    public void setjFormattedTextFieldCNPJ(JFormattedTextField jFormattedTextFieldCNPJ) {
        this.jFormattedTextFieldCNPJ = jFormattedTextFieldCNPJ;
    }

    public JFormattedTextField getjFormattedTextFieldCPF1() {
        return jFormattedTextFieldCPF1;
    }

    public void setjFormattedTextFieldCPF1(JFormattedTextField jFormattedTextFieldCPF1) {
        this.jFormattedTextFieldCPF1 = jFormattedTextFieldCPF1;
    }

    public JFormattedTextField getjFormattedTextFieldDataNasc() {
        return jFormattedTextFieldDataNasc;
    }

    public void setjFormattedTextFieldDataNasc(JFormattedTextField jFormattedTextFieldDataNasc) {
        this.jFormattedTextFieldDataNasc = jFormattedTextFieldDataNasc;
    }

    public JFormattedTextField getjFormattedTextFieldFone() {
        return jFormattedTextFieldFone;
    }

    public void setjFormattedTextFieldFone(JFormattedTextField jFormattedTextFieldFone) {
        this.jFormattedTextFieldFone = jFormattedTextFieldFone;
    }

    public JFormattedTextField getjFormattedTextFieldFone2() {
        return jFormattedTextFieldFone2;
    }

    public void setjFormattedTextFieldFone2(JFormattedTextField jFormattedTextFieldFone2) {
        this.jFormattedTextFieldFone2 = jFormattedTextFieldFone2;
    }

    public JPasswordField getjPasswordSenha() {
        return jPasswordSenha;
    }

    public void setjPasswordSenha(JPasswordField jPasswordSenha) {
        this.jPasswordSenha = jPasswordSenha;
    }

    public JTextField getjTextFieldComplemento() {
        return jTextFieldComplemento;
    }

    public void setjTextFieldComplemento(JTextField jTextFieldComplemento) {
        this.jTextFieldComplemento = jTextFieldComplemento;
    }

    public JTextField getjTextFieldEmail() {
        return jTextFieldEmail;
    }

    public void setjTextFieldEmail(JTextField jTextFieldEmail) {
        this.jTextFieldEmail = jTextFieldEmail;
    }

    public JTextField getjTextFieldID() {
        return jTextFieldID;
    }

    public void setjTextFieldID(JTextField jTextFieldID) {
        this.jTextFieldID = jTextFieldID;
    }

    public JTextField getjTextFieldInscricaoEstadual() {
        return jTextFieldInscricaoEstadual;
    }

    public void setjTextFieldInscricaoEstadual(JTextField jTextFieldInscricaoEstadual) {
        this.jTextFieldInscricaoEstadual = jTextFieldInscricaoEstadual;
    }

    public JTextField getjTextFieldMatricula() {
        return jTextFieldMatricula;
    }

    public void setjTextFieldMatricula(JTextField jTextFieldMatricula) {
        this.jTextFieldMatricula = jTextFieldMatricula;
    }

    public JTextField getjTextFieldNome() {
        return jTextFieldNome;
    }

    public void setjTextFieldNome(JTextField jTextFieldNome) {
        this.jTextFieldNome = jTextFieldNome;
    }


    public JTextField getjTextFieldRazaoSocial() {
        return jTextFieldRazaoSocial;
    }

    public void setjTextFieldRazaoSocial(JTextField jTextFieldRazaoSocial) {
        this.jTextFieldRazaoSocial = jTextFieldRazaoSocial;
    }

    public JTextField getjTextFieldUsuario() {
        return jTextFieldUsuario;
    }

    public void setjTextFieldUsuario(JTextField jTextFieldUsuario) {
        this.jTextFieldUsuario = jTextFieldUsuario;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JFormattedTextField getjFormatedFieldRG1() {
        return jFormatedFieldRG1;
    }

    public void setjFormattedTextFieldRG1(JFormattedTextField jFormattedTextFieldRG1) {
        this.jFormatedFieldRG1 = jFormattedTextFieldRG1;
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTitulo = new javax.swing.JPanel();
        jLtitulo = new javax.swing.JLabel();
        jPanelMeio = new javax.swing.JPanel();
        jButtonEndereco = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldLogradouro = new javax.swing.JTextField();
        jFormattedTextFieldCEP = new javax.swing.JFormattedTextField();
        jLabelID = new javax.swing.JLabel();
        jLabelTipoCadastro = new javax.swing.JLabel();
        jComboBoxTipoCadastro = new javax.swing.JComboBox<>();
        jFormatedFieldRG1 = new javax.swing.JFormattedTextField();
        jLabelComplemento1 = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelNome = new javax.swing.JLabel();
        jLabelFone1 = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabelEmail = new javax.swing.JLabel();
        jLabelFone2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabelStatus = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabelEndereco = new javax.swing.JLabel();
        jLabelComplemento = new javax.swing.JLabel();
        jLabelCPF = new javax.swing.JLabel();
        jLabelCPF1 = new javax.swing.JLabel();
        jTextFieldMatricula = new javax.swing.JTextField();
        jLabelMatricula = new javax.swing.JLabel();
        jLabelDatadeNascimento = new javax.swing.JLabel();
        jLabelCNPJ = new javax.swing.JLabel();
        jLabelInscricaoEstadual = new javax.swing.JLabel();
        jTextFieldInscricaoEstadual = new javax.swing.JTextField();
        jLabelRazaoSocial = new javax.swing.JLabel();
        jTextFieldRazaoSocial = new javax.swing.JTextField();
        jLabelUsuario = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jPasswordSenha = new javax.swing.JPasswordField();
        jLabelSenha = new javax.swing.JLabel();
        jTextFieldComplemento = new javax.swing.JTextField();
        jFormattedTextFieldFone = new javax.swing.JFormattedTextField();
        jFormattedTextFieldFone2 = new javax.swing.JFormattedTextField();
        jFormattedTextFieldCNPJ = new javax.swing.JFormattedTextField();
        jFormattedTextFieldDataNasc = new javax.swing.JFormattedTextField();
        jFormattedTextFieldCPF1 = new javax.swing.JFormattedTextField();
        jLabelFundoImagem = new javax.swing.JLabel();
        jPanelFim = new javax.swing.JPanel();
        jButtonNovo = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonGravar = new javax.swing.JButton();
        jButtonBuscar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setResizable(false);

        jPanelTitulo.setBackground(new java.awt.Color(0, 102, 153));
        jPanelTitulo.setPreferredSize(new java.awt.Dimension(394, 56));

        jLtitulo.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        jLtitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLtitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLtitulo.setText("Cadastro Pessoa");
        jPanelTitulo.add(jLtitulo);

        jPanelMeio.setPreferredSize(new java.awt.Dimension(800, 530));
        jPanelMeio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonEndereco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Find.png"))); // NOI18N
        jButtonEndereco.setActionCommand("5");
        jButtonEndereco.setPreferredSize(new java.awt.Dimension(5, 19));
        jButtonEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnderecoActionPerformed(evt);
            }
        });
        jPanelMeio.add(jButtonEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 210, 40, 30));

        jLabel1.setBackground(new java.awt.Color(0, 255, 255));
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanelMeio.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 102, 130));

        jTextFieldLogradouro.setActionCommand("5");
        jPanelMeio.add(jTextFieldLogradouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 387, -1));

        try {
            jFormattedTextFieldCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanelMeio.add(jFormattedTextFieldCEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 160, 160, -1));

        jLabelID.setForeground(new java.awt.Color(255, 255, 255));
        jLabelID.setText("ID");
        jPanelMeio.add(jLabelID, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 20, 20));

        jLabelTipoCadastro.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTipoCadastro.setText("Tipo de Cadastro");
        jPanelMeio.add(jLabelTipoCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, -1, 20));

        jComboBoxTipoCadastro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cliente", "Funcionario", "Fornecedor" }));
        jComboBoxTipoCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoCadastroActionPerformed(evt);
            }
        });
        jPanelMeio.add(jComboBoxTipoCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, 80, -1));

        try {
            jFormatedFieldRG1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-###.###.###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormatedFieldRG1.setActionCommand("6");
        jPanelMeio.add(jFormatedFieldRG1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 159, -1));

        jLabelComplemento1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelComplemento1.setText("CEP");
        jPanelMeio.add(jLabelComplemento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 160, -1, 20));

        jTextFieldID.setActionCommand("5");
        jPanelMeio.add(jTextFieldID, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 70, 20));

        jTextFieldNome.setActionCommand("5");
        jPanelMeio.add(jTextFieldNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 387, -1));

        jLabelNome.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNome.setText("Nome");
        jPanelMeio.add(jLabelNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, -1, 20));

        jLabelFone1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFone1.setText("Fone 1");
        jPanelMeio.add(jLabelFone1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 60, -1, 30));
        jPanelMeio.add(jTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 387, -1));

        jLabelEmail.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEmail.setText("Email");
        jPanelMeio.add(jLabelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, -1, 20));

        jLabelFone2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFone2.setText("Fone 2");
        jPanelMeio.add(jLabelFone2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 110, -1, 20));

        jButton1.setText("Adicionar Imagem");
        jButton1.setActionCommand("5");
        jPanelMeio.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        jLabelStatus.setForeground(new java.awt.Color(255, 255, 255));
        jLabelStatus.setText("Status");
        jPanelMeio.add(jLabelStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, -1, 20));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ativo", "Inativo" }));
        jComboBox1.setActionCommand("5");
        jPanelMeio.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 40, 70, -1));

        jLabelEndereco.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEndereco.setText("Endereço");
        jPanelMeio.add(jLabelEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, -1, -1));

        jLabelComplemento.setForeground(new java.awt.Color(255, 255, 255));
        jLabelComplemento.setText("Complemento");
        jPanelMeio.add(jLabelComplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 210, -1, -1));

        jLabelCPF.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCPF.setText("CPF");
        jPanelMeio.add(jLabelCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, -1, -1));

        jLabelCPF1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCPF1.setText("RG");
        jPanelMeio.add(jLabelCPF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, -1, -1));

        jTextFieldMatricula.setActionCommand("6");
        jPanelMeio.add(jTextFieldMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, 159, -1));

        jLabelMatricula.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMatricula.setText("Matricula");
        jPanelMeio.add(jLabelMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, -1, -1));

        jLabelDatadeNascimento.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDatadeNascimento.setText("Data Nasc.");
        jPanelMeio.add(jLabelDatadeNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, -1, -1));

        jLabelCNPJ.setBackground(new java.awt.Color(255, 255, 255));
        jLabelCNPJ.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCNPJ.setText("CNPJ");
        jPanelMeio.add(jLabelCNPJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 290, -1, -1));

        jLabelInscricaoEstadual.setBackground(new java.awt.Color(255, 255, 255));
        jLabelInscricaoEstadual.setForeground(new java.awt.Color(255, 255, 255));
        jLabelInscricaoEstadual.setText("Inscrição Estadual");
        jPanelMeio.add(jLabelInscricaoEstadual, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 390, 90, 20));

        jTextFieldInscricaoEstadual.setActionCommand("7");
        jTextFieldInscricaoEstadual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldInscricaoEstadualActionPerformed(evt);
            }
        });
        jPanelMeio.add(jTextFieldInscricaoEstadual, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 390, 159, -1));

        jLabelRazaoSocial.setBackground(new java.awt.Color(255, 255, 255));
        jLabelRazaoSocial.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRazaoSocial.setText("Razão Social");
        jPanelMeio.add(jLabelRazaoSocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 340, -1, -1));

        jTextFieldRazaoSocial.setActionCommand("7");
        jTextFieldRazaoSocial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRazaoSocialActionPerformed(evt);
            }
        });
        jPanelMeio.add(jTextFieldRazaoSocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 340, 159, -1));

        jLabelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUsuario.setText("Usuario");
        jPanelMeio.add(jLabelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, -1, -1));

        jTextFieldUsuario.setActionCommand("8");
        jPanelMeio.add(jTextFieldUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, 159, -1));

        jPasswordSenha.setActionCommand("8");
        jPanelMeio.add(jPasswordSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 390, 159, -1));

        jLabelSenha.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSenha.setText("Senha");
        jPanelMeio.add(jLabelSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 390, -1, -1));

        jTextFieldComplemento.setActionCommand("5");
        jPanelMeio.add(jTextFieldComplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 210, 159, -1));

        try {
            jFormattedTextFieldFone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldFone.setActionCommand("5");
        jPanelMeio.add(jFormattedTextFieldFone, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 60, 159, -1));

        try {
            jFormattedTextFieldFone2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldFone2.setActionCommand("5");
        jPanelMeio.add(jFormattedTextFieldFone2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 110, 159, -1));

        try {
            jFormattedTextFieldCNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCNPJ.setActionCommand("7");
        jPanelMeio.add(jFormattedTextFieldCNPJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 290, 159, -1));

        try {
            jFormattedTextFieldDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldDataNasc.setActionCommand("6");
        jPanelMeio.add(jFormattedTextFieldDataNasc, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, 159, -1));

        try {
            jFormattedTextFieldCPF1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCPF1.setActionCommand("10");
        jFormattedTextFieldCPF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldCPF1ActionPerformed(evt);
            }
        });
        jPanelMeio.add(jFormattedTextFieldCPF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 159, -1));

        jLabelFundoImagem.setBackground(new java.awt.Color(255, 255, 255));
        jLabelFundoImagem.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFundoImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Design sem nome (1).png"))); // NOI18N
        jPanelMeio.add(jLabelFundoImagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1023, -1));

        jPanelFim.setBackground(new java.awt.Color(0, 102, 153));
        jPanelFim.setForeground(new java.awt.Color(255, 255, 0));
        jPanelFim.setPreferredSize(new java.awt.Dimension(631, 55));

        jButtonNovo.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jButtonNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Create.png"))); // NOI18N
        jButtonNovo.setText("Novo");
        jButtonNovo.setActionCommand("0");
        jButtonNovo.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButtonNovo.setMaximumSize(new java.awt.Dimension(50, 80));
        jButtonNovo.setMinimumSize(new java.awt.Dimension(50, 80));
        jButtonNovo.setName(""); // NOI18N
        jButtonNovo.setPreferredSize(new java.awt.Dimension(120, 50));
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });
        jPanelFim.add(jButtonNovo);

        jButtonCancelar.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Cancel.png"))); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setActionCommand("1");
        jButtonCancelar.setEnabled(false);
        jButtonCancelar.setPreferredSize(new java.awt.Dimension(120, 50));
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        jPanelFim.add(jButtonCancelar);

        jButtonGravar.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jButtonGravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Go.png"))); // NOI18N
        jButtonGravar.setText("Gravar");
        jButtonGravar.setActionCommand("1");
        jButtonGravar.setEnabled(false);
        jButtonGravar.setPreferredSize(new java.awt.Dimension(120, 50));
        jButtonGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGravarActionPerformed(evt);
            }
        });
        jPanelFim.add(jButtonGravar);

        jButtonBuscar.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jButtonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Find.png"))); // NOI18N
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.setActionCommand("0");
        jButtonBuscar.setPreferredSize(new java.awt.Dimension(120, 50));
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });
        jPanelFim.add(jButtonBuscar);

        jButtonSair.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Exit.png"))); // NOI18N
        jButtonSair.setText("Sair");
        jButtonSair.setActionCommand("0");
        jButtonSair.setPreferredSize(new java.awt.Dimension(120, 50));
        jPanelFim.add(jButtonSair);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMeio, javax.swing.GroupLayout.DEFAULT_SIZE, 1083, Short.MAX_VALUE)
            .addComponent(jPanelFim, javax.swing.GroupLayout.DEFAULT_SIZE, 1083, Short.MAX_VALUE)
            .addComponent(jPanelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelMeio, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelFim, javax.swing.GroupLayout.PREFERRED_SIZE, 82, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jTextFieldInscricaoEstadualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldInscricaoEstadualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldInscricaoEstadualActionPerformed

    private void jTextFieldRazaoSocialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRazaoSocialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRazaoSocialActionPerformed

    private void jFormattedTextFieldCPF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldCPF1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldCPF1ActionPerformed

    private void jButtonEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnderecoActionPerformed
     
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEnderecoActionPerformed

    private void jButtonGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGravarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonGravarActionPerformed

    private void jComboBoxTipoCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTipoCadastroActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroPessoaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroPessoaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroPessoaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroPessoaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CadastroPessoaView dialog = new CadastroPessoaView(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEndereco;
    private javax.swing.JButton jButtonGravar;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBoxTipoCadastro;
    private javax.swing.JFormattedTextField jFormatedFieldRG1;
    private javax.swing.JFormattedTextField jFormattedTextFieldCEP;
    private javax.swing.JFormattedTextField jFormattedTextFieldCNPJ;
    private javax.swing.JFormattedTextField jFormattedTextFieldCPF1;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataNasc;
    private javax.swing.JFormattedTextField jFormattedTextFieldFone;
    private javax.swing.JFormattedTextField jFormattedTextFieldFone2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCNPJ;
    private javax.swing.JLabel jLabelCPF;
    private javax.swing.JLabel jLabelCPF1;
    private javax.swing.JLabel jLabelComplemento;
    private javax.swing.JLabel jLabelComplemento1;
    private javax.swing.JLabel jLabelDatadeNascimento;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelEndereco;
    private javax.swing.JLabel jLabelFone1;
    private javax.swing.JLabel jLabelFone2;
    private javax.swing.JLabel jLabelFundoImagem;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelInscricaoEstadual;
    private javax.swing.JLabel jLabelMatricula;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelRazaoSocial;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelStatus;
    private javax.swing.JLabel jLabelTipoCadastro;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JLabel jLtitulo;
    private javax.swing.JPanel jPanelFim;
    private javax.swing.JPanel jPanelMeio;
    private javax.swing.JPanel jPanelTitulo;
    private javax.swing.JPasswordField jPasswordSenha;
    private javax.swing.JTextField jTextFieldComplemento;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldInscricaoEstadual;
    private javax.swing.JTextField jTextFieldLogradouro;
    private javax.swing.JTextField jTextFieldMatricula;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldRazaoSocial;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
