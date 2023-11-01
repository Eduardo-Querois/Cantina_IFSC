/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 
package controller.cadastro;

import static DAO.Persiste.clienteList;
import static DAO.Persiste.enderecoList;
import static DAO.Persiste.fornecedorList;
import static DAO.Persiste.funcionarioList;
import Gambiarras.AtivaDesativaClassePessoa;
import controller.Busca.ControllerBairroView;
import controller.Busca.ControllerEnderecoView;
import controller.Busca.ControllerFornecedorView;
import static java.awt.Color.red;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.Busca.ClienteView;
import view.Busca.EnderecoView;
import view.Cadastro.CadastroPessoaView;
import view.Busca.FuncionarioView;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.plaf.synth.ColorType;
import model.bo.Cliente;
import model.bo.Endereco;
import model.bo.Fornecedor;
import model.bo.Funcionario;
import view.Busca.FornecedorView;
import view.TipoBusca1View;
import Gambiarras.AtivaDesativaClassePessoa;
/**
 *
 * @author joao-
 
public class ControllerCadastroPessoa implements ActionListener {

    //public static int codigo;

    FornecedorView fornecedorView = new FornecedorView(null, true);
    EnderecoView enderecoView = new EnderecoView(null, true);
    ClienteView clienteView = new ClienteView(null, true);
    FuncionarioView funcionarioView = new FuncionarioView(null, true);
    TipoBusca1View tipoBusca1View = new TipoBusca1View(null, true);
    AtivaDesativaClassePessoa ativaDesativaClassePessoa;
    CadastroPessoaView cadastroPessoaView;

    public ControllerCadastroPessoa(CadastroPessoaView cadastroPessoaView) {
        this.cadastroPessoaView = cadastroPessoaView;

        this.cadastroPessoaView.getjButton1().addActionListener(this);
        this.cadastroPessoaView.getjButtonBuscar().addActionListener(this);
        this.cadastroPessoaView.getjButtonCancelar().addActionListener(this);
        this.cadastroPessoaView.getjButtonEndereco().addActionListener(this);
        this.cadastroPessoaView.getjButtonGravar().addActionListener(this);
        this.cadastroPessoaView.getjButtonNovo().addActionListener(this);
        this.cadastroPessoaView.getjButtonSair().addActionListener(this);
        this.cadastroPessoaView.getjComboBox1().addActionListener(this);
        this.cadastroPessoaView.getjComboBoxTipoCadastro().addActionListener(this);

        utilities.Utilities.ativaDesativa(true, this.cadastroPessoaView.getjPanelFim());
        utilities.Utilities.limpaComponentes(false, this.cadastroPessoaView.getjPanelMeio());

    }

    public void ativaDesativaCliente(int numero) {

        if (numero == 0) {
            this.cadastroPessoaView.getjFormattedTextFieldCPF1().setEnabled(true);
            this.cadastroPessoaView.getjFormatedFieldRG1().setEnabled(true);
            this.cadastroPessoaView.getjTextFieldRazaoSocial().setEnabled(false);
            this.cadastroPessoaView.getjTextFieldInscricaoEstadual().setEnabled(false);
            this.cadastroPessoaView.getjFormattedTextFieldCNPJ().setEnabled(false);
            this.cadastroPessoaView.getjTextFieldMatricula().setEnabled(true);
            this.cadastroPessoaView.getjFormattedTextFieldDataNasc().setEnabled(true);
            this.cadastroPessoaView.getjTextFieldUsuario().setEnabled(false);
            this.cadastroPessoaView.getjPasswordSenha().setEnabled(false);

        } else if (numero == 1) {
            this.cadastroPessoaView.getjFormattedTextFieldCPF1().setEnabled(true);
            this.cadastroPessoaView.getjFormatedFieldRG1().setEnabled(true);
            this.cadastroPessoaView.getjTextFieldRazaoSocial().setEnabled(false);
            this.cadastroPessoaView.getjTextFieldInscricaoEstadual().setEnabled(false);
            this.cadastroPessoaView.getjFormattedTextFieldCNPJ().setEnabled(false);
            this.cadastroPessoaView.getjTextFieldMatricula().setEnabled(false);
            this.cadastroPessoaView.getjFormattedTextFieldDataNasc().setEnabled(false);
            this.cadastroPessoaView.getjTextFieldUsuario().setEnabled(true);
            this.cadastroPessoaView.getjPasswordSenha().setEnabled(true);

        } else if (numero == 2) {
            this.cadastroPessoaView.getjFormattedTextFieldCPF1().setEnabled(false);
            this.cadastroPessoaView.getjFormatedFieldRG1().setEnabled(false);
            this.cadastroPessoaView.getjTextFieldRazaoSocial().setEnabled(true);
            this.cadastroPessoaView.getjTextFieldInscricaoEstadual().setEnabled(true);
            this.cadastroPessoaView.getjFormattedTextFieldCNPJ().setEnabled(true);
            this.cadastroPessoaView.getjTextFieldMatricula().setEnabled(false);
            this.cadastroPessoaView.getjFormattedTextFieldDataNasc().setEnabled(false);
            this.cadastroPessoaView.getjTextFieldUsuario().setEnabled(false);
            this.cadastroPessoaView.getjPasswordSenha().setEnabled(false);

        }

    }

    
    
    
    
    public void limpaImagem() {
        this.cadastroPessoaView.getjLabel1().setIcon(null);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == this.cadastroPessoaView.getjButtonNovo()) {
            utilities.Utilities.ativaDesativa(false, this.cadastroPessoaView.getjPanelFim());
            utilities.Utilities.limpaComponentes(true, this.cadastroPessoaView.getjPanelMeio());
            this.cadastroPessoaView.getjTextFieldID().setEnabled(false);

        } else if (e.getSource() == this.cadastroPessoaView.getjButtonSair()) {
            this.cadastroPessoaView.dispose();

        } else if (e.getSource() == this.cadastroPessoaView.getjButtonCancelar()) {
            utilities.Utilities.ativaDesativa(true, this.cadastroPessoaView.getjPanelFim());
            utilities.Utilities.limpaComponentes(false, this.cadastroPessoaView.getjPanelMeio());
            limpaImagem();

        } else if (e.getSource() == this.cadastroPessoaView.getjComboBoxTipoCadastro()) {
            int tipoCadastro = this.cadastroPessoaView.getjComboBoxTipoCadastro().getSelectedIndex();
            ativaDesativaCliente(tipoCadastro);
           
           
           
           
           
        } else if (e.getSource() == this.cadastroPessoaView.getjButtonBuscar()) {

            TipoBusca1View tipoBusca1View = new TipoBusca1View(null, true);
            ControllerTipoDeBuscaView controllerTipoDeBuscaView = new ControllerTipoDeBuscaView(tipoBusca1View);
            tipoBusca1View.setVisible(true);

            if (tipoBusca1View.getjComboBox1().getSelectedIndex() == 2) {
                utilities.Utilities.limpaComponentes(true, this.cadastroPessoaView.getjPanelMeio());
                FornecedorView fornecedorView = new FornecedorView(null, true);

                if (codigo != 0) {
                    Fornecedor fornecedor = new Fornecedor();
                    fornecedor = DAO.Persiste.fornecedorList.get(codigo - 1);

                    this.cadastroPessoaView.getjTextFieldID().setText(fornecedor.getId() + " ");
                    this.cadastroPessoaView.getjTextFieldNome().setText(fornecedor.getNome() + " ");
                    this.cadastroPessoaView.getjTextFieldRazaoSocial().setText(fornecedor.getRazaoSocial() + " ");
                    this.cadastroPessoaView.getjFormattedTextFieldCNPJ().setText(fornecedor.getCnpj() + " ");
                    this.cadastroPessoaView.getjTextFieldInscricaoEstadual().setText(fornecedor.getInscricaoEstadual() + " ");
                    this.cadastroPessoaView.getjFormattedTextFieldFone().setText(fornecedor.getFone1() + " ");
                    this.cadastroPessoaView.getjFormattedTextFieldFone2().setText(fornecedor.getFone2() + " ");
                    this.cadastroPessoaView.getjTextFieldEmail().setText(fornecedor.getEmail() + " ");
                    this.cadastroPessoaView.getjComboBox1().setSelectedItem(fornecedor.getStatus().toString() + " ");
                    this.cadastroPessoaView.getjTextFieldLogradouro().setText(fornecedor.getEndereco().getLogradouro() + " ");
                    this.cadastroPessoaView.getjFormattedTextFieldCEP().setText(fornecedor.getEndereco().getCep() + " ");
                    this.cadastroPessoaView.getjTextFieldComplemento().setText(fornecedor.getComplementoEndereco() + " ");

                }

            }
            if (tipoBusca1View.getjComboBox1().getSelectedIndex() == 1) {
                FuncionarioView funcionarioView = new FuncionarioView(null, true);
                utilities.Utilities.limpaComponentes(true, this.cadastroPessoaView.getjPanelMeio());
                if (codigo != 0) {
                    Funcionario funcionario = new Funcionario();
                    funcionario = DAO.Persiste.funcionarioList.get(codigo - 1);

                    this.cadastroPessoaView.getjTextFieldID().setText(funcionario.getId() + " ");
                    this.cadastroPessoaView.getjTextFieldNome().setText(funcionario.getNome() + " ");
                    this.cadastroPessoaView.getjFormattedTextFieldCPF1().setText(funcionario.getCpf() + " ");
                    this.cadastroPessoaView.getjFormatedFieldRG1().setText(funcionario.getRg() + " ");
                    this.cadastroPessoaView.getjTextFieldUsuario().setText(funcionario.getUsuario() + " ");
                    this.cadastroPessoaView.getjPasswordSenha().setText(funcionario.getSenha() + " ");
                    this.cadastroPessoaView.getjFormattedTextFieldFone().setText(funcionario.getFone1() + " ");
                    this.cadastroPessoaView.getjFormattedTextFieldFone2().setText(funcionario.getFone2() + " ");
                    this.cadastroPessoaView.getjTextFieldEmail().setText(funcionario.getEmail() + " ");
                    this.cadastroPessoaView.getjComboBox1().setSelectedItem(funcionario.getStatus().toString() + " ");
                    this.cadastroPessoaView.getjTextFieldComplemento().setText(funcionario.getComplementoEndereco() + " ");
                    this.cadastroPessoaView.getjTextFieldLogradouro().setText(funcionario.getEndereco().getLogradouro() + " ");
                    this.cadastroPessoaView.getjFormattedTextFieldCEP().setText(funcionario.getEndereco().getCep() + " ");

                }

            }

            if (tipoBusca1View.getjComboBox1().getSelectedIndex() == 0) {
                ClienteView clienteView = new ClienteView(null, true);
                utilities.Utilities.limpaComponentes(true, this.cadastroPessoaView.getjPanelMeio());
                if (codigo != 0) {
                    Cliente cliente = new Cliente();
                    cliente = DAO.Persiste.clienteList.get(codigo - 1);

                    this.cadastroPessoaView.getjTextFieldID().setText(cliente.getId() + " ");
                    this.cadastroPessoaView.getjTextFieldMatricula().setText(cliente.getMatricula() + " ");
                    this.cadastroPessoaView.getjTextFieldNome().setText(cliente.getNome() + " ");
                    this.cadastroPessoaView.getjFormattedTextFieldCPF1().setText(cliente.getCpf() + " ");
                    this.cadastroPessoaView.getjFormatedFieldRG1().setText(cliente.getRg() + " ");
                    this.cadastroPessoaView.getjFormattedTextFieldDataNasc().setText(cliente.getDataNascimento() + " ");
                    this.cadastroPessoaView.getjFormattedTextFieldFone().setText(cliente.getDataNascimento() + " ");
                    this.cadastroPessoaView.getjFormattedTextFieldFone().setText(cliente.getFone1() + " ");
                    this.cadastroPessoaView.getjFormattedTextFieldFone2().setText(cliente.getFone2() + " ");
                    this.cadastroPessoaView.getjTextFieldEmail().setText(cliente.getEmail() + " ");
                    this.cadastroPessoaView.getjComboBox1().setSelectedItem(cliente.getStatus().toString() + " ");
                    this.cadastroPessoaView.getjTextFieldComplemento().setText(cliente.getComplementoEndereco() + " ");
                    this.cadastroPessoaView.getjTextFieldLogradouro().setText(cliente.getEndereco().getLogradouro() + " ");
                    this.cadastroPessoaView.getjFormattedTextFieldCEP().setText(cliente.getEndereco().getCep() + " ");

                }

            }
            utilities.Utilities.ativaDesativa(false, this.cadastroPessoaView.getjPanelFim());
        } else if (e.getSource() == this.cadastroPessoaView.getjButtonGravar()) {
            limpaImagem();

            if (this.cadastroPessoaView.getjComboBoxTipoCadastro().getSelectedIndex() == -1) {
                JOptionPane.showMessageDialog(null, "Selecione Algum Tipo de Cadastro Para Prosseguir!!!");
            }

            if (this.cadastroPessoaView.getjComboBoxTipoCadastro().getSelectedIndex() == 2) {

                String id = this.cadastroPessoaView.getjTextFieldID().getText().trim();
                Fornecedor fornecedor = new Fornecedor();
                Endereco endereco = new Endereco();

                fornecedor.setEndereco(endereco);
                fornecedor.setId(fornecedorList.size() + 1);
                fornecedor.setNome(this.cadastroPessoaView.getjTextFieldNome().getText());
                fornecedor.setRazaoSocial(this.cadastroPessoaView.getjTextFieldRazaoSocial().getText());
                fornecedor.setCnpj(this.cadastroPessoaView.getjFormattedTextFieldCNPJ().getText());
                fornecedor.setInscricaoEstadual(this.cadastroPessoaView.getjTextFieldInscricaoEstadual().getText());
                fornecedor.setFone1(this.cadastroPessoaView.getjFormattedTextFieldFone().getText());
                fornecedor.setFone2(this.cadastroPessoaView.getjFormattedTextFieldFone2().getText());
                fornecedor.setEmail(this.cadastroPessoaView.getjTextFieldEmail().getText());
                fornecedor.setStatus(this.cadastroPessoaView.getjComboBox1().getSelectedItem().toString());
                fornecedor.setComplementoEndereco(this.cadastroPessoaView.getjTextFieldComplemento().getText());
                fornecedor.getEndereco().setLogradouro(this.cadastroPessoaView.getjTextFieldLogradouro().getText());
                fornecedor.getEndereco().setCep(this.cadastroPessoaView.getjFormattedTextFieldCEP().getText());

                if (this.cadastroPessoaView.getjTextFieldID().getText().trim().equalsIgnoreCase("")) {
                    DAO.Persiste.fornecedorList.add(fornecedor);

                } else if (fornecedorList.size() > 0) {
                    if (!fornecedorList.get(Integer.parseInt(id) - 1).getNome().equals(this.cadastroPessoaView.getjTextFieldNome())) {
                        fornecedorList.get(Integer.parseInt(id) - 1).setNome(this.cadastroPessoaView.getjTextFieldNome().getText());
                    }
                    if (!fornecedorList.get(Integer.parseInt(id) - 1).getRazaoSocial().equals(this.cadastroPessoaView.getjTextFieldRazaoSocial())) {
                        fornecedorList.get(Integer.parseInt(id) - 1).setRazaoSocial(this.cadastroPessoaView.getjTextFieldRazaoSocial().getText());
                    }
                    if (!fornecedorList.get(Integer.parseInt(id) - 1).getCnpj().equals(this.cadastroPessoaView.getjFormattedTextFieldCNPJ())) {
                        fornecedorList.get(Integer.parseInt(id) - 1).setCnpj(this.cadastroPessoaView.getjFormattedTextFieldCNPJ().getText());
                    }
                    if (!fornecedorList.get(Integer.parseInt(id) - 1).getInscricaoEstadual().equals(this.cadastroPessoaView.getjTextFieldInscricaoEstadual())) {
                        fornecedorList.get(Integer.parseInt(id) - 1).setInscricaoEstadual(this.cadastroPessoaView.getjTextFieldInscricaoEstadual().getText());
                    }
                    if (!fornecedorList.get(Integer.parseInt(id) - 1).getFone1().equals(this.cadastroPessoaView.getjFormattedTextFieldFone())) {
                        fornecedorList.get(Integer.parseInt(id) - 1).setFone1(this.cadastroPessoaView.getjFormattedTextFieldFone().getText());
                    }
                    if (!fornecedorList.get(Integer.parseInt(id) - 1).getFone2().equals(this.cadastroPessoaView.getjFormattedTextFieldFone2())) {
                        fornecedorList.get(Integer.parseInt(id) - 1).setFone2(this.cadastroPessoaView.getjFormattedTextFieldFone2().getText());
                    }
                    if (!fornecedorList.get(Integer.parseInt(id) - 1).getEmail().equals(this.cadastroPessoaView.getjTextFieldEmail())) {
                        fornecedorList.get(Integer.parseInt(id) - 1).setEmail(this.cadastroPessoaView.getjTextFieldEmail().getText());
                    }
                    if (!fornecedorList.get(Integer.parseInt(id) - 1).getStatus().equals(this.cadastroPessoaView.getjComboBox1().getSelectedItem())) {
                        fornecedorList.get(Integer.parseInt(id) - 1).setStatus(this.cadastroPessoaView.getjComboBox1().getSelectedItem().toString());
                    }
                    if (!fornecedorList.get(Integer.parseInt(id) - 1).getComplementoEndereco().equals(this.cadastroPessoaView.getjTextFieldComplemento())) {
                        fornecedorList.get(Integer.parseInt(id) - 1).setComplementoEndereco(this.cadastroPessoaView.getjTextFieldComplemento().getText());
                    }
                    if (!fornecedorList.get(Integer.parseInt(id) - 1).getEndereco().getLogradouro().equals(this.cadastroPessoaView.getjTextFieldLogradouro())) {
                        fornecedorList.get(Integer.parseInt(id) - 1).getEndereco().setLogradouro(this.cadastroPessoaView.getjTextFieldLogradouro().getText());
                    }
                    if (!fornecedorList.get(Integer.parseInt(id) - 1).getEndereco().getCep().equals(this.cadastroPessoaView.getjFormattedTextFieldCEP())) {
                        fornecedorList.get(Integer.parseInt(id) - 1).getEndereco().setCep(this.cadastroPessoaView.getjFormattedTextFieldCEP().getText());
                    }

                }

                utilities.Utilities.ativaDesativa(true, this.cadastroPessoaView.getjPanelFim());
                utilities.Utilities.limpaComponentes(false, this.cadastroPessoaView.getjPanelMeio());

            }

            if (this.cadastroPessoaView.getjComboBoxTipoCadastro().getSelectedIndex() == 1) {

                String id = this.cadastroPessoaView.getjTextFieldID().getText().trim();
                Funcionario funcionario = new Funcionario();
                Endereco endereco = new Endereco();

                funcionario.setEndereco(endereco);

                funcionario.setId(fornecedorList.size() + 1);
                funcionario.setNome(this.cadastroPessoaView.getjTextFieldNome().getText());
                funcionario.setCpf(this.cadastroPessoaView.getjFormattedTextFieldCPF1().getText());
                funcionario.setRg(this.cadastroPessoaView.getjFormatedFieldRG1().getText());
                funcionario.setUsuario(this.cadastroPessoaView.getjTextFieldUsuario().getText());
                funcionario.setSenha(this.cadastroPessoaView.getjPasswordSenha().toString());
                funcionario.setFone1(this.cadastroPessoaView.getjFormattedTextFieldFone().getText());
                funcionario.setFone2(this.cadastroPessoaView.getjFormattedTextFieldFone2().getText());
                funcionario.setEmail(this.cadastroPessoaView.getjTextFieldEmail().getText());
                funcionario.setStatus(this.cadastroPessoaView.getjComboBox1().getSelectedItem().toString());
                funcionario.setComplementoEndereco(this.cadastroPessoaView.getjTextFieldComplemento().getText());
                funcionario.getEndereco().setLogradouro(this.cadastroPessoaView.getjTextFieldLogradouro().getText());
                funcionario.getEndereco().setCep(this.cadastroPessoaView.getjFormattedTextFieldCEP().getText());

                if (this.cadastroPessoaView.getjTextFieldID().getText().trim().equalsIgnoreCase("")) {
                    DAO.Persiste.funcionarioList.add(funcionario);

                } else if (funcionarioList.size() > 0) {

                    JOptionPane.showMessageDialog(null, "bug da porra");

                    if (!funcionarioList.get(Integer.parseInt(id) - 1).getNome().equals(this.cadastroPessoaView.getjTextFieldNome())) {
                        funcionarioList.get(Integer.parseInt(id) - 1).setNome(this.cadastroPessoaView.getjTextFieldNome().getText());
                    }
                    if (!funcionarioList.get(Integer.parseInt(id) - 1).getCpf().equals(this.cadastroPessoaView.getjFormattedTextFieldCPF1())) {
                        funcionarioList.get(Integer.parseInt(id) - 1).setCpf(this.cadastroPessoaView.getjFormattedTextFieldCPF1().getText());
                    }
                    if (!funcionarioList.get(Integer.parseInt(id) - 1).getRg().equals(this.cadastroPessoaView.getjFormatedFieldRG1())) {
                        funcionarioList.get(Integer.parseInt(id) - 1).setRg(this.cadastroPessoaView.getjFormatedFieldRG1().getText());
                    }
                    if (!funcionarioList.get(Integer.parseInt(id) - 1).getUsuario().equals(this.cadastroPessoaView.getjTextFieldUsuario())) {
                        funcionarioList.get(Integer.parseInt(id) - 1).setUsuario(this.cadastroPessoaView.getjTextFieldUsuario().getText());
                    }
                    if (!funcionarioList.get(Integer.parseInt(id) - 1).getSenha().equals(this.cadastroPessoaView.getjPasswordSenha())) {
                        funcionarioList.get(Integer.parseInt(id) - 1).setSenha(this.cadastroPessoaView.getjPasswordSenha().toString());
                    }
                    if (!funcionarioList.get(Integer.parseInt(id) - 1).getFone1().equals(this.cadastroPessoaView.getjFormattedTextFieldFone())) {
                        funcionarioList.get(Integer.parseInt(id) - 1).setFone1(this.cadastroPessoaView.getjFormattedTextFieldFone().getText());
                    }
                    if (!funcionarioList.get(Integer.parseInt(id) - 1).getFone2().equals(this.cadastroPessoaView.getjFormattedTextFieldFone2())) {
                        funcionarioList.get(Integer.parseInt(id) - 1).setFone2(this.cadastroPessoaView.getjFormattedTextFieldFone2().getText());
                    }
                    if (!funcionarioList.get(Integer.parseInt(id) - 1).getEmail().equals(this.cadastroPessoaView.getjTextFieldEmail())) {
                        funcionarioList.get(Integer.parseInt(id) - 1).setEmail(this.cadastroPessoaView.getjTextFieldEmail().getText());
                    }
                    if (!funcionarioList.get(Integer.parseInt(id) - 1).getStatus().equals(this.cadastroPessoaView.getjComboBox1().getSelectedItem().toString())) {
                        funcionarioList.get(Integer.parseInt(id) - 1).setStatus(this.cadastroPessoaView.getjComboBox1().getSelectedItem().toString());
                    }
                    if (!funcionarioList.get(Integer.parseInt(id) - 1).getComplementoEndereco().equals(this.cadastroPessoaView.getjTextFieldComplemento())) {
                        funcionarioList.get(Integer.parseInt(id) - 1).setComplementoEndereco(this.cadastroPessoaView.getjTextFieldComplemento().getText());
                    }
                    if (!funcionarioList.get(Integer.parseInt(id) - 1).getEndereco().getLogradouro().equals(this.cadastroPessoaView.getjTextFieldLogradouro())) {
                        funcionarioList.get(Integer.parseInt(id) - 1).getEndereco().setLogradouro(this.cadastroPessoaView.getjTextFieldLogradouro().getText());
                    }
                    if (!funcionarioList.get(Integer.parseInt(id) - 1).getEndereco().getCep().equals(this.cadastroPessoaView.getjFormattedTextFieldCEP())) {
                        funcionarioList.get(Integer.parseInt(id) - 1).getEndereco().setCep(this.cadastroPessoaView.getjFormattedTextFieldCEP().getText());

                    }

                }

                utilities.Utilities.ativaDesativa(true, this.cadastroPessoaView.getjPanelFim());
                utilities.Utilities.limpaComponentes(false, this.cadastroPessoaView.getjPanelMeio());
            }

            if (this.cadastroPessoaView.getjComboBoxTipoCadastro().getSelectedIndex() == 0) {

                String id = this.cadastroPessoaView.getjTextFieldID().getText().trim();
                Cliente cliente = new Cliente();
                Endereco endereco = new Endereco();

                cliente.setEndereco(endereco);

                cliente.setId(clienteList.size() + 1);
                cliente.setMatricula(this.cadastroPessoaView.getjTextFieldMatricula().getText());
                cliente.setNome(this.cadastroPessoaView.getjTextFieldNome().getText());
                cliente.setCpf(this.cadastroPessoaView.getjFormattedTextFieldCPF1().getText());
                cliente.setRg(this.cadastroPessoaView.getjFormatedFieldRG1().getText());
                cliente.setDataNascimento(this.cadastroPessoaView.getjFormattedTextFieldDataNasc().getText());
                cliente.setFone1(this.cadastroPessoaView.getjFormattedTextFieldFone().getText());
                cliente.setFone2(this.cadastroPessoaView.getjFormattedTextFieldFone2().getText());
                cliente.setFone2(this.cadastroPessoaView.getjFormattedTextFieldFone2().getText());
                cliente.setEmail(this.cadastroPessoaView.getjTextFieldEmail().getText());
                cliente.setStatus(this.cadastroPessoaView.getjComboBox1().getSelectedItem().toString());
                cliente.setComplementoEndereco(this.cadastroPessoaView.getjTextFieldComplemento().getText());
                cliente.getEndereco().setLogradouro(this.cadastroPessoaView.getjTextFieldLogradouro().getText());
                cliente.getEndereco().setCep(this.cadastroPessoaView.getjFormattedTextFieldCEP().getText());

                if (this.cadastroPessoaView.getjTextFieldID().getText().equalsIgnoreCase("")) {
                    DAO.Persiste.clienteList.add(cliente);

                } else if (clienteList.size() > 0) {
                    if (!clienteList.get(Integer.parseInt(id) - 1).getMatricula().equals(this.cadastroPessoaView.getjTextFieldMatricula())) {
                        clienteList.get(Integer.parseInt(id) - 1).setMatricula(this.cadastroPessoaView.getjTextFieldMatricula().getText());
                    }
                    if (!clienteList.get(Integer.parseInt(id) - 1).getNome().equals(this.cadastroPessoaView.getjTextFieldNome())) {
                        clienteList.get(Integer.parseInt(id) - 1).setNome(this.cadastroPessoaView.getjTextFieldNome().getText());
                    }
                    if (!clienteList.get(Integer.parseInt(id) - 1).getCpf().equals(this.cadastroPessoaView.getjFormattedTextFieldCPF1())) {
                        clienteList.get(Integer.parseInt(id) - 1).setCpf(this.cadastroPessoaView.getjFormattedTextFieldCPF1().getText());
                    }
                    if (!clienteList.get(Integer.parseInt(id) - 1).getRg().equals(this.cadastroPessoaView.getjFormatedFieldRG1())) {
                        clienteList.get(Integer.parseInt(id) - 1).setRg(this.cadastroPessoaView.getjFormatedFieldRG1().getText());
                    }
                    if (!clienteList.get(Integer.parseInt(id) - 1).getFone1().equals(this.cadastroPessoaView.getjFormattedTextFieldFone())) {
                        clienteList.get(Integer.parseInt(id) - 1).setFone1(this.cadastroPessoaView.getjFormattedTextFieldFone().getText());
                    }
                    if (!clienteList.get(Integer.parseInt(id) - 1).getFone2().equals(this.cadastroPessoaView.getjFormattedTextFieldFone2())) {
                        clienteList.get(Integer.parseInt(id) - 1).setFone2(this.cadastroPessoaView.getjFormattedTextFieldFone2().getText());
                    }
                    if (!clienteList.get(Integer.parseInt(id) - 1).getEmail().equals(this.cadastroPessoaView.getjTextFieldEmail())) {
                        clienteList.get(Integer.parseInt(id) - 1).setEmail(this.cadastroPessoaView.getjTextFieldEmail().getText());
                    }
                    if (!clienteList.get(Integer.parseInt(id) - 1).getStatus().equals(this.cadastroPessoaView.getjComboBox1().getSelectedItem())) {
                        clienteList.get(Integer.parseInt(id) - 1).setStatus(this.cadastroPessoaView.getjComboBox1().getSelectedItem().toString());
                    }
                    if (!clienteList.get(Integer.parseInt(id) - 1).getComplementoEndereco().equals(this.cadastroPessoaView.getjTextFieldComplemento())) {
                        clienteList.get(Integer.parseInt(id) - 1).setComplementoEndereco(this.cadastroPessoaView.getjTextFieldComplemento().getText());
                    }
                    if (!clienteList.get(Integer.parseInt(id) - 1).getEndereco().getLogradouro().equals(this.cadastroPessoaView.getjTextFieldLogradouro())) {
                        clienteList.get(Integer.parseInt(id) - 1).getEndereco().setLogradouro(this.cadastroPessoaView.getjTextFieldLogradouro().getText());
                    }
                    if (!clienteList.get(Integer.parseInt(id) - 1).getEndereco().getCep().equals(this.cadastroPessoaView.getjFormattedTextFieldCEP())) {
                        clienteList.get(Integer.parseInt(id) - 1).getEndereco().setCep(this.cadastroPessoaView.getjFormattedTextFieldCEP().getText());
                    }

                }

                utilities.Utilities.ativaDesativa(true, this.cadastroPessoaView.getjPanelFim());
                utilities.Utilities.limpaComponentes(false, this.cadastroPessoaView.getjPanelMeio());

            }

        } else if (e.getSource() == this.cadastroPessoaView.getjButtonEndereco()) {
            Endereco endereco = new Endereco();
            ControllerEnderecoView controllerEnderecoView = new ControllerEnderecoView(enderecoView);
            enderecoView.setVisible(true);

            if (this.cadastroPessoaView.getjTextFieldLogradouro() != null) {
             //   this.cadastroPessoaView.getjTextFieldLogradouro().setText(controllerEnderecoView.gamb);

            }

        } else if (e.getSource() == this.cadastroPessoaView.getjButton1()) {

            JFileChooser fileChooser = new JFileChooser();
            fileChooser.showOpenDialog(null);
            File selectedFile = fileChooser.getSelectedFile();
            if (selectedFile != null) {
                ImageIcon imageIcon = new ImageIcon(selectedFile.getPath());
                this.cadastroPessoaView.getjLabel1().setIcon(imageIcon);

                try {
                    utilities.ImageUtils.resizeImageAndSetIcon(selectedFile, this.cadastroPessoaView.getjLabel1(), 90, 120);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }

            }
        }

    }

}
*/