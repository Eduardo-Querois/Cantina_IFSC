/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.ResultSet;
import java.sql.Connection;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import model.bo.Carteirinha;
import model.bo.Cliente;

public class DAOCarteirinha implements InterfaceDAO<Carteirinha> {

    @Override
    public void create(Carteirinha objeto) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "INSERT INTO tblcarteirinha "
                + "(codigoBarra,dataGeracao,dataCancelamento,TBLCLIENTE_ID) "
                + "VALUES(?,?,?, (SELECT ID FROM TBLCLIENTE WHERE MATRICULA LIKE ?))";

        PreparedStatement pstm = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getCodigoBarra());
            pstm.setString(2, objeto.getDataCancelamento());
            pstm.setString(3, objeto.getDataGeracao());
            pstm.setString(4, objeto.getCliente().getMatricula());
            pstm.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm);

        }

    }

    @Override
    public void delete(Carteirinha objeto) {

    }

    @Override
    public void update(Carteirinha objeto) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "UPDATE tblcarteirinha SET codigoDescricao = ? ,"
                                                     + "dataGeracao = ? ,"
                                                    + " dataCancelamento = ?,"
                                                    + " TBLCLIENTE_ID = (SELECT ID FROM TBLCLIENTE WHERE MATRICULA LIKE ?) "
                                                    +  "WHERE id = ?";
        PreparedStatement pstm = null;
        Carteirinha carteirinha = new Carteirinha();

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getCodigoBarra());
            pstm.setString(2, objeto.getDataCancelamento());
            pstm.setString(3, objeto.getDataGeracao());
            pstm.setString(4,objeto.getCliente().getMatricula());
            pstm.setInt(5, objeto.getId());
            pstm.execute();

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm);
        }

    }

    @Override
    public void retrieve(Carteirinha objeto) {

    }

    @Override
    public List<Carteirinha> retrieve() {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT id,codigoBarra,dataGeracao,dataCancelamento FROM tblcarteirinha";
        PreparedStatement pstm = null;
        ResultSet rst = null;
        List<Carteirinha> carteirinhaList = new ArrayList<>();

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            rst = pstm.executeQuery();

            while (rst.next()) {
                Carteirinha carteirinha = new Carteirinha();
                carteirinha.setId(rst.getInt("id"));
                carteirinha.setCodigoBarra(rst.getString("codigoBarra"));
                carteirinha.setDataCancelamento(rst.getString("dataCancelamento"));

                carteirinhaList.add(carteirinha);
            }

        } catch (SQLException ex) {

            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return carteirinhaList;
        }

    }

    @Override
    public Carteirinha retrieve(int parPK) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT A.ID, A.CODIGOBARRA, A.dataGeracao,"
                + "A.DATACANCELAMENTO,C.RG,C.CPF,C.MATRICULA,C.DATANASCIMENTO, C.NOME "
                + "FROM TBLCARTEIRINHA A JOIN TBLCLIENTE C "
                + "ON A.TBLCLIENTE_ID = C.ID "
                + "WHERE A.ID = ? ";
        PreparedStatement pstm = null;
        ResultSet rst = null;

        Carteirinha carteirinha = new Carteirinha();
        Cliente cliente = new Cliente();
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setInt(1, parPK);
            rst = pstm.executeQuery();

            while (rst.next()) {
                carteirinha.setCliente(cliente);
                carteirinha.setId(rst.getInt("id"));
                carteirinha.setCodigoBarra(rst.getString("codigoBarra"));
                carteirinha.setDataGeracao(rst.getString("dataGeracao"));
                carteirinha.setDataCancelamento(rst.getString("dataCancelamento"));
                carteirinha.getCliente().setCpf(rst.getString("cpf"));
                carteirinha.getCliente().setRg(rst.getString("rg"));
                carteirinha.getCliente().setMatricula(rst.getString("matricula"));
                carteirinha.getCliente().setDataNascimento(rst.getString("dataNascimento"));
                carteirinha.getCliente().setNome(rst.getString("nome"));
            }

        } catch (SQLException ex) {

            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return carteirinha;

        }
    }

    @Override
    public List<Carteirinha> retrieve(String parString) {
        return null;
    }

}
