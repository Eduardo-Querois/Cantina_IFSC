/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import static DAO.Persiste.funcionarioList;
import java.sql.ResultSet;
import java.sql.Connection;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import model.bo.Funcionario;

public class DAOFuncionario implements InterfaceDAO<Funcionario> {

    @Override
    public void create(Funcionario objeto) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "INSERT INTO tblfuncionario (nome,fone1,fone2,email,status,complementoEndereco,cpf,rg,,usuario,senha) VALUES(?,?,?,?,?,?,?,?,?,?)";

        PreparedStatement pstm = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getNome());
            pstm.setString(2,objeto.getFone1());
            pstm.setString(3,objeto.getFone2());
            pstm.setString(4,objeto.getEmail());
            pstm.setString(5,objeto.getStatus());
            pstm.setString(6,objeto.getComplementoEndereco());
            pstm.setString(7, objeto.getCpf());
            pstm.setString(8,objeto.getRg());
            pstm.setString(9,objeto.getUsuario());
            pstm.setString(10,objeto.getSenha());
           
            pstm.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm);

        }

    }

    @Override
    public void delete(Funcionario objeto) {

    }

    @Override
    public void update(Funcionario objeto) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "UPDATE tblFuncionario SET nome = ? ,"
                                                 +"fone1 = ?,"
                                                 +"fone2 = ?,"
                                                 +"email = ?,"
                                                 +"status = ?,"
                                                 +"complementoEndereco = ?,"
                                                 +"cpf = ?,"
                                                 +"rg = ?,"
                                                 +"usuario = ?,"
                                                 +"senha = ?"
                                                 +"WHERE id = ?";
        PreparedStatement pstm = null;
        Funcionario funcionario = new Funcionario();

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getNome());
            pstm.setString(2,objeto.getFone1());
            pstm.setString(3,objeto.getFone2());
            pstm.setString(4,objeto.getEmail());
            pstm.setString(5,objeto.getStatus());
            pstm.setString(6,objeto.getComplementoEndereco());
            pstm.setString(7, objeto.getCpf());
            pstm.setString(8,objeto.getRg());
            pstm.setString(9,objeto.getUsuario());
            pstm.setString(10, objeto.getSenha());
            pstm.setInt(11, objeto.getId());
            pstm.execute();

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm);
        }

    }

    @Override
    public void retrieve(Funcionario objeto) {

    }

    @Override
    public List<Funcionario> retrieve() {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT id,nome,fone1,fone2,"
                + "email,status,complementoEndereco,"
                + "cpf,rg,usuario,senha"
                + "FROM tblfuncionario";
        PreparedStatement pstm = null;
        ResultSet rst = null;
        List<Funcionario> funcionarioList = new ArrayList<>();

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            rst = pstm.executeQuery();

            while (rst.next()) {
                Funcionario funcionario = new Funcionario();
                funcionario.setId(rst.getInt("id"));
                funcionario.setNome(rst.getString("nome"));
                funcionario.setFone1(rst.getString("fone1"));
                funcionario.setFone2(rst.getString("fone2"));
                funcionario.setEmail(rst.getString("email"));
                funcionario.setStatus(rst.getString("status"));
                funcionario.setComplementoEndereco(rst.getString("complementoEndereco"));
                funcionario.setCpf(rst.getString("dpf"));
                funcionario.setRg(rst.getString("rg"));
                funcionario.setUsuario(rst.getString("usuario"));
                funcionario.setSenha(rst.getString("senha"));
                funcionarioList.add(funcionario);
            }

        } catch (SQLException ex) {

            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return funcionarioList;
        }

    }

    @Override
    public Funcionario retrieve(int parPK) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT id,nome,fone1,fone2,email,status,complementoEndereco,cpf,rg,usuario,senha FROM tblfuncionario WHERE id = ? ";
        PreparedStatement pstm = null;
        ResultSet rst = null;
        
        Funcionario funcionario = new Funcionario();

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setInt(1, parPK);
            rst = pstm.executeQuery();

            while(rst.next()){
               
                funcionario.setId(rst.getInt("id"));
                funcionario.setNome(rst.getString("nome"));
                funcionario.setFone1(rst.getString("fone1"));
                funcionario.setFone2(rst.getString("fone2"));
                funcionario.setEmail(rst.getString("email"));
                funcionario.setStatus(rst.getString("status"));
                funcionario.setComplementoEndereco(rst.getString("complementoEndereco"));
                funcionario.setCpf(rst.getString("cpf"));
                funcionario.setRg(rst.getString("rg"));
                funcionario.setUsuario(rst.getString("usuario"));
                funcionario.setSenha(rst.getString("senha"));
                
                
            }
            
            
        } catch (SQLException ex) {

            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return funcionario;

        }
    }

    @Override
    public List<Funcionario> retrieve(String parString) {
        return null;
    }

}
