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
import Service.ItemVendaService;
import Service.ProdutoService;
import Service.VendaService;
import javax.swing.JTextField;

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

        this.pontoDeVendaView.getPassaInfo().addActionListener(this);
        this.pontoDeVendaView.getCalculaTotal().addActionListener(this);
        this.pontoDeVendaView.getCancelaItem().addActionListener(this);
        this.pontoDeVendaView.getFechaCaixa().addActionListener(this);
        this.pontoDeVendaView.getLerCodigoBarra().addActionListener(this);

        utilities.Utilities.ativaDesativa(true, this.pontoDeVendaView.getjPanelMeio());
        this.pontoDeVendaView.getCalculaTotal().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        List<Venda> vendaList = new ArrayList<>();
        List<ItemVenda> itemVendaList = new ArrayList<>();
        DefaultTableModel tabela = (DefaultTableModel) this.pontoDeVendaView.getTabelaListaProduto().getModel();

        if (e.getSource() == this.pontoDeVendaView.getCalculaTotal()) {

            JOptionPane.showMessageDialog(pontoDeVendaView, "Função do F5");

        } else if (e.getSource() == this.pontoDeVendaView.getLerCodigoBarra()) {

            if (this.pontoDeVendaView.getCodigoBarra().getText().equalsIgnoreCase("")) {

                JOptionPane.showMessageDialog(null, "Insira um codigo de barra, para adicionar um produto !");

            } else {

                if (this.pontoDeVendaView.getCodigoBarra().getText().length() < 13) {
                    JOptionPane.showMessageDialog(null, "Codigo de Barras invalido!");
                } else if (this.pontoDeVendaView.getCodigoBarra().getText().length() == 13) {
                    this.pontoDeVendaView.getQuantidade().setText("1");

                    Produto produto = new Produto();
                    produto = ProdutoService.carregarProduto(this.pontoDeVendaView.getCodigoBarra().getText().trim());

                    this.pontoDeVendaView.getProdutoNome1().setText(produto.getDescricao());

                } else {
                    int tamanho = this.pontoDeVendaView.getCodigoBarra().getText().length(); //PEGA O TAMANHO DO CODIGO DE BARRA

                    //  String[] teste = this.pontoDeVendaView.getCodigoBarra().getText().split("x", 3);
                    String quantidade = this.pontoDeVendaView.getCodigoBarra().getText().substring(0, tamanho - 13);

                    this.pontoDeVendaView.getQuantidade().setText(quantidade.replace("x", ""));

                    Produto produto = new Produto();
                    produto = ProdutoService.carregarProduto(this.pontoDeVendaView.getCodigoBarra().getText().trim());

                    this.pontoDeVendaView.getProdutoNome1().setText(produto.getDescricao());

                }

            }

        } else if (e.getSource() == this.pontoDeVendaView.getPassaInfo()) {

            if (this.pontoDeVendaView.getProdutoNome1().getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Nenhum item selecionado!");

            } else {

                Produto produto = new Produto();
                produto = ProdutoService.carregarProduto(this.pontoDeVendaView.getCodigoBarra().getText().trim());

                tabela.addRow(new Object[]{
                    produto.getId(),
                    produto.getDescricao(),
                    this.pontoDeVendaView.getValorUnitario().getText(),
                    this.pontoDeVendaView.getQuantidade().getText(),
                    "A"

                });

            }

        } else if (e.getSource() == this.pontoDeVendaView.getCancelaItem()) {

           
            if (tabela.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "Não é possivel cancelar itens, a tabela esta vazia!!!");
            } else {
                tabela.setValueAt('C', this.pontoDeVendaView.getTabelaListaProduto().getSelectedRow(), 4);
                JOptionPane.showMessageDialog(null, "Produto Cancelado!");
            }

        } else if (e.getSource() == this.pontoDeVendaView.getFechaCaixa()) {

            JOptionPane.showConfirmDialog(null, "Vai fechar o caixa?");

        }

    }

}
