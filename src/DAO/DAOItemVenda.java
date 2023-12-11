/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.util.List;
import controller.Busca.ControllerCarteirinhaView;
import static controller.Busca.ControllerCarteirinhaView.colunaFiltro;
import controller.Compra.ControllerPontoDeVenda;
import java.sql.ResultSet;
import java.sql.Connection;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.bo.Carteirinha;
import model.bo.Cliente;
import model.bo.ItemVenda;
import model.bo.Produto;
import model.bo.Venda;
import view.Busca.CarteirinhaView;
import view.Compra.PontoDeVendaView;

/**
 *
 * @author eduar
 */
public class DAOItemVenda implements InterfaceDAO<ItemVenda> {

    @Override
    public void create(ItemVenda objeto) {

        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = " INSERT INTO TBLITEMVENDA(QTDPRODUTO,VALORUNITARIO,STATUS, "
                + " TBLCARTEIRINHA_id, TBLPRODUTO_id, TBLVENDA_id) "
                + " VALUES(?,?,?, (SELECT id FROM TBLCARTEIRINHA WHERE codigoBarra LIKE ? ),"
                + " (SELECT id FROM TBLPRODUTO WHERE codigoBarra LIKE ?,"
                + "(SELECT id FROM TBLVENDA WHERE  TBLFUNCIONARIO_ID = ? AND TBLCARTEIRINHA_ID = ? AND DATAVENDA = ? AND HORAVENDA = ?))";

        PreparedStatement pstm = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setFloat(1, objeto.getQtdProduto());
            pstm.setFloat(2, objeto.getValorUnitario());
            pstm.setString(3, objeto.getStatus());
            pstm.setString(4, objeto.getCarteirinha().getCodigoBarra());
            pstm.setInt(5, objeto.getProduto().getId());
            pstm.setInt(6, objeto.getProduto().getId());
            pstm.setInt(7,objeto.getCarteirinha().getId());
            pstm.setString(8, objeto.getVenda().getDataVenda());
            pstm.setString(9, objeto.getVenda().getHoraVenda());

            pstm.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm);

        }

    }

    @Override
    public void retrieve(ItemVenda objeto) {

    }

    @Override
    public void update(ItemVenda objeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(ItemVenda objeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<ItemVenda> retrieve() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

    }

    @Override
    public ItemVenda retrieve(int parPK) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<ItemVenda> retrieve(String parString) {

        Connection conexao = ConnectionFactory.getConnection();
        PontoDeVendaView pontoDeVendaView = new PontoDeVendaView(null, true);
        ControllerPontoDeVenda controllerPontoDeVenda = new ControllerPontoDeVenda(pontoDeVendaView);
        // String coluna = produtoView.getComboBoxFiltrar().getSelectedItem().toString().trim();

        String sqlExecutar = "SELECT  descricao "
                + "FROM tblproduto "
                + "WHERE codigoBarra LIKE ?";  // Usando LIKE para busca de substring

        PreparedStatement pstm = null;
        ResultSet rst = null;
        List<ItemVenda> itemVendaList = new ArrayList<>();

        try {
            pstm = conexao.prepareStatement(sqlExecutar);

            //pstm.setString(1,colunaFiltro); 
            pstm.setString(1, "%" + parString + "%");  // Usando parString diretamente

            rst = pstm.executeQuery();

            while (rst.next()) {
                ItemVenda itemVenda = new ItemVenda();
                Produto produto = new Produto();

                itemVenda.setProduto(produto);

                itemVenda.getProduto().setDescricao(rst.getString("descricao"));

                itemVendaList.add(itemVenda);

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm, rst);
        }

        return itemVendaList;

    }
}
