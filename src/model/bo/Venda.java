/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bo;

/**
 *
 * @author aluno
 */
public class Venda {

    private int id;
    private String dataVenda;
    private String horaVenda;
    private float valorVenda;
//    private char flagTipoDesconto;
    private String observacao;
    private String status;

    private Cliente cliente;
    private Funcionario funcionario;
    private Produto produto;

    public Venda() {
    }

    ;

    public Venda(int id, String dataVenda, String horaVenda, float valorVenda, char flagTipoDesconto, String observacao, String status, Cliente cliente, Funcionario funcionario, Produto produto) {
        this.id = id;
        this.dataVenda = dataVenda;
        this.horaVenda = horaVenda;
        this.valorVenda = valorVenda;
//        this.flagTipoDesconto = flagTipoDesconto;
        this.observacao = observacao;
        this.status = status;
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.produto = produto;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public String getStatus() {
        return status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public String setStatus(String status) {
        return status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }

    public String getHoraVenda() {
        return horaVenda;
    }

    public void setHoraVenda(String horaVenda) {
        this.horaVenda = horaVenda;
    }

    public float getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(float valorVenda) {
        this.valorVenda = valorVenda;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    @Override
    public String toString() {
        return this.getId() + ""
                + this.getDataVenda() + ""
                + this.getHoraVenda() + ""
                + this.getValorVenda() + ""
                + this.getObservacao() + ""
                + this.getStatus() + ""
                + this.funcionario.getCpf() + ""
                + this.funcionario.getRg() + ""
                + this.funcionario.getUsuario() + ""
                + this.funcionario.getSenha() + "";
    }

}
