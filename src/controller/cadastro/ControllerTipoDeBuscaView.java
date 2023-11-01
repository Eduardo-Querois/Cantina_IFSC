/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.cadastro;

import controller.Busca.ControllerClienteView;
import controller.Busca.ControllerFornecedorView;
import controller.Busca.ControllerFuncionarioView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import view.Busca.ClienteView;
import view.Busca.FornecedorView;
import view.TipoBusca1View;
import view.Busca.FuncionarioView;

/**
 *
 * @author joao-
 */
public class ControllerTipoDeBuscaView implements ActionListener{
    ClienteView clienteView = new ClienteView(null,true);
    FornecedorView fornecedorView = new FornecedorView(null, true);
    FuncionarioView funcionarioView = new FuncionarioView(null, true);
    
    TipoBusca1View tipoBusca1View;
    
    public ControllerTipoDeBuscaView(TipoBusca1View tipoBusca1View) {
        this.tipoBusca1View =tipoBusca1View;
        
        this.tipoBusca1View.getjButtonBuscar().addActionListener(this);
        this.tipoBusca1View.getjButtonCancelar().addActionListener(this);
        this.tipoBusca1View.getjComboBox1().addActionListener(this);
        
        utilities.Utilities.limpaComponentes(true, tipoBusca1View.getjPanelMeio());
        
    }

    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.tipoBusca1View.getjButtonCancelar()){
        this.tipoBusca1View.dispose();
        
        } else if(e.getSource() == this.tipoBusca1View.getjButtonBuscar()){
       
            if (this.tipoBusca1View.getjComboBox1().getSelectedIndex() == 0) {
                ControllerClienteView controllerClienteView = new ControllerClienteView(clienteView);
                this.tipoBusca1View.dispose();
                clienteView.setVisible(true);
                

            }
            if (this.tipoBusca1View.getjComboBox1().getSelectedIndex() == 1) {
                ControllerFuncionarioView controllerFuncionarioView = new ControllerFuncionarioView(funcionarioView);
                this.tipoBusca1View.dispose();
                funcionarioView.setVisible(true);
                

            }
            if (this.tipoBusca1View.getjComboBox1().getSelectedIndex() == 2) {
                ControllerFornecedorView controllerFornecedorView = new ControllerFornecedorView(fornecedorView);
                this.tipoBusca1View.dispose();
                fornecedorView.setVisible(true);
                

            }
            if (this.tipoBusca1View.getjComboBox1().getSelectedIndex() == -1 ){
                JOptionPane.showMessageDialog(null, "Selecione um Tipo de Cadastro para Realizar uma Busca");

            }
        
        
        }
    
    
    }
    
    
    
    
    
    
    
}
