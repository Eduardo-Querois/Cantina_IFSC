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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.bo.ItemVenda;
import model.bo.Produto;
import model.bo.Venda;
import view.Busca.BuscaPontoDeVendaView;
import view.Busca.ProdutoView;
import view.Compra.PontoDeVendaView;
import view.Compra.PontoDeVendaView;

/**
 *
 * @author eduar
 */
public class ControllerPontoDeVenda implements ActionListener {

    PontoDeVendaView pontoDeVendaView;
    public static int codigo = 0;

    public ControllerPontoDeVenda(PontoDeVendaView pontoDeVendaView) {
        this.pontoDeVendaView = pontoDeVendaView;
        //this.pontoDeVendaView.getJMenuBar().setVisible(false);
       

        utilities.Utilities.ativaDesativa(true, this.pontoDeVendaView.getjPanelMeio());
         this.pontoDeVendaView.getCalculaTotal().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        
        if (e.getSource() == this.pontoDeVendaView.getCalculaTotal()) {
        
            JOptionPane.showMessageDialog(pontoDeVendaView, "vai tomar no cu");
        
        }
//        if (e.getSource() == this.pontoDeVendaView.getPesquisarProduto()) {
//            ProdutoView produtoView = new ProdutoView(null, true);
//            ControllerProdutoView controllerProdutoView = new ControllerProdutoView(produtoView);
//            produtoView.setVisible(true);
//
//        } else if (e.getSource() == this.pontoDeVendaView.getProdutoToTable()) {
//            ProdutoView produtoView = new ProdutoView(null, true);
//            ControllerProdutoView controllerProdutoView = new ControllerProdutoView(produtoView);
//            
//            List<ItemVenda> ItemVendaList = new ArrayList<>();
//
//            DefaultTableModel tableLista = (DefaultTableModel) this.pontoDeVendaView.getTabelaListaProduto().getModel();
//            for (ItemVenda itemVenda : ItemVendaList) {
//                tableLista.addRow(new Object[]{
//                    itemVenda.getId(),
//                    itemVenda.getProduto().getDescricao(),
//                    itemVenda.getValorUnitario(),
//                    itemVenda.getQtdProduto(),
//                    itemVenda.getStatus()
//                    
//                });
//
//            if (this.pontoDeVendaView.getProdutoNome().getText().equalsIgnoreCase("")) {
//                JOptionPane.showMessageDialog(null, "Campo ta vazio!");
//
//            } else {
//                while (true) {
//                 
//                    this.pontoDeVendaView.getTabelaListaProduto().setValueAt(this.pontoDeVendaView.getProdutoNome().getText(), linha++, coluna++);
//                    break;
//                }
//                
//                  
//                
//                }
//            }
//        }

    }
    
}

