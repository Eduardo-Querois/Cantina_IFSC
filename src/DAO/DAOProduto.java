/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import static DAO.Persiste.produtoList;
import java.sql.ResultSet;
import java.sql.Connection;
import java.util.List;
import model.bo.Produto;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAOProduto implements InterfaceDAO<Produto> {

    @Override
    public void create(Produto objeto) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "INSERT INTO tblproduto (descricao,codigoBarra,quantidade,status) VALUES(?,?,?,?)";

        PreparedStatement pstm = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getDescricao());
            pstm.setString(2, objeto.getCodigoBarra());
            pstm.setString(3,objeto.getQuantidade());
            pstm.setString(4, objeto.getStatus());
            pstm.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm);

        }

    }

    @Override
    public void delete(Produto objeto) {

    }

    @Override
    public void update(Produto objeto) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "UPDATE tblproduto SET descricao = ?, codigoBarra = ?,quantidade = ?, status = ? WHERE id = ?";
        PreparedStatement pstm = null;
        Produto produto = new Produto();

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getDescricao());
            pstm.setString(2,objeto.getCodigoBarra());
            pstm.setString(3, objeto.getQuantidade());
            pstm.setString(4,objeto.getStatus());
            
            pstm.setInt(5, objeto.getId());
            pstm.execute();

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm);
        }

    }

    @Override
    public void retrieve(Produto objeto) {

    }

    @Override
    public List<Produto> retrieve() {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT id,descricao,codigoBarra,quantidade,status FROM tblproduto";
        PreparedStatement pstm = null;
        ResultSet rst = null;
        List<Produto> produtoList = new ArrayList<>();

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            rst = pstm.executeQuery();

            while (rst.next()) {
                Produto produto = new Produto();
                produto.setId(rst.getInt("id"));
                produto.setDescricao(rst.getString("descricao"));
                produto.setCodigoBarra(rst.getString("codigoBarra"));
                produto.setQuantidade(rst.getString("quantidade"));
                produto.setStatus(rst.getString("status"));
                
                produtoList.add(produto);
            }

        } catch (SQLException ex) {

            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return produtoList;
        }

    }

    @Override
    public Produto retrieve(int parPK) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT id,descricao,codigoBarra,quantidade,status FROM tblproduto WHERE id = ? ";
        PreparedStatement pstm = null;
        ResultSet rst = null;
        
        Produto produto = new Produto();

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setInt(1, parPK);
            rst = pstm.executeQuery();

            while(rst.next()){
                produto.setId(rst.getInt("id"));
                produto.setDescricao(rst.getString("descricao"));
                produto.setCodigoBarra(rst.getString("codigoBarra"));
                produto.setQuantidade(rst.getString("quantidade"));
                produto.setStatus(rst.getString("status"));
            }
            
            
        } catch (SQLException ex) {

            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return produto;

        }
    }

    @Override
    public List<Produto> retrieve(String parString) {
        return null;
    }

}
