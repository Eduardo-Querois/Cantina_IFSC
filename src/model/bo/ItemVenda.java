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
public class ItemVenda {

    private int id;
    private float qtdProduto;
    private float valorUnitario;
    private String status;

    private Venda venda;
    private Carteirinha carteirinha;
    private Produto produto;

    
    
    public ItemVenda(){};

    public ItemVenda(int id, float qtdProduto, float valorUnitario, String status, Venda venda, Carteirinha carteirinha, Produto produto) {
        this.id = id;
        this.qtdProduto = qtdProduto;
        this.valorUnitario = valorUnitario;
        this.status = status;
        this.venda = venda;
        this.carteirinha = carteirinha;
        this.produto = produto;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getQtdProduto() {
        return qtdProduto;
    }

    public void setQtdProduto(float qtdProduto) {
        this.qtdProduto = qtdProduto;
    }

    public float getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public Carteirinha getCarteirinha() {
        return carteirinha;
    }

    public void setCarteirinha(Carteirinha carteirinha) {
        this.carteirinha = carteirinha;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return this.getId() + " "
                + this.getQtdProduto() + " "
                + this.getValorUnitario() + " "
                + this.getStatus() + " "
                + this.venda.getId() + " "
                + this.venda.getDataHoraVenda() + " "
                + this.venda.getValorDesconto() + " "
                + this.venda.getFlagTipoDesconto() + " "
                + this.venda.getObservacao() + " "
                + this.venda.getStatus();
    
    
    
    }

}
