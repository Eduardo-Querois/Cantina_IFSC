/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.Cadastro;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import view.Templates.*;

/**
 *
 * @author aluno
 */
public class CadastroFuncionarioView extends javax.swing.JDialog {
    
    /**
     * Creates new form TemplateCadastro
     */
    public CadastroFuncionarioView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        
        initComponents();
        utilities.Utilities.ativaDesativa(true, jPanelFim);
    }

    public JFormattedTextField getCEP() {
        return CEP;
    }

    public void setCEP(JFormattedTextField CEP) {
        this.CEP = CEP;
    }

    public JFormattedTextField getCPF() {
        return CPF;
    }

    public void setCPF(JFormattedTextField CPF) {
        this.CPF = CPF;
    }

    public JTextField getComplemento() {
        return Complemento;
    }

    public void setComplemento(JTextField Complemento) {
        this.Complemento = Complemento;
    }



    public JTextField getEmail() {
        return Email;
    }

    public void setEmail(JTextField Email) {
        this.Email = Email;
    }

    public JTextField getEnderecoLogradouro() {
        return EnderecoLogradouro;
    }

    public void setEnderecoLogradouro(JTextField Endereco) {
        this.EnderecoLogradouro = Endereco;
    }

    public JTextField getID() {
        return ID;
    }

    public void setID(JTextField ID) {
        this.ID = ID;
    }

 

    public JTextField getNome() {
        return Nome;
    }

    public void setNome(JTextField Nome) {
        this.Nome = Nome;
    }

    public JFormattedTextField getRG() {
        return RG;
    }

    public void setRG(JFormattedTextField RG) {
        this.RG = RG;
    }

    public JComboBox<String> getStatus() {
        return Status;
    }

    public void setStatus(JComboBox<String> Status) {
        this.Status = Status;
    }

    public JFormattedTextField getCelular() {
        return Celular;
    }

    public void setCelular(JFormattedTextField Celular) {
        this.Celular = Celular;
    }

    public JFormattedTextField getTelefone() {
        return Telefone;
    }

    public void setTelefone(JFormattedTextField Telefone) {
        this.Telefone = Telefone;
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

    public JPasswordField getSenha() {
        return Senha;
    }

    public void setSenha(JPasswordField Senha) {
        this.Senha = Senha;
    }

    public JTextField getUsuario() {
        return Usuario;
    }

    public void setUsuario(JTextField Usuario) {
        this.Usuario = Usuario;
    }

    public JButton getjButtonCadastroEndereco1() {
        return jButtonCadastroEndereco1;
    }

    public void setjButtonCadastroEndereco1(JButton jButtonCadastroEndereco1) {
        this.jButtonCadastroEndereco1 = jButtonCadastroEndereco1;
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
        Nome = new javax.swing.JTextField();
        Email = new javax.swing.JTextField();
        EnderecoLogradouro = new javax.swing.JTextField();
        jLabelEmail = new javax.swing.JLabel();
        jLabelEndereco = new javax.swing.JLabel();
        jLabelID = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        Status = new javax.swing.JComboBox<>();
        CPF = new javax.swing.JFormattedTextField();
        CEP = new javax.swing.JFormattedTextField();
        Telefone = new javax.swing.JFormattedTextField();
        Celular = new javax.swing.JFormattedTextField();
        jLabelCPF = new javax.swing.JLabel();
        jLabelStaus = new javax.swing.JLabel();
        jLabelCelular = new javax.swing.JLabel();
        jLabelCEP = new javax.swing.JLabel();
        jLabelTelefone = new javax.swing.JLabel();
        jLabelNome1 = new javax.swing.JLabel();
        RG = new javax.swing.JFormattedTextField();
        jLabelRG = new javax.swing.JLabel();
        Complemento = new javax.swing.JTextField();
        jButtonEndereco = new javax.swing.JButton();
        jLabelComplemento = new javax.swing.JLabel();
        Senha = new javax.swing.JPasswordField();
        jLabelSenha = new javax.swing.JLabel();
        Usuario = new javax.swing.JTextField();
        jLabelUsuario = new javax.swing.JLabel();
        jButtonCadastroEndereco1 = new javax.swing.JButton();
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
        jPanelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jPanelTitulo.setPreferredSize(new java.awt.Dimension(394, 56));

        jLtitulo.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        jLtitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLtitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLtitulo.setText("Cadastro de Funcionario");
        jPanelTitulo.add(jLtitulo);

        jPanelMeio.setPreferredSize(new java.awt.Dimension(800, 530));

        Nome.setActionCommand("5");
        Nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeActionPerformed(evt);
            }
        });

        EnderecoLogradouro.setActionCommand("5");

        jLabelEmail.setText("Email");

        jLabelEndereco.setText("Endereço");

        jLabelID.setText("ID");

        ID.setActionCommand("5");
        ID.setName("id"); // NOI18N

        Status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ativo", "Inativo" }));
        Status.setActionCommand("5");
        Status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatusActionPerformed(evt);
            }
        });

        try {
            CPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        CPF.setActionCommand("10");
        CPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CPFActionPerformed(evt);
            }
        });

        try {
            CEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        CEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CEPActionPerformed(evt);
            }
        });

        try {
            Telefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        Telefone.setActionCommand("5");

        try {
            Celular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        Celular.setActionCommand("5");

        jLabelCPF.setText("CPF");

        jLabelStaus.setText("Status");

        jLabelCelular.setText("Celular");

        jLabelCEP.setText("CEP");

        jLabelTelefone.setText("Telefone");

        jLabelNome1.setText("Nome");

        try {
            RG.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-###.###.###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        RG.setActionCommand("6");

        jLabelRG.setText("RG");

        Complemento.setActionCommand("5");
        Complemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComplementoActionPerformed(evt);
            }
        });

        jButtonEndereco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Find.png"))); // NOI18N
        jButtonEndereco.setActionCommand("5");
        jButtonEndereco.setPreferredSize(new java.awt.Dimension(5, 19));
        jButtonEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnderecoActionPerformed(evt);
            }
        });

        jLabelComplemento.setText("Complemento");

        Senha.setActionCommand("8");

        jLabelSenha.setText("Senha");

        Usuario.setActionCommand("8");

        jLabelUsuario.setText("Usuario");

        jButtonCadastroEndereco1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/New.png"))); // NOI18N
        jButtonCadastroEndereco1.setActionCommand("5");
        jButtonCadastroEndereco1.setPreferredSize(new java.awt.Dimension(5, 19));

        javax.swing.GroupLayout jPanelMeioLayout = new javax.swing.GroupLayout(jPanelMeio);
        jPanelMeio.setLayout(jPanelMeioLayout);
        jPanelMeioLayout.setHorizontalGroup(
            jPanelMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMeioLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanelMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelEndereco)
                    .addComponent(jLabelID, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelNome1)
                        .addComponent(jLabelEmail)))
                .addGap(18, 18, 18)
                .addGroup(jPanelMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMeioLayout.createSequentialGroup()
                        .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                        .addComponent(jLabelTelefone)
                        .addGap(18, 18, 18)
                        .addComponent(Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMeioLayout.createSequentialGroup()
                        .addComponent(EnderecoLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCadastroEndereco1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelCEP)
                        .addGap(18, 18, 18)
                        .addComponent(CEP, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMeioLayout.createSequentialGroup()
                        .addGroup(jPanelMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelStaus)
                            .addComponent(jLabelCelular))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Celular)
                            .addComponent(Status, 0, 159, Short.MAX_VALUE))
                        .addGap(124, 124, 124))))
            .addGroup(jPanelMeioLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanelMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelMeioLayout.createSequentialGroup()
                        .addComponent(jLabelUsuario)
                        .addGap(20, 20, 20)
                        .addComponent(Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelMeioLayout.createSequentialGroup()
                        .addComponent(jLabelComplemento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Complemento, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelMeioLayout.createSequentialGroup()
                        .addComponent(jLabelCPF)
                        .addGap(10, 10, 10)
                        .addComponent(CPF, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addGroup(jPanelMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelMeioLayout.createSequentialGroup()
                        .addComponent(jLabelRG)
                        .addGap(25, 25, 25)
                        .addComponent(RG, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelMeioLayout.createSequentialGroup()
                        .addComponent(jLabelSenha)
                        .addGap(18, 18, 18)
                        .addComponent(Senha, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelMeioLayout.setVerticalGroup(
            jPanelMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMeioLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanelMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelID, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelStaus, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanelMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Celular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNome1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 39, Short.MAX_VALUE)
                .addGroup(jPanelMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonCadastroEndereco1, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addGroup(jPanelMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(EnderecoLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelEndereco)
                        .addComponent(CEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanelMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelComplemento)
                    .addComponent(Complemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanelMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelRG)
                        .addComponent(CPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(RG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelUsuario)
                    .addComponent(Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSenha)
                    .addComponent(Senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );

        jPanelFim.setBackground(new java.awt.Color(0, 102, 153));
        jPanelFim.setForeground(new java.awt.Color(255, 255, 255));
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
            .addComponent(jPanelFim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelMeio, javax.swing.GroupLayout.PREFERRED_SIZE, 950, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelMeio, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelFim, javax.swing.GroupLayout.PREFERRED_SIZE, 61, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
     
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
       
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGravarActionPerformed
    
    }//GEN-LAST:event_jButtonGravarActionPerformed

    private void jButtonEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnderecoActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEnderecoActionPerformed

    private void CPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CPFActionPerformed

    private void NomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomeActionPerformed

    private void StatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StatusActionPerformed

    private void CEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CEPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CEPActionPerformed

    private void ComplementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComplementoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComplementoActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroFuncionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                CadastroFuncionarioView dialog = new CadastroFuncionarioView(new javax.swing.JFrame(), true);
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
    private javax.swing.JFormattedTextField CEP;
    private javax.swing.JFormattedTextField CPF;
    private javax.swing.JFormattedTextField Celular;
    private javax.swing.JTextField Complemento;
    private javax.swing.JTextField Email;
    private javax.swing.JTextField EnderecoLogradouro;
    private javax.swing.JTextField ID;
    private javax.swing.JTextField Nome;
    private javax.swing.JFormattedTextField RG;
    private javax.swing.JPasswordField Senha;
    private javax.swing.JComboBox<String> Status;
    private javax.swing.JFormattedTextField Telefone;
    private javax.swing.JTextField Usuario;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonCadastroEndereco1;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEndereco;
    private javax.swing.JButton jButtonGravar;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabelCEP;
    private javax.swing.JLabel jLabelCPF;
    private javax.swing.JLabel jLabelCelular;
    private javax.swing.JLabel jLabelComplemento;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelEndereco;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelNome1;
    private javax.swing.JLabel jLabelRG;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelStaus;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JLabel jLtitulo;
    private javax.swing.JPanel jPanelFim;
    private javax.swing.JPanel jPanelMeio;
    private javax.swing.JPanel jPanelTitulo;
    // End of variables declaration//GEN-END:variables
}
