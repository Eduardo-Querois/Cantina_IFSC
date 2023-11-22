/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.Compra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.Busca.BuscaCompraView;

/**
 *
 * @author eduar
 */
public class ControllerBuscaCompraView implements ActionListener{

    BuscaCompraView buscaCompraView;
    
    public ControllerBuscaCompraView(BuscaCompraView buscaCompraView){
    this.buscaCompraView = buscaCompraView;
    
    this.buscaCompraView.getjButtonBuscar().addActionListener(this);
    this.buscaCompraView.getjButtonCarregar().addActionListener(this);
    this.buscaCompraView.getjButtonSair().addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.buscaCompraView.getjButtonCarregar()){
        }
        
        else if(e.getSource() == this.buscaCompraView.getjButtonBuscar()){
        
        }
        
        else if(e.getSource() == this.buscaCompraView.getjButtonSair()){
        this.buscaCompraView.dispose();
        }
        
        
    }
    
}
