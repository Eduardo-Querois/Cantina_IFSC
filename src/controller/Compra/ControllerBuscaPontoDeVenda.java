/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.Compra;

import controller.Busca.ControllerProdutoView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.bo.Venda;
import view.Busca.BuscaPontoDeVendaView;
import view.Busca.ProdutoView;

/**
 *
 * @author eduar
 */
public class ControllerBuscaPontoDeVenda implements ActionListener {

    BuscaPontoDeVendaView buscaCompraView;
    public static boolean vendaToProduto = false;

    public ControllerBuscaPontoDeVenda(BuscaPontoDeVendaView buscaCompraView) {
        this.buscaCompraView = buscaCompraView;
       // this.buscaCompraView.getm

        this.buscaCompraView.getjButtonBuscar().addActionListener(this);
        this.buscaCompraView.getjButtonCarregar().addActionListener(this);
        this.buscaCompraView.getjButtonSair().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.buscaCompraView.getjButtonCarregar()) {
        } else if (e.getSource() == this.buscaCompraView.getjButtonSair()) {

            this.buscaCompraView.dispose();
        } else if (e.getSource() == this.buscaCompraView.getjButtonBuscar()) {

            
           
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            List<Venda> vendaList = new ArrayList<>();
         

            DefaultTableModel tableLista = (DefaultTableModel) this.buscaCompraView.getjTable1().getModel();
            for (Venda vendaAtual : vendaList) {
                tableLista.addRow(new Object[]{
                    vendaAtual.getId(),
                    vendaAtual.getCliente().getNome(),
                    vendaAtual.getFlagTipoDesconto(),
                    vendaAtual.getStatus(),
                    vendaAtual.getDataHoraVenda(),
                    vendaAtual.getValorDesconto(),
                    vendaAtual.getObservacao()

                });

            }
        }

    }

}
