/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.util.List;
import controller.Busca.ControllerCarteirinhaView;
import static controller.Busca.ControllerCarteirinhaView.colunaFiltro;
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
import view.Busca.CarteirinhaView;

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
                + "(SELECT id FROM TBLVENDA WHERE observacao LIKE ?))";

        PreparedStatement pstm = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setFloat(1, objeto.getQtdProduto());   
            pstm.setFloat(2,objeto.getValorUnitario());
            pstm.setString(3,objeto.getStatus());
            pstm.setInt(4,objeto.getCarteirinha().getId());
            pstm.setInt(5,objeto.getProduto().getId());
            pstm.setInt(6,objeto.getVenda().getId());
           
            pstm.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm);

        }       
        
    }

    @Override
    public void retrieve(ItemVenda objeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
   
}
