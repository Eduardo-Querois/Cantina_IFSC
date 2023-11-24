/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.Compra;

import controller.Busca.ControllerProdutoView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.Busca.BuscaPontoDeVendaView;
import view.Busca.ProdutoView;
import view.Compra.PontoDeVendaView;
import view.Compra.PontoDeVendaView;

/**
 *
 * @author eduar
 */
public class ControllerCompraView implements ActionListener {

    PontoDeVendaView compraView;
    public static int codigo;

    public ControllerCompraView(PontoDeVendaView compraView) {
        this.compraView = compraView;
        this.compraView.getjButtonBuscar().addActionListener(this);
        this.compraView.getjButtonCancelar().addActionListener(this);
        this.compraView.getjButtonGravar().addActionListener(this);
        this.compraView.getjButtonNovo().addActionListener(this);
        this.compraView.getjButtonSair().addActionListener(this);
        this.compraView.getPesquisarProduto().addActionListener(this);

        utilities.Utilities.ativaDesativa(true, this.compraView.getjPanelFim());
        utilities.Utilities.limpaComponentes(false, this.compraView.getjPanelMeio());

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.compraView.getjButtonNovo()) {

            utilities.Utilities.ativaDesativa(false, this.compraView.getjPanelFim());
            utilities.Utilities.limpaComponentes(true, this.compraView.getjPanelMeio());

            this.compraView.getId().setEnabled(false);
            this.compraView.getIdFuncionario().setEnabled(false);
            this.compraView.getNomeCliente().setEnabled(false);
            this.compraView.getNomeFuncionario().setEnabled(false);
            this.compraView.getCodigoBarra().setEnabled(false);
            this.compraView.getTabelaListaProduto().setEnabled(false);
            
        } else if (e.getSource() == this.compraView.getjButtonCancelar()) {

            utilities.Utilities.ativaDesativa(true, this.compraView.getjPanelFim());
            utilities.Utilities.limpaComponentes(false, this.compraView.getjPanelMeio());

        } else if (e.getSource() == this.compraView.getjButtonSair()) {

            this.compraView.dispose();

        } else if (e.getSource() == this.compraView.getjButtonBuscar()) {
            BuscaPontoDeVendaView buscaCompraView = new BuscaPontoDeVendaView(null, true);
            ControllerBuscaCompraView controllerBuscaCompraView = new ControllerBuscaCompraView(buscaCompraView);
            buscaCompraView.setVisible(true);

        } else if (e.getSource() == this.compraView.getjButtonGravar()) {

            
        } 
        
        else if (e.getSource() == this.compraView.getPesquisarProduto()) {
            ProdutoView produtoView = new ProdutoView(null, true);
            ControllerProdutoView controllerProdutoView = new ControllerProdutoView(produtoView);
            produtoView.setVisible(true);

        }

    }

}
