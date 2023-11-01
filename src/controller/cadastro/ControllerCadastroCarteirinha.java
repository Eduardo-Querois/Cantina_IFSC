/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.cadastro;

import static DAO.Persiste.carteirinhaList;
import controller.Busca.ControllerCarteirinhaView;
import view.Cadastro.CadastroCarteirinhaView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.bo.Carteirinha;
import model.bo.Cliente;
import view.Busca.CarteirinhaView;

/**
 *
 * @author joao-
 */
public class ControllerCadastroCarteirinha implements ActionListener {

    
    
    CadastroCarteirinhaView cadastroCarteirinhaView;
    public static int codigo;
    public ControllerCadastroCarteirinha(CadastroCarteirinhaView cadastroCarteirinhaView) {
        this.cadastroCarteirinhaView = cadastroCarteirinhaView;
        
        
        this.cadastroCarteirinhaView.getjButtonNovo().addActionListener(this);
        this.cadastroCarteirinhaView.getjButtonSair().addActionListener(this);
        this.cadastroCarteirinhaView.getjButtonCancelar().addActionListener(this);
        this.cadastroCarteirinhaView.getjButtonGravar().addActionListener(this);
        this.cadastroCarteirinhaView.getjButtonBuscar().addActionListener(this);
        
        utilities.Utilities.ativaDesativa(true, this.cadastroCarteirinhaView.getjPanelFim());
        utilities.Utilities.limpaComponentes(false, this.cadastroCarteirinhaView.getjPanelMeio());
       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.cadastroCarteirinhaView.getjButtonNovo()) {
            utilities.Utilities.ativaDesativa(false, this.cadastroCarteirinhaView.getjPanelFim());
            utilities.Utilities.limpaComponentes(true, this.cadastroCarteirinhaView.getjPanelMeio());
            this.cadastroCarteirinhaView.getjTextFieldID().setEnabled(false);

        } else if (e.getSource() == this.cadastroCarteirinhaView.getjButtonSair()) {
            this.cadastroCarteirinhaView.dispose();

        } else if (e.getSource() == this.cadastroCarteirinhaView.getjButtonCancelar()) {
            utilities.Utilities.ativaDesativa(true, this.cadastroCarteirinhaView.getjPanelFim());
            utilities.Utilities.limpaComponentes(false, this.cadastroCarteirinhaView.getjPanelMeio());

        } else if (e.getSource() == this.cadastroCarteirinhaView.getjButtonBuscar()) {
            
            codigo = 0;
            CarteirinhaView carteirinhaView = new CarteirinhaView(null, true);
            ControllerCarteirinhaView controllerCarteirinhaView = new ControllerCarteirinhaView(carteirinhaView);
            carteirinhaView.setVisible(true);
            
            if(codigo !=0){
            Carteirinha carteirinha = new Carteirinha();
            carteirinha = Service.CarteirinhaService.carregar(codigo);
            utilities.Utilities.ativaDesativa(false, this.cadastroCarteirinhaView.getjPanelFim());
            utilities.Utilities.limpaComponentes(true, this.cadastroCarteirinhaView.getjPanelMeio());

            
            this.cadastroCarteirinhaView.getjTextFieldID().setText(carteirinha.getId()+ "");
            this.cadastroCarteirinhaView.getjTextFieldCodigoDeBarra().setText(carteirinha.getCodigoBarra() + " ");
            this.cadastroCarteirinhaView.getjFormattedTextField3().setText(carteirinha.getDataGeracao()+" ");
            this.cadastroCarteirinhaView.getjFormattedTextField1().setText(carteirinha.getDataCancelamento()+" ");
            this.cadastroCarteirinhaView.getjFormattedTextFieldCPF().setText(carteirinha.getCliente().getCpf()+"");
            this.cadastroCarteirinhaView.getjFormattedTextFieldRG1().setText(carteirinha.getCliente().getRg()+" ");
            this.cadastroCarteirinhaView.getjTextFieldMatricula().setText(carteirinha.getCliente().getMatricula()+" ");
            this.cadastroCarteirinhaView.getjFormattedTextFieldDataNascimento().setText(carteirinha.getCliente().getDataNascimento()+" ");
            
         
            this.cadastroCarteirinhaView.getjTextFieldID().setEnabled(false);
            this.cadastroCarteirinhaView.getjTextFieldCodigoDeBarra().setEnabled(true);
            this.cadastroCarteirinhaView.getjFormattedTextField3().setEnabled(true);
            this.cadastroCarteirinhaView.getjFormattedTextField1().setEnabled(true);
            this.cadastroCarteirinhaView.getjFormattedTextFieldCPF().setEnabled(true);
            this.cadastroCarteirinhaView.getjFormattedTextFieldRG1().setEnabled(true);
            this.cadastroCarteirinhaView.getjTextFieldMatricula().setEnabled(true);
            this.cadastroCarteirinhaView.getjFormattedTextFieldDataNascimento().setEnabled(true);
            
           
            
            }
    
        } else if (e.getSource() == this.cadastroCarteirinhaView.getjButtonGravar()) {
            
           
       
           Carteirinha carteirinha = new Carteirinha();
           Cliente cliente = new Cliente();
           carteirinha.setCliente(cliente);
           carteirinha.setId(carteirinhaList.size()+1);
           carteirinha.setCodigoBarra(this.cadastroCarteirinhaView.getjTextFieldCodigoDeBarra().getText());
           carteirinha.setDataGeracao(this.cadastroCarteirinhaView.getjFormattedTextField3().getText());
           carteirinha.setDataCancelamento(this.cadastroCarteirinhaView.getjFormattedTextField1().getText());
           carteirinha.getCliente().setCpf(this.cadastroCarteirinhaView.getjFormattedTextFieldCPF().getText());
           carteirinha.getCliente().setRg(this.cadastroCarteirinhaView.getjFormattedTextFieldRG1().getText());
           carteirinha.getCliente().setMatricula(this.cadastroCarteirinhaView.getjTextFieldMatricula().getText());
           carteirinha.getCliente().setDataNascimento(this.cadastroCarteirinhaView.getjFormattedTextFieldDataNascimento().getText());
          
           
           
           if (this.cadastroCarteirinhaView.getjTextFieldID().getText().equalsIgnoreCase("")){
           Service.CarteirinhaService.adicionar(carteirinha);
           
           }
   
           else {
               carteirinha.setId(Integer.parseInt(this.cadastroCarteirinhaView.getjTextFieldID().getText()));
               Service.CarteirinhaService.atualizar(carteirinha);
                }
            utilities.Utilities.ativaDesativa(true, this.cadastroCarteirinhaView.getjPanelFim());
            utilities.Utilities.limpaComponentes(false, this.cadastroCarteirinhaView.getjPanelMeio());
            
            
           }
            
            

        }
    
        
    
    }
    
    
    
    
    
