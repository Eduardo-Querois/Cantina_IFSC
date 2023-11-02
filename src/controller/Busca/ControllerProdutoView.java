/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.Busca;

import static DAO.Persiste.produtoList;
import Service.ProdutoService;
import controller.cadastro.ControllerCadastroBairro;
import controller.cadastro.ControllerCadastroProduto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import model.bo.Produto;
import view.Busca.ProdutoView;

/**
 *
 * @author joao-
 */
public class ControllerProdutoView implements ActionListener {

    ProdutoView ProdutoView;
    int contador;

    public ControllerProdutoView(ProdutoView produtoView) {
        this.ProdutoView = produtoView;

        this.ProdutoView.getjButtonBuscar().addActionListener(this);
        this.ProdutoView.getjButtonCarregar().addActionListener(this);
        this.ProdutoView.getjButtonSair().addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == this.ProdutoView.getjButtonCarregar()) {
            ControllerCadastroProduto.codigo = (int) this.ProdutoView.getjTable1().getValueAt(this.ProdutoView.getjTable1().getSelectedRow(), 0);
            this.ProdutoView.dispose();

        } else if (e.getSource() == this.ProdutoView.getjButtonSair()) {
            this.ProdutoView.dispose();

        } else if (e.getSource() == this.ProdutoView.getjButtonBuscar()) {
            

            
                DefaultTableModel tabela = (DefaultTableModel) this.ProdutoView.getjTable1().getModel();
                tabela.setRowCount(0);
                for (Produto produtoAtual : ProdutoService.carregar()) {
                    tabela.addRow(new Object[]{
                        produtoAtual.getId(),
                        produtoAtual.getDescricao(),
                        produtoAtual.getCodigoBarra(),
                        produtoAtual.getQuantidade(),
                        produtoAtual.getTipoUnidade(),
                        produtoAtual.getStatus()});

                

            }

        }

    }

}
